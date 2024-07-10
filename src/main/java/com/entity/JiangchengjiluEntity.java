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
 * 奖惩记录
 *
 * @author 
 * @email
 */
@TableName("jiangchengjilu")
public class JiangchengjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiangchengjiluEntity() {

	}

	public JiangchengjiluEntity(T t) {
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
     * 奖惩标题
     */
    @TableField(value = "jiangchengjilu_name")

    private String jiangchengjiluName;


    /**
     * 奖惩
     */
    @TableField(value = "jiangchengjilu_rongyu")

    private String jiangchengjiluRongyu;


    /**
     * 奖惩类型
     */
    @TableField(value = "jiangchengjilu_types")

    private Integer jiangchengjiluTypes;


    /**
     * 文件
     */
    @TableField(value = "jiangchengjilu_file")

    private String jiangchengjiluFile;


    /**
     * 文档
     */
    @TableField(value = "jiangchengjilu_wendang")

    private String jiangchengjiluWendang;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "zhiburizhi_time")

    private Date zhiburizhiTime;


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
	 * 设置：奖惩标题
	 */
    public String getJiangchengjiluName() {
        return jiangchengjiluName;
    }


    /**
	 * 获取：奖惩标题
	 */

    public void setJiangchengjiluName(String jiangchengjiluName) {
        this.jiangchengjiluName = jiangchengjiluName;
    }
    /**
	 * 设置：奖惩
	 */
    public String getJiangchengjiluRongyu() {
        return jiangchengjiluRongyu;
    }


    /**
	 * 获取：奖惩
	 */

    public void setJiangchengjiluRongyu(String jiangchengjiluRongyu) {
        this.jiangchengjiluRongyu = jiangchengjiluRongyu;
    }
    /**
	 * 设置：奖惩类型
	 */
    public Integer getJiangchengjiluTypes() {
        return jiangchengjiluTypes;
    }


    /**
	 * 获取：奖惩类型
	 */

    public void setJiangchengjiluTypes(Integer jiangchengjiluTypes) {
        this.jiangchengjiluTypes = jiangchengjiluTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getJiangchengjiluFile() {
        return jiangchengjiluFile;
    }


    /**
	 * 获取：文件
	 */

    public void setJiangchengjiluFile(String jiangchengjiluFile) {
        this.jiangchengjiluFile = jiangchengjiluFile;
    }
    /**
	 * 设置：文档
	 */
    public String getJiangchengjiluWendang() {
        return jiangchengjiluWendang;
    }


    /**
	 * 获取：文档
	 */

    public void setJiangchengjiluWendang(String jiangchengjiluWendang) {
        this.jiangchengjiluWendang = jiangchengjiluWendang;
    }
    /**
	 * 设置：日期
	 */
    public Date getZhiburizhiTime() {
        return zhiburizhiTime;
    }


    /**
	 * 获取：日期
	 */

    public void setZhiburizhiTime(Date zhiburizhiTime) {
        this.zhiburizhiTime = zhiburizhiTime;
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
        return "Jiangchengjilu{" +
            "id=" + id +
            ", zhibuId=" + zhibuId +
            ", jiangchengjiluName=" + jiangchengjiluName +
            ", jiangchengjiluRongyu=" + jiangchengjiluRongyu +
            ", jiangchengjiluTypes=" + jiangchengjiluTypes +
            ", jiangchengjiluFile=" + jiangchengjiluFile +
            ", jiangchengjiluWendang=" + jiangchengjiluWendang +
            ", zhiburizhiTime=" + zhiburizhiTime +
            ", createTime=" + createTime +
        "}";
    }
}
