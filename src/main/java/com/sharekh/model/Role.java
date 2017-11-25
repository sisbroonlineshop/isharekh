package com.sharekh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
Create By: Ron Rith
Create Date: 11/25/2017
*/
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sec_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;
}
