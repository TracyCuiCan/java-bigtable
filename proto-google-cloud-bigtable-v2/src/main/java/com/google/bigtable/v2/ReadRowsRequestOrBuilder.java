/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ReadRowsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ReadRowsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique name of the table from which to read.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>
   * string table_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   *
   *
   * <pre>
   * Required. The unique name of the table from which to read.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>
   * string table_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString getTableNameBytes();

  /**
   *
   *
   * <pre>
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 5;</code>
   *
   * @return The appProfileId.
   */
  java.lang.String getAppProfileId();
  /**
   *
   *
   * <pre>
   * This value specifies routing for replication. If not specified, the
   * "default" application profile will be used.
   * </pre>
   *
   * <code>string app_profile_id = 5;</code>
   *
   * @return The bytes for appProfileId.
   */
  com.google.protobuf.ByteString getAppProfileIdBytes();

  /**
   *
   *
   * <pre>
   * The row keys and/or ranges to read sequentially. If not specified, reads
   * from all rows.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowSet rows = 2;</code>
   *
   * @return Whether the rows field is set.
   */
  boolean hasRows();
  /**
   *
   *
   * <pre>
   * The row keys and/or ranges to read sequentially. If not specified, reads
   * from all rows.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowSet rows = 2;</code>
   *
   * @return The rows.
   */
  com.google.bigtable.v2.RowSet getRows();
  /**
   *
   *
   * <pre>
   * The row keys and/or ranges to read sequentially. If not specified, reads
   * from all rows.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowSet rows = 2;</code>
   */
  com.google.bigtable.v2.RowSetOrBuilder getRowsOrBuilder();

  /**
   *
   *
   * <pre>
   * The filter to apply to the contents of the specified row(s). If unset,
   * reads the entirety of each row.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowFilter filter = 3;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * The filter to apply to the contents of the specified row(s). If unset,
   * reads the entirety of each row.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowFilter filter = 3;</code>
   *
   * @return The filter.
   */
  com.google.bigtable.v2.RowFilter getFilter();
  /**
   *
   *
   * <pre>
   * The filter to apply to the contents of the specified row(s). If unset,
   * reads the entirety of each row.
   * </pre>
   *
   * <code>.google.bigtable.v2.RowFilter filter = 3;</code>
   */
  com.google.bigtable.v2.RowFilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The read will stop after committing to N rows' worth of results. The
   * default (zero) is to return all results.
   * </pre>
   *
   * <code>int64 rows_limit = 4;</code>
   *
   * @return The rowsLimit.
   */
  long getRowsLimit();

  /**
   *
   *
   * <pre>
   * The view into RequestStats, as described above.
   * </pre>
   *
   * <code>.google.bigtable.v2.ReadRowsRequest.RequestStatsView request_stats_view = 6;</code>
   *
   * @return The enum numeric value on the wire for requestStatsView.
   */
  int getRequestStatsViewValue();
  /**
   *
   *
   * <pre>
   * The view into RequestStats, as described above.
   * </pre>
   *
   * <code>.google.bigtable.v2.ReadRowsRequest.RequestStatsView request_stats_view = 6;</code>
   *
   * @return The requestStatsView.
   */
  com.google.bigtable.v2.ReadRowsRequest.RequestStatsView getRequestStatsView();

  /**
   *
   *
   * <pre>
   * Experimental API - Please note that this API is currently experimental
   * and can change in the future.
   *
   * Return rows in lexiographical descending order of the row keys. The row
   * contents will not be affected by this flag.
   *
   * Example result set:
   *
   *     [
   *       {key: "k2", "f:col1": "v1", "f:col2": "v1"},
   *       {key: "k1", "f:col1": "v2", "f:col2": "v2"}
   *     ]
   * </pre>
   *
   * <code>bool reversed = 7;</code>
   *
   * @return The reversed.
   */
  boolean getReversed();
}
