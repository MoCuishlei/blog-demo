package pro.blog.dao;


import org.apache.ibatis.annotations.Mapper;
import pro.blog.dto.Article;

public interface ContextMapper{
    Article getContext(int id);
}
