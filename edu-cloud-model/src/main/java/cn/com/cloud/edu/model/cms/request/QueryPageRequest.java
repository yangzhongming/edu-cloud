package cn.com.cloud.edu.model.cms.request;

import cn.com.cloud.edu.common.model.request.RequestData;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author:Alex
 * @date:2019/7/29
 * @version:1.0
 * @description: 接收页面查询的查询条件
 */
@Data
public class QueryPageRequest extends RequestData {

   @ApiModelProperty("站点ID")
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}
