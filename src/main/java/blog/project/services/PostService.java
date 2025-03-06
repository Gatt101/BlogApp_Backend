package blog.project.services;

import blog.project.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    public Post addPost(Post post);
    public String deletePost(Post post);
    public Post updatePost(Post post);
    public Post getPost(String id);
    public List<Post> getAllPosts();
}
