package com.example.PortolioCMS.Controller;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import com.example.PortolioCMS.Model.Blog;
import com.example.PortolioCMS.Service.BlogService;
import com.example.PortolioCMS.Service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @Autowired
    BlogService blogService;


    @GetMapping("/admin")
    public String admin(){
        return "portfolioAdmin";
    }
    @GetMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }
    @GetMapping("/blogs")
    public String projects(Model model){
        List<Blog> blogs = blogService.projects();
        model.addAttribute("blogs",blogs);
        return "blogview";
    }
    @PostMapping("/admin")
    public String adminlogin(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                            HttpSession session,
                            Model model) {
        boolean result = portfolioService.adminlogin(username,password);
        if(result){
            session.setAttribute("admin","loggedin");
            List<Blog> blogs = blogService.projects();
            model.addAttribute("blogs",blogs);
            return "adminDashboard";
        }
        return "portfolioAdmin";
    }

    @GetMapping("/")
    public String home(Model model){
        List<Blog> blogs = blogService.projects();
        model.addAttribute("blogs" ,blogs);
        return "portfolio";
    }
    @GetMapping("/projects/{id}")
    public String projectsDisplay(@PathVariable int id,Model model){
        Blog blog = blogService.projectsDisplay(id);
        model.addAttribute("blog", blog);
        return "viewfullblog";
    }
    @GetMapping("/edit/{id}")
    public String editProject(@PathVariable int id ,Model model){
        Blog blog = blogService.editProjects(id);
        model.addAttribute("blog",blog);
        return "editProjects";
    }
    @GetMapping("/delete/{id}")
    public String deleteProject(@PathVariable int id,
                                Model model){

        blogService.deleteProject(id);

        List<Blog> blogs = blogService.projects();
        model.addAttribute("blogs", blogs);

        return "adminDashboard";
    }
    @PostMapping("/update/{id}")
    public String updateProject(@PathVariable int id,
                                @RequestParam String title,
                                @RequestParam String shortDescription,
                                @RequestParam String content,
                                Model model) {

        blogService.updateProject(id, title, shortDescription, content);

        List<Blog> blogs = blogService.projects();
        model.addAttribute("blogs", blogs);

        return "adminDashboard";
    }
    @GetMapping("/viewBlog")
    public String viewBlog(Model model){
        List<Blog> blog = blogService.viewBlog();
        model.addAttribute("blog", blog);
        return "viewBlog";
    }
}
