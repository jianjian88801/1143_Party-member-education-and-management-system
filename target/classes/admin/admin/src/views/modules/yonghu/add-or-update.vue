<template>
    <div class="addEdit-block">
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                :rules="rules"
                label-width="80px"
                :style="{backgroundColor:addEditForm.addEditBoxColor}">
            <el-row>
                <el-col :span="12"  v-if="sessionTable !='zhibu'">
                    <el-form-item class="select" v-if="type!='info'"  label="支部" prop="zhibuId">
                        <el-select v-model="ruleForm.zhibuId" :disabled="ro.zhibuId" filterable placeholder="请选择支部" @change="zhibuChange">
                            <el-option
                                    v-for="(item,index) in zhibuOptions"
                                    v-bind:key="item.id"
                                    :label="item.zhibuName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>

                <el-col :span="12"  v-if="sessionTable !='zhibu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="负责人姓名" prop="zhibuName">
                        <el-input v-model="zhibuForm.zhibuName"
                                  placeholder="负责人姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="负责人姓名" prop="zhibuName">
                            <el-input v-model="ruleForm.zhibuName"
                                      placeholder="负责人姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='zhibu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="党支部" prop="zhibuDangzhibu">
                        <el-input v-model="zhibuForm.zhibuDangzhibu"
                                  placeholder="党支部" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="党支部" prop="zhibuDangzhibu">
                            <el-input v-model="ruleForm.zhibuDangzhibu"
                                      placeholder="党支部" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='zhibu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="联系方式" prop="zhibuPhone">
                        <el-input v-model="zhibuForm.zhibuPhone"
                                  placeholder="联系方式" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="联系方式" prop="zhibuPhone">
                            <el-input v-model="ruleForm.zhibuPhone"
                                      placeholder="联系方式" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='zhibu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="办公地址" prop="zhibuAddress">
                        <el-input v-model="zhibuForm.zhibuAddress"
                                  placeholder="办公地址" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="办公地址" prop="zhibuAddress">
                            <el-input v-model="ruleForm.zhibuAddress"
                                      placeholder="办公地址" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='zhibu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="邮箱" prop="zhibuEmail">
                        <el-input v-model="zhibuForm.zhibuEmail"
                                  placeholder="邮箱" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="邮箱" prop="zhibuEmail">
                            <el-input v-model="ruleForm.zhibuEmail"
                                      placeholder="邮箱" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <input id="updateId" name="id" type="hidden">
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="账户" prop="username">
                       <el-input v-model="ruleForm.username"
                                 placeholder="账户" clearable  :readonly="ro.username"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="账户" prop="username">
                           <el-input v-model="ruleForm.username"
                                     placeholder="账户" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="党员姓名" prop="yonghuName">
                       <el-input v-model="ruleForm.yonghuName"
                                 placeholder="党员姓名" clearable  :readonly="ro.yonghuName"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="党员姓名" prop="yonghuName">
                           <el-input v-model="ruleForm.yonghuName"
                                     placeholder="党员姓名" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
                <el-col :span="24">
                    <el-form-item class="upload" v-if="type!='info' && !ro.yonghuPhoto" label="证件照片" prop="yonghuPhoto">
                        <file-upload
                            tip="点击上传证件照片"
                            action="file/upload"
                            :limit="3"
                            :multiple="true"
                            :fileUrls="ruleForm.yonghuPhoto?ruleForm.yonghuPhoto:''"
                            @change="yonghuPhotoUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div v-else>
                        <el-form-item v-if="ruleForm.yonghuPhoto" label="证件照片" prop="yonghuPhoto">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.yonghuPhoto || '').split(',')" :src="item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="民族" prop="minzu">
                       <el-input v-model="ruleForm.minzu"
                                 placeholder="民族" clearable  :readonly="ro.minzu"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="民族" prop="minzu">
                           <el-input v-model="ruleForm.minzu"
                                     placeholder="民族" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
                <el-col :span="12">
                    <el-form-item class="select" v-if="type!='info'"  label="性别" prop="sexTypes">
                        <el-select v-model="ruleForm.sexTypes" :disabled="ro.sexTypes" placeholder="请选择性别">
                            <el-option
                                v-for="(item,index) in sexTypesOptions"
                                v-bind:key="item.codeIndex"
                                :label="item.indexName"
                                :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="性别" prop="sexValue">
                        <el-input v-model="ruleForm.sexValue"
                            placeholder="性别" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="籍贯" prop="jiguan">
                       <el-input v-model="ruleForm.jiguan"
                                 placeholder="籍贯" clearable  :readonly="ro.jiguan"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="籍贯" prop="jiguan">
                           <el-input v-model="ruleForm.jiguan"
                                     placeholder="籍贯" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="出生日期" prop="chushengriqi">
                       <el-input v-model="ruleForm.chushengriqi"
                                 placeholder="出生日期" clearable  :readonly="ro.chushengriqi"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="出生日期" prop="chushengriqi">
                           <el-input v-model="ruleForm.chushengriqi"
                                     placeholder="出生日期" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="文化程度" prop="wenhuachengdu">
                       <el-input v-model="ruleForm.wenhuachengdu"
                                 placeholder="文化程度" clearable  :readonly="ro.wenhuachengdu"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="文化程度" prop="wenhuachengdu">
                           <el-input v-model="ruleForm.wenhuachengdu"
                                     placeholder="文化程度" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="工作单位" prop="gongzuodanwei">
                       <el-input v-model="ruleForm.gongzuodanwei"
                                 placeholder="工作单位" clearable  :readonly="ro.gongzuodanwei"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="工作单位" prop="gongzuodanwei">
                           <el-input v-model="ruleForm.gongzuodanwei"
                                     placeholder="工作单位" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="工作职务" prop="gongzuozhiwu">
                       <el-input v-model="ruleForm.gongzuozhiwu"
                                 placeholder="工作职务" clearable  :readonly="ro.gongzuozhiwu"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="工作职务" prop="gongzuozhiwu">
                           <el-input v-model="ruleForm.gongzuozhiwu"
                                     placeholder="工作职务" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="入党时间" prop="rudangshijian">
                       <el-input v-model="ruleForm.rudangshijian"
                                 placeholder="入党时间" clearable  :readonly="ro.rudangshijian"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="入党时间" prop="rudangshijian">
                           <el-input v-model="ruleForm.rudangshijian"
                                     placeholder="入党时间" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="转正时间" prop="zhuanzhengshijian">
                       <el-input v-model="ruleForm.zhuanzhengshijian"
                                 placeholder="转正时间" clearable  :readonly="ro.zhuanzhengshijian"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="转正时间" prop="zhuanzhengshijian">
                           <el-input v-model="ruleForm.zhuanzhengshijian"
                                     placeholder="转正时间" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
            <input id="zhibuId" name="zhibuId" type="hidden">
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="签发日期" prop="qianfariqi">
                       <el-input v-model="ruleForm.qianfariqi"
                                 placeholder="签发日期" clearable  :readonly="ro.qianfariqi"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="签发日期" prop="qianfariqi">
                           <el-input v-model="ruleForm.qianfariqi"
                                     placeholder="签发日期" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="联系方式" prop="yonghuPhone">
                       <el-input v-model="ruleForm.yonghuPhone"
                                 placeholder="联系方式" clearable  :readonly="ro.yonghuPhone"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="联系方式" prop="yonghuPhone">
                           <el-input v-model="ruleForm.yonghuPhone"
                                     placeholder="联系方式" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="党员身份证号" prop="yonghuIdNumber">
                       <el-input v-model="ruleForm.yonghuIdNumber"
                                 placeholder="党员身份证号" clearable  :readonly="ro.yonghuIdNumber"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="党员身份证号" prop="yonghuIdNumber">
                           <el-input v-model="ruleForm.yonghuIdNumber"
                                     placeholder="党员身份证号" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="邮箱" prop="yonghuEmail">
                       <el-input v-model="ruleForm.yonghuEmail"
                                 placeholder="邮箱" clearable  :readonly="ro.yonghuEmail"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="邮箱" prop="yonghuEmail">
                           <el-input v-model="ruleForm.yonghuEmail"
                                     placeholder="邮箱" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
            </el-row>
            <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
                <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
                <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>
<script>
    import styleJs from "../../../utils/style.js";
    // 数字，邮件，手机，url，身份证校验
    import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
    export default {
        data() {
            return {
                addEditForm:null,
                id: '',
                type: '',
                sessionTable : "",//登录账户所在表名
                role : "",//权限
                userId:"",//当前登录人的id
                zhibuForm: {},
                ro:{
                    username: false,
                    password: false,
                    yonghuName: false,
                    yonghuPhoto: false,
                    minzu: false,
                    sexTypes: false,
                    jiguan: false,
                    chushengriqi: false,
                    wenhuachengdu: false,
                    gongzuodanwei: false,
                    gongzuozhiwu: false,
                    rudangshijian: false,
                    zhuanzhengshijian: false,
                    zhibuId: false,
                    qianfariqi: false,
                    yonghuPhone: false,
                    yonghuIdNumber: false,
                    yonghuEmail: false,
                    yonghuDelete: false,
                },
                ruleForm: {
                    username: '',
                    password: '',
                    yonghuName: '',
                    yonghuPhoto: '',
                    minzu: '',
                    sexTypes: '',
                    jiguan: '',
                    chushengriqi: '',
                    wenhuachengdu: '',
                    gongzuodanwei: '',
                    gongzuozhiwu: '',
                    rudangshijian: '',
                    zhuanzhengshijian: '',
                    zhibuId: '',
                    qianfariqi: '',
                    yonghuPhone: '',
                    yonghuIdNumber: '',
                    yonghuEmail: '',
                    yonghuDelete: '',
                },
                sexTypesOptions : [],
                zhibuOptions : [],
                rules: {
                   username: [
                              { required: true, message: '账户不能为空', trigger: 'blur' },
                          ],
                   password: [
                              { required: true, message: '密码不能为空', trigger: 'blur' },
                          ],
                   yonghuName: [
                              { required: true, message: '党员姓名不能为空', trigger: 'blur' },
                          ],
                   yonghuPhoto: [
                              { required: true, message: '证件照片不能为空', trigger: 'blur' },
                          ],
                   minzu: [
                              { required: true, message: '民族不能为空', trigger: 'blur' },
                          ],
                   sexTypes: [
                              { required: true, message: '性别不能为空', trigger: 'blur' },
                              {  pattern: /^[1-9][0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   jiguan: [
                              { required: true, message: '籍贯不能为空', trigger: 'blur' },
                          ],
                   chushengriqi: [
                              { required: true, message: '出生日期不能为空', trigger: 'blur' },
                          ],
                   wenhuachengdu: [
                              { required: true, message: '文化程度不能为空', trigger: 'blur' },
                          ],
                   gongzuodanwei: [
                              { required: true, message: '工作单位不能为空', trigger: 'blur' },
                          ],
                   gongzuozhiwu: [
                              { required: true, message: '工作职务不能为空', trigger: 'blur' },
                          ],
                   rudangshijian: [
                              { required: true, message: '入党时间不能为空', trigger: 'blur' },
                          ],
                   zhuanzhengshijian: [
                              { required: true, message: '转正时间不能为空', trigger: 'blur' },
                          ],
                   zhibuId: [
                              { required: true, message: '所在支部不能为空', trigger: 'blur' },
                              {  pattern: /^[1-9][0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   qianfariqi: [
                              { required: true, message: '签发日期不能为空', trigger: 'blur' },
                          ],
                   yonghuPhone: [
                              {  required: true, message: '联系方式不能为空', trigger: 'blur' },
                              {  pattern: /^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$/,
                                 message: '联系方式格式不对',
                                 trigger: 'blur'
                              }
                          ],
                   yonghuIdNumber: [
                              { required: true, message: '党员身份证号不能为空', trigger: 'blur' },
                              { pattern: /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/,
                                message: '党员身份证号格式有误！',
                                trigger: 'blur'
                              }
                          ],
                   yonghuEmail: [
                              { required: true, message: '邮箱不能为空', trigger: 'blur' },
                              { pattern: /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/,
                                message: '邮箱只能是邮箱格式',
                                trigger: 'blur'
                              }
                          ],
                   yonghuDelete: [
                              { required: true, message: '假删不能为空', trigger: 'blur' },
                              {  pattern: /^[1-9][0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                }
            };
        },
        props: ["parent"],
        computed: {
        },
        created() {
            //获取当前登录用户的信息
            this.sessionTable = this.$storage.get("sessionTable");
            this.role = this.$storage.get("role");
            this.userId = this.$storage.get("userId");

            if (this.role != "管理员"){
            }
            this.addEditForm = styleJs.addStyle();
            this.addEditStyleChange()
            this.addEditUploadStyleChange()
            //获取下拉框信息
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.sexTypesOptions = data.data.list;
                    }
                });

         this.$http({
             url: `zhibu/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
                this.zhibuOptions = data.data.list;
            }
         });

        },
        mounted() {
        },
        methods: {
            // 下载
            download(file){
                window.open(`${file}`)
            },
            // 初始化
            init(id,type) {
                if (id) {
                    this.id = id;
                    this.type = type;
                }
                if(this.type=='info'||this.type=='else'){
                    this.info(id);
                }
                // 获取用户信息
                this.$http({
                    url:`${this.$storage.get("sessionTable")}/session`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        var json = data.data;
                    } else {
                        this.$message.error(data.msg);
                    }
                });
            },
            zhibuChange(id){
                this.$http({
                    url: `zhibu/info/`+id,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.zhibuForm = data.data;
                    }
                });
            },
            // 多级联动参数
            info(id) {
                let _this =this;
                _this.$http({
                    url: `yonghu/info/${id}`,
                    method: 'get'
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        _this.ruleForm = data.data;
                        _this.zhibuChange(data.data.zhibuId)
                    } else {
                        _this.$message.error(data.msg);
                    }
                });
            },
            // 提交
            onSubmit() {
                this.$refs["ruleForm"].validate(valid => {
                    if (valid) {
                        this.$http({
                            url:`yonghu/${!this.ruleForm.id ? "save" : "update"}`,
                            method: "post",
                            data: this.ruleForm
                        }).then(({ data }) => {
                            if (data && data.code === 0) {
                                this.$message({
                                    message: "操作成功",
                                    type: "success",
                                    duration: 1500,
                                    onClose: () => {
                                        this.parent.showFlag = true;
                                        this.parent.addOrUpdateFlag = false;
                                        this.parent.yonghuCrossAddOrUpdateFlag = false;
                                        this.parent.search();
                                        this.parent.contentStyleChange();
                                    }
                                });
                            } else {
                                this.$message.error(data.msg);
                            }
                        });
                    }
                });
            },
            // 获取uuid
            getUUID () {
                return new Date().getTime();
            },
            // 返回
            back() {
                this.parent.showFlag = true;
                this.parent.addOrUpdateFlag = false;
                this.parent.yonghuCrossAddOrUpdateFlag = false;
                this.parent.contentStyleChange();
            },
            //图片
            yonghuPhotoUploadChange(fileUrls){
                this.ruleForm.yonghuPhoto = fileUrls;
                this.addEditUploadStyleChange()
            },

            addEditStyleChange() {
                this.$nextTick(()=>{
                    // input
                    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputFontColor
                        el.style.fontSize = this.addEditForm.inputFontSize
                        el.style.borderWidth = this.addEditForm.inputBorderWidth
                        el.style.borderStyle = this.addEditForm.inputBorderStyle
                        el.style.borderColor = this.addEditForm.inputBorderColor
                        el.style.borderRadius = this.addEditForm.inputBorderRadius
                        el.style.backgroundColor = this.addEditForm.inputBgColor
                    })
                    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputLableColor
                        el.style.fontSize = this.addEditForm.inputLableFontSize
                    })
                    // select
                    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectFontColor
                        el.style.fontSize = this.addEditForm.selectFontSize
                        el.style.borderWidth = this.addEditForm.selectBorderWidth
                        el.style.borderStyle = this.addEditForm.selectBorderStyle
                        el.style.borderColor = this.addEditForm.selectBorderColor
                        el.style.borderRadius = this.addEditForm.selectBorderRadius
                        el.style.backgroundColor = this.addEditForm.selectBgColor
                    })
                    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectLableColor
                        el.style.fontSize = this.addEditForm.selectLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
                        el.style.color = this.addEditForm.selectIconFontColor
                        el.style.fontSize = this.addEditForm.selectIconFontSize
                    })
                    // date
                    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateFontColor
                        el.style.fontSize = this.addEditForm.dateFontSize
                        el.style.borderWidth = this.addEditForm.dateBorderWidth
                        el.style.borderStyle = this.addEditForm.dateBorderStyle
                        el.style.borderColor = this.addEditForm.dateBorderColor
                        el.style.borderRadius = this.addEditForm.dateBorderRadius
                        el.style.backgroundColor = this.addEditForm.dateBgColor
                    })
                    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateLableColor
                        el.style.fontSize = this.addEditForm.dateLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
                        el.style.color = this.addEditForm.dateIconFontColor
                        el.style.fontSize = this.addEditForm.dateIconFontSize
                        el.style.lineHeight = this.addEditForm.dateHeight
                    })
                    // upload
                    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
                    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.uploadHeight
                        el.style.color = this.addEditForm.uploadLableColor
                        el.style.fontSize = this.addEditForm.uploadLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
                        el.style.color = this.addEditForm.uploadIconFontColor
                        el.style.fontSize = this.addEditForm.uploadIconFontSize
                        el.style.lineHeight = iconLineHeight
                        el.style.display = 'block'
                    })
                    // 多文本输入框
                    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
                        el.style.height = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaFontColor
                        el.style.fontSize = this.addEditForm.textareaFontSize
                        el.style.borderWidth = this.addEditForm.textareaBorderWidth
                        el.style.borderStyle = this.addEditForm.textareaBorderStyle
                        el.style.borderColor = this.addEditForm.textareaBorderColor
                        el.style.borderRadius = this.addEditForm.textareaBorderRadius
                        el.style.backgroundColor = this.addEditForm.textareaBgColor
                    })
                    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
                        // el.style.lineHeight = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaLableColor
                        el.style.fontSize = this.addEditForm.textareaLableFontSize
                    })
                    // 保存
                    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
                        el.style.width = this.addEditForm.btnSaveWidth
                        el.style.height = this.addEditForm.btnSaveHeight
                        el.style.color = this.addEditForm.btnSaveFontColor
                        el.style.fontSize = this.addEditForm.btnSaveFontSize
                        el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
                        el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
                        el.style.borderColor = this.addEditForm.btnSaveBorderColor
                        el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnSaveBgColor
                    })
                    // 返回
                    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
                        el.style.width = this.addEditForm.btnCancelWidth
                        el.style.height = this.addEditForm.btnCancelHeight
                        el.style.color = this.addEditForm.btnCancelFontColor
                        el.style.fontSize = this.addEditForm.btnCancelFontSize
                        el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
                        el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
                        el.style.borderColor = this.addEditForm.btnCancelBorderColor
                        el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnCancelBgColor
                    })
                })
            },
            addEditUploadStyleChange() {
                this.$nextTick(()=>{
                    document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                })
            },
        }
    };
</script>
<style lang="scss">
.editor{
  height: 500px;

  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}</style>

