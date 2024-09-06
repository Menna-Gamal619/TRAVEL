package com.travel.TRAVEL.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Unit {
   private String name;
   private String availableUnits;
    private  String description;
    private Float Price;
    private  int beds;
    private Integer capacity;
}
