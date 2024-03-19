package com.example.transaction.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired AddressRepository addressRepository;

    public void addAddress(Address address) {
        this.addressRepository.save(address);
    }
}
