package com.company.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author wlb10
 * @PackageName initSSM
 * @Package com.company.ssm.pojo
 * @Date 2022/4/23 20:11
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
