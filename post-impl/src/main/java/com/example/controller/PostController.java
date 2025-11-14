package com.example.controller;

import com.example.service.PostService;
import com.example.user.api.controller.PostApi;
import com.example.user.api.dto.CreatePostRequest;
import com.example.user.api.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController implements PostApi {
    private final PostService postService;

    @Override
    public ResponseEntity<PostResponse> createPost(CreatePostRequest createPostRequest){
        PostResponse response = postService.createPost(createPostRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
