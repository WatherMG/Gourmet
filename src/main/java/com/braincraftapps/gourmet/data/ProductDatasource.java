package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public class ProductDatasource extends GenericDatasource<Product> {

    private static final String[] allColumns = {
            DatabaseHelper.ROW_PRODUCT_ID,
            DatabaseHelper.ROW_PRODUCTS_NAME,
            DatabaseHelper.ROW_PRODUCTS_FATS,
            DatabaseHelper.ROW_PRODUCTS_PROTEIN,
            DatabaseHelper.ROW_PRODUCTS_CARBOHYDRATES,
            DatabaseHelper.ROW_PRODUCTS_TOTAL_CALORIES
    };

    public ProductDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_PRODUCTS, allColumns);
    }

    @Override
    protected List<Product> cursorToList(Cursor cursor) {
        List<Product> products = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_CATEGORY_ID));
                String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_CATEGORY_NAME));
                Float fats = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_PRODUCTS_FATS));
                Float protein = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_PRODUCTS_PROTEIN));
                Float carbohydrates = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_PRODUCTS_CARBOHYDRATES));
                Float totalCalories = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_PRODUCTS_TOTAL_CALORIES));

                Product product = new Product(id, name, fats, protein,carbohydrates, totalCalories);
                products.add(product);
            }
        }
        return products;
    }

    @Override
    protected long getEntryId(Product entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Product entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_PRODUCTS_NAME, entry.getName());
        values.put(DatabaseHelper.ROW_PRODUCTS_FATS, entry.getFats());
        values.put(DatabaseHelper.ROW_PRODUCTS_PROTEIN, entry.getProtein());
        values.put(DatabaseHelper.ROW_PRODUCTS_CARBOHYDRATES, entry.getCarbohydrate());
        values.put(DatabaseHelper.ROW_PRODUCTS_TOTAL_CALORIES, entry.getTotalCalories());

        return values;
    }

    @Override
    protected void setEntryId(Product entry, long insertId) {
        entry.setId(insertId);
    }
}
