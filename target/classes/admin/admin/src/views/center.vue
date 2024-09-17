<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='党员姓名' prop="yonghuName">
               <el-input v-model="ruleForm.yonghuName"  placeholder='党员姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='证件照片' prop="yonghuPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.yonghuPhoto?ruleForm.yonghuPhoto:''"
                         @change="yonghuPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='民族' prop="minzu">
               <el-input v-model="ruleForm.minzu"  placeholder='民族' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='籍贯' prop="jiguan">
               <el-input v-model="ruleForm.jiguan"  placeholder='籍贯' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='出生日期' prop="chushengriqi">
               <el-input v-model="ruleForm.chushengriqi"  placeholder='出生日期' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='文化程度' prop="wenhuachengdu">
               <el-input v-model="ruleForm.wenhuachengdu"  placeholder='文化程度' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='工作单位' prop="gongzuodanwei">
               <el-input v-model="ruleForm.gongzuodanwei"  placeholder='工作单位' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='工作职务' prop="gongzuozhiwu">
               <el-input v-model="ruleForm.gongzuozhiwu"  placeholder='工作职务' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='入党时间' prop="rudangshijian">
               <el-input v-model="ruleForm.rudangshijian"  placeholder='入党时间' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='转正时间' prop="zhuanzhengshijian">
               <el-input v-model="ruleForm.zhuanzhengshijian"  placeholder='转正时间' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='负责人姓名' prop="zhibuName">
                 <el-input v-model="ruleForm.zhibuName" :disabled="true" placeholder="负责人姓名"></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='党支部' prop="zhibuDangzhibu">
                 <el-input v-model="ruleForm.zhibuDangzhibu" :disabled="true" placeholder="党支部"></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='联系方式' prop="zhibuPhone">
                 <el-input v-model="ruleForm.zhibuPhone" :disabled="true" placeholder="联系方式"></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='办公地址' prop="zhibuAddress">
                 <el-input v-model="ruleForm.zhibuAddress" :disabled="true" placeholder="办公地址"></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='邮箱' prop="zhibuEmail">
                 <el-input v-model="ruleForm.zhibuEmail" :disabled="true" placeholder="邮箱"></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='签发日期' prop="qianfariqi">
               <el-input v-model="ruleForm.qianfariqi"  placeholder='签发日期' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='联系方式' prop="yonghuPhone">
               <el-input v-model="ruleForm.yonghuPhone"  placeholder='联系方式' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='党员身份证号' prop="yonghuIdNumber">
               <el-input v-model="ruleForm.yonghuIdNumber"  placeholder='党员身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='邮箱' prop="yonghuEmail">
               <el-input v-model="ruleForm.yonghuEmail"  placeholder='邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhibu'"  label='负责人姓名' prop="zhibuName">
               <el-input v-model="ruleForm.zhibuName"  placeholder='负责人姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhibu'"  label='党支部' prop="zhibuDangzhibu">
               <el-input v-model="ruleForm.zhibuDangzhibu"  placeholder='党支部' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhibu'"  label='联系方式' prop="zhibuPhone">
               <el-input v-model="ruleForm.zhibuPhone"  placeholder='联系方式' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhibu'"  label='办公地址' prop="zhibuAddress">
               <el-input v-model="ruleForm.zhibuAddress"  placeholder='办公地址' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='zhibu'"  label='邮箱' prop="zhibuEmail">
               <el-input v-model="ruleForm.zhibuEmail"  placeholder='邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="24">
             <el-form-item v-if="flag=='zhibu'"  label="支部详情" prop="zhibuContent">
                 <editor
                         style="min-width: 200px; max-width: 600px;"
                         v-model="ruleForm.zhibuContent"
                         class="editor"
                         action="file/upload">
                 </editor>
             </el-form-item>
         </el-col>
         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      sexTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
          this.sexTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
  });
  },
  methods: {
    yonghuPhotoUploadChange(fileUrls) {
        this.ruleForm.yonghuPhoto = fileUrls;
    },

    onUpdateHandler() {
                         if((!this.ruleForm.yonghuName)&& 'yonghu'==this.flag){
                             this.$message.error('党员姓名不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhoto)&& 'yonghu'==this.flag){
                             this.$message.error('证件照片不能为空');
                             return
                         }

                         if((!this.ruleForm.minzu)&& 'yonghu'==this.flag){
                             this.$message.error('民族不能为空');
                             return
                         }

                         if((!this.ruleForm.jiguan)&& 'yonghu'==this.flag){
                             this.$message.error('籍贯不能为空');
                             return
                         }

                         if((!this.ruleForm.chushengriqi)&& 'yonghu'==this.flag){
                             this.$message.error('出生日期不能为空');
                             return
                         }

                         if((!this.ruleForm.wenhuachengdu)&& 'yonghu'==this.flag){
                             this.$message.error('文化程度不能为空');
                             return
                         }

                         if((!this.ruleForm.gongzuodanwei)&& 'yonghu'==this.flag){
                             this.$message.error('工作单位不能为空');
                             return
                         }

                         if((!this.ruleForm.gongzuozhiwu)&& 'yonghu'==this.flag){
                             this.$message.error('工作职务不能为空');
                             return
                         }

                         if((!this.ruleForm.rudangshijian)&& 'yonghu'==this.flag){
                             this.$message.error('入党时间不能为空');
                             return
                         }

                         if((!this.ruleForm.zhuanzhengshijian)&& 'yonghu'==this.flag){
                             this.$message.error('转正时间不能为空');
                             return
                         }

                         if((!this.ruleForm.zhibuId)&& 'yonghu'==this.flag){
                             this.$message.error('所在支部不能为空');
                             return
                         }

                         if((!this.ruleForm.qianfariqi)&& 'yonghu'==this.flag){
                             this.$message.error('签发日期不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhone)&& 'yonghu'==this.flag){
                             this.$message.error('联系方式不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuIdNumber)&& 'yonghu'==this.flag){
                             this.$message.error('党员身份证号不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuEmail&&(!isEmail(this.ruleForm.yonghuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.zhibuName)&& 'zhibu'==this.flag){
                             this.$message.error('负责人姓名不能为空');
                             return
                         }

                         if((!this.ruleForm.zhibuDangzhibu)&& 'zhibu'==this.flag){
                             this.$message.error('党支部不能为空');
                             return
                         }

                         if((!this.ruleForm.zhibuPhone)&& 'zhibu'==this.flag){
                             this.$message.error('联系方式不能为空');
                             return
                         }

                         if((!this.ruleForm.zhibuAddress)&& 'zhibu'==this.flag){
                             this.$message.error('办公地址不能为空');
                             return
                         }

                             if( 'zhibu' ==this.flag && this.ruleForm.zhibuEmail&&(!isEmail(this.ruleForm.zhibuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.zhibuContent)&& 'zhibu'==this.flag){
                             this.$message.error('支部详情不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes)&& this.flag !='users'){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
