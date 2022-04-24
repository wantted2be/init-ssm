package com.company.ssm.test;

import com.company.ssm.pojo.Books;
import com.company.ssm.service.BookService;
import com.company.ssm.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wlb10
 * @PackageName initSSM
 * @Package com.company.ssm.test
 * @Date 2022/4/24 12:25
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)applicationContext.getBean("BookServiceImpl");
        for(Books books : bookService.queryAllBook()){
            System.out.println(books);
        }
    }
}
