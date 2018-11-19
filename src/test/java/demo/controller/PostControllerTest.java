/**
 * 
 */
package demo.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import demo.model.Post;
import demo.repository.PostRepository;

/**
 * @author dedaloc2
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(PostController.class)
public class PostControllerTest {

	@Autowired
	private PostController postController;
	
//	@Autowired
//	private Pageable pageable;

//	@TestConfiguration
//	static class PostConrollerTestContextConfiguration {
//
//		@Bean
//		public PostController postController() {
//			return new PostController();
//		}
//	}

	@MockBean
	private PostRepository postRepository;


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		List<Post> listPost = new ArrayList<>();
		
		Mockito.when(listPost = postRepository.findAll())
			.thenReturn(listPost);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link demo.controller.PostController#getAllPosts(org.springframework.data.domain.Pageable)}.
	 */
	@Test
	public void testGetAllPosts() {
		
//		Page<Post> pagePost = postController.getAllPosts(Pageable.unpaged());
//		
//		assertNotNull(pagePost);
				
				
	}

	/**
	 * Test method for {@link demo.controller.PostController#createPost(demo.model.Post)}.
	 */
	@Test
	public void testCreatePost() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link demo.controller.PostController#updatePost(java.lang.Long, demo.model.Post)}.
	 */
	@Test
	public void testUpdatePost() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link demo.controller.PostController#deletePost(java.lang.Long)}.
	 */
	@Test
	public void testDeletePost() {
		fail("Not yet implemented");
	}

}
