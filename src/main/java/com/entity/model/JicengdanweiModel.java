package com.entity.model;

import com.entity.JicengdanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 基层单位
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JicengdanweiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 支部
     */
    private Integer zhibuId;


    /**
     * 单位名称
     */
    private String jicengdanweiName;


    /**
     * 联系人
     */
    private String jicengdanweiLianxiren;


    /**
     * 联系电话
     */
    private String jicengdanweiPhone;


    /**
     * 单位类型
     */
    private Integer jicengdanweiTypes;


    /**
     * 单位地址
     */
    private String jicengdanweiAddress;


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
	 * 获取：支部
	 */
    public Integer getZhibuId() {
        return zhibuId;
    }


    /**
	 * 设置：支部
	 */
    public void setZhibuId(Integer zhibuId) {
        this.zhibuId = zhibuId;
    }
    /**
	 * 获取：单位名称
	 */
    public String getJicengdanweiName() {
        return jicengdanweiName;
    }


    /**
	 * 设置：单位名称
	 */
    public void setJicengdanweiName(String jicengdanweiName) {
        this.jicengdanweiName = jicengdanweiName;
    }
    /**
	 * 获取：联系人
	 */
    public String getJicengdanweiLianxiren() {
        return jicengdanweiLianxiren;
    }


    /**
	 * 设置：联系人
	 */
    public void setJicengdanweiLianxiren(String jicengdanweiLianxiren) {
        this.jicengdanweiLianxiren = jicengdanweiLianxiren;
    }
    /**
	 * 获取：联系电话
	 */
    public String getJicengdanweiPhone() {
        return jicengdanweiPhone;
    }


    /**
	 * 设置：联系电话
	 */
    public void setJicengdanweiPhone(String jicengdanweiPhone) {
        this.jicengdanweiPhone = jicengdanweiPhone;
    }
    /**
	 * 获取：单位类型
	 */
    public Integer getJicengdanweiTypes() {
        return jicengdanweiTypes;
    }


    /**
	 * 设置：单位类型
	 */
    public void setJicengdanweiTypes(Integer jicengdanweiTypes) {
        this.jicengdanweiTypes = jicengdanweiTypes;
    }
    /**
	 * 获取：单位地址
	 */
    public String getJicengdanweiAddress() {
        return jicengdanweiAddress;
    }


    /**
	 * 设置：单位地址
	 */
    public void setJicengdanweiAddress(String jicengdanweiAddress) {
        this.jicengdanweiAddress = jicengdanweiAddress;
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
