package com.mohsin.portfolio.service.impl;

import com.mohsin.portfolio.entity.Portfolio;
import com.mohsin.portfolio.service.PortfolioService;

import java.util.List;
import java.util.Optional;

public class PortfolioImpl implements PortfolioService {

    @Override
    public Portfolio savePortfolio(Portfolio portfolio) {
        return null;
    }

    @Override
    public List<Portfolio> getAllPortfolios() {
        return List.of();
    }

    @Override
    public Optional<Portfolio> getPortfolioById(Long id) {
        return Optional.empty();
    }

    @Override
    public Portfolio updatePortfolio(Long id, Portfolio portfolio) {
        return null;
    }

    @Override
    public void deletePortfolio(Long id) {

    }

    @Override
    public Portfolio getPortfolioByEmail(String email) {
        return null;
    }

    @Override
    public Portfolio getPortfolioByUserId(String userId) {
        return null;
    }

    @Override
    public List<Portfolio> searchByName(String name) {
        return List.of();
    }

    @Override
    public List<Portfolio> searchBySkill(String skillKeyword) {
        return List.of();
    }

    @Override
    public List<Portfolio> filterByExperienceRange(int minYears, int maxYears) {
        return List.of();
    }

    @Override
    public boolean isPortfolioOwner(Long portfolioId, String userEmail) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public List<Portfolio> saveMultiplePortfolios(List<Portfolio> portfolios) {
        return List.of();
    }
}
