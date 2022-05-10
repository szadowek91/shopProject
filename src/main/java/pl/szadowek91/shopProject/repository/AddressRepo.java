package pl.szadowek91.shopProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.szadowek91.shopProject.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
