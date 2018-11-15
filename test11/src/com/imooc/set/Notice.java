package com.imooc.set;

import java.util.Date;

public class Notice {
    private int id;//ID
    private String title;//标题
    private String creator;//创建人
    private Date createTime;//时间

    public Notice(int id, String title, String creator, Date createTime) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCreator() {
        return creator;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
