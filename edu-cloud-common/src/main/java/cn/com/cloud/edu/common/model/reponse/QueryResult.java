package cn.com.cloud.edu.common.model.reponse;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author:Alex
 * @date:2019/7/30
 * @version:1.0
 * @description:
 */
@Data
@ToString
public class QueryResult<T> {
    //数据列表
    private List<T> list;
    //数据总数
    private long total;
}
