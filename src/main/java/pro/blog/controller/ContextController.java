package pro.blog.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.blog.component.Result;
import pro.blog.dao.ContentMapper;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:13
 */
@RestController
@RequestMapping("/")
public class ContextController {

    @Resource
    ContentMapper contentMapper;

    @GetMapping("/article/{id}")
    public Result<List<?>> getC(@PathVariable("id")int id, HttpServletResponse response) throws UnsupportedEncodingException {
        return Result.success(contentMapper.getContext(id));
    }
}
