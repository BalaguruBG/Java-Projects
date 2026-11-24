package com.example.PortolioCMS.Service;

import com.example.PortolioCMS.Model.Blog;
import com.example.PortolioCMS.Repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogService {

    @Autowired
    BlogRepo blogRepo;

    public void createBlog(String title, String shortDescription, String content) {
        Blog blog = new Blog(title,shortDescription,content);
        blogRepo.save(blog);

    }

    public List<Blog> projects() {
        return blogRepo.findAll();
    }

    public Blog projectsDisplay(int id) {
        Blog blog =blogRepo.findById(id).orElse(null);
        return blog;
    }

    public Blog editProjects(int id) {
        Blog blog = blogRepo.findById(id).orElse(null);
        return blog;
    }
    public void updateProject(int id,
                              String title,
                              String shortDescription,
                              String content) {

        Blog blog = blogRepo.findById(id).orElse(null);

        if(blog != null){
            blog.setTitle(title);
            blog.setShortDescription(shortDescription);
            blog.setContent(content);

            blogRepo.save(blog);
        }
    }

    public void deleteProject(int id) {
        blogRepo.deleteById(id);
    }

    public List<Blog> viewBlog() {
        return blogRepo.findAll();
    }
}
