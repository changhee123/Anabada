package Anabada.Anabada.repository;

import Anabada.Anabada.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {


}