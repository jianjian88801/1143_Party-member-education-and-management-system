package com.entity.vo;

import com.entity.ZhiburizhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 支部日志
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiburizhi")
public class ZhiburizhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 支部
     */

    @TableField(value = "zhibu_id")
    private Integer zhibuId;


    /**
     * 日志
     */

    @TableField(value = "zhiburizhi_rizhi")
    private String zhiburizhiRizhi;


    /**
     * 日志类型
     */

    @TableField(value = "zhiburizhi_types")
    private Integer zhiburizhiTypes;


    /**
     * 文件
     */

    @TableField(value = "zhiburizhi_file")
    private String zhiburizhiFile;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zhiburizhi_time")
    private Date zhiburizhiTime;


    /**
     * 支部日志备注
     */

    @TableField(value = "zhiburizhi_text")
    private String zhiburizhiText;


    /**
     * 支部日志详情
     */

    @TableField(value = "zhiburizhi_content")
    private String zhiburizhiContent;


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
	 * 设置：日志
	 */
    public String getZhiburizhiRizhi() {
        return zhiburizhiRizhi;
    }


    /**
	 * 获取：日志
	 */

    public void setZhiburizhiRizhi(String zhiburizhiRizhi) {
        this.zhiburizhiRizhi = zhiburizhiRizhi;
    }
    /**
	 * 设置：日志类型
	 */
    public Integer getZhiburizhiTypes() {
        return zhiburizhiTypes;
    }


    /**
	 * 获取：日志类型
	 */

    public void setZhiburizhiTypes(Integer zhiburizhiTypes) {
        this.zhiburizhiTypes = zhiburizhiTypes;
    }
    /**
	 * 设置：文件
	 */
    public String getZhiburizhiFile() {
        return zhiburizhiFile;
    }


    /**
	 * 获取：文件
	 */

    public void setZhiburizhiFile(String zhiburizhiFile) {
        this.zhiburizhiFile = zhiburizhiFile;
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
	 * 设置：支部日志备注
	 */
    public String getZhiburizhiText() {
        return zhiburizhiText;
    }


    /**
	 * 获取：支部日志备注
	 */

    public void setZhiburizhiText(String zhiburizhiText) {
        this.zhiburizhiText = zhiburizhiText;
    }
    /**
	 * 设置：支部日志详情
	 */
    public String getZhiburizhiContent() {
        return zhiburizhiContent;
    }


    /**
	 * 获取：支部日志详情
	 */

    public void setZhiburizhiContent(String zhiburizhiContent) {
        this.zhiburizhiContent = zhiburizhiContent;
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
