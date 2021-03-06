package com.project2.cms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Shadow1Application {

	public static void main(String[] args) {
		SpringApplication.run(Shadow1Application.class, args);
	}
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//      // We're defining the class we're using inline here as a shortcut
//      // You could create a separate file.
//      return new WebMvcConfigurer() {
//        public void addCorsMappings(CorsRegistry registry) {
//          registry.addMapping("/**").allowedMethods("*").allowCredentials(true).maxAge(3600);
//        }
//      };
//    }



@Bean
public WebMvcConfigurer corsConfigurer() {
  // We're defining the class we're using inline here as a shortcut.
  // You could create a separate file
  return new WebMvcConfigurer() {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE",
          "OPTIONS").allowedOrigins("*");
    }
    
  };
}



}
