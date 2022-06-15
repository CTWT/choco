package com.cake.choco.controller.api;

import com.cake.choco.config.auth.PrincipalDetail;
import com.cake.choco.domain.user.User;
import com.cake.choco.dto.user.UserSaveReuestDto;
import com.cake.choco.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserService userService;

    @PostMapping("/auth/api/v1/user")
    public Long save(@RequestBody UserSaveReuestDto userSaveReuestDto) {
        return userService.save(userSaveReuestDto.toEntity());
    }

    /*
    *  회원 수정 API
    * */

    @PutMapping("/api/v1/user")
    public Long update(@RequestBody User user, @AuthenticationPrincipal PrincipalDetail principalDetail) {
        userService.update(user, principalDetail);
        return user.getId();
    }
}
