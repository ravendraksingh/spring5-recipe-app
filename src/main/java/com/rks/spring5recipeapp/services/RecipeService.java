package com.rks.spring5recipeapp.services;

import com.rks.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes() ;
}
