package com.example.baoxian.util;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.UUID;
@Component
public class OSSUtil {
    public String addOSS(InputStream inputStream , String  id , String fileName){
        String endpoint = "oss endpoint";
        String accessKeyId = "accessKeyId of oss";
        String accessKeySecret = "accessKeySecret of oss";
        String bucktName = "bxxt-lzj";
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        if (!ossClient.doesBucketExist(bucktName)){
            ossClient.createBucket(bucktName);
            ossClient.setBucketAcl(bucktName, CannedAccessControlList.PublicRead);
        }
        String url = id +'/'+ UUID.randomUUID().toString() +fileName;
        try {
            ossClient.putObject(bucktName,url,inputStream);
            ((OSS) ossClient).shutdown();
            return url;
        }catch (Exception e){
            System.err.println("上传失败");
            ((OSS) ossClient).shutdown();
            return url;
        }
//// 关闭OSSClient。
//        ((OSS) ossClient).shutdown();
//        return url;
    }
    public boolean delOSS(String objectName) throws Exception {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "oss endpoint";
        String accessKeyId = "accessKeyId of oss";
        String accessKeySecret = "accessKeySecret of oss";
        String bucketName = "bxxt-lzj";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            // 删除文件或目录。如果要删除目录，目录必须为空。
            ossClient.deleteObject(bucketName, objectName);
            return true;
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
        return false;
    }
}
