# Insurance-system
​	本项目由Java+Vue+Mysql开发，主要实现了用户端的功能，例如（自助投保功能、我的保单，保单维护功能)

管理端的功能（管理首页、保单管理、客户资源管理、被投保人资料管理）

​	此项目可以作为您的毕业项目，可以二次开发，如果您对我的项目进行了二次开发并开源请在开源项目中的自述文件说明。
 This project is developed by Java+Vue+Mysql and mainly realizes the functions of the user side, such as (self-service insurance, my policy, policy maintenance)

The functions of the management terminal (management homepage, policy management, customer resource management, insured data management)

 This project can be used as your graduation project and can be developed again. If you have carried out secondary development of my project and open source it, please explain it in the readme file in the open source project.

## Set the project environment - front end

 The front-end uses OSS to separate static and dynamic files. To start this project, you must first have OSS.

 The first step:

 Upload static files (staticfiles) to oss

 The second step:

 Change the path referenced by index.html to your oss address



Next start the web project

~~~vue
npm install
npm run dev
~~~

## Set the project environment - backend

 This project uses OSS to implement file management. First, set your oss information in the OSSUtils.java folder in the uitl folder, then find the application.yml folder and modify it to your database configuration
