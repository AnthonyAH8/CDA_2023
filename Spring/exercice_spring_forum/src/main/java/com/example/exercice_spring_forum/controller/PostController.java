package com.example.exercice_spring_forum.controller;

import com.example.exercice_spring_forum.entity.Post;
import com.example.exercice_spring_forum.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String getPosts(Model model) {
        model.addAttribute("posts", postService.getPosts());
        return "posts-list";
    }

    @GetMapping("/postForm")
    public String getPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post-form";
    }

    @PostMapping("/addPost")
    public String addPost(@RequestParam String content, @RequestParam String creationDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(creationDate, formatter);

        Post post = new Post();
        post.setContent(content);
        post.setCreationDate(dateTime);

        postService.savePost(post);
        return "posts-list";
    }

    @GetMapping("/post/edit/{id}")
    public String getPostEdit(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "post-form";
    }

    @GetMapping("/post/delete/id")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "redirect/posts";
    }
}
