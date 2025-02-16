package org.example;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.example.protoFiles.Book;
import org.example.protoFiles.BookResponse;
import org.example.protoFiles.BookServiceGrpc;
import org.example.protoFiles.ISBNRequest;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyServer {
    // In-memory store to simulate a book database
    private static final Map<String, Book> bookDatabase = new HashMap<>();

    public static void main(String[] args) {
        // Start the gRPC server
        Server server = ServerBuilder.forPort(8080)
                .addService((BindableService) new BookServiceHandler()) // Register the service implementation
                .build();

        System.out.println("====================================");
        System.out.println("Starting gRPC server on port 8080...");
        try {
            server.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Server started.");
        System.out.println("====================================\n");

        // Keep the server running
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Service implementation for BookService
    static class BookServiceHandler extends BookServiceGrpc.BookServiceImplBase {
        @Override
        public void createBook(Book request, StreamObserver<BookResponse> responseObserver) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Received request to create a book");
            System.out.println("Book Title: " + request.getTitle());
            System.out.println("----------------------------------------------------------------\n");

            // Add the book to the database
            bookDatabase.put(request.getIsbn(), request);

            // Encode the Book object into a byte array**
            byte[] encodedBook = request.toByteArray();
            System.out.println("Encoded Book (byte array) on Server: " + Arrays.toString(encodedBook));

            // Decode the byte array back into a Book object on Server**
            try {
                Book decodedBook = Book.parseFrom(encodedBook);
                System.out.println("Decoded Book on Server: \n" + decodedBook);
            } catch (Exception e) {
                System.out.println("Failed to decode book on server: " + e.getMessage());
            }

            // Send a response indicating success
            BookResponse response = BookResponse.newBuilder()
                    .setMessage("\u001B[34mServer: Book added successfully!\u001B[0m")
                    .setBook(request)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getBookByISBN(ISBNRequest request, StreamObserver<BookResponse> responseObserver) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Received request to fetch book by ISBN: " + request.getIsbn());

            // Fetch the book from database
            String isbn = request.getIsbn();
            Book book = bookDatabase.get(isbn);

            BookResponse response;
            if (book != null) {
                response = BookResponse.newBuilder()
                        .setMessage("\u001B[34mServer: Book found!\u001B[0m")
                        .setBook(book)
                        .build();
                System.out.println("Book found for ISBN: " + isbn);
            } else {
                response = BookResponse.newBuilder()
                        .setMessage("\u001B[31mServer: Book not found!\u001B[0m")
                        .build();
                System.out.println("Book not found for ISBN: " + isbn);
            }

            System.out.println("---------------------------------------------------------------------\n");

            // Send the response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

    }
}