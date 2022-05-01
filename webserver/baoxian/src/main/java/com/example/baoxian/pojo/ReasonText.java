package com.example.baoxian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReasonText implements Serializable {
    Integer id ;
    String resontext;
    Integer insuredID;
}
