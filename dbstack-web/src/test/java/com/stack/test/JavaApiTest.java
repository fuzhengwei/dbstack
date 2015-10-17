package com.stack.test;

import com.stack.dbstack.common.utils.GsonUtils;
import com.stack.dbstack.domain.DBTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fuzhengwei
 * Date: 15-10-17
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public class JavaApiTest {



    @Test
    public void test(){

        DBTree dbTree_5_2 = new DBTree();
        dbTree_5_2.setId("111112");
        dbTree_5_2.setText("user");

        DBTree dbTree_5_1 = new DBTree();
        dbTree_5_1.setId("111111");
        dbTree_5_1.setText("school");

        DBTree dbTree_5 = new DBTree();
        dbTree_5.setId("11111");
        dbTree_5.setText("Table");
        List<DBTree> children_5 = new ArrayList<DBTree>();
        children_5.add(dbTree_5_1);
        children_5.add(dbTree_5_2);

        DBTree dbTree_4 = new DBTree();
        dbTree_4.setId("1111");
        dbTree_4.setText("dbstack");
        List<DBTree> children_4 = new ArrayList<DBTree>();
        children_4.add(dbTree_5);

        DBTree dbTree_3 = new DBTree();
        dbTree_3.setId("111");
        dbTree_3.setText("Databases");
        List<DBTree> children_3 = new ArrayList<DBTree>();
        children_3.add(dbTree_4);
        dbTree_3.setChildren(children_3);

        DBTree dbTree_2 = new DBTree();
        dbTree_2.setId("11");
        dbTree_2.setText("localhost_mysql");
        dbTree_2.setState("closed");
        List<DBTree> children_2 = new ArrayList<DBTree>();
        children_2.add(dbTree_3);
        dbTree_2.setChildren(children_2);


        DBTree dbTree_1 = new DBTree();
        dbTree_1.setId("1");
        dbTree_1.setText("Connections");

        List<DBTree> children_1 = new ArrayList<DBTree>();
        children_1.add(dbTree_2);
        dbTree_1.setChildren(children_1);


        System.out.println(GsonUtils.toJson(dbTree_1));
    }

}
