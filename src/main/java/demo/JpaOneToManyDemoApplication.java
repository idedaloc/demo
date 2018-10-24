package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
//@EnableJpaRepositories
//@EntityScan(basePackages = {"demo.model"})
public class JpaOneToManyDemoApplication {
    public static void main(String[] args) {
    	SpringApplication sa  = new SpringApplicationBuilder(JpaOneToManyDemoApplication.class)
    	.build()
    	;
    	sa.setBanner((env,myClass,out) -> out.println("MyBanner"));
        //SpringApplication.run(JpaOneToManyDemoApplication.class, args);
    	sa.run(args);
    	
    	    }
}
