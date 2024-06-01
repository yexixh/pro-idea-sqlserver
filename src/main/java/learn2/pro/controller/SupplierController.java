package learn2.pro.controller;

import learn2.pro.domain.Supplier;
import learn2.pro.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSupplier();
    }

    @GetMapping("/{supID}")
    public Optional<Supplier> getSupplierById(@PathVariable String supID) {
        return supplierService.getSupplierById(supID);
    }

    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @PutMapping("/{supID}")
    public Supplier updateSupplier(@PathVariable String supID, @RequestBody Supplier supplierDetails) {
        Optional<Supplier> supplierOptional = supplierService.getSupplierById(supID);
        if (supplierOptional.isPresent()) {
            Supplier supplier = supplierOptional.get();
            supplier.setSupName(supplierDetails.getSupName());
            supplier.setSupAddress(supplierDetails.getSupAddress());
            supplier.setSupPhone(supplierDetails.getSupPhone());
            supplier.setSupPerson(supplierDetails.getSupPerson());

            return supplierService.saveSupplier(supplier);
        } else {
            throw new RuntimeException("Supplier not found with ID: " + supID);
        }
    }

    @DeleteMapping("/{supID}")
    public void deleteSupplier(@PathVariable String supID) {
        supplierService.deleteSupplier(supID);
    }
}
