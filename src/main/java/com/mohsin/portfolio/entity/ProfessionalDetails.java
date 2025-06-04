package com.mohsin.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity representing professional details like skills, experience, job role, etc.,
 * associated with a user or portfolio.
 *
 * Author: Md Mohsin Haider
 * Project: Portfolio Management System
 */

@Entity
@Table(name = "professional_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfessionalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String skills;

    @Column(nullable = false)
    private String experience;

    @Column(name = "job_role", nullable = false)
    private String jobRole;

    @Column(name = "company_name")
    private String company;

    @Column(length = 1000)
    private String summary;

    /**
     * Many professional detail entries can belong to one Portfolio/User.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;
}
