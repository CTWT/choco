package com.cake.choco.controller;

import com.cake.choco.config.auth.PrincipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/auth/user/save")
    public String userSave() {
        return "layout/user/user-save";
    }

    @GetMapping("/auth/user/login")
    public String userLogin() {
        return "layout/user/user-login";
    }

    /*
    *  회원 수정 페이지
    * */

    @GetMapping("/user/update")
    public String userUpdate(@AuthenticationPrincipal PrincipalDetail principalDetail, Model model) {
        model.addAttribute("principal", principalDetail.getUser());
        return "/layout/user/user-update";
    }
}
