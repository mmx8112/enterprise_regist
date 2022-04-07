package com.example.qydj.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author mhh
 * @date 2022/4/7 11:26
 */
@Data
public class CResponseBody {
    private String accCondition;
    private String addtime;
    private String adviceWay;
    private String basicCode;
    private String basis;
    private String bizCode;
    private String catalogcode;
    private String correspondingClassification;
    private String doType;
    private String droitsource;
    private Map dyMap;
    private String dynamicList;
    private String handleDeep;
    private String exeLevel;
    private String flowPic;
    private String handleAddress;
    private String handleTime;
    private String handleform;
    private String hasAuthorized;
    private String hasConditions;
    //todo
    private TxnCommCom txnCommCom;
    private List<RegionInfo> list ;
    private List conditionLeadList ;
    private String code;
    private String message;
}
