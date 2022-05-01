package com.example.baoxian;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.CannedAccessControlList;
import com.example.baoxian.util.OSSUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;
@SpringBootTest
public class testOSS {
    public void testOSS(InputStream inputStream ,String  id ,String fileName){
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI5tFfSmSBqN2cJ2WjU8QH";
        String accessKeySecret = "OrXryk2Q7qcx307HN8dfttkqeVhChP";
        String bucktName = "bxxt-lzj";


        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        if (!ossClient.doesBucketExist(bucktName)){
            ossClient.createBucket(bucktName);
            ossClient.setBucketAcl(bucktName, CannedAccessControlList.PublicRead);
        }
        String url = id +'/'+ UUID.randomUUID().toString() +fileName;
        try {
            ossClient.putObject(bucktName,url,inputStream);
        }catch (Exception e){
            System.err.println("上传失败");
        }
// 关闭OSSClient。
        ((OSS) ossClient).shutdown();
    }

    @Test
    public void test01(){
        String filePath = "C:\\Users\\Admin\\Desktop\\10公寓618\\刘朝甲\\baidde.png";
        try {
            InputStream inputStream  = new FileInputStream(filePath);
            testOSS(inputStream,"1","touxiang.png");
        } catch (Exception e) {
            System.err.println("报错了");
        }
    }
    @Autowired
    OSSUtil ossUtil ;
    @Test
    public void test03(){
        try {
            ossUtil.delOSS("3/2ef1b432-20ec-4394-8d98-b4ac5b06a8cbfile.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
