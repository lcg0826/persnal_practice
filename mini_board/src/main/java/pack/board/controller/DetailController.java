package pack.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.board.model.Board;
import pack.board.model.BoardDao;

@Controller
public class DetailController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("detail")
	public ModelAndView detailProcess(@RequestParam("num")String num) {
		Board board = new Board();
		
		// 조회수 늘리기
		boardDao.addReadCnt(num);
		board = boardDao.detail(num);
		
		return new ModelAndView("detail", "detail", board);
		
	}
}
