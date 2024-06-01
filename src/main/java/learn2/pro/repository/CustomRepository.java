package learn2.pro.repository;

import learn2.pro.domain.Custom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepository extends JpaRepository<Custom,String> {

}
