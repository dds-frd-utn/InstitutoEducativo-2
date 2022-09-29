package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PostController {
    @Autowired
    PostService postService;

    @RequestMapping(value="/posts",method = RequestMethod.GET, produces = "application/json")
    public List<Post> getPost(){
        return postService.findAllPost();
    }

    @RequestMapping(value="/posts/author/{author_id}",method = RequestMethod.GET, produces = "application/json")
    public List<Post> getPublishedPost(@PathVariable Long author_id){
        return postService.findPostPublishedByAuthor(author_id);
    }

    @RequestMapping(value="/posts",params = {"title"}, method = RequestMethod.GET, produces = "application/json")
    public Post getPostByTitle(@RequestParam String title){
        return postService.findPostByTitle(title);
    }

    @RequestMapping(value="/posts/{id}",method = RequestMethod.GET, produces = "application/json")
    public Optional<Post> getPostById(@PathVariable Long id){

        return postService.findPostById(id);
    }

    @RequestMapping(value="/posts",method = RequestMethod.POST, produces = "application/json")
    public Post addPost(Post post){
        return postService.savePost(post);
    }

    @RequestMapping(value="/posts/update",method = RequestMethod.PUT, produces = "application/json")
    public String updatePost(Post post){
        return postService.updatePost(post);
    }
}
