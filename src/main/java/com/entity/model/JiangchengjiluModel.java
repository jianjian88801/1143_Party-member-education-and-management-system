package com.entity.model;

import com.entity.JiangchengjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖惩记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiangchengjiluModel implements Serializable {
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
     * 奖惩标题
     */
    private String jiangchengjiluName;


    /**
     * 奖惩
     */
    private String jiangchengjiluRongyu;


    /**
     * 奖惩类型
     */
    private Integer jiangchengjiluTypes;


    /**
     * 文件
     */
    private String jiangchengjiluFile;


    /**
     * 文档
     */
    private String jiangchengjiluWendang;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhiburizhiTime;


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
	 * 获取：奖惩标题
	 */
    public String getJiangchengjiluName() {
        return jiangchengjiluName;
    }


    /**
	 * 设置：奖惩标题
	 */
    public void setJiangchengjiluName(String jiangchengjiluName) {
        this.jiangchengjiluName = jiangchengjiluName;
    }
    /**
	 * 获取：奖惩
	 */
    public String getJiangchengjiluRongyu() {
        return jiangchengjiluRongyu;
    }


    /**
	 * 设置：奖惩
	 */
    public void setJiangchengjiluRongyu(String jiangchengjiluRongyu) {
        this.jiangchengjiluRongyu = jiangchengjiluRongyu;
    }
    /**
	 * 获取：奖惩类型
	 */
    public Integer getJiangchengjiluTypes() {
        return jiangchengjiluTypes;
    }


    /**
	 * 设置：奖惩类型
	 */
    public void setJiangchengjiluTypes(Integer jiangchengjiluTypes) {
        this.jiangchengjiluTypes = jiangchengjiluTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getJiangchengjiluFile() {
        return jiangchengjiluFile;
    }


    /**
	 * 设置：文件
	 */
    public void setJiangchengjiluFile(String jiangchengjiluFile) {
        this.jiangchengjiluFile = jiangchengjiluFile;
    }
    /**
	 * 获取：文档
	 */
    public String getJiangchengjiluWendang() {
        return jiangchengjiluWendang;
    }


    /**
	 * 设置：文档
	 */
    public void setJiangchengjiluWendang(String jiangchengjiluWendang) {
        this.jiangchengjiluWendang = jiangchengjiluWendang;
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
