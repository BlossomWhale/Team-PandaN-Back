package com.example.teampandanback.dto.project;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ProjectDeleteResponseDto {
    private Long projectId;

    @Builder
    public ProjectDeleteResponseDto (Long projectId) {
        this.projectId = projectId;
    }

}
