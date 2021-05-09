package com.lios.mybatis.demo;

import com.lios.mybatis.demo.domain.Blog;
import com.lios.mybatis.demo.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project: MyBatisDemo
 *
 * @author: Lionseun Ling
 * @create: 2021/5/9
 */
public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sessionFactory = getSessionFactoryFromXml();
        BlogMapper mapper = sessionFactory.openSession().getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlog(1);
        System.out.printf(blog.getContent());

    }


    public static SqlSessionFactory getSessionFactoryFromXml() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
}
