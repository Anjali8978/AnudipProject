package Service_Module;

import java.util.*;

import com.Anudip.HibernateProject.SocialMedia_11.Post;
import com.Anudip.HibernateProject.SocialMedia_11.User;

public interface PostService {
    void createPost(User user, String content);
    void deletePost(Post post);
    List<Post> getPostsByUser(User user);
    Post getPostById(Long postId);
}