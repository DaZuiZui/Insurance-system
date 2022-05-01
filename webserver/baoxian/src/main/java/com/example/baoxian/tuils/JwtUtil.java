package com.example.baoxian.tuils;


import com.example.baoxian.pojo.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class JwtUtil {
    /**
     * 生成或解析令牌时候所需要的密钥
     */
    private final static String JWTKey = "demo1";

    /**
     * 生成密文
     * @return
     */
    public static String createJWT(User user){
        //构建jwt令牌
        JwtBuilder builder = Jwts.builder();
        builder.setIssuer("demo1"); //颁发者
        builder.setIssuedAt(new Date()); //颁发时间
        builder.setSubject("demo1");   //主题
        builder.setExpiration(new Date(System.currentTimeMillis()+3600000*10));  //过期时间 设置3600秒

        //自定义信息 自定义载荷
        Map<String,Object> map = new HashMap<>();
        map.put("username",user.getUsername());
        builder.addClaims(map); //添加载荷

        builder.signWith(SignatureAlgorithm.HS256,JWTKey); //1.算法 2.密钥
        //生成密文
        String jstString = builder.compact();
        return jstString;
    }

    /**
     * 解析密钥
     * @param token 传入的token 并且从token解析的数据获取登入的用户名
     * @return
     */
    public static String analysisJWT(String token){
        System.out.println("获取到的"+token);
        Claims body = Jwts.parser()
                //密钥
                .setSigningKey(JWTKey)
                //要解析的令牌
                .parseClaimsJws(token)
                //获取解析后的数据
                .getBody();
        System.out.println(body.get("username"));
        return (String) body.get("username");
    }
}
