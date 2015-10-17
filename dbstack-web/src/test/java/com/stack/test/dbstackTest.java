package com.stack.test;

import com.stack.dbstack.service.DBTreeService;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fuzhengwei
 * Date: 15-10-11
 * Time: 下午7:52
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class dbstackTest {

    @Autowired
    private BasicDataSource dataSource;

    @Autowired
    private DBTreeService dbTreeService;


    @Test
    public void test_getsource() throws Exception{

        List<List> lists = new ArrayList<List>();

        Connection connection = null;
        Statement stmt = null;

        connection = dataSource.getConnection();
        stmt = connection.createStatement();

        boolean bool = stmt.execute("show databases;");

        if (bool){
            System.out.println("查询");
            lists = buildResultSet(stmt);
            System.out.println(""+lists);
        }
    }

    private List<List> buildResultSet(Statement stmt) throws SQLException {
        List<List> result = new ArrayList<List>();
        ResultSet resultSet = stmt.getResultSet();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<String> cols = new ArrayList<String>();
        for (int i=0; i<columnCount;i++){
            cols.add(metaData.getColumnName(i+1));
        }
        result.add(cols);
        while(resultSet.next()){
            List values = new ArrayList();
            for (int i=0; i<columnCount;i++){
                values.add(resultSet.getObject(i+1));
            }
            result.add(values);
        }
        return result;
    }

}
