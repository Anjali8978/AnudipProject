import java.util.List;

import com.Anudip.HibernateProject.SocialMedia_11.Comment;
import com.Anudip.HibernateProject.SocialMedia_11.Post;
import com.Anudip.HibernateProject.SocialMedia_11.User;

public interface CommentService {
    void addComment(User user, Post post, String content);
    void deleteComment(Comment comment);
    List<Comment> getCommentsByPost(Post post);
}