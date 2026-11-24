package com.example.PortolioCMS.Repo;

import com.example.PortolioCMS.Model.PortfolioAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioAdminRepo extends JpaRepository<PortfolioAdmin,Integer> {
    PortfolioAdmin findByUsername(String username);
}
