package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 党员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
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
     * 党员姓名
     */
    private String yonghuName;


    /**
     * 证件照片
     */
    private String yonghuPhoto;


    /**
     * 民族
     */
    private String minzu;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 籍贯
     */
    private String jiguan;


    /**
     * 出生日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chushengriqi;


    /**
     * 文化程度
     */
    private String wenhuachengdu;


    /**
     * 工作单位
     */
    private String gongzuodanwei;


    /**
     * 工作职务
     */
    private String gongzuozhiwu;


    /**
     * 入党时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date rudangshijian;


    /**
     * 转正时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhuanzhengshijian;


    /**
     * 所在支部
     */
    private Integer zhibuId;


    /**
     * 签发日期
     */
    private String qianfariqi;


    /**
     * 联系方式
     */
    private String yonghuPhone;


    /**
     * 党员身份证号
     */
    private String yonghuIdNumber;


    /**
     * 邮箱
     */
    private String yonghuEmail;


    /**
     * 假删
     */
    private Integer yonghuDelete;


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
	 * 获取：党员姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：党员姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：证件照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：证件照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：民族
	 */
    public String getMinzu() {
        return minzu;
    }


    /**
	 * 设置：民族
	 */
    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：籍贯
	 */
    public String getJiguan() {
        return jiguan;
    }


    /**
	 * 设置：籍贯
	 */
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    /**
	 * 获取：出生日期
	 */
    public Date getChushengriqi() {
        return chushengriqi;
    }


    /**
	 * 设置：出生日期
	 */
    public void setChushengriqi(Date chushengriqi) {
        this.chushengriqi = chushengriqi;
    }
    /**
	 * 获取：文化程度
	 */
    public String getWenhuachengdu() {
        return wenhuachengdu;
    }


    /**
	 * 设置：文化程度
	 */
    public void setWenhuachengdu(String wenhuachengdu) {
        this.wenhuachengdu = wenhuachengdu;
    }
    /**
	 * 获取：工作单位
	 */
    public String getGongzuodanwei() {
        return gongzuodanwei;
    }


    /**
	 * 设置：工作单位
	 */
    public void setGongzuodanwei(String gongzuodanwei) {
        this.gongzuodanwei = gongzuodanwei;
    }
    /**
	 * 获取：工作职务
	 */
    public String getGongzuozhiwu() {
        return gongzuozhiwu;
    }


    /**
	 * 设置：工作职务
	 */
    public void setGongzuozhiwu(String gongzuozhiwu) {
        this.gongzuozhiwu = gongzuozhiwu;
    }
    /**
	 * 获取：入党时间
	 */
    public Date getRudangshijian() {
        return rudangshijian;
    }


    /**
	 * 设置：入党时间
	 */
    public void setRudangshijian(Date rudangshijian) {
        this.rudangshijian = rudangshijian;
    }
    /**
	 * 获取：转正时间
	 */
    public Date getZhuanzhengshijian() {
        return zhuanzhengshijian;
    }


    /**
	 * 设置：转正时间
	 */
    public void setZhuanzhengshijian(Date zhuanzhengshijian) {
        this.zhuanzhengshijian = zhuanzhengshijian;
    }
    /**
	 * 获取：所在支部
	 */
    public Integer getZhibuId() {
        return zhibuId;
    }


    /**
	 * 设置：所在支部
	 */
    public void setZhibuId(Integer zhibuId) {
        this.zhibuId = zhibuId;
    }
    /**
	 * 获取：签发日期
	 */
    public String getQianfariqi() {
        return qianfariqi;
    }


    /**
	 * 设置：签发日期
	 */
    public void setQianfariqi(String qianfariqi) {
        this.qianfariqi = qianfariqi;
    }
    /**
	 * 获取：联系方式
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：党员身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：党员身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：假删
	 */
    public Integer getYonghuDelete() {
        return yonghuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setYonghuDelete(Integer yonghuDelete) {
        this.yonghuDelete = yonghuDelete;
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
