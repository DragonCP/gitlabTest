package com.example.study.sideBoard;

import java.util.List;

public class sideBoardVo {
private int b_no;
private int b_parent;
private int b_depth;
private int b_order;
private String b_content;
public int getB_no() {
	return b_no;
}
public void setB_no(int b_no) {
	this.b_no = b_no;
}
public int getB_parent() {
	return b_parent;
}
public void setB_parent(int b_parent) {
	this.b_parent = b_parent;
}
public int getB_depth() {
	return b_depth;
}
public void setB_depth(int b_depth) {
	this.b_depth = b_depth;
}
public int getB_order() {
	return b_order;
}
public void setB_order(int b_order) {
	this.b_order = b_order;
}
public String getB_content() {
	return b_content;
}
public void setB_content(String b_content) {
	this.b_content = b_content;
}



private List<sideBoardVo> boardVolist;

public List<sideBoardVo> getBoardVoList() {
	return boardVolist;
}
public void setBoardVoList(List<sideBoardVo> boardVoList) {
	this.boardVolist = boardVoList;
}
}
