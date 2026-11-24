package com.example.PortolioCMS.Controller;

import com.example.PortolioCMS.Model.Blog;
import com.example.PortolioCMS.Service.BlogService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/createBlog")
    public String createBlog(HttpSession session){
        if(session.getAttribute("admin")==null){
            return "redirect:/admin";
        }
        return "Blog";
    }


    @PostMapping("/createBlog")
    public String createBlog(@RequestParam("title") String title,
                             @RequestParam("shortDescription") String shortDescription,
                             @RequestParam("content") String content){
        blogService.createBlog(title,shortDescription,content);
        return "adminDashboard";

    }




}
