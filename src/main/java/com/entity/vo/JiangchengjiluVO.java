package com.entity.vo;

import com.entity.JiangchengjiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖惩记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangchengjilu")
public class JiangchengjiluVO implements Serializable {
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
