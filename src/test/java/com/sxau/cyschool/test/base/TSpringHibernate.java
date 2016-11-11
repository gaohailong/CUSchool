package com.sxau.cyschool.test.base;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * Created by gaohailong on 2016/11/11.
 */
public class TSpringHibernate {
    private ApplicationContext ctx = null;

    {
        ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    @Test
    public void testResoucrce() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.print(dataSource.getConnection());
    }
}
