package com.example.baoxian.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feature implements Serializable {
    Integer id ;
    String value ;
    int holderId;
    String holderName;
    String imageUrl;
    Date createTime ;
    Date updateTime ;
}
