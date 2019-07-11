package com.ghost.hcls.core.util;

import java.util.HashMap;

/**
 * 通用返回结果集
 */
public class ResultMap extends HashMap {

    private boolean success;

    private String code;

    private String msg;

    public ResultMap() {

    }

    public ResultMap(ResultEnum resultEnum) {
        this.success = ResultEnum.SUCCESS.getCode().equals(resultEnum.getCode());
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.put("success", success);
        this.put("msg", msg);
        this.put("code", code);
    }

    public ResultMap(boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.put("success", success);
        this.put("msg", msg);
        this.put("code", code);
    }

    public static ResultMap success() {
        return new ResultMap(ResultEnum.SUCCESS);
    }

    public ResultMap put(Object key, Object value) {
        super.put(key, value);
        return this;
    }

    public static ResultMap failure() {
        return new ResultMap(ResultEnum.FAILURE);
    }

    public static ResultMap failure(String code, String msg) {
        return new ResultMap(ResultEnum.FAILURE).setMsg(msg).setCode(code);
    }


    public static ResultMap failure(String msg) {
        return new ResultMap(ResultEnum.FAILURE).setMsg(msg);
    }


    public boolean isSuccess() {
        return success;
    }

    public ResultMap setSuccess(boolean success) {
        this.success = success;
        this.put("success", success);
        return this;
    }

    public String getCode() {
        return code;
    }

    public ResultMap setCode(String code) {
        this.code = code;
        this.put("code", code);
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultMap setMsg(String msg) {
        this.msg = msg;
        this.put("msg", msg);
        return this;
    }

    public ResultMap setData(Object data) {
        this.put("data", data);
        return this;
    }
}
