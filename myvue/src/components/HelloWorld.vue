<template>
	<div>
		<div class="container-fluid">
			<div class="row">
				<nav class="col-md-2 d-none d-md-block bg-light sidebar"  >
					<div class="">
						<ul class="nav flex-column">
							<li><br> <br>  </li> 
				 
								<li class="nav-item">
								<a class="nav-link active" href="http://127.0.0.1:8080/" >
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-home">
										<path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
										<polyline points="9 22 9 12 15 12 15 22"></polyline>
									</svg>
									首页面板 <span class="sr-only">(current)</span>
								</a>
							</li>
								<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/plist">
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
			
					<div class="jumbotron jumbotron-fluid" style="height:200px">
						<div class="container">
							<h1 class="display-4">保险系统</h1>
							<p class="lead">欢迎来到保险系统</p>
						</div>
					</div>
	
					<div class="alert alert-primary" role="alert">
						待处理事件
					</div>

			 		<div class="form-row">
						<div class="form-group col-md-4">
							<div class="card" style="width: 20rem;">
								<div class="card-body">
									<ul class="list-group">
										<li class="list-group-item">待开发事件A</li>
										<li class="list-group-item">待开发事件B</li>
										<li class="list-group-item">待开发事件C</li>
									</ul>
								</div>
							</div>
						</div>

						<div class="form-group col-md-4">
							<div class="card" style="width: 20rem;">
								<div class="card-body">
									<ul class="list-group">
										<li class="list-group-item">待开发事件D</li>
										<li class="list-group-item">待开发事件E</li>
										<li class="list-group-item">待开发事件F</li>
									</ul>
								</div>
							</div>
						</div>

						<div class="form-group col-md-4" >
							<div class="card" style="width: 20rem;">
								<div class="card-body">
									<ul class="list-group">
										<li class="list-group-item">待开发事件Q</li>
										<li class="list-group-item">待开发事件W</li>
										<li class="list-group-item">待开发事件E</li>
									</ul>
								</div>
							</div>
						</div>
					</div>

		 
					
					<div class="card">
						<h5 class="card-header">保单信息处理</h5>

							<table class="table table-borderless">
								<tbody>
									<tr>
										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">保单总数</b>
										</td>
											<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">生效保单</b>
										</td>
										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">审核中</b>
										</td>

										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">已过期</b>
										</td>
									</tr>
								</tbody>
							</table>
					</div>
					<br><br>
 										<div class="card">
						<h5 class="card-header">用户信息处理</h5>

							<table class="table table-borderless">
								<tbody>
									<tr>
										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">保单总数</b>
										</td>
											<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">生效保单</b>
										</td>
										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">审核中</b>
										</td>

										<td>
											<a style="color:#F00;font-size:18px">100</a>
											 <br>
											<b style="font-size:20px">已过期</b>
										</td>
									</tr>
								</tbody>
							</table>
					</div>
 
    <!-- 图表 -->
	
    <div class="vol-data">
      <div class="charts" style="width:'100%',height:'6.54rem'">
        <div class="charts-title">
           保险系统业务走势图
        </div>
        <div id="myChart" :style="{width:'100%',height:'300px'}">
        </div>
      </div>
    </div>
 
 
				</main>
			</div>
		</div>
	</div>
</template>

 

<script>
import * as echarts from 'echarts';
export default {
  name: 'homeindex',
  data () {
    return {
		dis: false,
	     tip: '2022',
    }
  },
  methods: {
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
			}
  },
  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();

	 var myChart = echarts.init(document.getElementById('myChart'));
    myChart.setOption({
 
   xAxis: {
    data: [2018, 2019, 2020, 2021, this.tip]
  },
  yAxis: {},
        series: [
    {
      data: [10, 40, 28, 23, 40],
      type: 'line',
      areaStyle: {}
    },
    {
      data: [25, 39, 23, 35, 40],
      type: 'line',
      areaStyle: {
        color: '#ff0',
        opacity: 0.5
      }
    }
  ]
     })
 
  },

}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>