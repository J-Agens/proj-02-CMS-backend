package com.project2.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.cms.model.Post;
import com.project2.cms.repository.PostRepository;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDateTime;   

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public Post createPost(Post post) {
		System.out.println("this is post model from request");
		System.out.print( post);
//		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		   LocalDateTime now = LocalDateTime.now();  
//		   post.setDateSubmitted(dtf.format(now));
//		   post.setDatePublished(null);
//		   post.setStatus("Pending");
//		   post.setResolver(0);
		return postRepository.save(post);
	}

	public List<Post> createPosts(List<Post> posts){
		return postRepository.saveAll(posts);
	}
	
	public Post getPostById(int id) {
		System.out.print(id);
		return postRepository.findById(id).orElse(null);
	}
	
	public Post getPostsByStatus(int status) {
		return postRepository.findByStatus(status);
	}
	
	public String deletePost(int id) {
	 	postRepository.deleteById(id);
		return "post removed! " + id;
	}
	
	public Post updatePost(Post post) {
		Post existingPost = postRepository.findById(post.getId()).orElse(null);
		existingPost.setPostTitle(post.getPostTitle());
		existingPost.setStatus(post.getStatus());
		existingPost.setPostDescription(post.getPostDescription());
		existingPost.setPostType(post.getPostType());
		existingPost.setPostField(post.getPostField());
		return postRepository.save(existingPost);
	}
	
	
	
	
}
