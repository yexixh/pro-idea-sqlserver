package learn2.pro.service;


import learn2.pro.domain.Custom;
import learn2.pro.repository.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomService {
    @Autowired
    private CustomRepository customRepository;

    public List<Custom> getAllCustomers() {
        return customRepository.findAll();
    }

    //未在html添加
    public Optional<Custom> getCustomerById(String id) {
        return customRepository.findById(id);
    }

    public Custom saveCustomer(Custom custom) {
        return customRepository.save(custom);
    }

    public void deleteCustomer(String id) {
        customRepository.deleteById(id);
    }
}
