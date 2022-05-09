package pl.szadowek91.shopProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szadowek91.shopProject.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
