package com.example.demo.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.board.domain.Board;

// 인터페이스를 생성하여 JpaRepository 인터페이스를 상속받아 JpaRepository에서 선언한 메서드들을 사용
public interface BoardRepository extends JpaRepository<Board, Long> {

}
