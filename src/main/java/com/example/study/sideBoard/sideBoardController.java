package com.example.study.sideBoard;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class sideBoardController {
	@Resource(name="com.example.study.sideBoard.sideBoardService")
	sideBoardService boardService;
/*	
	@GetMapping(value = "/index")
	@ResponseBody
	public String test1() {
		return "가나다라마바사";
	}
	
	@GetMapping(value = "/test")
	@ResponseBody
		public int test() throws Exception {
		int testService = boardService.SBCount();
			return testService;
		}
		*/
	@RequestMapping(value="/sidetest2")
	public ModelAndView home(Model model, ModelAndView mav) throws Exception{
		List<sideBoardVo> testService = boardService.SBoardList();
		
		System.out.println(testService.get(0).getB_content());
		model.addAttribute("name", testService);
		mav.setViewName("/testjsp");
		return mav;
	}
	@RequestMapping(value="/side")
	public String side(Model model) throws Exception {
    List<sideBoardVo> testService = boardService.SBoardList();
		
		System.out.println(testService.get(0).getB_content());
		model.addAttribute("name", testService);
		return "/testjsp";
	}
}
