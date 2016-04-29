package com.braincraftapps.gourmet.vm;

import com.braincraftapps.gourmet.data.IUowData;
import com.braincraftapps.gourmet.model.Category;

import java.util.ArrayList;
import java.util.List;

public class ViewModelHelper {
    private IUowData uowData;

    public ViewModelHelper(IUowData uowData) {
        this.uowData = uowData;
    }

    public CategoryVM getCategoryVM(Category category) {
        CategoryVM categoryVM = null;
        long id = category.getId();
        String name = category.getName();
        String image = category.getImage();
        String recipesCount = category.getRecipesCount();

        Category dbCategory = uowData.getCategories().findById(id);

        if (dbCategory != null) {
            categoryVM = new CategoryVM(id, name, image, recipesCount);
        }

        return categoryVM;
    }

    public List<CategoryVM> getCategoryVM(List<Category> categories) {
        List<CategoryVM> vmListToReturn = new ArrayList<>();

        for (Category category : categories) {

            CategoryVM categoryVM = new CategoryVM(category.getId(), category.getName());

            vmListToReturn.add(categoryVM);
        }

        return vmListToReturn;
    }



}
