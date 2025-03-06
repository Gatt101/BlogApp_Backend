package blog.project.reposistory;

import blog.project.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JPAImplementation extends MongoRepository<Post, Long> {
    Optional<Post> findById(String id);
}
