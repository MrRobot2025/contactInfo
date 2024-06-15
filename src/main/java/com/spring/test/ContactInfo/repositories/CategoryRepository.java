package com.spring.test.ContactInfo.repositories;

import com.spring.test.ContactInfo.entity.Category;
import com.spring.test.ContactInfo.entity.CustomerQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

}
