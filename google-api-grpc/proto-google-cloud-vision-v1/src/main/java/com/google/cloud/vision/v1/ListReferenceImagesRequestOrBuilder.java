// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface ListReferenceImagesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ListReferenceImagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the product containing the reference images.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the product containing the reference images.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of items to return. Default 10, maximum 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * A token identifying a page of results to be returned. This is the value
   * of `nextPageToken` returned in a previous reference image list request.
   * Defaults to the first page if not specified.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A token identifying a page of results to be returned. This is the value
   * of `nextPageToken` returned in a previous reference image list request.
   * Defaults to the first page if not specified.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
