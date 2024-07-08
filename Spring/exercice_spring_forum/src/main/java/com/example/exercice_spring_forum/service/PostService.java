package com.example.exercice_spring_forum.service;

import com.example.exercice_spring_forum.dao.PostRepository;
import com.example.exercice_spring_forum.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements PostInterfaceService{

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPostById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }
}
