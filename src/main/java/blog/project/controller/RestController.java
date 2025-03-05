package blog.project.controller;

import blog.project.models.Post;
import blog.project.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private PostService postService;

    @GetMapping("/post")
        public List<Post> getPost(){
           return postService.getAllPosts();
        }

    @GetMapping("/post1/{title}")
    public Post getOnePost(@PathVariable String title){
        Post post = postService.getPost(title);
        return post;
    }

        @PostMapping("/post")
        public Post addPost(@RequestBody Post post){
          return postService.addPost(post);
        }
}
