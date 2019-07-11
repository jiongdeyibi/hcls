package com.ghost.hcls.core.util;


/**
 * 返回结果枚举值
 */
public enum ResultEnum {

    SUCCESS("000000", "成功"),
    FAILURE("000001", "失败"),

    SYS_EXCEPT("000002", "系统异常"),

    DATA_ERROR("000003", "数据格式不正确"),
    DATA_EMPTY("000004", "数据不能为空"),
    DATA_EXCEED("000005", "数据超过限制"),
    DATA_VALIDATION_ERR("000006", "数据校验失败"),
    DATA_PARAMETER_ERR("000007", "参数错误"),
    ;

    //TODO: 枚举其它返回值

    private String code;
    private String msg;

    ResultEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
