package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDatasource extends GenericDatasource<Category>{

    private static final String[] allColumns = {
            DatabaseHelper.ROW_CATEGORY_ID,
            DatabaseHelper.ROW_CATEGORY_NAME
    };

    public CategoryDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_CATEGORY, allColumns);
    }

    @Override
    protected List<Category> cursorToList(Cursor cursor) {
        List<Category> categories = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_CATEGORY_ID));
                String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_CATEGORY_NAME));

                Category category = new Category(id, name);
                categories.add(category);
            }
        }
        return categories;
    }

    @Override
    protected long getEntryId(Category entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Category entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_CATEGORY_NAME, entry.getName());

        return values;
    }

    @Override
    protected void setEntryId(Category entry, long insertId) {
        entry.setId(insertId);
    }

}
