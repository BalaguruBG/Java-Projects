package com.example.PortolioCMS.Repo;

import com.example.PortolioCMS.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<Blog,Integer> {
}
