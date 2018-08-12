package com.ql.server.util;

/**
 * 
 * @author huch
 *
 */
public class JnResBodyUtil {

	/**
	 * 定义返回成功方法
	 * @param object
	 * @return
	 */
    public static JnResponseBody success(Object object){
        JnResponseBody result = new JnResponseBody();
        result.setCode("1");
        result.setMsg("成功");
        result.setData(object);
        return  result;
    }

    /**
     * 定义返回成功方法
     * @param object
     * @param resultEnum
     * @return
     */
    public static JnResponseBody success(Object object, JnResCode resultEnum){
        JnResponseBody result = new JnResponseBody();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(object);
        return result;
    }

    /**
     * 定义返回失败方法
     * @param resultEnum
     * @return
     */
    public static JnResponseBody error(JnResCode resultEnum){
        return error(resultEnum.getCode(),resultEnum.getMsg());
    }

    /**
     * 定义返回失败方法
     * @param code
     * @param msg
     * @return
     */
    public static JnResponseBody error(String code, String msg){
        JnResponseBody result = new JnResponseBody();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return  result;
    }
}
