package com.entity.model;

import com.entity.ZhiburongyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 支部荣誉
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhiburongyuModel implements Serializable {
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
     * 成果
     */
    private String zhiburongyuChengguo;


    /**
     * 证书
     */
    private String zhiburongyuZhengshu;


    /**
     * 荣誉
     */
    private String zhiburongyuRongyu;


    /**
     * 荣誉类型
     */
    private Integer zhiburongyuTypes;


    /**
     * 文件
     */
    private String zhiburongyuFile;


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
	 * 获取：成果
	 */
    public String getZhiburongyuChengguo() {
        return zhiburongyuChengguo;
    }


    /**
	 * 设置：成果
	 */
    public void setZhiburongyuChengguo(String zhiburongyuChengguo) {
        this.zhiburongyuChengguo = zhiburongyuChengguo;
    }
    /**
	 * 获取：证书
	 */
    public String getZhiburongyuZhengshu() {
        return zhiburongyuZhengshu;
    }


    /**
	 * 设置：证书
	 */
    public void setZhiburongyuZhengshu(String zhiburongyuZhengshu) {
        this.zhiburongyuZhengshu = zhiburongyuZhengshu;
    }
    /**
	 * 获取：荣誉
	 */
    public String getZhiburongyuRongyu() {
        return zhiburongyuRongyu;
    }


    /**
	 * 设置：荣誉
	 */
    public void setZhiburongyuRongyu(String zhiburongyuRongyu) {
        this.zhiburongyuRongyu = zhiburongyuRongyu;
    }
    /**
	 * 获取：荣誉类型
	 */
    public Integer getZhiburongyuTypes() {
        return zhiburongyuTypes;
    }


    /**
	 * 设置：荣誉类型
	 */
    public void setZhiburongyuTypes(Integer zhiburongyuTypes) {
        this.zhiburongyuTypes = zhiburongyuTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getZhiburongyuFile() {
        return zhiburongyuFile;
    }


    /**
	 * 设置：文件
	 */
    public void setZhiburongyuFile(String zhiburongyuFile) {
        this.zhiburongyuFile = zhiburongyuFile;
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
