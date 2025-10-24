package com.mohsin.portfolio.service;

import com.mohsin.portfolio.entity.Portfolio;
import com.mohsin.portfolio.repository.PortfolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    final private PortfolioRepository portfolioRepository;

    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public List<Portfolio> getAllPortfolio(){
        return portfolioRepository.findAll();
    }
}
