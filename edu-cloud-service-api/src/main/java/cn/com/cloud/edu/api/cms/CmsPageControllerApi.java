package cn.com.cloud.edu.api.cms;

import cn.com.cloud.edu.model.cms.request.QueryPageRequest;
import cn.com.cloud.edu.common.model.reponse.QueryResponseResult;

/**
 * @author:Alex
 * @date:2019/7/29
 * @version:1.0
 * @description:
 */
public interface CmsPageControllerApi {
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
