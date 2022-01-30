package mz.co.blog.api.post.presentation;

import lombok.Data;
import mz.co.blog.api.user.presentation.UserJson;

import java.util.List;

@Data
public class PostJson {
    private Long id;
    private String title;
    private String description;
    private String coverPicture;
    private String uuid;
    private List<String> images;
    private UserJson createdBy;
}
