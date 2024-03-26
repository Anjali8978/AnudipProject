package com.Anudip.HibernateProject.SocialMedia_11;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    @ManyToMany(mappedBy = "likedBy")
    private List<Post> likedPosts = new ArrayList<>();

    // Constructors, getters, and setters
}
