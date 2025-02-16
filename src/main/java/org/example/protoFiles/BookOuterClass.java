// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: book.proto
// Protobuf Java Version: 4.28.2

package org.example.protoFiles;

public final class BookOuterClass {
  private BookOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      BookOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Books_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Books_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Book_Publisher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Book_Publisher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ISBNRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ISBNRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BookResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nbook.proto\"\035\n\005Books\022\024\n\005books\030\001 \003(\0132\005.B" +
      "ook\"\220\002\n\004Book\022\r\n\005title\030\001 \001(\t\022\016\n\006author\030\002 " +
      "\001(\t\022\014\n\004isbn\030\003 \001(\t\022\027\n\017publicationYear\030\004 \001" +
      "(\005\022 \n\010category\030\005 \001(\0162\016.Book.Category\022\"\n\t" +
      "publisher\030\006 \001(\0132\017.Book.Publisher\032+\n\tPubl" +
      "isher\022\014\n\004name\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\"O\n" +
      "\010Category\022\013\n\007UNKNOWN\020\000\022\013\n\007FICTION\020\001\022\017\n\013N" +
      "ON_FICTION\020\002\022\013\n\007SCIENCE\020\003\022\013\n\007HISTORY\020\004\"\033" +
      "\n\013ISBNRequest\022\014\n\004isbn\030\001 \001(\t\"4\n\014BookRespo" +
      "nse\022\017\n\007message\030\001 \001(\t\022\023\n\004book\030\002 \001(\0132\005.Boo" +
      "k2_\n\013BookService\022,\n\rGetBookByISBN\022\014.ISBN" +
      "Request\032\r.BookResponse\022\"\n\nCreateBook\022\005.B" +
      "ook\032\r.BookResponseB\032\n\026org.example.protoF" +
      "ilesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Books_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Books_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Books_descriptor,
        new java.lang.String[] { "Books", });
    internal_static_Book_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Book_descriptor,
        new java.lang.String[] { "Title", "Author", "Isbn", "PublicationYear", "Category", "Publisher", });
    internal_static_Book_Publisher_descriptor =
      internal_static_Book_descriptor.getNestedTypes().get(0);
    internal_static_Book_Publisher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Book_Publisher_descriptor,
        new java.lang.String[] { "Name", "Location", });
    internal_static_ISBNRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ISBNRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ISBNRequest_descriptor,
        new java.lang.String[] { "Isbn", });
    internal_static_BookResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_BookResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BookResponse_descriptor,
        new java.lang.String[] { "Message", "Book", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
