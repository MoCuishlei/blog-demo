package pro.blog.utils;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.reflections.Reflections;
import pro.blog.dto.context.PhotoContent;
import pro.blog.dto.context.TextContent;
import pro.blog.dto.context.base.Content;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:38
 */
public class JsonUtils {
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static{
        Reflections reflections = new Reflections("pro.");
        Set<Class<? extends Content>> subTypesOf = reflections.getSubTypesOf(Content.class);
        subTypesOf.forEach(OBJECT_MAPPER::registerSubtypes);
    }

    public static String toJson() {
        return "";
    }

    public static <T> T toObject(String json,Class<T> c) throws IOException {
        return OBJECT_MAPPER.readValue(json.getBytes(), c);
    }

    public static <T> T toArray(String serializedValue, TypeReference<T> typeReference) throws JsonProcessingException {
        return OBJECT_MAPPER.readValue(serializedValue,typeReference);
    }
}
