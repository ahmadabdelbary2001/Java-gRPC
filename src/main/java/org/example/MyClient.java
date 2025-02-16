package org.example;

import com.google.protobuf.util.JsonFormat;
import org.example.protoFiles.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;

public class MyClient {

    // Channel setup
    private static ManagedChannel setupChannel() {
        return ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
    }

    //Build a Book object
    private static Book buildBook() {
        // Create a Publisher object for the books
        Book.Publisher publisher = Book.Publisher.newBuilder()
                .setName("Editions Ellipses")
                .setLocation("Paris")
                .build();

        // Create a Book object
        return Book.newBuilder()
                .setTitle("263 Exercices corriges de Mathematiques en speciales")
                .setAuthor("Omran Kouba")
                .setIsbn("978-2-7298-4564-3")
                .setPublicationYear(1995)
                .setCategory(Book.Category.SCIENCE)
                .setPublisher(publisher)
                .build();
    }

    // Protobuf function
    private static void handleProtobufBook(BookServiceGrpc.BookServiceBlockingStub stub) {
        Book book = buildBook();

        System.out.println("============================================");
        System.out.println("       Encoding and decoding the book       ");
        System.out.println("============================================");

        // Encoding and decoding the book
        byte[] encodedBook = book.toByteArray();
        System.out.println("Encoded Book (byte array): " + Arrays.toString(encodedBook));

        /*
        // Save the protobuf object to a file
        try (FileOutputStream fos = new FileOutputStream(".\\protoFiles\\book.proto")) {
            book.writeTo(fos);
            System.out.println("Successfully saved Book as protobuf to file in protoFiles.");
        } catch (IOException e) {
            System.out.println("Failed to save the protobuf object to file: " + e.getMessage());
        }
        */

        System.out.println("\u001B[32mProtobuf size: " + encodedBook.length + "\u001B[0m");

        try {
            Book decodedBook = Book.parseFrom(encodedBook);
            printBookDetails(decodedBook);
        } catch (Exception e) {
            System.out.println("Failed to decode the byte array: " + e.getMessage());
        }

        // Create book and add it to the database using gRPC
        System.out.println("----------------------------------------------");
        System.out.println("Creating book and adding it to the database...");
        BookResponse createResponse = stub.createBook(book);
        System.out.println("Response from " + createResponse.getMessage());
        System.out.println("----------------------------------------------\n");
    }

    private static void convertBookToJson() {
        Book book = buildBook();

        System.out.println("============================================");
        System.out.println("        Converting book to JSON             ");
        System.out.println("============================================");

        // Convert to JSON
        String jsonString;
        try {
            jsonString = JsonFormat.printer().print(book);

            /*
            // Save JSON to file
            try (FileWriter file = new FileWriter(".\\jsonFiles\\book.json")) {
                file.write(jsonString);
                System.out.println("Successfully written JSON to file and saved in jsonFiles.");
            }
            */

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Book in JSON format: " + jsonString);
        System.out.println("\u001B[32mJSON size: " + jsonString.getBytes().length + "\u001B[0m");
    }

    // Fetching book by ISBN
    private static void fetchBookByISBN(BookServiceGrpc.BookServiceBlockingStub stub) {
        System.out.println("============================================");
        System.out.println("      Requesting to fetch book by ISBN      ");
        System.out.println("============================================");

        ISBNRequest request = ISBNRequest.newBuilder().setIsbn("978-2-7298-4564-3").build();
        try {
            BookResponse getResponse = stub.getBookByISBN(request);
            System.out.println("Response from " + getResponse.getMessage());
            System.out.println("Fetched Book: \n" + getResponse.getBook());
        } catch (StatusRuntimeException e) {
            System.out.println("Error: " + e.getStatus());
        }
    }

    // Print Book details
    private static void printBookDetails(Book book) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Decoded Book: ");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Year: " + book.getPublicationYear());
        System.out.println("Category: " + book.getCategory());
        System.out.println("Publisher: " + book.getPublisher().getName());
    }

    public static void main(String[] args) {
        ManagedChannel channel = setupChannel();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);

        // Protobuf operations
        handleProtobufBook(stub);

        // Fetch book by ISBN
        fetchBookByISBN(stub);

        // JSON operations
        convertBookToJson();

        // Shutdown the channel
        channel.shutdown();
    }
}
