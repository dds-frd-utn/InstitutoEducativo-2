package com.example.demo.repository;

import com.example.demo.entity.Post;
import com.example.demo.util.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    void save(Optional<Post> postToUpdate);
    List<Post> findByAuthorId(Long id);
//    Post findByTitle(String title);
//    List<Post> findByPublishedDateBeetwen(); Si tuviera fecha de publicacion el post
    @Query("SELECT p FROM Post p WHERE p.author.id = ?1 AND p.title like ?2")
    Post findTopTen(Long id, String title);
//    @Query("SELECT p FROM Post p WHERE p.author.id = ?1 AND p.status = 'published'")
//    List<Post> findPublishedByAuthorId(Long id);
    List<Post> findByStatusAndAuthorId(Status status, Long id);
    Post findByTitle(String title);






}
