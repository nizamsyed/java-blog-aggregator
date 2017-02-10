package cz.nizam.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.nizam.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
