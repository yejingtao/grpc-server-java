// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_route.proto

package com.jingtao.library;

public final class BookServiceProto {
  private BookServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mybook_RequestData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mybook_RequestData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mybook_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mybook_Book_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020book_route.proto\022\006mybook\"\033\n\013RequestDat" +
      "a\022\014\n\004name\030\001 \001(\t\"3\n\004Book\022\014\n\004name\030\001 \001(\t\022\016\n" +
      "\006auther\030\002 \001(\t\022\r\n\005price\030\003 \001(\0052;\n\013BookServ" +
      "ice\022,\n\005check\022\023.mybook.RequestData\032\014.mybo" +
      "ok.Book\"\000B/\n\023com.jingtao.libraryB\020BookSe" +
      "rviceProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mybook_RequestData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mybook_RequestData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mybook_RequestData_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_mybook_Book_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_mybook_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mybook_Book_descriptor,
        new java.lang.String[] { "Name", "Auther", "Price", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
