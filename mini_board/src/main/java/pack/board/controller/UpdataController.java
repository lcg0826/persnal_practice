package pack.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.board.model.Board;
import pack.board.model.BoardDao;
import pack.board.model.BoardDaoInter;

@Controller
public class UpdataController {
	@Autowired
	private BoardDao boardDao;
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView up(@RequestParam("num")String num) {
		Board dto = boardDao.detail(num);
		return new ModelAndView("upform", "dto", dto);
	}
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String submit(BoardBean bean) {
		int result = boardDao.update(bean);
		if(result > 0)
			return "redirect:/boardlist";
		else
			return "error";
	}
}
