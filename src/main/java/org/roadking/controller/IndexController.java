package org.roadking.controller;

import java.util.ArrayList;
import java.util.List;

import org.roadking.model.Equipment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	@RequestMapping("/search.do")
	public String index(Model model,
			@RequestParam(name="name",defaultValue="rk",required=true)String name){
		model.addAttribute("name", name);
		return "etos";
	}
	
	@RequestMapping("/requesteqp")
	public @ResponseBody List<Equipment> get_data()
	{
		List<Equipment> list = new ArrayList<>();
		for(int i=0;i<50;++i)
			list.add(new Equipment("EQP"+i, "127.0.0."+i, "TL", "TY"));
		return list;
	}
	
	@RequestMapping("/requesteqp.do")
	public String etos_home(Model model)
	{
		List<Equipment> list = new ArrayList<>();
		for(int i=0;i<50;++i)
			list.add(new Equipment("EQP"+i, "127.0.0."+i, "TL", "TY"));
		model.addAttribute("prods", list);
		return "etos";
	}
	
}
