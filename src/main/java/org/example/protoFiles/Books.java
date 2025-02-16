// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: book.proto
// Protobuf Java Version: 4.28.2

package org.example.protoFiles;

/**
 * Protobuf type {@code Books}
 */
public final class Books extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Books)
    BooksOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      Books.class.getName());
  }
  // Use Books.newBuilder() to construct.
  private Books(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Books() {
    books_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.protoFiles.BookOuterClass.internal_static_Books_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.protoFiles.BookOuterClass.internal_static_Books_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.protoFiles.Books.class, org.example.protoFiles.Books.Builder.class);
  }

  public static final int BOOKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.protoFiles.Book> books_;
  /**
   * <code>repeated .Book books = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.protoFiles.Book> getBooksList() {
    return books_;
  }
  /**
   * <code>repeated .Book books = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.protoFiles.BookOrBuilder> 
      getBooksOrBuilderList() {
    return books_;
  }
  /**
   * <code>repeated .Book books = 1;</code>
   */
  @java.lang.Override
  public int getBooksCount() {
    return books_.size();
  }
  /**
   * <code>repeated .Book books = 1;</code>
   */
  @java.lang.Override
  public org.example.protoFiles.Book getBooks(int index) {
    return books_.get(index);
  }
  /**
   * <code>repeated .Book books = 1;</code>
   */
  @java.lang.Override
  public org.example.protoFiles.BookOrBuilder getBooksOrBuilder(
      int index) {
    return books_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < books_.size(); i++) {
      output.writeMessage(1, books_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < books_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, books_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.protoFiles.Books)) {
      return super.equals(obj);
    }
    org.example.protoFiles.Books other = (org.example.protoFiles.Books) obj;

    if (!getBooksList()
        .equals(other.getBooksList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBooksCount() > 0) {
      hash = (37 * hash) + BOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getBooksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.protoFiles.Books parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protoFiles.Books parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protoFiles.Books parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protoFiles.Books parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protoFiles.Books parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.protoFiles.Books parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.protoFiles.Books parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.example.protoFiles.Books parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.protoFiles.Books parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.protoFiles.Books parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.protoFiles.Books parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.example.protoFiles.Books parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.protoFiles.Books prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Books}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Books)
      org.example.protoFiles.BooksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.protoFiles.BookOuterClass.internal_static_Books_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.protoFiles.BookOuterClass.internal_static_Books_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.protoFiles.Books.class, org.example.protoFiles.Books.Builder.class);
    }

    // Construct using org.example.protoFiles.Books.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (booksBuilder_ == null) {
        books_ = java.util.Collections.emptyList();
      } else {
        books_ = null;
        booksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.protoFiles.BookOuterClass.internal_static_Books_descriptor;
    }

    @java.lang.Override
    public org.example.protoFiles.Books getDefaultInstanceForType() {
      return org.example.protoFiles.Books.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.protoFiles.Books build() {
      org.example.protoFiles.Books result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.protoFiles.Books buildPartial() {
      org.example.protoFiles.Books result = new org.example.protoFiles.Books(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.protoFiles.Books result) {
      if (booksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          books_ = java.util.Collections.unmodifiableList(books_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.books_ = books_;
      } else {
        result.books_ = booksBuilder_.build();
      }
    }

    private void buildPartial0(org.example.protoFiles.Books result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.protoFiles.Books) {
        return mergeFrom((org.example.protoFiles.Books)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.protoFiles.Books other) {
      if (other == org.example.protoFiles.Books.getDefaultInstance()) return this;
      if (booksBuilder_ == null) {
        if (!other.books_.isEmpty()) {
          if (books_.isEmpty()) {
            books_ = other.books_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBooksIsMutable();
            books_.addAll(other.books_);
          }
          onChanged();
        }
      } else {
        if (!other.books_.isEmpty()) {
          if (booksBuilder_.isEmpty()) {
            booksBuilder_.dispose();
            booksBuilder_ = null;
            books_ = other.books_;
            bitField0_ = (bitField0_ & ~0x00000001);
            booksBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getBooksFieldBuilder() : null;
          } else {
            booksBuilder_.addAllMessages(other.books_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.example.protoFiles.Book m =
                  input.readMessage(
                      org.example.protoFiles.Book.parser(),
                      extensionRegistry);
              if (booksBuilder_ == null) {
                ensureBooksIsMutable();
                books_.add(m);
              } else {
                booksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.example.protoFiles.Book> books_ =
      java.util.Collections.emptyList();
    private void ensureBooksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        books_ = new java.util.ArrayList<org.example.protoFiles.Book>(books_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.example.protoFiles.Book, org.example.protoFiles.Book.Builder, org.example.protoFiles.BookOrBuilder> booksBuilder_;

    /**
     * <code>repeated .Book books = 1;</code>
     */
    public java.util.List<org.example.protoFiles.Book> getBooksList() {
      if (booksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(books_);
      } else {
        return booksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public int getBooksCount() {
      if (booksBuilder_ == null) {
        return books_.size();
      } else {
        return booksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public org.example.protoFiles.Book getBooks(int index) {
      if (booksBuilder_ == null) {
        return books_.get(index);
      } else {
        return booksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder setBooks(
        int index, org.example.protoFiles.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.set(index, value);
        onChanged();
      } else {
        booksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder setBooks(
        int index, org.example.protoFiles.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.set(index, builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder addBooks(org.example.protoFiles.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.add(value);
        onChanged();
      } else {
        booksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder addBooks(
        int index, org.example.protoFiles.Book value) {
      if (booksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBooksIsMutable();
        books_.add(index, value);
        onChanged();
      } else {
        booksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder addBooks(
        org.example.protoFiles.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.add(builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder addBooks(
        int index, org.example.protoFiles.Book.Builder builderForValue) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.add(index, builderForValue.build());
        onChanged();
      } else {
        booksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder addAllBooks(
        java.lang.Iterable<? extends org.example.protoFiles.Book> values) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, books_);
        onChanged();
      } else {
        booksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder clearBooks() {
      if (booksBuilder_ == null) {
        books_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        booksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public Builder removeBooks(int index) {
      if (booksBuilder_ == null) {
        ensureBooksIsMutable();
        books_.remove(index);
        onChanged();
      } else {
        booksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public org.example.protoFiles.Book.Builder getBooksBuilder(
        int index) {
      return getBooksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public org.example.protoFiles.BookOrBuilder getBooksOrBuilder(
        int index) {
      if (booksBuilder_ == null) {
        return books_.get(index);  } else {
        return booksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public java.util.List<? extends org.example.protoFiles.BookOrBuilder> 
         getBooksOrBuilderList() {
      if (booksBuilder_ != null) {
        return booksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(books_);
      }
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public org.example.protoFiles.Book.Builder addBooksBuilder() {
      return getBooksFieldBuilder().addBuilder(
          org.example.protoFiles.Book.getDefaultInstance());
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public org.example.protoFiles.Book.Builder addBooksBuilder(
        int index) {
      return getBooksFieldBuilder().addBuilder(
          index, org.example.protoFiles.Book.getDefaultInstance());
    }
    /**
     * <code>repeated .Book books = 1;</code>
     */
    public java.util.List<org.example.protoFiles.Book.Builder> 
         getBooksBuilderList() {
      return getBooksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.example.protoFiles.Book, org.example.protoFiles.Book.Builder, org.example.protoFiles.BookOrBuilder> 
        getBooksFieldBuilder() {
      if (booksBuilder_ == null) {
        booksBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.example.protoFiles.Book, org.example.protoFiles.Book.Builder, org.example.protoFiles.BookOrBuilder>(
                books_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        books_ = null;
      }
      return booksBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:Books)
  }

  // @@protoc_insertion_point(class_scope:Books)
  private static final org.example.protoFiles.Books DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.protoFiles.Books();
  }

  public static org.example.protoFiles.Books getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Books>
      PARSER = new com.google.protobuf.AbstractParser<Books>() {
    @java.lang.Override
    public Books parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Books> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Books> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.protoFiles.Books getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

