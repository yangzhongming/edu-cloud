package cn.com.cloud.edu.model.cms;

import lombok.Data;
import lombok.ToString;

/**
 * @author:Alex
 * @date:2019/7/30
 * @version:1.0
 * @description:
 */
@Data
@ToString
public class CmsPageParam {
    //参数名称
    private String pageParamName;
    //参数值
    private String pageParamValue;
}
