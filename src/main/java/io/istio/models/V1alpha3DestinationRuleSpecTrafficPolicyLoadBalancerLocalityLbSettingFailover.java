/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.istio.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T14:22:47.686Z[Etc/UTC]")
public class V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;


  public V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Originating region.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Originating region.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover v1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover = (V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover) o;
    return Objects.equals(this.from, v1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover.from) &&
        Objects.equals(this.to, v1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DestinationRuleSpecTrafficPolicyLoadBalancerLocalityLbSettingFailover {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

