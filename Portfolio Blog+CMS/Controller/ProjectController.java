package com.example.PortolioCMS.Controller;

import com.example.PortolioCMS.Model.Project;
import com.example.PortolioCMS.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProjectController {


    @Autowired
    ProjectService projectService;

    @GetMapping("/createProject")
    public String createProject(){
        return "createproject";
    }
    @PostMapping("/createProject")
    public String createproject(@RequestParam("projectHead") String projectHead,
                                @RequestParam("projectDescription") String projectDescription,
                                @RequestParam("projectContent") String projectContent){
        projectService.createproject(projectHead,projectDescription,projectContent);
        return "createproject";
    }
    @GetMapping("/viewProject")
    public String viewProject(Model model){
        List<Project> projects = projectService.viewProject();
        model.addAttribute("projects",projects);
        return "projectView";
    }
    @GetMapping("/viewProject/{id}")
    public String viewProjectbyid(@PathVariable int id,Model model){
        Project project = projectService.viewProjectById(id);
        model.addAttribute("project", project);
        return "projectbutton";
    }
}
