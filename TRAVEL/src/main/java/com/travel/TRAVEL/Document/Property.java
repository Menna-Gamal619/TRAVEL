package com.travel.TRAVEL.Document;

import com.travel.TRAVEL.Enums.PropertyType;
import com.travel.TRAVEL.Models.Location;
import com.travel.TRAVEL.Models.Unit;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Property {
    @Id
    @NotEmpty
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String Description;
    @NotEmpty
    private PropertyType type;
    @NotEmpty
    private Location location;
    @NotEmpty
    private List<Unit> units;

}
