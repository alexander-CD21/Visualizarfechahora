package com.codingdojo.visualizarfechahora;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controladorfechahora {
	@RequestMapping("/") 
	public String Dashboard() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String Date(Model model ) {
		//Date date=new Date();
		String pattern = "E, dd MMM yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		model.addAttribute("fecha",date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model ) {
		String formato= "HH:mm a";
		//Se crea el obejto simpleDateFormat
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(formato);
		//Se accede a los metodos de este objeto y se pasa el obejto Date 
		String time=simpleDateFormat.format(new Date());
		model.addAttribute("hora",time);
		return "time.jsp";
	}
}
