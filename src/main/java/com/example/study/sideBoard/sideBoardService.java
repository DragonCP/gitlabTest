package com.example.study.sideBoard;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("com.example.study.sideBoard.sideBoardService")
public class sideBoardService {
	@Resource(name = "com.example.study.sideBoard.sideBoardMapper")
	sideBoardMapper sbMapper;
    //명칭은 차후에 바꾸고 	
    public int SBCount() throws Exception{
    	return sbMapper.side_boardCount();
    }
	
	public int newSBboard(sideBoardMapper sbMapper) throws Exception{
		return sbMapper.newSide_board(sbMapper);
	}
	
	public void SBUpdate(int b_no) throws Exception{
		
	}

	public List<sideBoardVo> SBoardList() throws Exception{
		return sbMapper.side_boardList();
	}
}
