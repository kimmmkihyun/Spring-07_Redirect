package com.spring.ex;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	@RequestMapping("a1")
	public String al(HttpServletRequest request, Model model) {
		System.out.println("a1 요청");
		
		model.addAttribute("model_attr", "model_attr");
		request.setAttribute("req_attr", "req_attr");
		
		//return "a2";  이렇게 요청하면  a2에서는 getAttribute, model만 출력 가능했지만 
		//아래처럼 가지고 넘어가는 경우에는 속성으로 넘긴거는 못출력하고 Parameter만 출력할 수 있다!(*model만 가능) 
		return "redirect:/a2";   //a2요청으로 챙길거 챙겨서 넘어간다
	}
	
	@RequestMapping("a2")
	public String a2() {
		System.out.println("a2 요청");
		
		return "a3";
	}
	
	@RequestMapping("b1")
	public String b1( RedirectAttributes redirectAttributes) {
		System.out.println("b1 요청");
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("model_attr","model_attr");
		map.put("req_attr", "req_attr");
		
		redirectAttributes.addFlashAttribute("map1", map);
		//map으로 넘길 때는  b3로 넘어갈 때 값출력에 문제가 없다.
		
		//return "b2";
		return "redirect:/b2";
	}
	
	@RequestMapping("b2")
	public String b2() {
		System.out.println("b2 요청");
		
		return "b3";
	}
	
				
	
}
