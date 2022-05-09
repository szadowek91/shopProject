package pl.szadowek91.shopProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szadowek91.shopProject.entity.AdvertEntity;

public interface AdvertRepo extends JpaRepository<AdvertEntity, Integer> {
}
