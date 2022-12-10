package com.myblogrestapi.mapper;

import com.myblogrestapi.entities.Post;
import com.myblogrestapi.payload.PostDto;

public class PostMapper {

    public static Post mapToPost(PostDto postDto){
        return Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .description(postDto.getDescription())
                .content(postDto.getContent())
                .build();
    }

    public static PostDto mapToPostDto(Post post){
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .description(post.getDescription())
                .content(post.getContent())
                .build();
    }
}
