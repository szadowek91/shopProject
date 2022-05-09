package pl.szadowek91.shopProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szadowek91.shopProject.entity.CategoryEntity;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {
}
