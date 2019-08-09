package cn.com.cloud.edu.service.api.cms;

import cn.com.cloud.edu.model.cms.request.QueryPageRequest;
import cn.com.cloud.edu.common.model.reponse.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author:Alex
 * @date:2019/7/29
 * @version:1.0
 * @description:
 */
@Api(value="cms页面管理接口",description="cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
        @ApiOperation("分页查询页面列表")
        @ApiImplicitParams({@ApiImplicitParam(name="page",value = "页码",required=true,paramType="path",dataType="int"),
                            @ApiImplicitParam(name="size",value ="每页记录数",required=true,paramType="path",dataType="int")})
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
