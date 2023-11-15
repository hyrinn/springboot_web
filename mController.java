package com.web.p7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class mController {
	
	@Autowired
	private memoRep mrep;
	
	@GetMapping("/memo")
	public String memo() {
		return "memoWrite";
	}
	
	@GetMapping("/popup2")
	public String popup(String msg,Model mo) {
		msg = "잘 저장되었습니다!";
		mo.addAttribute("msg", msg);
		return "memoPopup";
	}
	
	@GetMapping("/memo/insert")
	public String memoInsert(String je, String nae, RedirectAttributes re) {
		memo m = new memo();
		m.je=je; m.nae=nae;
		mrep.save(m);
		return "redirect:/popup2";
	}
	
	@GetMapping("/memo/list")
	public String memoList(Model mo) {
		mo.addAttribute("arr", mrep.findAll());
		return "memoList";
	}

}
