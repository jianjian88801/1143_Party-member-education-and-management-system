package com.entity.vo;

import com.entity.JicengdanweiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 基层单位
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jicengdanwei")
public class JicengdanweiVO implements Serializable {
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
