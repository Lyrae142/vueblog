package blog.vueblog.service.impl;

import blog.vueblog.entity.User;
import blog.vueblog.mapper.UserMapper;
import blog.vueblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
