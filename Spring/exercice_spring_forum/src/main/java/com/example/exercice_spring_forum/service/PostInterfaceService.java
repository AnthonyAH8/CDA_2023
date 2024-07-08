package com.example.exercice_spring_forum.service;

import com.example.exercice_spring_forum.entity.Post;

import java.util.List;

public interface PostInterfaceService {
    List<Post> getPosts();
    Post savePost(Post post);
    Post getPostById(int id);
    void deletePost(int id);

}
