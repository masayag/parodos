/*
 * Parodos Notification Service API
 * This is the API documentation for the Parodos Notification Service. It provides operations to send out and check notification. The endpoints are secured with oAuth2/OpenID and cannot be accessed without a valid token.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.notification.sdk.model;

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
 * PageMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageMetadata {

	public static final String SERIALIZED_NAME_NUMBER = "number";

	@SerializedName(SERIALIZED_NAME_NUMBER)
	private Long number;

	public static final String SERIALIZED_NAME_SIZE = "size";

	@SerializedName(SERIALIZED_NAME_SIZE)
	private Long size;

	public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";

	@SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
	private Long totalElements;

	public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";

	@SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
	private Long totalPages;

	public PageMetadata() {
	}

	public PageMetadata number(Long number) {

		this.number = number;
		return this;
	}

	/**
	 * Get number
	 * @return number
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public PageMetadata size(Long size) {

		this.size = size;
		return this;
	}

	/**
	 * Get size
	 * @return size
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public PageMetadata totalElements(Long totalElements) {

		this.totalElements = totalElements;
		return this;
	}

	/**
	 * Get totalElements
	 * @return totalElements
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public PageMetadata totalPages(Long totalPages) {

		this.totalPages = totalPages;
		return this;
	}

	/**
	 * Get totalPages
	 * @return totalPages
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "")

	public Long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PageMetadata pageMetadata = (PageMetadata) o;
		return Objects.equals(this.number, pageMetadata.number) && Objects.equals(this.size, pageMetadata.size)
				&& Objects.equals(this.totalElements, pageMetadata.totalElements)
				&& Objects.equals(this.totalPages, pageMetadata.totalPages);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, size, totalElements, totalPages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PageMetadata {\n");
		sb.append("    number: ").append(toIndentedString(number)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
		sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
