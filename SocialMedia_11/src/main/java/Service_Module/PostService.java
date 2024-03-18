package Service_Module;

import javax.transaction.Transactional;

import com.Anudip.HibernateProject.SocialMedia_11.Post;
import com.Anudip.HibernateProject.SocialMedia_11.PostDao;

@Service
@Transactional
public class PostService {
    private final PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    public void save(Post post) {
        postDao.save(post);
    }

// Implement other CRUD methods
}