package com.entity.view;

import com.entity.JiangchengjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 奖惩记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiangchengjilu")
public class JiangchengjiluView extends JiangchengjiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 奖惩类型的值
		*/
		private String jiangchengjiluValue;



		//级联表 zhibu
			/**
			* 负责人姓名
			*/
			private String zhibuName;
			/**
			* 党支部
			*/
			private String zhibuDangzhibu;
			/**
			* 联系方式
			*/
			private String zhibuPhone;
			/**
			* 办公地址
			*/
			private String zhibuAddress;
			/**
			* 邮箱
			*/
			private String zhibuEmail;
			/**
			* 支部详情
			*/
			private String zhibuContent;
			/**
			* 假删
			*/
			private Integer zhibuDelete;

	public JiangchengjiluView() {

	}

	public JiangchengjiluView(JiangchengjiluEntity jiangchengjiluEntity) {
		try {
			BeanUtils.copyProperties(this, jiangchengjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 奖惩类型的值
			*/
			public String getJiangchengjiluValue() {
				return jiangchengjiluValue;
			}
			/**
			* 设置： 奖惩类型的值
			*/
			public void setJiangchengjiluValue(String jiangchengjiluValue) {
				this.jiangchengjiluValue = jiangchengjiluValue;
			}
















				//级联表的get和set zhibu
					/**
					* 获取： 负责人姓名
					*/
					public String getZhibuName() {
						return zhibuName;
					}
					/**
					* 设置： 负责人姓名
					*/
					public void setZhibuName(String zhibuName) {
						this.zhibuName = zhibuName;
					}
					/**
					* 获取： 党支部
					*/
					public String getZhibuDangzhibu() {
						return zhibuDangzhibu;
					}
					/**
					* 设置： 党支部
					*/
					public void setZhibuDangzhibu(String zhibuDangzhibu) {
						this.zhibuDangzhibu = zhibuDangzhibu;
					}
					/**
					* 获取： 联系方式
					*/
					public String getZhibuPhone() {
						return zhibuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setZhibuPhone(String zhibuPhone) {
						this.zhibuPhone = zhibuPhone;
					}
					/**
					* 获取： 办公地址
					*/
					public String getZhibuAddress() {
						return zhibuAddress;
					}
					/**
					* 设置： 办公地址
					*/
					public void setZhibuAddress(String zhibuAddress) {
						this.zhibuAddress = zhibuAddress;
					}
					/**
					* 获取： 邮箱
					*/
					public String getZhibuEmail() {
						return zhibuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setZhibuEmail(String zhibuEmail) {
						this.zhibuEmail = zhibuEmail;
					}
					/**
					* 获取： 支部详情
					*/
					public String getZhibuContent() {
						return zhibuContent;
					}
					/**
					* 设置： 支部详情
					*/
					public void setZhibuContent(String zhibuContent) {
						this.zhibuContent = zhibuContent;
					}
					/**
					* 获取： 假删
					*/
					public Integer getZhibuDelete() {
						return zhibuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setZhibuDelete(Integer zhibuDelete) {
						this.zhibuDelete = zhibuDelete;
					}






}
