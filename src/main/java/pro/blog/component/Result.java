package pro.blog.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 23:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    String code;
    String msg;
    T data;

    public static <T> Result<T> success(T data){
        return new Result<>("1000","success",data);
    }
}
