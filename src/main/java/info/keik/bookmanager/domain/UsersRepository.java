package info.keik.bookmanager.domain;

import info.keik.bookmanager.model.Stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Stock, Integer> {

}
