package com.Anudip.HibernateProject.SocialMedia_11;

import java.util.List;

public interface PostDao {
    void save(Post post);
    void update(Post post);
    void delete(Long id);
    Post findById(Long id);
    List<Post> findAll();
}