package learn2.pro.repository;

import learn2.pro.domain.Product;
import learn2.pro.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,String> {

}
