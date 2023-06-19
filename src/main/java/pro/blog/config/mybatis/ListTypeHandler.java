package pro.blog.config.mybatis;

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

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:37
 */
public class ListTypeHandler implements TypeHandler<Content> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Content content, JdbcType jdbcType) {

    }

    @Override
    public Content getResult(ResultSet resultSet, String columnName) throws SQLException {
        String serializedValue = resultSet.getString(columnName);
        serializedValue = new String(serializedValue.getBytes(StandardCharsets.UTF_8));
        try {
            return JsonUtils.toObject(serializedValue, Content.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Content getResult(ResultSet resultSet, int i) {
        return null;
    }

    @Override
    public Content getResult(CallableStatement callableStatement, int i) {
        return null;
    }
}
