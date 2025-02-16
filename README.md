# Java gRPC Book Service Application

## Overview
This project is a full-stack gRPC-based book service application. The server manages a collection of books—providing RPC methods to create and retrieve books by ISBN—while the client builds, serializes, and converts book objects (using Protocol Buffers and JSON) and communicates with the server via gRPC. Unit tests compare the sizes of the serialized messages in Protobuf and JSON formats.

## Features
- **Book Service:** Create books, retrieve details by ISBN, and handle Protocol Buffer encoding/decoding.
- **Client Operations:** Build book objects, serialize/deserialize them, convert to JSON, and perform gRPC calls.
- **Testing:** Compare the byte sizes of Protobuf and JSON representations using JUnit tests.

## Project Structure
- **Protocol Buffers Definition**
  - **book.proto:** Defines messages (`Book`, `Books`, `ISBNRequest`, `BookResponse`) and the `BookService` RPC methods (`GetBookByISBN` and `CreateBook`).

- **Server-Side**
  - **MyServer.java:** Implements the gRPC server on port 8080. Contains the `BookServiceHandler` (extending `BookServiceGrpc.BookServiceImplBase`) to handle RPC calls using an in-memory book database.

- **Client-Side**
  - **MyClient.java:** Sets up a gRPC channel and blocking stub to communicate with the server. Demonstrates building a book object, serializing it with Protocol Buffers, converting it to JSON, and making gRPC calls.

- **Testing**
  - **MessageSizesTest.java:** Contains JUnit tests that print and compare the sizes (in bytes) of a book object serialized to Protobuf and JSON.

- **Additional Files**
  - **book.json:** A sample JSON representation of a book object.
  - **book.proto (snippet):** A snippet showing the serialized form of a book message.

## Technical Stack
- Java
- gRPC
- Protocol Buffers

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
