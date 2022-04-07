package com.example.qydj.vo;

import com.example.qydj.dto.CResponseBody;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 统一出参
 * @author mhh
 * @date 2022/4/7 9:06
 */
@Data
public class WebResponse {

    @JsonProperty("C-Response-Desc")
    private String responseDesc = "success";

    @JsonProperty("C-API-Status")
    private String apiStatus = "00";

    @JsonProperty("C-Response-Body")
    private CResponseBody responseBody;

    @JsonProperty("C-Response-Code")
    private String responseCode = "000000000000";



}
