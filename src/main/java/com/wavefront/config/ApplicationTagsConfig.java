package com.wavefront.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Application Tags YAML Config.
 *
 * @author Sushant Dewan (sushant@wavefront.com).
 */
public class ApplicationTagsConfig {

  /**
   * Name of the application.
   */
  @Nonnull
  @JsonProperty
  private String application = "defaultApplication";

  /**
   * Name of the service.
   */
  @Nonnull
  @JsonProperty
  private String service = "defaultService";

  /**
   * Cluster where the service is running in.
   */
  @Nullable
  @JsonProperty
  private String cluster;

  /**
   * Shard where the service is running on.
   */
  @Nullable
  @JsonProperty
  private String shard;

  /**
   * Additional metadata.
   */
  @Nullable
  @JsonProperty
  Map<String, String> customTags;

  @Nonnull
  public String getApplication() {
    return application;
  }

  @Nonnull
  public String getService() {
    return service;
  }

  @Nullable
  public String getCluster() {
    return cluster;
  }

  @Nullable
  public String getShard() {
    return shard;
  }

  @Nullable
  public Map<String, String> getCustomTags() {
    return customTags;
  }

  public void setApplication(@Nonnull String application) {
    this.application = application;
  }

  public void setService(@Nonnull String service) {
    this.service = service;
  }

  public void setCluster(@Nullable String cluster) {
    this.cluster = cluster;
  }

  public void setShard(@Nullable String shard) {
    this.shard = shard;
  }

  public void setCustomTags(@Nullable Map<String, String> customTags) {
    this.customTags = customTags;
  }
}
