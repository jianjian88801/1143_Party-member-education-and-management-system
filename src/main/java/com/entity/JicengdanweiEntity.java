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
 * 基层单位
 *
 * @author 
 * @email
 */
@TableName("jicengdanwei")
public class JicengdanweiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JicengdanweiEntity() {

	}

	public JicengdanweiEntity(T t) {
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
     * 支部
     */
    @TableField(value = "zhibu_id")

    private Integer zhibuId;


    /**
     * 单位名称
     */
    @TableField(value = "jicengdanwei_name")

    private String jicengdanweiName;


    /**
     * 联系人
     */
    @TableField(value = "jicengdanwei_lianxiren")

    private String jicengdanweiLianxiren;


    /**
     * 联系电话
     */
    @TableField(value = "jicengdanwei_phone")

    private String jicengdanweiPhone;


    /**
     * 单位类型
     */
    @TableField(value = "jicengdanwei_types")

    private Integer jicengdanweiTypes;


    /**
     * 单位地址
     */
    @TableField(value = "jicengdanwei_address")

    private String jicengdanweiAddress;


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
	 * 设置：支部
	 */
    public Integer getZhibuId() {
        return zhibuId;
    }


    /**
	 * 获取：支部
	 */

    public void setZhibuId(Integer zhibuId) {
        this.zhibuId = zhibuId;
    }
    /**
	 * 设置：单位名称
	 */
    public String getJicengdanweiName() {
        return jicengdanweiName;
    }


    /**
	 * 获取：单位名称
	 */

    public void setJicengdanweiName(String jicengdanweiName) {
        this.jicengdanweiName = jicengdanweiName;
    }
    /**
	 * 设置：联系人
	 */
    public String getJicengdanweiLianxiren() {
        return jicengdanweiLianxiren;
    }


    /**
	 * 获取：联系人
	 */

    public void setJicengdanweiLianxiren(String jicengdanweiLianxiren) {
        this.jicengdanweiLianxiren = jicengdanweiLianxiren;
    }
    /**
	 * 设置：联系电话
	 */
    public String getJicengdanweiPhone() {
        return jicengdanweiPhone;
    }


    /**
	 * 获取：联系电话
	 */

    public void setJicengdanweiPhone(String jicengdanweiPhone) {
        this.jicengdanweiPhone = jicengdanweiPhone;
    }
    /**
	 * 设置：单位类型
	 */
    public Integer getJicengdanweiTypes() {
        return jicengdanweiTypes;
    }


    /**
	 * 获取：单位类型
	 */

    public void setJicengdanweiTypes(Integer jicengdanweiTypes) {
        this.jicengdanweiTypes = jicengdanweiTypes;
    }
    /**
	 * 设置：单位地址
	 */
    public String getJicengdanweiAddress() {
        return jicengdanweiAddress;
    }


    /**
	 * 获取：单位地址
	 */

    public void setJicengdanweiAddress(String jicengdanweiAddress) {
        this.jicengdanweiAddress = jicengdanweiAddress;
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
        return "Jicengdanwei{" +
            "id=" + id +
            ", zhibuId=" + zhibuId +
            ", jicengdanweiName=" + jicengdanweiName +
            ", jicengdanweiLianxiren=" + jicengdanweiLianxiren +
            ", jicengdanweiPhone=" + jicengdanweiPhone +
            ", jicengdanweiTypes=" + jicengdanweiTypes +
            ", jicengdanweiAddress=" + jicengdanweiAddress +
            ", createTime=" + createTime +
        "}";
    }
}
