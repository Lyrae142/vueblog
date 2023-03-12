package blog.vueblog.service.impl;

import blog.vueblog.entity.Blog;
import blog.vueblog.mapper.BlogMapper;
import blog.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lyrae
 * @since 2021-05-29
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
