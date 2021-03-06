// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

public interface PackageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.package.Package)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  java.util.List<io.grafeas.v1beta1.pkg.Distribution> 
      getDistributionList();
  /**
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  io.grafeas.v1beta1.pkg.Distribution getDistribution(int index);
  /**
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  int getDistributionCount();
  /**
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.pkg.DistributionOrBuilder> 
      getDistributionOrBuilderList();
  /**
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
   */
  io.grafeas.v1beta1.pkg.DistributionOrBuilder getDistributionOrBuilder(
      int index);
}
