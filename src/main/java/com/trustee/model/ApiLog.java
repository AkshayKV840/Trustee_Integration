package com.trustee.model;

import jakarta.persistence.*;

import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "api_log", schema = "transbnk_trustee_integration")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "api_log_id")
    private int apiLogId;

    @ManyToOne
    @JoinColumn(name = "trustee_code", referencedColumnName = "trustee_code")
    private Trustee trustee;

    @Column(name = "entity_id")
    private String entityId;

    @Column(name = "program_id")
    private int programId;

    @Column(name = "request", columnDefinition = "json")
    private String request;

    @Column(name = "response", columnDefinition = "json")
    private String response;

    @Column(name = "url", columnDefinition = "text")
    private String url;

    @Column(name = "headers", columnDefinition = "json")
    private String headers;
}

