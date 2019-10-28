package cn.com.cloud.edu.common.model.reponse;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author:Alex
 * @date:2019/7/30
 * @version:1.0
 * @description:
 */

@ToString
public enum  CommonCode implements ResultCode {
    SUCCESS(true,10000,"操作成功！"),
    FAIL(false,10001,"操作失败！"),
    UNAUTHENTICATED(false,10001,"此操作需要登陆系统！"),
    UNAUTHORISE(false,10002,"权限不足，无权操作！"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！");

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
