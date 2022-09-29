package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.util.Status;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findPostById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post savePost(Post newPost) {
        return postRepository.save(newPost);
    }

    @Override
    public String deletePost(Long id) {
        if(postRepository.findById(id) != null){
            postRepository.deleteById(id);
            return "OK";
        }
        return "Error, el id no existe";
    }

    @Override
    public String updatePost(Post post) {
        if(postRepository.findById(post.getId()) != null){
            postRepository.save(post);
            return "OK";
        }
        return "Error, el id no existe";
    }
    public List<Post> findPostByAuthor(Long id){
        return postRepository.findByAuthorId(id);
    }

    public List<Post> findPostPublishedByAuthor(Long id){
        return postRepository.findByStatusAndAuthorId(Status.published,id);
    }

    public Post findPostByTitle(String title){
        return postRepository.findByTitle(title);
    }
}


