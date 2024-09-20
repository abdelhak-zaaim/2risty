package com.touristy.touristy.repository;

import com.touristy.touristy.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
    public Category findCategoryById(String id);
    void deleteCategoryById(String id);
    boolean existsCategoryById(String id);
}