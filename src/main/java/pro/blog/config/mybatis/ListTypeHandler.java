package pro.blog.config.mybatis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import pro.blog.dto.context.base.Content;
import pro.blog.utils.JsonUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:37
 */
public class ListTypeHandler<T> implements TypeHandler<List<Content>> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, List<Content> contents, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public List<Content> getResult(ResultSet resultSet, String columnName) throws SQLException {
        String serializedValue = resultSet.getString(columnName);
        serializedValue = new String(serializedValue.getBytes(StandardCharsets.UTF_8));
//        TypeReference<List<Content>> typeReference = new TypeReference<List<Content>>() {};
//        try {
        try {
            return Collections.singletonList(JsonUtils.toObject(serializedValue, Content.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public List<Content> getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public List<Content> getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
