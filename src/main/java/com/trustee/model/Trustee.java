package com.trustee.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "trustee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trustee {

    @Id
    @Column(name = "trustee_code", nullable = false)
    private String trusteeCode;

    @Column(name = "trustee_name", length = 64, nullable = false)
    private String trusteeName;
}

