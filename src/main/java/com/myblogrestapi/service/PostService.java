package com.myblogrestapi.service;

import com.myblogrestapi.payload.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);
}
