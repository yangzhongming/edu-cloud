package cn.com.cloud.edu.manage.cms.dao;

import cn.com.cloud.edu.model.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Pageable;
/**
 * @author:Alex
 * @date:2019/7/31
 * @version:1.0
 * @description:
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    //根据页面名称查询
    CmsPage findByPageName(String pageName);
/*    //根据页面名称和类型查询
    CmsPage findByPageAndPageType(String  siteId,String pageType);
    //根据站点和页面类型查询记录数
    int countBySiteIdAndPageType(String siteId,String pageType);
   //根据站点和页面类型分页查询
   Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);*/
}
