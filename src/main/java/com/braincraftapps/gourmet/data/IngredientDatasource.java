package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public class IngredientDatasource extends GenericDatasource<Ingredient> {
    private static final String[] allColumns = {
            DatabaseHelper.ROW_INGREDIENTS_ID,
            DatabaseHelper.ROW_INGREDIENTS_RECIPE_ID,
            DatabaseHelper.ROW_INGREDIENTS_CATEGORY_ID,
            DatabaseHelper.ROW_INGREDIENTS_PRODUCT_ID,
            DatabaseHelper.ROW_INGREDIENTS_QUANTITY,
            DatabaseHelper.ROW_INGREDIENTS_MEASUREMENT_ID
    };

    public IngredientDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_INGREDIENTS, allColumns);
    }

    @Override
    protected List<Ingredient> cursorToList(Cursor cursor) {
        List<Ingredient> ingredients = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {

                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_ID));
                long recipeId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_RECIPE_ID));
                long categoryId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_CATEGORY_ID));
                long productId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_PRODUCT_ID));
                float quantity = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_QUANTITY));
                long measurementId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_INGREDIENTS_MEASUREMENT_ID));

                Ingredient ingredient = new Ingredient(id, recipeId,categoryId, productId,measurementId,quantity);
                ingredients.add(ingredient);
            }
        }
        return ingredients;
    }

    @Override
    protected long getEntryId(Ingredient entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Ingredient entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_INGREDIENTS_RECIPE_ID, entry.getRecipeId());
        values.put(DatabaseHelper.ROW_INGREDIENTS_CATEGORY_ID, entry.getCategoryId());
        values.put(DatabaseHelper.ROW_INGREDIENTS_PRODUCT_ID, entry.getProductId());
        values.put(DatabaseHelper.ROW_INGREDIENTS_QUANTITY, entry.getQuantity());
        values.put(DatabaseHelper.ROW_INGREDIENTS_MEASUREMENT_ID, entry.getMeasurementId());

        return values;
    }

    @Override
    protected void setEntryId(Ingredient entry, long insertId) {
        entry.setId(insertId);
    }
}
