package org.example.repository.book.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.BookMybatis;

import java.util.List;

@Mapper
public interface BookMapper {
    public List<BookMybatis> findAll();
    public BookMybatis findById(@Param("id") Long id);
    public int save(BookMybatis newBook);
    public int delete(@Param("id") Long id);
}
