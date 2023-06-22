/*
 * Copyright 2020 Google LLC
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
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface ChangeStreamConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ChangeStreamConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   *
   * @return Whether the retentionPeriod field is set.
   */
  boolean hasRetentionPeriod();
  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   *
   * @return The retentionPeriod.
   */
  com.google.protobuf.Duration getRetentionPeriod();
  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getRetentionPeriodOrBuilder();
}