package com.Anudip.HibernateProject.SocialMedia_11;

import java.util.List;

public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(Long id);
    User findById(Long id);
    List<User> findAll();
}
