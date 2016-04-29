package com.braincraftapps.gourmet.data;

import com.braincraftapps.gourmet.model.Category;

public class DBInitializer {
    private static final String[] categories = {
            "Мясные блюда",
            "Блюда из птицы",
            "Блюда из морепродуктов",
            "Напитки",
            "Десерты",
            "Растительная пища"
    };

     public static void init(IUowData uowData) {
        boolean categoriesIsEmpty = uowData.getCategories().findAll().size() == 0;
        if (categoriesIsEmpty) {
            initCategories(uowData);
        }
    }

    private static void initCategories(IUowData uowData) {

        for (String cat : categories) {
            Category category = new Category();
            category.setName(cat);
            category.setRecipesCount("2");
            uowData.getCategories().create(category);
        }
    }

}
