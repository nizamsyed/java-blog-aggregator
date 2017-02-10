package cz.nizam.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.nizam.jba.entity.Blog;
import cz.nizam.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
