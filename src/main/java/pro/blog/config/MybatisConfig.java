package pro.blog.config;

import jakarta.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import pro.blog.config.mybatis.ListTypeHandler;
import pro.blog.dto.context.base.Content;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/19 00:49
 */
@Configurable
@MapperScan("pro.blog.dap")
public class MybatisConfig {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @PostConstruct
    public void registerTypeHandlers() {
        TypeHandlerRegistry typeHandlerRegistry = sqlSessionFactory.getConfiguration().getTypeHandlerRegistry();
        typeHandlerRegistry.register(Content.class, new ListTypeHandler());
    }
}
