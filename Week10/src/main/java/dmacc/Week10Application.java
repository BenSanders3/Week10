package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Sandwich;
import dmacc.beans.Server;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.SandwichRepository;

@SpringBootApplication
public class Week10Application{

	//@Autowired
	//SandwichRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Week10Application.class, args);
		
	}
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Sandwich s = appContext.getBean("sandwich", Sandwich.class);
		
		s.setBread("wheat");
		repo.save(s);
		
		Sandwich t = new Sandwich("Wheat", "Turkey", "American");
		Server a = new Server("John", "Smith");
		t.setServer(a);
		repo.save(t);
		
		List<Sandwich> allSandwiches = repo.findAll();
		for(Sandwich order: allSandwiches) {
			System.out.println(order.toString());
		}
		
		((AbstractApplicationContext) appContext).close(); 
	}*/
}
