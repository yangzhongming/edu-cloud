package cn.com.cloud.edu.manage.cms.controller.test;

import cn.com.cloud.edu.manage.cms.dao.CmsPageRepository;
import cn.com.cloud.edu.model.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author:Alex
 * @date:2019/7/31
 * @version:1.0
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {
    @Autowired
    CmsPageRepository cmsPageRepository;

    //查询全部数据
    @Test
    public  void testFindAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println("test FindAll");
        System.out.println(all);
    }

    //分页查询
    @Test
    public void  testFindByPage(){
        int page = 1;
        int size = 10 ;
        Pageable pageable = PageRequest.of(page,size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all);
    }
}
