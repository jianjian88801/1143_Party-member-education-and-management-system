package com.entity.model;

import com.entity.ZhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 支部
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhibuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 负责人姓名
     */
    private String zhibuName;


    /**
     * 党支部
     */
    private String zhibuDangzhibu;


    /**
     * 联系方式
     */
    private String zhibuPhone;


    /**
     * 办公地址
     */
    private String zhibuAddress;


    /**
     * 邮箱
     */
    private String zhibuEmail;


    /**
     * 支部详情
     */
    private String zhibuContent;


    /**
     * 假删
     */
    private Integer zhibuDelete;


    /**
     * 创建时间
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：负责人姓名
	 */
    public String getZhibuName() {
        return zhibuName;
    }


    /**
	 * 设置：负责人姓名
	 */
    public void setZhibuName(String zhibuName) {
        this.zhibuName = zhibuName;
    }
    /**
	 * 获取：党支部
	 */
    public String getZhibuDangzhibu() {
        return zhibuDangzhibu;
    }


    /**
	 * 设置：党支部
	 */
    public void setZhibuDangzhibu(String zhibuDangzhibu) {
        this.zhibuDangzhibu = zhibuDangzhibu;
    }
    /**
	 * 获取：联系方式
	 */
    public String getZhibuPhone() {
        return zhibuPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setZhibuPhone(String zhibuPhone) {
        this.zhibuPhone = zhibuPhone;
    }
    /**
	 * 获取：办公地址
	 */
    public String getZhibuAddress() {
        return zhibuAddress;
    }


    /**
	 * 设置：办公地址
	 */
    public void setZhibuAddress(String zhibuAddress) {
        this.zhibuAddress = zhibuAddress;
    }
    /**
	 * 获取：邮箱
	 */
    public String getZhibuEmail() {
        return zhibuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setZhibuEmail(String zhibuEmail) {
        this.zhibuEmail = zhibuEmail;
    }
    /**
	 * 获取：支部详情
	 */
    public String getZhibuContent() {
        return zhibuContent;
    }


    /**
	 * 设置：支部详情
	 */
    public void setZhibuContent(String zhibuContent) {
        this.zhibuContent = zhibuContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getZhibuDelete() {
        return zhibuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setZhibuDelete(Integer zhibuDelete) {
        this.zhibuDelete = zhibuDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
