package com.fragmadata.vo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"pId",
"eId",
"startDate",
"endDate",
"status",
"createdDate",
"createdBy"
})
@Generated("jsonschema2pojo")
public class ProjectEmployeeRequest {

@JsonProperty("pId")
private Integer pId;
@JsonProperty("eId")
private Integer eId;
@JsonProperty("startDate")
private String startDate;
@JsonProperty("endDate")
private String endDate;
@JsonProperty("status")
private String status;
@JsonProperty("createdDate")
private String createdDate;
@JsonProperty("createdBy")
private String createdBy;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("pId")
public Integer getpId() {
return pId;
}

@JsonProperty("pId")
public void setpId(Integer pId) {
this.pId = pId;
}

@JsonProperty("eId")
public Integer geteId() {
return eId;
}

@JsonProperty("eId")
public void seteId(Integer eId) {
this.eId = eId;
}

@JsonProperty("startDate")
public String getStartDate() {
return startDate;
}

@JsonProperty("startDate")
public void setStartDate(String startDate) {
this.startDate = startDate;
}

@JsonProperty("endDate")
public String getEndDate() {
return endDate;
}

@JsonProperty("endDate")
public void setEndDate(String endDate) {
this.endDate = endDate;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("createdDate")
public String getCreatedDate() {
return createdDate;
}

@JsonProperty("createdDate")
public void setCreatedDate(String createdDate) {
this.createdDate = createdDate;
}

@JsonProperty("createdBy")
public String getCreatedBy() {
return createdBy;
}

@JsonProperty("createdBy")
public void setCreatedBy(String createdBy) {
this.createdBy = createdBy;
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