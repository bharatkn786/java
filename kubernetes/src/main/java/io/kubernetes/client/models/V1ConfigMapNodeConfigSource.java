/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
 */
@ApiModel(description = "ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.")

public class V1ConfigMapNodeConfigSource {
  @SerializedName("kubeletConfigKey")
  private String kubeletConfigKey = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("resourceVersion")
  private String resourceVersion = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ConfigMapNodeConfigSource kubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

   /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
   * @return kubeletConfigKey
  **/
  @ApiModelProperty(required = true, value = "KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.")
  public String getKubeletConfigKey() {
    return kubeletConfigKey;
  }

  public void setKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
  }

  public V1ConfigMapNodeConfigSource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ConfigMapNodeConfigSource namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ConfigMapNodeConfigSource resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ConfigMapNodeConfigSource uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return uid
  **/
  @ApiModelProperty(value = "UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigMapNodeConfigSource v1ConfigMapNodeConfigSource = (V1ConfigMapNodeConfigSource) o;
    return Objects.equals(this.kubeletConfigKey, v1ConfigMapNodeConfigSource.kubeletConfigKey) &&
        Objects.equals(this.name, v1ConfigMapNodeConfigSource.name) &&
        Objects.equals(this.namespace, v1ConfigMapNodeConfigSource.namespace) &&
        Objects.equals(this.resourceVersion, v1ConfigMapNodeConfigSource.resourceVersion) &&
        Objects.equals(this.uid, v1ConfigMapNodeConfigSource.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletConfigKey, name, namespace, resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigMapNodeConfigSource {\n");
    
    sb.append("    kubeletConfigKey: ").append(toIndentedString(kubeletConfigKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
