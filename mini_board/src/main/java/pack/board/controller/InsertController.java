package pack.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.board.model.Board;
import pack.board.model.BoardDao;

@Controller
public class InsertController {
	
	@Autowired
	private BoardDao boardDao; // Db 불러오려는 목적
	
	
	@RequestMapping(value="insert", method = RequestMethod.GET)
	public String form() {
		return "insform";
	}
	
	@RequestMapping(value="insert", method = RequestMethod.POST)
	public String submit(BoardBean bean) {
		int result = boardDao.insert(bean);
		
		if(result > 0)
			return "redirect:/boardlist";
		else
			return "error";
	}
}
