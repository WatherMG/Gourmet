package com.braincraftapps.gourmet.data;

import com.braincraftapps.gourmet.model.*;

/**
 * Created by Алексей on 16.04.2015.
 */
public interface IUowData {
    IDatasource<Category> getCategories();
    IDatasource<Product> getProducts();
    IDatasource<Measurement> getMeasurements();
    IDatasource<Ingredient> getIngredients();
    IDatasource<Recipe> getRecipes();
    IDatasource<Step> getStep();
    /*IDatasource<User> getUser();
    IDatasource<UserRatedRecipe> getUserRatedRecipe();
    IDatasource<UserRecipe> getUserRecipe();*/
}
