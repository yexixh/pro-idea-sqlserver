package learn2.pro.controller;


import learn2.pro.domain.Custom;
import learn2.pro.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/customer")
public class CustomController {
    @Autowired
    private CustomService customService;

    @GetMapping
    public List<Custom> getAllCustomers() {
        return customService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Custom> getCustomerById(@PathVariable String id) {
        return customService.getCustomerById(id);
    }

    @PostMapping
    public Custom createCustomer(@RequestBody Custom custom) {
        return customService.saveCustomer(custom);
    }

    @PutMapping("/{id}")
    public Custom updateCustomer(@PathVariable String id, @RequestBody Custom customDetails) {
        Optional<Custom> customOptional = customService.getCustomerById(id);
        if (customOptional.isPresent()) {
            Custom custom = customOptional.get();
            custom.setCustomName(customDetails.getCustomName());
            custom.setCustomAddress(customDetails.getCustomAddress());
            custom.setCustomPhone(customDetails.getCustomPhone());



            return customService.saveCustomer(custom);
        } else {
            throw new RuntimeException("Customer not found with id: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customService.deleteCustomer(id);
    }
}

