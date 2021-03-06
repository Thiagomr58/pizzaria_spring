package br.com.thiagomr.pizzaria.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="br.com.thiagomr.pizzaria")
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter{

}
