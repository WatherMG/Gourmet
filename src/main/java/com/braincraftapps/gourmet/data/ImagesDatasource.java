package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Image;

import java.util.ArrayList;
import java.util.List;

public class ImagesDatasource extends GenericDatasource<Image> {

    private static final String[] allRows = {
        DatabaseHelper.ROW_IMAGE_ID,
            DatabaseHelper.ROW_IMAGE_CATEGORY_ID,
            DatabaseHelper.ROW_IMAGE_RECIPE_ID,
            DatabaseHelper.ROW_IMAGE_STEP_ID,
            DatabaseHelper.ROW_IMAGE_URL,
            DatabaseHelper.ROW_IMAGE_DESCRIPTION
    };

    public ImagesDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_IMAGES, allRows);
    }

    @Override
    protected List<Image> cursorToList(Cursor cursor) {
        List<Image> images = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_ID));
                long categoryId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_CATEGORY_ID));
                long recipeId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_RECIPE_ID));
                long stepId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_STEP_ID));
                String URL = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_URL));
                String description = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_IMAGE_DESCRIPTION));

                Image image = new Image(id, recipeId,categoryId,stepId,URL, description);
                images.add(image);
                }


        }
        return images;
    }

    @Override
    protected long getEntryId(Image entry) {
        return 0;
    }

    @Override
    protected ContentValues entryToContentValues(Image entry) {
        return null;
    }

    @Override
    protected void setEntryId(Image entry, long insertId) {

    }
}
