package pack.board.model;

import java.util.List;

import pack.board.controller.BoardBean;

public interface BoardDaoInter{
	
	List<Board> selectDataAll();
	List<Board> search(BoardBean bean);


	int update(BoardBean bean);
	int delete(String num);
	

	int addReadCnt(String num);
	Board detail(String num);

	
}
