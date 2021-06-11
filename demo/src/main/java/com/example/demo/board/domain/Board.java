package com.example.demo.board.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter				// 클래스 내 모든 필드의 Getter 메소드를 자동 생성
@NoArgsConstructor	// 기본 생성자를 자동으로 추가
@Entity
@Table(name = "tbl_board")  
public class Board {
	
	@Id		// 엔티티 클래스의 필드를 테이블에 기본 키(PK, Primary key)로 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)	// strategy에 따라 기본 키를 지정
    @Column(name = "board_seq")
    private Long boardSeq;
 
    @Lob	// 엔티티 클래스의 필드를 데이터베이스 BLOB, CLOB, TEXT 타입과 맵핑
    @Column(name = "board_subject")
    private String boardSubject;
 
    @Column(name = "board_writer")
    private String boardWriter;
 
    @Lob
    @Column(name = "board_content")
    private String boardContent;
 
    @Builder	// 해당 클래스의 빌더 패턴 클래스를 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Board(String boardSubject, String boardWriter, String boardContent) {
        this.boardSubject = boardSubject;
        this.boardWriter = boardWriter;
        this.boardContent = boardContent;
    }
 
    public void update(String boardSubject, String boardContent) {
        this.boardSubject = boardSubject;
        this.boardContent = boardContent;
    }
    
}
