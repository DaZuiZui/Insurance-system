<template>
	<div>
		<div class="container-fluid">
			<div class="row">
				<nav class="col-md-2 d-none d-md-block bg-light sidebar">
					<div class="">
						<ul class="nav flex-column">
							<li><br> <br>  </li> 
			 
								<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home">
										<path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
										<polyline points="9 22 9 12 15 12 15 22"></polyline>
									</svg>
									首页面板 <span class="sr-only">(current)</span>
								</a>
							</li>
								<li class="nav-item">
								<a class="nav-link active" href="http://127.0.0.1:8080/plist">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-layers">
										<polygon points="12 2 2 7 12 12 22 7 12 2"></polygon>
										<polyline points="2 17 12 22 22 17"></polyline>
										<polyline points="2 12 12 17 22 12"></polyline>
									</svg>
									自助投保
								</a>
							</li>
					 
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/user/myoder">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file">
										<path d="M13 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V9z"></path>
										<polyline points="13 2 13 9 20 9"></polyline>
									</svg>
									我的保单
								</a>
							</li>
						</ul>

							<ul class="nav flex-column mb-2" v-if="dis">
 
							<h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">

							<span>管理员操作</span>
				
							</h6>
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/admin/policymanagement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									保单管理
								</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/admin/usermanagement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									客户资料管理
								</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/admin/insuredmangement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									被投保人资料管理
								</a>
							</li>
						</ul>
					</div>
				</nav>

				<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                    <h2>我的保单</h2>
                    <br>
<el-row :gutter="20">
  <el-col :span="2"><div class="grid-content bg-purple">&nbsp;</div></el-col>
  <el-col :span="18"><div class="grid-content bg-purple">
	  	<div>
						<el-steps :active="active" finish-status="success">
							<el-step title="保单信息填写"></el-step>
							<el-step title="图片上传"></el-step>
							<el-step title="完成"></el-step>
						</el-steps>
					</div>

					<div class="alert alert-primary" role="alert">
						投保人
					</div>

					<div style="width:200px" >
						类型
						<select class="form-control">
						<option>个体用户</option>
					</select>
					</div>

					<br>

               		<div class="form-group" style="width:50%	" >
						<label for="exampleInputEmail1">姓名</label>
						<input   class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" v-model="form.name">
						<small id="emailHelp" class="form-text text-muted">输入您的姓名</small>
					</div>
 

					<div class="form-row">
						<div class="form-group col-md-6">
						<label for="inputEmail4">身份证</label>
						<input type="email" class="form-control" id="inputEmail4" v-model="form.idcard">
						</div>
						<div class="form-group col-md-6">
						<label for="inputPassword4"  >手机号码</label>
						<input type="text" class="form-control" id="inputPassword4" v-model="form.phoneNumber">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
						<label for="inputEmail4">电子邮箱</label>
						<input type="email" class="form-control" id="inputEmail4" v-model="form.email">
						</div>
						<div class="form-group col-md-6">
						<label for="inputPassword4">常驻城市</label>
						<input type="text" class="form-control" id="inputPassword4" v-model="form.city">
						</div>
					</div>
					
					<div class="alert alert-primary" role="alert">
						被投保人
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
						<label for="inputEmail4">为谁投保</label>
						<input type="email" class="form-control" id="inputEmail4" v-model="form.benameoftheinsured">
						</div>
						<div class="form-group col-md-6">
						<label for="inputPassword4">姓名</label>
						<input type="text" class="form-control" id="inputPassword4" v-model="form.nameoftheinsured">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
						<label for="inputEmail4">有无社保</label>
						<input type="email" class="form-control" id="inputEmail4" v-model="form.socialsecurity">
						</div>
						<div class="form-group col-md-6">
						<label for="inputPassword4">证件信息</label>
						<input type="text" class="form-control" id="inputPassword4" v-model="form.idcardoftheinsunred">
						</div>
					</div>

					<div class="form-group" style="width:50%	" >
						<label for="exampleInputEmail1">手机号码</label>
						<input   class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" v-model="form.phoneofnumber">
						<small id="emailHelp" class="form-text text-muted">手机号码</small>
					</div>

				 
					 
				 <el-date-picker
					v-model="form.times"
					type="date"
					disabled
					placeholder="选择日期">
				</el-date-picker>

					<div>
						 <button class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"  style="width:100%;height: 50px;" @click="submit()"> 修改</button> 
					</div>
	  </div></el-col>
 
</el-row>

				 
				</main>
			</div>
		</div>
	</div>
</template>

<script>
export default {
  name: 'homeindex',
  data () {
    return {
		dis: false,
		active: 0,
		form: {
            id: '',
		   demo: '',     
		   money: 0.00,     
		   times: null,
           name:   '',		//投保人姓名
		   idcard: '',		//投保人身份证
		   phoneNumber: '',	//投保人手机号
		   email: '',		//投保人邮箱
		   city: '',			//投保人常居住的城市

		   phoneofnumber: 	  '', //被投保人的手机号
		   idcardoftheinsunred: '', //被投保人的身份证 
		   nameoftheinsured:   '', //姓名
		   benameoftheinsured: '', //为谁投保
		   socialsecurity:     '', //是否拥有社保 是 or 否
		   username: '',
        }
    }
  },
    //自启动
  mounted(){
	//获取demo昵称
	this.form.id = getQueryVariable("id");
 
    //身份验证 
    this.checkinsin();

    //通过id获取用户信息
    this.$axios.get("http://127.0.0.1/insuretable/querytheDateOfinsuredById?id="+this.form.id)
    .then(res =>{
        this.form = res.data;
        console.log(res.data);
    })
  },
  methods: {
	  	//提交
		submit(){
			this.$axios.post("http://127.0.0.1/insuretable/update",this.form)
			.then(res => {
				alert("修改成功");
				window.location.href="http://127.0.0.1:8080/admin/policymanagement";
			}).catch(res => {

			})
		},

	  	  	   //身份验证
            checkinsin(){
                //获取token
                this.token = getCookie("token");
                //解析token
                this.$axios.get("http://127.0.0.1/user/jiexiJWT?token="+this.token)
                .then((response) => {
					 //tood
					 this.pdgl(response.data)
                 }).catch(res =>{
					alert("您还没有登入!");
				    window.location.href="http://127.0.0.1:8080/user/login";
				 })
            },
			//判断是否为管理员
			pdgl(username){
				this.$axios.get("http://127.0.0.1/user/getUser?username="+username)
				.then(res => {
					if(res.data.role == "admin"){
						this.dis = true;
					}
				})
			},
  }

}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>