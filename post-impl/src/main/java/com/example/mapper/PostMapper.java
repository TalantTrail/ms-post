package com.example.mapper;

import com.example.model.Post;
import com.example.user.api.dto.PostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    PostResponse toPostResponse(Post post);
}
