package blog.project.services;

import blog.project.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    public Post addPost(Post post);
    public void deletePost(String title);
    public void updatePost(String title, String content, String author);
    public Post getPost(String title);
    public List<Post> getAllPosts();
}
