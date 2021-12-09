package com.example.study.sideBoard;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("com.example.study.sideBoard.sideBoardMapper")
public interface sideBoardMapper {
	public int side_boardCount() throws Exception;
	
	public int newSide_board(sideBoardMapper sbMapper) throws Exception;
	
	public void side_boardUpdate(int b_no) throws Exception;
	
	public List<sideBoardVo> side_boardList() throws Exception;
}
