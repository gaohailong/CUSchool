package com.sxau.cyschool.test.service;

import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gaohailong on 2016/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:config/applicationContext.xml")
public class TestTitle  {
    private TitleService titleService ;
    private Title title;

    @Test
    public void testPageTitle() {
        try {
            Page<Title> titlePage = titleService.queryTitleByCondition(title, 1, 2);
            System.out.print(titlePage.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TitleService getTitleService() {
        return titleService;
    }

    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }
}
