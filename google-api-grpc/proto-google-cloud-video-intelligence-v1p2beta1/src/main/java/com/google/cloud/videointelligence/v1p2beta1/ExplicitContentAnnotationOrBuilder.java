// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

public interface ExplicitContentAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.ExplicitContentAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame> 
      getFramesList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame getFrames(int index);
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame frames = 1;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.ExplicitContentFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.ExplicitContentFrameOrBuilder getFramesOrBuilder(
      int index);
}
