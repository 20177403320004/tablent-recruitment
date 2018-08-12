package com.ql.server.util;

/**
 * @author wangyuhai
 * Created by huc on 2017/11/23.
 *JNSp规范以20起始，示例:20XXX
 * 标准码规范定义
 */
public enum JnResCode {
    /**
     * 成功
     */
    SUCCESS("1","成功"),
    /**
     * 失败
     */
    FAIL("0","失败"),
    
    /**
     * 用户信息不存在
     */
    USER_INFO_NOT_EXIST("2","用户信息不存在"),
    
    /**
     * 参数为空
     */
    PARAM_IS_NULL("3","参数为空"),
    
    PLATFORMID("4","平台标识必填")
    ;
    private String code;
    private String msg;

    JnResCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
