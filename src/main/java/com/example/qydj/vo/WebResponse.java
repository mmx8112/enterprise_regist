package com.example.qydj.vo;

import com.example.qydj.dto.CResponseBody;
import lombok.Data;

/**
 * 统一出参
 * @author mhh
 * @date 2022/4/7 9:06
 */
@Data
public class WebResponse {
    private String responseDesc = "success";
    private String apiStatus = "00";
    private CResponseBody responseBody;
    private String responseCode = "000000000000";



}
