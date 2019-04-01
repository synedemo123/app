package springboot;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

    public static void main(String[] args) {
    	
    	SpringApplication app = new SpringApplication(Application.class);
    	Properties properties =  new Properties();
    	properties.setProperty("server.port", "8083");
    	app.setDefaultProperties(properties);
        //app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
        
        SpringApplication.run(Application.class, args);
    }

}
