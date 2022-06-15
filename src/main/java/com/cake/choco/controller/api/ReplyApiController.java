package com.cake.choco.controller.api;

import com.cake.choco.config.auth.PrincipalDetail;
import com.cake.choco.domain.reply.Reply;
import com.cake.choco.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class ReplyApiController {

    private final ReplyService replyService;

    @PostMapping("/api/v1/board/{boardId}/reply")
    public void save(@PathVariable Long boardId, @RequestBody Reply reply,
                     @AuthenticationPrincipal PrincipalDetail principalDetail) {
        replyService.replySave(boardId, reply, principalDetail.getUser());
    }

    @DeleteMapping("/api/v1/board/{boardId}/reply/{replyId}")
    public void delete(@PathVariable Long replyId) {
        replyService.replyDelete(replyId);
    }
}
