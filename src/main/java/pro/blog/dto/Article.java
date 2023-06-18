package pro.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pro.blog.dto.context.base.Content;

import java.util.List;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private String id;

    private List<Content> content;
}
