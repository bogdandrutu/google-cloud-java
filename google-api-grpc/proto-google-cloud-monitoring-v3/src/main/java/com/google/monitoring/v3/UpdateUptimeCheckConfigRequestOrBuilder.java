// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public interface UpdateUptimeCheckConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateUptimeCheckConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. If present, only the listed fields in the current uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. If present, only the listed fields in the current uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. If present, only the listed fields in the current uptime check
   * configuration are updated with values from the new configuration. If this
   * field is empty, then the current configuration is completely replaced with
   * the new configuration.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. If an `"updateMask"` has been specified, this field gives
   * the values for the set of fields mentioned in the `"updateMask"`. If an
   * `"updateMask"` has not been given, this uptime check configuration replaces
   * the current configuration. If a field is mentioned in `"updateMask"` but
   * the corresonding field is omitted in this partial uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3;</code>
   */
  boolean hasUptimeCheckConfig();
  /**
   * <pre>
   * Required. If an `"updateMask"` has been specified, this field gives
   * the values for the set of fields mentioned in the `"updateMask"`. If an
   * `"updateMask"` has not been given, this uptime check configuration replaces
   * the current configuration. If a field is mentioned in `"updateMask"` but
   * the corresonding field is omitted in this partial uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig();
  /**
   * <pre>
   * Required. If an `"updateMask"` has been specified, this field gives
   * the values for the set of fields mentioned in the `"updateMask"`. If an
   * `"updateMask"` has not been given, this uptime check configuration replaces
   * the current configuration. If a field is mentioned in `"updateMask"` but
   * the corresonding field is omitted in this partial uptime check
   * configuration, it has the effect of deleting/clearing the field from the
   * configuration on the server.
   * The following fields can be updated: `display_name`,
   * `http_check`, `tcp_check`, `timeout`, `content_matchers`, and
   * `selected_regions`.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 3;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder();
}
