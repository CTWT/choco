package com.cake.choco.controller.api;

import com.cake.choco.dto.user.UserSaveReuestDto;
import com.cake.choco.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserApiController {

    private final UserService userService;

    @PostMapping("/api/vi/user")
    public Long save(@RequestBody UserSaveReuestDto userSaveReuestDto) {
        return userService.save(userSaveReuestDto.toEntity());
    }
}
