package cn.com.cloud.edu.common.model.reponse;

/**
 * @author:Alex
 * @date:2019/7/30
 * @version:1.0
 * @description:
 */
public class ResponseResult implements Response {
    //操作是否成功
    boolean success = SUCCESS;
    //操作代码
    int code = SUCCESS_CODE;
    //提示信息
    String message;

    public  ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }

    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }
}
