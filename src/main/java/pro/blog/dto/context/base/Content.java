package pro.blog.dto.context.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
public interface Content {
}
