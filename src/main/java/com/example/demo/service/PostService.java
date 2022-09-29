package com.example.demo.service;

import com.example.demo.entity.Post;

import java.util.List;
import java.util.Optional;


public interface PostService {
    public List<Post> findAllPost();

    public Optional<Post> findPostById(Long id);

    public Post savePost(Post newPost);

    public String deletePost(Long id);

    public String updatePost(Post post);
    public List<Post> findPostPublishedByAuthor(Long id);
    public Post findPostByTitle(String title);
}
