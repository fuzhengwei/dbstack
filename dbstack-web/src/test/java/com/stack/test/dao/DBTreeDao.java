package com.stack.test.dao;

import com.stack.dbstack.service.DBTreeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: fuzhengwei
 * Date: 15-10-17
 * Time: 下午7:59
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class DBTreeDao {


    @Autowired
    private DBTreeService dbTreeService;

    @Test
    public void test_queryDBTableTreeDao() {
    }

}
