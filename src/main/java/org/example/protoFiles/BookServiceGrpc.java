package org.example.protoFiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to exchange book data
 * </pre>
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: book.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.protoFiles.ISBNRequest,
      org.example.protoFiles.BookResponse> getGetBookByISBNMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBookByISBN",
      requestType = org.example.protoFiles.ISBNRequest.class,
      responseType = org.example.protoFiles.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protoFiles.ISBNRequest,
      org.example.protoFiles.BookResponse> getGetBookByISBNMethod() {
    io.grpc.MethodDescriptor<org.example.protoFiles.ISBNRequest, org.example.protoFiles.BookResponse> getGetBookByISBNMethod;
    if ((getGetBookByISBNMethod = BookServiceGrpc.getGetBookByISBNMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBookByISBNMethod = BookServiceGrpc.getGetBookByISBNMethod) == null) {
          BookServiceGrpc.getGetBookByISBNMethod = getGetBookByISBNMethod =
              io.grpc.MethodDescriptor.<org.example.protoFiles.ISBNRequest, org.example.protoFiles.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBookByISBN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protoFiles.ISBNRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protoFiles.BookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBookByISBN"))
              .build();
        }
      }
    }
    return getGetBookByISBNMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.protoFiles.Book,
      org.example.protoFiles.BookResponse> getCreateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBook",
      requestType = org.example.protoFiles.Book.class,
      responseType = org.example.protoFiles.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.protoFiles.Book,
      org.example.protoFiles.BookResponse> getCreateBookMethod() {
    io.grpc.MethodDescriptor<org.example.protoFiles.Book, org.example.protoFiles.BookResponse> getCreateBookMethod;
    if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
          BookServiceGrpc.getCreateBookMethod = getCreateBookMethod =
              io.grpc.MethodDescriptor.<org.example.protoFiles.Book, org.example.protoFiles.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protoFiles.Book.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.protoFiles.BookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("CreateBook"))
              .build();
        }
      }
    }
    return getCreateBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to exchange book data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC method to get details of a book by ISBN
     * </pre>
     */
    default void getBookByISBN(org.example.protoFiles.ISBNRequest request,
        io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookByISBNMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC method to create or add a book to the collection
     * </pre>
     */
    default void createBook(org.example.protoFiles.Book request,
        io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBookMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookService.
   * <pre>
   * Service to exchange book data
   * </pre>
   */
  public static abstract class BookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookService.
   * <pre>
   * Service to exchange book data
   * </pre>
   */
  public static final class BookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get details of a book by ISBN
     * </pre>
     */
    public void getBookByISBN(org.example.protoFiles.ISBNRequest request,
        io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookByISBNMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC method to create or add a book to the collection
     * </pre>
     */
    public void createBook(org.example.protoFiles.Book request,
        io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookService.
   * <pre>
   * Service to exchange book data
   * </pre>
   */
  public static final class BookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get details of a book by ISBN
     * </pre>
     */
    public org.example.protoFiles.BookResponse getBookByISBN(org.example.protoFiles.ISBNRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookByISBNMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC method to create or add a book to the collection
     * </pre>
     */
    public org.example.protoFiles.BookResponse createBook(org.example.protoFiles.Book request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookService.
   * <pre>
   * Service to exchange book data
   * </pre>
   */
  public static final class BookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get details of a book by ISBN
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protoFiles.BookResponse> getBookByISBN(
        org.example.protoFiles.ISBNRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookByISBNMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC method to create or add a book to the collection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.protoFiles.BookResponse> createBook(
        org.example.protoFiles.Book request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOK_BY_ISBN = 0;
  private static final int METHODID_CREATE_BOOK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOK_BY_ISBN:
          serviceImpl.getBookByISBN((org.example.protoFiles.ISBNRequest) request,
              (io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse>) responseObserver);
          break;
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((org.example.protoFiles.Book) request,
              (io.grpc.stub.StreamObserver<org.example.protoFiles.BookResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetBookByISBNMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protoFiles.ISBNRequest,
              org.example.protoFiles.BookResponse>(
                service, METHODID_GET_BOOK_BY_ISBN)))
        .addMethod(
          getCreateBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.protoFiles.Book,
              org.example.protoFiles.BookResponse>(
                service, METHODID_CREATE_BOOK)))
        .build();
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.protoFiles.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getGetBookByISBNMethod())
              .addMethod(getCreateBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
