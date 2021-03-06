package com.cake.choco.dto.user;

import com.cake.choco.domain.user.Role;
import com.cake.choco.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveReuestDto {

    private String username;
    private String passsword;
    private String email;
    private String nickname;
    private Role role;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(passsword)
                .email(email)
                .nickname(nickname)
                .role(Role.USER)
                .build();
    }
}
