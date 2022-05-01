
<template>
     <div>
         <div style="width:500px;">
            <div class="main animated zoomIn" v-cloak>
                <form  v-on:submit.prevent="submit()">
                    <h1 class="h3 mb-3 font-weight-normal"></h1>
                    <label class="sr-only">Username</label>
                    <input type="text" class="form-control" placeholder="username" required="" autofocus="" id="username" name="username" v-model="user.username">
                    <label class="sr-only">Password</label>
                    <input type="password" class="form-control" placeholder="password" required="" id="password" name="password"  v-model="user.password">
                    <button class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"  style="width:300px;height: 50px;"    > 登入</button> 

            
                    还没有账户?<a href="http://127.0.0.1:8080/user/reg">点击我注册</a>
                    <p class="mt-5 mb-3 text-muted">© 2021 - 2021 &nbsp;</p>
                </form>
            </div>
         </div>
     </div>
</template>


<script>
    import Axios from 'axios'
     
    export default {
        name: "login",     //对外开放打包
 
        data() {
            return{
                formbutton: false,
                
                user:{
                    username: null,
                    password: null,
                },
            }
        },
  //自启动
  mounted(){
 
  },

        methods: {
            //提交登入
            submit(){
                this.$axios.post("http://127.0.0.1/user/login",this.user)
                .then(function(response){
                    console.log(response.data);
                    if("false" == response){
                        alert("密码不正确");
                    }else{
                        setCookie ("token",response.data);
                        setCookie ("idcard",response.data);
                        alert("登入成功");
                        window.location.href="http://127.0.0.1:8080/";
                    }
                    
                }).catch(res =>{
                    alert("服务器繁忙，稍后在尝试");
                }) 
            },
        }
    }
</script>

<style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>
 