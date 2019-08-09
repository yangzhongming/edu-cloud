package cn.com.cloud.edu.manage.cms.service;

import cn.com.cloud.edu.common.model.reponse.CommonCode;
import cn.com.cloud.edu.common.model.reponse.QueryResponseResult;
import cn.com.cloud.edu.common.model.reponse.QueryResult;
import cn.com.cloud.edu.manage.cms.dao.CmsPageRepository;
import cn.com.cloud.edu.model.cms.CmsPage;
import cn.com.cloud.edu.model.cms.request.QueryPageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author:Alex
 * @date:2019/7/31
 * @version:1.0
 * @description:
 */
@Service
public class PageService {
    @Autowired
    CmsPageRepository cmsPageRepository;
    /**
     * 页面列表分页查询
     * @param page 当前页码
     *
     */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest){
        if (queryPageRequest==null){
            queryPageRequest = new QueryPageRequest();
        }
        if(page <=0){
            page = 1;
        }
        if(size<=0){
            size = 10;
        }
        //分页对象
        Pageable pageable = new PageRequest(page,size);
        //分页查询
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
            QueryResult<CmsPage> cmsPageQueryResult = new QueryResult<CmsPage>();
        cmsPageQueryResult.setList(all.getContent());
        cmsPageQueryResult.setTotal(all.getTotalElements());

        //返回结果
        return  new QueryResponseResult(CommonCode.SUCCESS,cmsPageQueryResult);
    }
}
