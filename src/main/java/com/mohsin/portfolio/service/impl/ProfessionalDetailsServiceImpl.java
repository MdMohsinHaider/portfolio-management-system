package com.mohsin.portfolio.service.impl;

import com.mohsin.portfolio.entity.ProfessionalDetails;
import com.mohsin.portfolio.service.ProfessionalDetailsService;

import java.util.List;
import java.util.Optional;

public class ProfessionalDetailsServiceImpl implements ProfessionalDetailsService {

    @Override
    public ProfessionalDetails saveProfessionalDetails(ProfessionalDetails professionalDetails) {
        return null;
    }

    @Override
    public List<ProfessionalDetails> getAllProfessionalDetails() {
        return List.of();
    }

    @Override
    public Optional<ProfessionalDetails> getProfessionalDetailsById(Long id) {
        return Optional.empty();
    }

    @Override
    public ProfessionalDetails updateProfessionalDetails(Long id, ProfessionalDetails professionalDetails) {
        return null;
    }

    @Override
    public void deleteProfessionalDetails(Long id) {

    }

    @Override
    public List<ProfessionalDetails> getProfessionalDetailsByPortfolioId(Long portfolioId) {
        return List.of();
    }

    @Override
    public List<ProfessionalDetails> getByPortfolioOwnerEmail(String email) {
        return List.of();
    }

    @Override
    public boolean isProfessionalDetailsOwner(Long profId, String userEmail) {
        return false;
    }

    @Override
    public List<ProfessionalDetails> searchByJobRole(String jobRole) {
        return List.of();
    }

    @Override
    public List<ProfessionalDetails> filterByCompany(String companyName) {
        return List.of();
    }

    @Override
    public List<ProfessionalDetails> searchBySkillKeyword(String skillKeyword) {
        return List.of();
    }

    @Override
    public void deleteAllByPortfolioId(Long portfolioId) {

    }

    @Override
    public List<ProfessionalDetails> saveAll(List<ProfessionalDetails> list) {
        return List.of();
    }

    @Override
    public long countByPortfolioId(Long portfolioId) {
        return 0;
    }

    @Override
    public long countAllProfessionalEntries() {
        return 0;
    }
}
