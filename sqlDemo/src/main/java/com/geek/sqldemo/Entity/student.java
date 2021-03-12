package com.geek.sqldemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Robert
 * @create 2021/3/12 9:32
 * @Version 1.0
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    private int StuNo;
    private String StuName;
    private String StuSex;
    private String Pwd;
    private int DeptNo;
}
