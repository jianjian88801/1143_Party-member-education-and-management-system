package com.entity.model;

import com.entity.DangfeidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 党费登记
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DangfeidengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 所在支部
     */
    private Integer zhibuId;


    /**
     * 缴纳金额
     */
    private String dangfeidengjiName;


    /**
     * 是否支付
     */
    private Integer dangfeidengjiTypes;


    /**
     * 登记日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date dangfeidengjiTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：所在支部
	 */
    public Integer getZhibuId() {
        return zhibuId;
    }


    /**
	 * 设置：所在支部
	 */
    public void setZhibuId(Integer zhibuId) {
        this.zhibuId = zhibuId;
    }
    /**
	 * 获取：缴纳金额
	 */
    public String getDangfeidengjiName() {
        return dangfeidengjiName;
    }


    /**
	 * 设置：缴纳金额
	 */
    public void setDangfeidengjiName(String dangfeidengjiName) {
        this.dangfeidengjiName = dangfeidengjiName;
    }
    /**
	 * 获取：是否支付
	 */
    public Integer getDangfeidengjiTypes() {
        return dangfeidengjiTypes;
    }


    /**
	 * 设置：是否支付
	 */
    public void setDangfeidengjiTypes(Integer dangfeidengjiTypes) {
        this.dangfeidengjiTypes = dangfeidengjiTypes;
    }
    /**
	 * 获取：登记日期
	 */
    public Date getDangfeidengjiTime() {
        return dangfeidengjiTime;
    }


    /**
	 * 设置：登记日期
	 */
    public void setDangfeidengjiTime(Date dangfeidengjiTime) {
        this.dangfeidengjiTime = dangfeidengjiTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
