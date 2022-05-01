<!--
    管理员
     宝单管理
-->
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
								<a class="nav-link"  href="http://127.0.0.1:8080/plist">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-layers">
										<polygon points="12 2 2 7 12 12 22 7 12 2"></polygon>
										<polyline points="2 17 12 22 22 17"></polyline>
										<polyline points="2 12 12 17 22 12"></polyline>
									</svg>
									自助投保
								</a>
							</li>
					 
							<li class="nav-item">
								<a class="nav-link  " href="http://127.0.0.1:8080/user/myoder">
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
                    		<h2>保单管理</h2>
                            <br>
                        <div class="table-responsive">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>订单id</th>
									<th>投保内容</th>
									<th>客户id</th>
                                    <th>金额(元)</th>
									<th>状态</th>
                                    <th>生成日期</th>
                                    <th>订单来源</th>
                                    <th>操作</th>
								</tr>
							</thead>
							<tbody v-for="(article,index) in t" :key="index">
								<tr v-if="article.state != '客户取消'">
									<td>{{article.id}}</td>
									<td>{{article.demo}}</td>
									<td>{{article.username}}</td>
                                    <td>{{article.money}}</td>
                                    <td>{{article.state}}</td>
                                    <td>{{article.times}}</td>
                                    <td>推荐</td>
                                    <td v-if="article.state == '待审核'">
                                        <button type="button" class="btn btn-primary" @click="sqlp(article.id)">申请审核</button>
                                        <button type="button" class="btn btn-warning" @click="updatethedate(article.id)">信息修改</button>
                                        <button type="button" class="btn btn-danger"  @click="deletedemo(article.id)">信息删除</button>
                                    </td>

									<td v-else>
                                        <button type="button" class="btn btn-primary" @click="sqlp()" disabled>申请审核</button>
                                        <button type="button" class="btn btn-warning" @click="updatethedate(article.id)">信息修改</button>
                                        <button type="button" class="btn btn-danger"  @click="deletedemo(article.id)" >信息删除</button>
                                    </td>
								</tr>
							</tbody>
						</table>
					</div>
				</main>
			</div>
		</div>
		<el-dialog
  title="提示"
  :visible.sync="dialogVisible"
  width="30%"
  :before-close="handleClose">
  <span>我已同意解理赔须知，如果不同意请关闭此窗口</span>
  <span slot="footer" class="dialog-footer">
    <el-button type="primary" @click="ok()">我同意</el-button>
  </span>
</el-dialog>
	</div>
</template>

<script>
export default {
  name: 'myOder',
  data () {
    return {
		dis: false,
		 dialogVisible: false,
		 t: {
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
        },
    }
  },
    //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
 
	this.$axios.get("http://127.0.0.1/insuretable/selectAll")
	.then(res =>{
		this.t = res.data;
	})
  },
   methods: {
	   sqlp(id){
		   window.location.href="http://127.0.0.1:8080/admin/sqlp?id="+id;
	   },
	   updatethedate(id){
		   window.location.href="http://127.0.0.1:8080/admin/Uinsured?id="+id;
	   },
	   //删除一个保单 
	   deletedemo(id){
		 this.$axios.get("http://127.0.0.1/insuretable/del?id="+id)
		 .then(res => {
			alert("删除成功")
			window.location.href="http://127.0.0.1:8080/admin/policymanagement";
		 })
	   },

	  xianshi(){
		  this.dialogVisible = true;
	  },
	  ok(){
		this.dialogVisible = false;
	 	 window.location.href = "http://127.0.0.1:8080/user/csa";
	  },
      handleClose(done) {
        this.$confirm('确认关闭？')
          .then(_ => {
            done();
			window.location.href="http://127.0.0.1:8080/"
          })
          .catch(_ => {});
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
 
 