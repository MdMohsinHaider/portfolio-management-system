package com.mohsin.portfolio.service;

import com.mohsin.portfolio.entity.Portfolio;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing Portfolio-related operations.
 * This includes CRUD operations, user-specific access, searching/filtering, and admin/security checks.
 *
 * <p><b>Author:</b> Md Mohsin Haider</p>
 * <p><b>Project:</b> Portfolio Management System</p>
 */
public interface PortfolioService {
    // ==========================
    // === Core CRUD Methods ===
    // ==========================

    /**
     * Saves a single portfolio entry to the database.
     *
     * @param portfolio The portfolio object to be saved.
     * @return The saved Portfolio object.
     */
    Portfolio savePortfolio(Portfolio portfolio);

    /**
     * Retrieves all portfolios stored in the database.
     *
     * @return A list of all portfolios.
     */
    List<Portfolio> getAllPortfolios();

    /**
     * Fetches a specific portfolio by its unique ID.
     *
     * @param id The ID of the portfolio.
     * @return An Optional containing the portfolio if found, or empty otherwise.
     */
    Optional<Portfolio> getPortfolioById(Long id);

    /**
     * Updates an existing portfolio by its ID.
     *
     * @param id The ID of the portfolio to update.
     * @param portfolio The portfolio object containing updated data.
     * @return The updated Portfolio object.
     */
    Portfolio updatePortfolio(Long id, Portfolio portfolio);

    /**
     * Deletes a portfolio based on its ID.
     *
     * @param id The ID of the portfolio to be deleted.
     */
    void deletePortfolio(Long id);


    // ==================================
    // === Authenticated User Support ===
    // ==================================

    /**
     * Retrieves a portfolio by the user's email.
     * Useful when email is a unique identifier for users.
     *
     * @param email The email address linked to the portfolio.
     * @return The portfolio associated with the given email.
     */
    Portfolio getPortfolioByEmail(String email);

    /**
     * Retrieves a portfolio by the user's system userId.
     * Useful for linking with login systems.
     *
     * @param userId The unique userId of the user.
     * @return The portfolio associated with the given userId.
     */
    Portfolio getPortfolioByUserId(String userId);


    // ================================
    // === Advanced Query Methods ===
    // ================================

    /**
     * Searches portfolios by the full name or partial match.
     *
     * @param name The name or part of the name to search for.
     * @return A list of matching portfolios.
     */
    List<Portfolio> searchByName(String name);

    /**
     * Searches portfolios that include a given skill keyword.
     *
     * @param skillKeyword Keyword to match within skill sets.
     * @return A list of portfolios matching the skill criteria.
     */
    List<Portfolio> searchBySkill(String skillKeyword);

    /**
     * Filters portfolios by a range of experience in years.
     *
     * @param minYears Minimum years of experience.
     * @param maxYears Maximum years of experience.
     * @return A list of portfolios within the given experience range.
     */
    List<Portfolio> filterByExperienceRange(int minYears, int maxYears);


    // ===========================
    // === Admin/Security Check ===
    // ===========================

    /**
     * Verifies whether a user is the owner of a given portfolio.
     *
     * @param portfolioId The portfolio's ID.
     * @param userEmail The email of the requesting user.
     * @return True if the user is the owner, false otherwise.
     */
    boolean isPortfolioOwner(Long portfolioId, String userEmail);

    /**
     * Checks whether a portfolio exists for a given email.
     *
     * @param email The email to check.
     * @return True if a portfolio with the email exists, false otherwise.
     */
    boolean existsByEmail(String email);


    // ===============================
    // === Bulk or Batch Operations ===
    // ===============================

    /**
     * Saves multiple portfolios in a single operation (bulk insert).
     *
     * @param portfolios A list of portfolio objects to be saved.
     * @return The list of saved portfolio objects.
     */
    List<Portfolio> saveMultiplePortfolios(List<Portfolio> portfolios);
}
