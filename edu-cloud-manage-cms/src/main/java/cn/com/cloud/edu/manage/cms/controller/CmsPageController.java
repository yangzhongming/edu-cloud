package cn.com.cloud.edu.manage.cms.controller;

import cn.com.cloud.edu.service.api.cms.CmsPageControllerApi;
import cn.com.cloud.edu.manage.cms.service.PageService;
import cn.com.cloud.edu.model.cms.request.QueryPageRequest;
import cn.com.cloud.edu.common.model.reponse.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:Alex
 * @date:2019/7/30
 * @version:1.0
 * @description:
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {
    @Autowired
    PageService pageService;

    @CrossOrigin
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page")int page,  @PathVariable("size")int size, QueryPageRequest queryPageRequest) {
        return pageService.findList(page,size,queryPageRequest);
    }

/*    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
        QueryResult queryResult = new QueryResult();
        queryResult.setTotal(2);
        List list = new ArrayList();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;
    }*/


}
