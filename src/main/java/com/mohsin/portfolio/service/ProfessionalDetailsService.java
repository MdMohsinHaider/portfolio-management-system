package com.mohsin.portfolio.service;

import com.mohsin.portfolio.entity.ProfessionalDetails;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing operations related to Professional Details.
 * This includes core CRUD operations, portfolio-scoped queries, filtering,
 * ownership checks, batch operations, and analytics.
 *
 * <p><b>Author:</b> Md Mohsin Haider</p>
 * <p><b>Project:</b> Portfolio Management System</p>
 */
public interface ProfessionalDetailsService {
    // ==========================
    // === Core CRUD Methods ===
    // ==========================

    /**
     * Saves a new ProfessionalDetails entry into the system.
     *
     * @param professionalDetails The professional details to save.
     * @return The saved ProfessionalDetails object.
     */
    ProfessionalDetails saveProfessionalDetails(ProfessionalDetails professionalDetails);

    /**
     * Retrieves all professional details entries from the database.
     *
     * @return A list of all professional details.
     */
    List<ProfessionalDetails> getAllProfessionalDetails();

    /**
     * Fetches professional details by its unique ID.
     *
     * @param id The ID of the professional detail.
     * @return An Optional containing the ProfessionalDetails if found, or empty otherwise.
     */
    Optional<ProfessionalDetails> getProfessionalDetailsById(Long id);

    /**
     * Updates an existing professional detail based on ID.
     *
     * @param id The ID of the entry to be updated.
     * @param professionalDetails The updated ProfessionalDetails object.
     * @return The updated ProfessionalDetails.
     */
    ProfessionalDetails updateProfessionalDetails(Long id, ProfessionalDetails professionalDetails);

    /**
     * Deletes a professional detail based on its ID.
     *
     * @param id The ID of the entry to be deleted.
     */
    void deleteProfessionalDetails(Long id);


    // ==================================
    // === Portfolio-Scoped Access ===
    // ==================================

    /**
     * Retrieves a list of professional details linked to a specific portfolio.
     *
     * @param portfolioId The ID of the portfolio.
     * @return List of ProfessionalDetails associated with the portfolio.
     */
    List<ProfessionalDetails> getProfessionalDetailsByPortfolioId(Long portfolioId);


    // ======================================
    // === User Authentication & Ownership ===
    // ======================================

    /**
     * Retrieves professional details entries for a user based on their email.
     *
     * @param email The owner's email.
     * @return List of ProfessionalDetails linked to the user.
     */
    List<ProfessionalDetails> getByPortfolioOwnerEmail(String email);

    /**
     * Verifies if the given user owns the specified professional detail.
     *
     * @param profId The professional detail's ID.
     * @param userEmail The email of the user.
     * @return True if the user owns the entry; false otherwise.
     */
    boolean isProfessionalDetailsOwner(Long profId, String userEmail);


    // ================================
    // === Searching & Filtering ===
    // ================================

    /**
     * Searches for professional entries matching a specific job role.
     *
     * @param jobRole The job role keyword to search for.
     * @return List of matching ProfessionalDetails entries.
     */
    List<ProfessionalDetails> searchByJobRole(String jobRole);

    /**
     * Filters professional details by company name.
     *
     * @param companyName The name of the company.
     * @return List of entries that match the company name.
     */
    List<ProfessionalDetails> filterByCompany(String companyName);

    /**
     * Searches for professional entries containing a specific skill keyword.
     *
     * @param skillKeyword The skill keyword to look for.
     * @return List of entries that match the skill.
     */
    List<ProfessionalDetails> searchBySkillKeyword(String skillKeyword);


    // ===========================
    // === Admin/Batch Ops ===
    // ===========================

    /**
     * Deletes all professional entries associated with a portfolio.
     * Useful for cascade delete on portfolio removal.
     *
     * @param portfolioId The ID of the portfolio.
     */
    void deleteAllByPortfolioId(Long portfolioId);

    /**
     * Saves a list of professional detail entries in bulk.
     *
     * @param list The list of ProfessionalDetails to be saved.
     * @return The list of saved entries.
     */
    List<ProfessionalDetails> saveAll(List<ProfessionalDetails> list);


    // ================================
    // === Analytics & Statistics ===
    // ================================

    /**
     * Returns the total number of professional details linked to a portfolio.
     *
     * @param portfolioId The ID of the portfolio.
     * @return Count of professional entries.
     */
    long countByPortfolioId(Long portfolioId);

    /**
     * Returns the total number of professional details in the system.
     *
     * @return Total count of all professional entries.
     */
    long countAllProfessionalEntries();
}
