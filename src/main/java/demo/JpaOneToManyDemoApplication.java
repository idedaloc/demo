package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import demo.model.Post;
import demo.repository.PostRepository;

@SpringBootApplication
@EnableJpaAuditing
//@EnableJpaRepositories
//@EntityScan(basePackages = {"demo.model"})
public class JpaOneToManyDemoApplication implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;
	
    public static void main(String[] args) {
    	SpringApplication sa  = new SpringApplicationBuilder(JpaOneToManyDemoApplication.class)
    	.build()
    	;
    	sa.setBanner((env,myClass,out) -> out.println("MyBanner"));
        //SpringApplication.run(JpaOneToManyDemoApplication.class, args);
    	sa.run(args);
    	
    	    }

	@Override
	public void run(String... args) throws Exception {

		Post post = new Post();
		post.setTitle("Test45");
		post.setContent("Contetnasdf");
		post.setDescription("To Testsadf");
		
		postRepository.save(post);
		
		Post post2 = new Post();
		post2.setTitle("Test345");
		post2.setContent("Contetn3");
		post2.setDescription("To Test3");
		
		postRepository.save(post2);
		
		
//		Tag post = new Tag();
//		post.setName("Test");
//	
//		
//		postRepository.save(post);
	}
}
