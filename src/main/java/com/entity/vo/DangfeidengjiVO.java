package com.entity.vo;

import com.entity.DangfeidengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 党费登记
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dangfeidengji")
public class DangfeidengjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 所在支部
     */

    @TableField(value = "zhibu_id")
    private Integer zhibuId;


    /**
     * 缴纳金额
     */

    @TableField(value = "dangfeidengji_name")
    private String dangfeidengjiName;


    /**
     * 是否支付
     */

    @TableField(value = "dangfeidengji_types")
    private Integer dangfeidengjiTypes;


    /**
     * 登记日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "dangfeidengji_time")
    private Date dangfeidengjiTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：所在支部
	 */
    public Integer getZhibuId() {
        return zhibuId;
    }


    /**
	 * 获取：所在支部
	 */

    public void setZhibuId(Integer zhibuId) {
        this.zhibuId = zhibuId;
    }
    /**
	 * 设置：缴纳金额
	 */
    public String getDangfeidengjiName() {
        return dangfeidengjiName;
    }


    /**
	 * 获取：缴纳金额
	 */

    public void setDangfeidengjiName(String dangfeidengjiName) {
        this.dangfeidengjiName = dangfeidengjiName;
    }
    /**
	 * 设置：是否支付
	 */
    public Integer getDangfeidengjiTypes() {
        return dangfeidengjiTypes;
    }


    /**
	 * 获取：是否支付
	 */

    public void setDangfeidengjiTypes(Integer dangfeidengjiTypes) {
        this.dangfeidengjiTypes = dangfeidengjiTypes;
    }
    /**
	 * 设置：登记日期
	 */
    public Date getDangfeidengjiTime() {
        return dangfeidengjiTime;
    }


    /**
	 * 获取：登记日期
	 */

    public void setDangfeidengjiTime(Date dangfeidengjiTime) {
        this.dangfeidengjiTime = dangfeidengjiTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
