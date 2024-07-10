package com.entity.model;

import com.entity.ZhiburizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 支部日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhiburizhiModel implements Serializable {
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
     * 日志
     */
    private String zhiburizhiRizhi;


    /**
     * 日志类型
     */
    private Integer zhiburizhiTypes;


    /**
     * 文件
     */
    private String zhiburizhiFile;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhiburizhiTime;


    /**
     * 支部日志备注
     */
    private String zhiburizhiText;


    /**
     * 支部日志详情
     */
    private String zhiburizhiContent;


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
	 * 获取：日志
	 */
    public String getZhiburizhiRizhi() {
        return zhiburizhiRizhi;
    }


    /**
	 * 设置：日志
	 */
    public void setZhiburizhiRizhi(String zhiburizhiRizhi) {
        this.zhiburizhiRizhi = zhiburizhiRizhi;
    }
    /**
	 * 获取：日志类型
	 */
    public Integer getZhiburizhiTypes() {
        return zhiburizhiTypes;
    }


    /**
	 * 设置：日志类型
	 */
    public void setZhiburizhiTypes(Integer zhiburizhiTypes) {
        this.zhiburizhiTypes = zhiburizhiTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getZhiburizhiFile() {
        return zhiburizhiFile;
    }


    /**
	 * 设置：文件
	 */
    public void setZhiburizhiFile(String zhiburizhiFile) {
        this.zhiburizhiFile = zhiburizhiFile;
    }
    /**
	 * 获取：日期
	 */
    public Date getZhiburizhiTime() {
        return zhiburizhiTime;
    }


    /**
	 * 设置：日期
	 */
    public void setZhiburizhiTime(Date zhiburizhiTime) {
        this.zhiburizhiTime = zhiburizhiTime;
    }
    /**
	 * 获取：支部日志备注
	 */
    public String getZhiburizhiText() {
        return zhiburizhiText;
    }


    /**
	 * 设置：支部日志备注
	 */
    public void setZhiburizhiText(String zhiburizhiText) {
        this.zhiburizhiText = zhiburizhiText;
    }
    /**
	 * 获取：支部日志详情
	 */
    public String getZhiburizhiContent() {
        return zhiburizhiContent;
    }


    /**
	 * 设置：支部日志详情
	 */
    public void setZhiburizhiContent(String zhiburizhiContent) {
        this.zhiburizhiContent = zhiburizhiContent;
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
