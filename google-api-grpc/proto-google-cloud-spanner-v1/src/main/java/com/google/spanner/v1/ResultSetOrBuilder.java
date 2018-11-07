// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/result_set.proto

package com.google.spanner.v1;

public interface ResultSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.ResultSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata about the result set, such as row type information.
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetMetadata metadata = 1;</code>
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata about the result set, such as row type information.
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetMetadata metadata = 1;</code>
   */
  com.google.spanner.v1.ResultSetMetadata getMetadata();
  /**
   * <pre>
   * Metadata about the result set, such as row type information.
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetMetadata metadata = 1;</code>
   */
  com.google.spanner.v1.ResultSetMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Each element in `rows` is a row whose format is defined by
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. The ith element
   * in each row matches the ith field in
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. Elements are
   * encoded based on type as described
   * [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue rows = 2;</code>
   */
  java.util.List<com.google.protobuf.ListValue> 
      getRowsList();
  /**
   * <pre>
   * Each element in `rows` is a row whose format is defined by
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. The ith element
   * in each row matches the ith field in
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. Elements are
   * encoded based on type as described
   * [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue rows = 2;</code>
   */
  com.google.protobuf.ListValue getRows(int index);
  /**
   * <pre>
   * Each element in `rows` is a row whose format is defined by
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. The ith element
   * in each row matches the ith field in
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. Elements are
   * encoded based on type as described
   * [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue rows = 2;</code>
   */
  int getRowsCount();
  /**
   * <pre>
   * Each element in `rows` is a row whose format is defined by
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. The ith element
   * in each row matches the ith field in
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. Elements are
   * encoded based on type as described
   * [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue rows = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.ListValueOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <pre>
   * Each element in `rows` is a row whose format is defined by
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. The ith element
   * in each row matches the ith field in
   * [metadata.row_type][google.spanner.v1.ResultSetMetadata.row_type]. Elements are
   * encoded based on type as described
   * [here][google.spanner.v1.TypeCode].
   * </pre>
   *
   * <code>repeated .google.protobuf.ListValue rows = 2;</code>
   */
  com.google.protobuf.ListValueOrBuilder getRowsOrBuilder(
      int index);

  /**
   * <pre>
   * Query plan and execution statistics for the SQL statement that
   * produced this result set. These can be requested by setting
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * DML statements always produce stats containing the number of rows
   * modified, unless executed using the
   * [ExecuteSqlRequest.QueryMode.PLAN][google.spanner.v1.ExecuteSqlRequest.QueryMode.PLAN] [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * Other fields may or may not be populated, based on the
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetStats stats = 3;</code>
   */
  boolean hasStats();
  /**
   * <pre>
   * Query plan and execution statistics for the SQL statement that
   * produced this result set. These can be requested by setting
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * DML statements always produce stats containing the number of rows
   * modified, unless executed using the
   * [ExecuteSqlRequest.QueryMode.PLAN][google.spanner.v1.ExecuteSqlRequest.QueryMode.PLAN] [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * Other fields may or may not be populated, based on the
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetStats stats = 3;</code>
   */
  com.google.spanner.v1.ResultSetStats getStats();
  /**
   * <pre>
   * Query plan and execution statistics for the SQL statement that
   * produced this result set. These can be requested by setting
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * DML statements always produce stats containing the number of rows
   * modified, unless executed using the
   * [ExecuteSqlRequest.QueryMode.PLAN][google.spanner.v1.ExecuteSqlRequest.QueryMode.PLAN] [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * Other fields may or may not be populated, based on the
   * [ExecuteSqlRequest.query_mode][google.spanner.v1.ExecuteSqlRequest.query_mode].
   * </pre>
   *
   * <code>.google.spanner.v1.ResultSetStats stats = 3;</code>
   */
  com.google.spanner.v1.ResultSetStatsOrBuilder getStatsOrBuilder();
}
