package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 党费登记
 *
 * @author 
 * @email
 */
@TableName("dangfeidengji")
public class DangfeidengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DangfeidengjiEntity() {

	}

	public DangfeidengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dangfeidengji{" +
            "id=" + id +
            ", zhibuId=" + zhibuId +
            ", dangfeidengjiName=" + dangfeidengjiName +
            ", dangfeidengjiTypes=" + dangfeidengjiTypes +
            ", dangfeidengjiTime=" + dangfeidengjiTime +
            ", createTime=" + createTime +
        "}";
    }
}
