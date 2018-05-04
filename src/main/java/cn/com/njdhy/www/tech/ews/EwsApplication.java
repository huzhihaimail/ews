package cn.com.njdhy.www.tech.ews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class EwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwsApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "index.html";
	}
}
