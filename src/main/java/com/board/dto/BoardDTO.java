package com.board.dto;

import com.board.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
// DTO(Data Transfer Object), VO, Bean
public class BoardDTO {

    private long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContest;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardContest(boardEntity.getBoardContents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
        return boardDTO;
    }

    public BoardDTO(long id, String boardWriter, String boardPass, String boardTitle, String boardContest, int boardHits, LocalDateTime boardCreatedTime, LocalDateTime boardUpdatedTime) {
        this.id = id;
        this.boardWriter = boardWriter;
        this.boardPass = boardPass;
        this.boardTitle = boardTitle;
        this.boardContest = boardContest;
        this.boardHits = boardHits;
        this.boardCreatedTime = boardCreatedTime;
        this.boardUpdatedTime = boardUpdatedTime;
    }

    public BoardDTO() {
    }
}
