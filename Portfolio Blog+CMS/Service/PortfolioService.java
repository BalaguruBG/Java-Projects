package com.example.PortolioCMS.Service;

import com.example.PortolioCMS.Model.PortfolioAdmin;
import com.example.PortolioCMS.Repo.PortfolioAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {

    @Autowired
    PortfolioAdminRepo portfolioAdminRepo;


    public boolean adminlogin(String username, String password) {
        PortfolioAdmin admin = portfolioAdminRepo.findByUsername(username);
        if(admin!= null && admin.getUsername().equals(username) && admin.getPassword().equals(password) ){
            return true;
        }
        return false;
    }
}
