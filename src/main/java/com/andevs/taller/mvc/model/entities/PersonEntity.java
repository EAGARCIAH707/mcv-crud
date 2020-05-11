package com.andevs.taller.mvc.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {
    private Integer id_person;
    private Long document_number;
    private String name;
    private Double weight;
    private Double height;
    private Timestamp created_on;
    private Timestamp last_modified;
}
