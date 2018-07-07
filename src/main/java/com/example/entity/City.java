package com.example.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * 城市实体类
 *
 * Created by bysocket on 07/02/2017.
 */
@Table(name = "city")
public class City {

    /**
     * 城市编号
     */
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Long id;

    /**
     * 省份编号
     */
    @Column(name = "province_id",type = MySqlTypeConstant.INT,length = 11)
    private Long provinceId;

    /**
     * 城市名称
     */
    @Column(name = "city_name",type = MySqlTypeConstant.TEXT)
    private String cityName;

    /**
     * 描述
     */
    @Column(name = "description",type = MySqlTypeConstant.TEXT)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
