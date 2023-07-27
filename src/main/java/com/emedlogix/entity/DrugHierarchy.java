package com.emedlogix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "drug_hierarchy")
@Table(name="drug_hierarchy")
public class DrugHierarchy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "parent_id")
    private Integer parentId;
    
    @Column(name = "child_id")
    private Integer childId;
    
    @Column(name = "level")
    private Integer level;
}
