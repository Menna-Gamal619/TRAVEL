package com.travel.TRAVEL.Controller;

import com.travel.TRAVEL.Document.Property;
import com.travel.TRAVEL.Dto.PropertyDto;
import com.travel.TRAVEL.Enums.PropertyType;
import com.travel.TRAVEL.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    PropertyService service;
    @PostMapping
    public String  save(@RequestBody Property property){
        return service.save(property);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id,@RequestBody PropertyDto dto){
        service.update(id,dto);
    }

    @GetMapping("/search")
    public List<Property> search(@RequestParam (required = false) String name, @RequestParam(required = false) PropertyType type){
        return service.search(name,type);
    }
}
