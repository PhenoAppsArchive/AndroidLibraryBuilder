/**
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class ObservationUnitsTableResponse implements Serializable {
  
  @SerializedName("data")
  private List<List<String>> data = null;
  @SerializedName("headerRow")
  private List<String> headerRow = null;
  @SerializedName("observationVariableDbIds")
  private List<String> observationVariableDbIds = null;
  @SerializedName("observationVariableNames")
  private List<String> observationVariableNames = null;

  /**
   * Matrix of observation meta-data and recorded values. Each inner array represents 1 row of data.
   **/
  @ApiModelProperty(value = "Matrix of observation meta-data and recorded values. Each inner array represents 1 row of data.")
  public List<List<String>> getData() {
    return data;
  }
  public void setData(List<List<String>> data) {
    this.data = data;
  }

  /**
   * Names of the columns included in the data matrix. Any or All of [ \"year\",\"studyDbId\",\"studyName\",\"locationDbId\",\"locationName\",\"germplasmDbId\",\"germplasmName\",\"observationUnitDbId\",\"plotNumber\",\"replicate\",\"blockNumber\", \"observationTimestamp\", \"entryType\", \"X\", \"Y\"]
   **/
  @ApiModelProperty(value = "Names of the columns included in the data matrix. Any or All of [ \"year\",\"studyDbId\",\"studyName\",\"locationDbId\",\"locationName\",\"germplasmDbId\",\"germplasmName\",\"observationUnitDbId\",\"plotNumber\",\"replicate\",\"blockNumber\", \"observationTimestamp\", \"entryType\", \"X\", \"Y\"]")
  public List<String> getHeaderRow() {
    return headerRow;
  }
  public void setHeaderRow(List<String> headerRow) {
    this.headerRow = headerRow;
  }

  /**
   * Array of observation variable DbIds for the collected data. This array is appended to the \"headerRow\" to get the complete header of the data matrix
   **/
  @ApiModelProperty(value = "Array of observation variable DbIds for the collected data. This array is appended to the \"headerRow\" to get the complete header of the data matrix")
  public List<String> getObservationVariableDbIds() {
    return observationVariableDbIds;
  }
  public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
    this.observationVariableDbIds = observationVariableDbIds;
  }

  /**
   * Human readable names of the observation variables for the collected data. This array should match 1 to 1 with the \"observationVariableDbIds\" array.
   **/
  @ApiModelProperty(value = "Human readable names of the observation variables for the collected data. This array should match 1 to 1 with the \"observationVariableDbIds\" array.")
  public List<String> getObservationVariableNames() {
    return observationVariableNames;
  }
  public void setObservationVariableNames(List<String> observationVariableNames) {
    this.observationVariableNames = observationVariableNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationUnitsTableResponse observationUnitsTableResponse = (ObservationUnitsTableResponse) o;
    return (this.data == null ? observationUnitsTableResponse.data == null : this.data.equals(observationUnitsTableResponse.data)) &&
        (this.headerRow == null ? observationUnitsTableResponse.headerRow == null : this.headerRow.equals(observationUnitsTableResponse.headerRow)) &&
        (this.observationVariableDbIds == null ? observationUnitsTableResponse.observationVariableDbIds == null : this.observationVariableDbIds.equals(observationUnitsTableResponse.observationVariableDbIds)) &&
        (this.observationVariableNames == null ? observationUnitsTableResponse.observationVariableNames == null : this.observationVariableNames.equals(observationUnitsTableResponse.observationVariableNames));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.headerRow == null ? 0: this.headerRow.hashCode());
    result = 31 * result + (this.observationVariableDbIds == null ? 0: this.observationVariableDbIds.hashCode());
    result = 31 * result + (this.observationVariableNames == null ? 0: this.observationVariableNames.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitsTableResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  headerRow: ").append(headerRow).append("\n");
    sb.append("  observationVariableDbIds: ").append(observationVariableDbIds).append("\n");
    sb.append("  observationVariableNames: ").append(observationVariableNames).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}