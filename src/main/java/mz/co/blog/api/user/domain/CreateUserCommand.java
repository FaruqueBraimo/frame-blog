package mz.co.blog.api.user.domain;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserCommand {
    @NotNull
    @NotEmpty
    @Size(min = 2)
    private String name;

    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Size(min = 2)
    private String username;

    @NotNull
    @NotEmpty
    @Size(min = 5)
    private String password;

    @NotNull
    @NotEmpty
    @Size(min = 5)
    private String passwordConfirmation;
}
