package blog.project.controller;

import blog.project.models.Post;
import blog.project.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")  // Adding a base path
public class RestController {

    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public List<Post> getPost() {
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public Post getOnePost(@PathVariable String id) {
        return postService.getPost(id);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @DeleteMapping("/post/delete")
    public String deletePost(@RequestBody Post post) {
        return postService.deletePost(post);
    }

    @PutMapping("/post/update")
    public Post updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }
}
