package com.example.testforeignkeyperformance2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Object2 {

    private int id;
    private String name;
    private int object1Id;

}
