package pl.asprojects.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.asprojects.springsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUserName(String userName);
}
