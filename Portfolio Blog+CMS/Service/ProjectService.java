package com.example.PortolioCMS.Service;

import com.example.PortolioCMS.Model.Project;
import com.example.PortolioCMS.Repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectRepo projectRepo;

    public void createproject(String projectHead, String projectDescription, String projectContent) {
        Project project = new Project(projectHead,projectDescription,projectContent);
        projectRepo.save(project);
    }

    public List<Project> viewProject() {
        return projectRepo.findAll();
    }

    public Project viewProjectById(int id) {
        return projectRepo.findById(id).orElse(null);

    }
}
