package pl.szadowek91.shopProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szadowek91.shopProject.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
