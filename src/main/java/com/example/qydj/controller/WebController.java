package com.example.qydj.controller;

import com.example.qydj.dto.CResponseBody;
import com.example.qydj.dto.WebRequest;
import com.example.qydj.vo.WebResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mhh
 * @date 2022/4/7 9:02
 */
@RestController
@RequestMapping("qydj")
public class WebController {
    /**
     * 企业登记资料说明
     * @param webRequest
     * @return
     */
    @PostMapping("/gml/itemweb10004")
    public WebResponse eventQuery(WebRequest webRequest){
        return new WebResponse();
    }

    /**
     * 返回空结果
     * @param webRequest
     * @return
     */
    @PostMapping("/gml/itemweb10006")
    public WebResponse queryInfoById(WebRequest webRequest){
        return new WebResponse();
    }

    /**
     *返回行政区划，三级联动
     * @param webRequest
     * @return
     */
    @PostMapping("/gsp/xa/mng6021")
    public WebResponse queryRegion(WebRequest webRequest){
        WebResponse webResponse = new WebResponse();
        webResponse.setResponseBody(new CResponseBody());
        return webResponse;
    }

    /**
     * 返回空
     * @param webRequest
     * @return
     */
    @PostMapping("/gsp/fsx04004")
    public WebResponse queryFsx4004(WebRequest webRequest){
        return new WebResponse();
    }

}
