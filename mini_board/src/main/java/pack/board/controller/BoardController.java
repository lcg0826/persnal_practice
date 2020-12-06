package pack.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.board.model.BoardDaoInter;



@Controller
public class BoardController {
	
	@Autowired
	private BoardDaoInter boardDaoInter;
	
	@RequestMapping("boardlist")
	public ModelAndView list() {
					
		return new ModelAndView("list", "list", boardDaoInter.selectDataAll());
	}
}
