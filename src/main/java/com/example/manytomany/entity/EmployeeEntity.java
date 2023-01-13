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

@Table(name="Employee_Entity")
public class EmployeeEntity {


    @SequenceGenerator(name = "id", sequenceName = "id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
    @Id
    @Column(name="employee_id")
    private Long id;
    private String firstName;
    private String lastName;
    private Long age;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    @JoinTable(name="Employee_Department_Table",
    joinColumns = {
            @JoinColumn(name = "employee_Id",referencedColumnName = "id")

    },
            inverseJoinColumns = {
            @JoinColumn(name="department_Id", referencedColumnName = "id")

            })

private Set<DepartmentEntity> departmentEntities;
}

