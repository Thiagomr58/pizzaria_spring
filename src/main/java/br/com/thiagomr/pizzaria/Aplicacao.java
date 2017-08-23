package br.com.thiagomr.pizzaria;
//buildApplicationContext: É o contexto que vai gerenciar todos os objetos da minha classe

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Aplicacao implements WebApplicationInitializer {

	// DispatcherServlet: todas as requisições batem nele, e ele é o responsavel por redirecionar elas aos seus devidos controles. 
	//DispatcherServlet conhece todas as instancias dos obejtos 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.com.thiagomr.pizzaria.configuracoes"); // pacote onde vão estar todas as minhas classes de configuração
		
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(webApplicationContext)); // Se eu não passar nenhum parametro no DispatcherServlet, ele não conseguirá reconhecer as minhas entidades
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/app/*");
		
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		
	}
	
	
	
	

}
