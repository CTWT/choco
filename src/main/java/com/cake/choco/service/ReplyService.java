package com.cake.choco.service;

import com.cake.choco.domain.board.Board;
import com.cake.choco.domain.board.BoardRepository;
import com.cake.choco.domain.reply.Reply;
import com.cake.choco.domain.reply.ReplyRepository;
import com.cake.choco.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ReplyService {

    private final ReplyRepository replyRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public void replySave(Long boardId, Reply reply, User user) {
        Board board = boardRepository.findById(boardId).orElseThrow(() -> new IllegalArgumentException("해당 boardId가 없습니다 id =" + boardId));

        reply.save(board, user);

        replyRepository.save(reply);
    }

    @Transactional
    public void replyDelete(Long replyId){
        replyRepository.deleteById(replyId);
    }
}
