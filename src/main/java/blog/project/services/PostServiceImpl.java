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
    public void deletePost(String title) {

    }

    @Override
    public void updatePost(String title, String content, String author) {

    }

    @Override
    public Post getPost(String title) {

        return repo.findByTitle(title).orElse(null);
    }

    @Override
    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}
