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
 * 支部荣誉
 *
 * @author 
 * @email
 */
@TableName("zhiburongyu")
public class ZhiburongyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhiburongyuEntity() {

	}

	public ZhiburongyuEntity(T t) {
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
     * 成果
     */
    @TableField(value = "zhiburongyu_chengguo")

    private String zhiburongyuChengguo;


    /**
     * 证书
     */
    @TableField(value = "zhiburongyu_zhengshu")

    private String zhiburongyuZhengshu;


    /**
     * 荣誉
     */
    @TableField(value = "zhiburongyu_rongyu")

    private String zhiburongyuRongyu;


    /**
     * 荣誉类型
     */
    @TableField(value = "zhiburongyu_types")

    private Integer zhiburongyuTypes;


    /**
     * 文件
     */
    @TableField(value = "zhiburongyu_file")

    private String zhiburongyuFile;


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
	 * 设置：成果
	 */
    public String getZhiburongyuChengguo() {
        return zhiburongyuChengguo;
    }


    /**
	 * 获取：成果
	 */

    public void setZhiburongyuChengguo(String zhiburongyuChengguo) {
        this.zhiburongyuChengguo = zhiburongyuChengguo;
    }
    /**
	 * 设置：证书
	 */
    public String getZhiburongyuZhengshu() {
        return zhiburongyuZhengshu;
    }


    /**
	 * 获取：证书
	 */

    public void setZhiburongyuZhengshu(String zhiburongyuZhengshu) {
        this.zhiburongyuZhengshu = zhiburongyuZhengshu;
    }
    /**
	 * 设置：荣誉
	 */
    public String getZhiburongyuRongyu() {
        return zhiburongyuRongyu;
    }


    /**
	 * 获取：荣誉
	 */

    public void setZhiburongyuRongyu(String zhiburongyuRongyu) {
        this.zhiburongyuRongyu = zhiburongyuRongyu;
    }
    /**
	 * 设置：荣誉类型
	 */
    public Integer getZhiburongyuTypes() {
        return zhiburongyuTypes;
    }


    /**
	 * 获取：荣誉类型
	 */

    public void setZhiburongyuTypes(Integer zhiburongyuTypes) {
        this.zhiburongyuTypes = zhiburongyuTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getZhiburongyuFile() {
        return zhiburongyuFile;
    }


    /**
	 * 获取：文件
	 */

    public void setZhiburongyuFile(String zhiburongyuFile) {
        this.zhiburongyuFile = zhiburongyuFile;
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
        return "Zhiburongyu{" +
            "id=" + id +
            ", zhibuId=" + zhibuId +
            ", zhiburongyuChengguo=" + zhiburongyuChengguo +
            ", zhiburongyuZhengshu=" + zhiburongyuZhengshu +
            ", zhiburongyuRongyu=" + zhiburongyuRongyu +
            ", zhiburongyuTypes=" + zhiburongyuTypes +
            ", zhiburongyuFile=" + zhiburongyuFile +
            ", createTime=" + createTime +
        "}";
    }
}
