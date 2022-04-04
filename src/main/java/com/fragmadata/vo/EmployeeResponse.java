package com.fragmadata.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "eid", "status", "error" })
@Generated("jsonschema2pojo")
public class EmployeeResponse {

	@JsonProperty("eid")
	private Object eid;
	@JsonProperty("status")
	private String status;
	@JsonProperty("error")
	private List<String> error = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("eid")
	public Object getEid() {
		return eid;
	}

	@JsonProperty("eid")
	public void setEid(Object eid) {
		this.eid = eid;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("error")
	public List<String> getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(List<String> error) {
		this.error = error;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}