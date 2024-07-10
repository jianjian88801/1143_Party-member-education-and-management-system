package com.entity.vo;

import com.entity.ZhiburongyuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 支部荣誉
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiburongyu")
public class ZhiburongyuVO implements Serializable {
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
