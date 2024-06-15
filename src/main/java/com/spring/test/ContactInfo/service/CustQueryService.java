package com.spring.test.ContactInfo.service;
import com.spring.test.ContactInfo.entity.CustomerQuery;
import com.spring.test.ContactInfo.repositories.CustomerQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class CustQueryService {

    private final CustomerQueryRepository customerQueryRepository;

    @Autowired
    public CustQueryService(CustomerQueryRepository customerQueryRepository){
         this.customerQueryRepository=customerQueryRepository;
    }

    public List<CustomerQuery> getAllQueries(){
        return customerQueryRepository.findAll();
    }

    public void save(CustomerQuery customerQuery){
        customerQuery.setId(UUID.randomUUID().toString().split("-")[0]);
        customerQueryRepository.save(customerQuery);
    }

    public void deleteQuery(String id){
        CustomerQuery query = customerQueryRepository.findById(id).get();
        customerQueryRepository.delete(query);
    }

    public void updateStatus(String id,CustomerQuery status){
        CustomerQuery query = customerQueryRepository.findById(id).get();
        query.setStatus(status.getStatus());
        customerQueryRepository.save(query);
    }

    public CustomerQuery findbyId(String id){
        return customerQueryRepository.findById(id).get();
    }


}
