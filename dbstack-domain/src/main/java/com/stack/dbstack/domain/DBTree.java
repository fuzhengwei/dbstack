package com.stack.dbstack.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: fuzhengwei
 * Date: 15-10-17
 * Time: 下午4:48
 * To change this template use File | Settings | File Templates.
 */
public class DBTree {

    private String id;
    private String text;
    private String state;
    private List<DBTree> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DBTree> getChildren() {
        return children;
    }

    public void setChildren(List<DBTree> children) {
        this.children = children;
    }
}
