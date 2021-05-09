package com.lios.mybatis.demo.mapper;

import com.lios.mybatis.demo.domain.Blog;

/**
 * Project: MyBatisDemo
 *
 * @author: Lionseun Ling
 * @create: 2021/5/9
 */
public interface BlogMapper {
    public Blog selectBlog(int id);
}
