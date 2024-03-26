package Service_Module;

import com.Anudip.HibernateProject.SocialMedia_11.User;

public interface UserService<UserDetails> {
   void registerUser(UserDetails userDetails);
    User loginUser(String username, String password);
    void updateUserProfile(User user);
    void deleteUser(User user);
}