package mz.co.blog.api.album.presentation;

import lombok.Data;
import mz.co.blog.api.user.presentation.UserJson;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AlbumJson {
    private Long id;
    private String title;
    private List<String> images;
    private LocalDateTime createdAt;
    private UserJson createdBy;
    private LocalDateTime updatedAt;
}
