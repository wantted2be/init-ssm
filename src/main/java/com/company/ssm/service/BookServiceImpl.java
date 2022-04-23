package com.company.ssm.service;

import com.company.ssm.dao.BookMapper;
import com.company.ssm.pojo.Books;

import java.util.List;

/**
 * @Author wlb10
 * @PackageName initSSM
 * @Package com.company.ssm.service
 * @Date 2022/4/23 20:15
 * @Version 1.0
 */
public class BookServiceImpl implements BookService{
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
