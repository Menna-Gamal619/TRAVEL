package com.travel.TRAVEL.Service;

import com.travel.TRAVEL.Document.Property;
import com.travel.TRAVEL.Dto.PropertyDto;
import com.travel.TRAVEL.Enums.PropertyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    MongoTemplate template;

    public void delete(String id) {
        Query query=new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        template.remove(query);
    }

    public String save(Property property) {
        return template.save(property).getId();
    }

    public void update( String id,PropertyDto dto) {
        Query query=new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        template.save(dto);

    }


    public List<Property> search(String name, PropertyType type) {
        Query query=new Query();
        query.addCriteria(Criteria.where("name").is(name));
        long count = template.count(query, Property.class);
        if (count > 0) {
            throw new IllegalArgumentException("Property with name '" + name + "' already exists.");
        }
        if (name !=null)
         query.addCriteria(Criteria.where("name").regex(name,"i"));
        if (type!=null)
            query.addCriteria(Criteria.where("type").is(type));
        return template.find(query,Property.class);
    }
}
