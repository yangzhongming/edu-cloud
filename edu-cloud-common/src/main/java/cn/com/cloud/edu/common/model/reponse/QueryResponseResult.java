package cn.com.cloud.edu.common.model.reponse;

import lombok.Data;
import lombok.ToString;

/**
 * @author:Alex
 * @date:2019/7/29
 * @version:1.0
 * @description:
 */
@Data
@ToString
public class QueryResponseResult  extends  ResponseResult{

    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult) {
        super(resultCode);
        this.queryResult = queryResult;
    }
}
