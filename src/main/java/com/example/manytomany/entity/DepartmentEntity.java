package com.example.manytomany.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Department_Entity")
public class DepartmentEntity {

    @SequenceGenerator(name = "id", sequenceName = "id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")

    @Column(name = "department_Id")
    @Id
    private Long id;
    private String departmentName;

    @ManyToMany(mappedBy = "departmentEntities",fetch = FetchType.LAZY)
    private Set<EmployeeEntity> employeeEntity;
}
