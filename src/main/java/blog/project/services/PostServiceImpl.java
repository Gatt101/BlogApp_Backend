package blog.project.services;

import blog.project.models.Post;
import blog.project.reposistory.JPAImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private JPAImplementation repo;
    @Override
    public Post addPost(Post post) {
        return repo.save(post);
    }

    @Override
    public String deletePost(Post post) {
        repo.delete(post);
        return "Post deleted";
    }

    @Override
    public Post updatePost(Post post) {
        return repo.save(post);
    }

    @Override
    public Post getPost(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}
