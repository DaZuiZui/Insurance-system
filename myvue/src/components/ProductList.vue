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
								<a class="nav-link active"  href="http://127.0.0.1:8080/plist">
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
                    		<h2>保单商品</h2>
                            <hr>
                        <div>
                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐A</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a  class="btn btn-primary" @click="liaojie()">去了解</a>
                                </div>
                            </div>

                            <div style="float:left; width:100px;">  &nbsp;</div>

                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐B</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a   class="btn btn-primary"  @click="liaojie()">去了解</a>
                                </div>
                            </div>

                            <div style="float:left; width:100px;">  &nbsp;</div>

                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐C</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a   class="btn btn-primary"  @click="liaojie()">去了解</a>
                                </div>
                            </div>



                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            </div>

                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐A</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a   class="btn btn-primary"  @click="liaojie()">去了解</a>
                                </div>
                            </div>

                            <div style="float:left; width:100px;">  &nbsp;</div>

                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐A</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a   class="btn btn-primary"  @click="liaojie()">去了解</a>
                                </div>
                            </div>

                            <div style="float:left; width:100px;">  &nbsp;</div>

                            <div class="card"  style="float:left;width:50%;width: 18rem;">
                                <img src="https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg" class="card-img-top" alt="...">
                                <div class="card-body">
                                        <h5 class="card-title">套餐A</h5>
                                        <p class="card-text">asdfghhjkl.</p>
                                        <a   class="btn btn-primary"  @click="liaojie()">去了解</a>
                                </div>
                            </div>
                        </div>
					 
				</main>
         
			</div>
		</div>

        <el-dialog
            title="提示"
            :visible.sync="dialogVisible"
            width="30%"
            :before-close="handleClose">
            <span> 您是否同意保险须知,若您不同意请关闭此窗口</span>
            <span slot="footer" class="dialog-footer">
                <el-button type="primary" @click="ok()">确 定</el-button>
            </span>
        </el-dialog>
	</div>
</template>

<script>
export default {
  name: 'policyMaintanance',
  data () {
    return {
        dis: false,
         dialogVisible: false,
    // s *fom user where id = #{id}
       urls: [
          'https://fuss10.elemecdn.com/a/3f/3302e58f9a181d2509f3dc0fa68b0jpeg.jpeg',
          'https://fuss10.elemecdn.com/1/34/19aa98b1fcb2781c4fba33d850549jpeg.jpeg',
          'https://fuss10.elemecdn.com/0/6f/e35ff375812e6b0020b6b4e8f9583jpeg.jpeg',

        ]

    }
  },
    //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
  },
  methods: {
      ok(){
		 this.dialogVisible = false;
         alert("test");
	 	 window.location.href = "http://127.0.0.1:8080/user/selfInsucrance?demo=A&money=666.66"
	  },
      liaojie(){
          this.dialogVisible=true;
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
      handleClose(done) {
        this.$confirm('如果您拒绝，将终端本次交易')
          .then(_ => {
            done();
            window.location.href="http://127.0.0.1:8080";
          })
          .catch(_ => {});
      }
    },
 
 
}
</script>
 
 