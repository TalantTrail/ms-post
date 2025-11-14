package com.example.service;

import com.example.mapper.PostMapper;
import com.example.model.Post;
import com.example.repository.PostRepository;
import com.example.user.api.dto.CreatePostRequest;
import com.example.user.api.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public PostResponse createPost(CreatePostRequest createPostRequest) {
        UUID userId = UUID.fromString("5a2fd653-85b0-447c-aef5-2e68769f29e0");
        Post post = new Post();
        post.setAuthorId(userId);
        post.setContent(createPostRequest.getContent());
        PostResponse response = postMapper.toPostResponse(postRepository.save(post));

        return response;
    }
}
