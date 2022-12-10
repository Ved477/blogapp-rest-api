package com.myblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDto {

    private long id;
    private String title;
    private String description;
    private String content;
}
