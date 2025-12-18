package oi.githhub.kaiocandido.arquiteturaSpring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaSpringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("producao");
		builder.lazyInitialization(false); //dessa forma todos são lazy por padrão

		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String nameApp = environment.getProperty("spring.application.name");
		System.out.println("Nome: " + nameApp);

		ExemploValue value = applicationContext.getBean(ExemploValue.class);
		value.imprimir();
	}

}
