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
 * @since 2023/6/18 20:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("Photo")
public class PhotoContent implements Content {
    private String id;
    private String content;
    private String type;
}
