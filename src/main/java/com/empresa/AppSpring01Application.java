package com.empresa;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empresa.service.UserService;
import com.empresa.entity.User;
@SpringBootApplication
public class AppSpring01Application {

	public static void main(String[] args) {
		SpringApplication.run(AppSpring01Application.class, args);
	}
	
	
	
	/*@Bean
	CommandLineRunner run(UserService userService) {
		return args ->{
			userService.save(new User(0,"user","123456"));
		};
	}*/

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*").allowCredentials(true);
			}
		};
	}*/
    
	
}
