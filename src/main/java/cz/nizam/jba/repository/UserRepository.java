package cz.nizam.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.nizam.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
