package com.example.baoxian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resofuser  implements Serializable {
    Integer id ;
    Integer insuredId ;
    String imageurl;
}
