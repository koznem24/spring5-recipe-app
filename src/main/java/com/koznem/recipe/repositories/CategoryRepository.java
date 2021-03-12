package com.koznem.recipe.repositories;

import com.koznem.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
