package com.mohsin.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * Entity representing a user's portfolio.
 */

@Entity
@Table(name = "portfolio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String phone;
    private String profileImageUrl;

    /**
     * One portfolio can have multiple professional entries.
     */
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProfessionalDetails> professionalDetailsList;

    // You can add @OneToMany mappings for projects, contacts, etc.
}
