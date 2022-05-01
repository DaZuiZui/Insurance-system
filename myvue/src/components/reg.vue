<template>
    <div>
        <div style="margin: auto;width: 600px" id="enrolldate" class="animated zoomIn" v-cloak>
            <div style="margin: auto;width: 250px">
                 
            </div>
            <form v-on:submit.prevent="submit()">
                   <div class="form-group">
                    <label for="username">账号</label>    <span style="color:#FF0000;font-size:14px">{{userdataerror.usernameerror}}</span>
                    <input type="text" class="form-control" id="username" name="username" v-model="userdata.username">
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="password">密码</label>
                         <span style="color:#FF0000;font-size:14px">{{this.userdataerror.eqpassworderror1}}</span>
                        <input type="password" class="form-control" id="password" name="password" v-model="userdata.password">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="erpassword">确认密码</label>   <span style="color:#FF0000;font-size:14px">{{this.userdataerror.eqpassworderror}}</span>
                        <input type="password" class="form-control" id="erpassword" name="eqpassword" v-model="userdata.eqpassword">
                    </div>
                </div>
                <div class="form-group">
                    <label for="name">昵称</label>    <span style="color:#FF0000;font-size:14px">{{userdataerror.nameerror}}</span>
                    <input type="text" class="form-control" id="name" name="name" v-model="userdata.name">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>  <span style="color:#FF0000;font-size:14px">{{this.userdataerror.emailerror}}</span>
                    <input type="email" class="form-control" id="email" name="email" v-model="userdata.email">
                </div>
 
                <button class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"    style="width:600px;height: 50px;"> 注册</button> 
         
                <div style="margin: auto;width: 180px">
                    我已经拥有账户<a href="http://127.0.0.1:8080/user/reg">前去登入</a>
                </div>
            </form>
            <div style="margin: auto;width: 204px">
            
            </div>
        </div>
    </div>
</template>

<script>
    import Axios from 'axios'
    export default {
        name: "registered",

        data() {
            return{
                    userdata: {
                        username: null,
                        password: null,
                        eqpassword: null,
                        authority: null,
                        name: null,
                        year: null,
              
                        email: null,
                    },
                    //错误信息提示数据
                    userdataerror: {
                        usernameerror: null,
                        passworderror: null,
                        eqpassworderror: null,
                        authorityerror: null,
                        nameerror: null,
                        yearserror: null,
                        dayerror: null,
                        montherror: null,
                        emailerror: null,
                        sexerror: null,
                    },
                    //用户数据是否合法校验
                    userformif: true,
                    //年份集合
                    yearsList: [1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015],
                    //月份集合
                    monthArray: [1,2,3,4,5,6,7,8,9,10,11,12],
                    //设置按钮为不可点击
                    formbutton: false,
                }
        },

        methods: {
            //注册
            submit() {
       
                  //更新验证判断为真
                    this.userformif = true;
                   //判断账号是否合法
                   var usernamepattern=/^\w{4,16}$/;
                   if(!usernamepattern.test(this.userdata.username) || this.userdata.username == null){
                       this.userdataerror.usernameerror = "账号长度要在4到20位之间且不能为空！";
                       this.userformif = false;
                   }else{
                    this.userdataerror.usernameerror = "";
                   }
            
                    //判断两次密码输入的是否相同并且不为空
                   if (this.userdata.eqpassword != this.userdata.password || this.userdata.password == null || this.userdata.eqpassword == null || this.userdata.eqpassword.length < 6 || this.userdata.eqpassword.length > 30){
                       this.userdataerror.eqpassworderror = "两次密码输入的必须相同长度在6-30";
                       this.userformif = false;
                   }else{
                       this.userdataerror.eqpassworderror = "";
                   }

                   //判断名字是否合法
                   if (this.userdata.name == null){
                       this.userdataerror.nameerror = "名字不可以为空";
                       this.userformif = false;
                   }else{
                        if(this.userdata.name.length < 2 || this.userdata.name.length > 30){
                            this.userdataerror.nameerror = "昵称长度请在2-30之间";
                            this.userformif = false;
                        }else{
                                   this.userdataerror.nameerror = "";
                        }
                   }
                   
                   //判断邮箱是否合法
                   var emailpattern =  /^[A-Za-z0-9]+([_\.][A-Za-z0-9]+)*@([A-Za-z0-9\-]+\.)+[A-Za-z]{2,25}$/;
                   if (!emailpattern.test(this.userdata.email) || this.userdata.email == null ){
                       this.userdataerror.emailerror = "您输入的邮箱格式不正确";
                       this.userformif = false;
                   }else{
                       this.userdataerror.emailerror = "";
                   }
 
                   alert(this.userformif);
                   //如果所有校验都合法
                   if (this.userformif){
                      //更新表单按钮为不可提交
                       this.formbutton = true;
                       this.$axios.post("http://127.0.0.1/user/adduser",
                       this.userdata 
                       ).then(function (response) { //   后端返回的值  http 请求头   axzx http   JOSN
                            alert("返回的json字符串"+response.data);
                            if(response.data == true){ 
                                alert("恭喜你注册成功,前往登入吧!")
                                //弹窗
                                // 跳转   ---->  硬跳转 
                                // 
                               window.location.href="http://127.0.0.1:8080/user/login";
                            }
                            if(response.data == false){
                                alert("您的账户已经被其他人注册");
                                vm.formbutton = false;
                            }
                       })
                   }
            },
       }
    }
</script>

<style scoped> 
  @import 'http://www.dazuizui.com:5002/static/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>
 