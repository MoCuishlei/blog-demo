package pro.blog.dto.context;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pro.blog.dto.context.base.Content;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("text")
public class TextContent implements Content {
    private String id;
    private String content;
    private String type;
}
