package pro.blog.dao;


import org.apache.ibatis.annotations.Mapper;
import pro.blog.dto.Article;

import java.util.List;

@Mapper
public interface ContentMapper {
    List<Article> getContext(int id);
}
