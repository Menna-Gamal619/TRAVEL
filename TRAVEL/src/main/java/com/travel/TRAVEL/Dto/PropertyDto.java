package com.travel.TRAVEL.Dto;

import com.travel.TRAVEL.Enums.PropertyType;
import com.travel.TRAVEL.Models.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDto {

    private String id;
    private String name;
    private String Description;
    private PropertyType type;
    private Location location;


}
