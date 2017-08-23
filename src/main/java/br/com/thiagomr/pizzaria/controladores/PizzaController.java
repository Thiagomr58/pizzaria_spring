package br.com.thiagomr.pizzaria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
	
	public PizzaController() {
		System.out.println("Criou a pizza controler");
	}
	
	@RequestMapping("/ola/{nome}")
	@ResponseBody // como eu n�o tenho uma view com o nome '  "Ol�,"+nome  ', eu uso o ResponseBody para que ele retorne exatamente o que o return est� retornando.
	public String ola(@PathVariable String nome) {
		return "Ol�," + nome; // o spring procura uma view com nome igual o de retorno, que nesse caso �: "Ol�,"+nome
	}

}
