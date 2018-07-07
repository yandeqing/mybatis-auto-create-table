package com.example.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.io.Serializable;

/**
 * Book 实体类
 *
 * Created by bysocket on 30/09/2017.
 */
@Table(name = "city")
public class Book implements Serializable {

    /**
     * 编号
     */
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Long id;

    /**
     * 书名
     */
    @Column(name = "name",type = MySqlTypeConstant.TEXT)
    private String name;

    /**
     * 作者
     */
    @Column(name = "writer",type = MySqlTypeConstant.TEXT)
    private String writer;

    /**
     * 简介
     */
    @Column(name = "introduction",type = MySqlTypeConstant.TEXT)
    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
