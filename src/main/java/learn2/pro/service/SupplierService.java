package learn2.pro.service;



import learn2.pro.domain.Supplier;
import learn2.pro.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSupplier() {
        return supplierRepository.findAll();
    }


    public Optional<Supplier> getSupplierById(String supId) {
        return supplierRepository.findById(supId);
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public void deleteSupplier(String supId) {
        supplierRepository.deleteById(supId);
    }
}
