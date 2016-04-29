package com.braincraftapps.gourmet.data;

import android.content.Context;
import com.braincraftapps.gourmet.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 17.04.2015.
 */
public class UowData implements IUowData, IReadable {
    private IDatasource<Category> categoriesDatasource;
    private IDatasource<Product> productsDatasource;
    private IDatasource<Measurement> measurementDatasource;
    private IDatasource<Ingredient> ingredientsDatasource;
    private IDatasource<Recipe> recipesDatasource;
    private IDatasource<Step> stepDatasource;
    private List<IReadable> datasources;

    public UowData(Context context) {
        categoriesDatasource = new CategoryDatasource(context);
        productsDatasource = new ProductDatasource(context);
        measurementDatasource = new MeasurementDatasource(context);
        ingredientsDatasource = new IngredientDatasource(context);
        recipesDatasource = new RecipeDatasource(context);
        stepDatasource = new StepDatasource(context);

        datasources = new ArrayList<>();

        datasources.add((IReadable) categoriesDatasource);
        datasources.add((IReadable) productsDatasource);
        datasources.add((IReadable) measurementDatasource);
        datasources.add((IReadable) ingredientsDatasource);
        datasources.add((IReadable) recipesDatasource);
        datasources.add((IReadable) stepDatasource);
    }

    @Override
    public IDatasource<Category> getCategories() {
        return categoriesDatasource;
    }

    @Override
    public IDatasource<Product> getProducts() {
        return productsDatasource;
    }

    @Override
    public IDatasource<Measurement> getMeasurements() {
        return measurementDatasource;
    }

    @Override
    public IDatasource<Ingredient> getIngredients() {
        return ingredientsDatasource;
    }

    @Override
    public IDatasource<Recipe> getRecipes() {
        return recipesDatasource;
    }

    @Override
    public IDatasource<Step> getStep() {
        return stepDatasource;
    }

    @Override
    public void open() {
        for (IReadable datasourse : datasources) {
            datasourse.open();
        }
    }

    @Override
    public void close() {
        for (IReadable datasource : datasources) {
            datasource.close();
        }
    }
}
