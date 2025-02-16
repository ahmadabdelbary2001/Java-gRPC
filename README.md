# Java gRPC Book Service Application

## Overview
This project is a full-stack gRPC-based application that implements a book service. It consists of a server and a client that communicate over a network using Protocol Buffers. The server manages a collection of books and provides RPC methods for creating a new book and retrieving a book by its ISBN, while the client demonstrates how to build, encode, decode, and convert book objects. The project also includes unit tests to compare the sizes of serialized messages in Protobuf and JSON formats.

## Technical Stack
- Java
- gRPC
- Protocol Buffers

## Features

### Book Service (Server)
- Create a new book and add it to an in-memory database.
- Retrieve book details by ISBN.
- Encode and decode Protocol Buffer messages on the server side.

### Client Operations
- Build a book object with title, author, ISBN, publication year, category, and publisher information.
- Serialize the book object to a Protobuf byte array and deserialize it back.
- Convert the book object to JSON format.
- Communicate with the server using gRPC to create and fetch books.

### Message Size Comparison
- Compare the sizes of the serialized Protobuf message and its JSON representation using unit tests.

## Project Structure

### Protocol Buffers Definition
book.proto:
- Defines the messages: `Book`, `Books`, `ISBNRequest`, `BookResponse` and the `BookService` RPC methods (`GetBookByISBN` and `CreateBook`).

### Server-Side
MyServer.java:
- Implements the gRPC server that listens on port 8080.
- Contains the `BookServiceHandler` class (extending `BookServiceGrpc.BookServiceImplBase`) to handle RPC calls.
- Uses an in-memory store to simulate a book database.

### Client-Side
MyClient.java:
- Sets up a gRPC channel and blocking stub for communication with the server.
- Demonstrates building a book object, encoding/decoding Protobuf messages, converting to JSON, and making gRPC calls.

### Testing
MessageSizesTest.java:
- Contains JUnit test cases to compare the size of a book object when serialized using Protobuf versus JSON.
- Prints the size (in bytes) of both the Protobuf byte array and the JSON string.

### Additional Files
book.json:
- A sample JSON representation of a book object.

book.proto (snippet):
- A snippet showing the serialized form of a book message.

## Getting Started

### Prerequisites
- Java 21 or higher
- Maven
- gRPC tools (e.g., protoc compiler for generating Java files from .proto definitions)

### Installation
1. **Clone the Repository**
   ```bash
   git clone https://github.com/ahmadabdelbary2001/Java-gRPC.git
   ```
2. **Generate Java Files from .proto**
   ```bash
   protoc --java_out=src/main/java proto/book.proto
   protoc --grpc-java_out=src/main/java proto/book.proto
   ```
3. **Build the project**
   ```bash
   mvn clean install
   ```
