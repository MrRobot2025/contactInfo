package com.spring.test.ContactInfo.repositories;

import com.spring.test.ContactInfo.entity.CustomerQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerQueryRepository extends MongoRepository<CustomerQuery, String> {
}
