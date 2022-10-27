package com.iljesus.zceblog.ReturnInfo;

import lombok.Data;

@Data
public class ReturnData<T> {

    // 结果状态码
    private int code;

    // 响应信息
    private String msg;

    // 响应数据
    private T data;

    // 接口请求时间
    private long timestamp ;

    public ReturnData(){
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ReturnData<T> success(T data){
        ReturnData returnData = new ReturnData();
        returnData.setCode(ReturnCode.RC200.getCode());
        returnData.setMsg(ReturnCode.RC200.getMsg());
        returnData.setData(data);
        return returnData;
    }

    public static <T> ReturnData<T> fail(int code, String msg){
        ReturnData returnData = new ReturnData();
        returnData.setCode(code);
        returnData.setMsg(msg);
        return returnData;
    }
}

