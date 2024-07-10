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
 * 支部
 *
 * @author 
 * @email
 */
@TableName("zhibu")
public class ZhibuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhibuEntity() {

	}

	public ZhibuEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 负责人姓名
     */
    @TableField(value = "zhibu_name")

    private String zhibuName;


    /**
     * 党支部
     */
    @TableField(value = "zhibu_dangzhibu")

    private String zhibuDangzhibu;


    /**
     * 联系方式
     */
    @TableField(value = "zhibu_phone")

    private String zhibuPhone;


    /**
     * 办公地址
     */
    @TableField(value = "zhibu_address")

    private String zhibuAddress;


    /**
     * 邮箱
     */
    @TableField(value = "zhibu_email")

    private String zhibuEmail;


    /**
     * 支部详情
     */
    @TableField(value = "zhibu_content")

    private String zhibuContent;


    /**
     * 假删
     */
    @TableField(value = "zhibu_delete")

    private Integer zhibuDelete;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：负责人姓名
	 */
    public String getZhibuName() {
        return zhibuName;
    }


    /**
	 * 获取：负责人姓名
	 */

    public void setZhibuName(String zhibuName) {
        this.zhibuName = zhibuName;
    }
    /**
	 * 设置：党支部
	 */
    public String getZhibuDangzhibu() {
        return zhibuDangzhibu;
    }


    /**
	 * 获取：党支部
	 */

    public void setZhibuDangzhibu(String zhibuDangzhibu) {
        this.zhibuDangzhibu = zhibuDangzhibu;
    }
    /**
	 * 设置：联系方式
	 */
    public String getZhibuPhone() {
        return zhibuPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setZhibuPhone(String zhibuPhone) {
        this.zhibuPhone = zhibuPhone;
    }
    /**
	 * 设置：办公地址
	 */
    public String getZhibuAddress() {
        return zhibuAddress;
    }


    /**
	 * 获取：办公地址
	 */

    public void setZhibuAddress(String zhibuAddress) {
        this.zhibuAddress = zhibuAddress;
    }
    /**
	 * 设置：邮箱
	 */
    public String getZhibuEmail() {
        return zhibuEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setZhibuEmail(String zhibuEmail) {
        this.zhibuEmail = zhibuEmail;
    }
    /**
	 * 设置：支部详情
	 */
    public String getZhibuContent() {
        return zhibuContent;
    }


    /**
	 * 获取：支部详情
	 */

    public void setZhibuContent(String zhibuContent) {
        this.zhibuContent = zhibuContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getZhibuDelete() {
        return zhibuDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setZhibuDelete(Integer zhibuDelete) {
        this.zhibuDelete = zhibuDelete;
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
        return "Zhibu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zhibuName=" + zhibuName +
            ", zhibuDangzhibu=" + zhibuDangzhibu +
            ", zhibuPhone=" + zhibuPhone +
            ", zhibuAddress=" + zhibuAddress +
            ", zhibuEmail=" + zhibuEmail +
            ", zhibuContent=" + zhibuContent +
            ", zhibuDelete=" + zhibuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
