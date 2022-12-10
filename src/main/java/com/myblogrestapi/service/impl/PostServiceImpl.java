package com.myblogrestapi.service.impl;

import com.myblogrestapi.entities.Post;
import com.myblogrestapi.mapper.PostMapper;
import com.myblogrestapi.payload.PostDto;
import com.myblogrestapi.repositories.PostRepository;
import com.myblogrestapi.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = PostMapper.mapToPost(postDto);
        Post postEntity = postRepository.save(post);
        PostDto postResponse = PostMapper.mapToPostDto(postEntity);
        return postResponse;
    }
}
