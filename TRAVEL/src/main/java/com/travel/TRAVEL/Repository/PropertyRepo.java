package com.travel.TRAVEL.Repository;

import com.travel.TRAVEL.Document.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends MongoRepository<Property,String> {
}
