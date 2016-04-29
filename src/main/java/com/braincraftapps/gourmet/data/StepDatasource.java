package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public class StepDatasource extends GenericDatasource<Step> {
    private static final String[] allColumns = {
            DatabaseHelper.ROW_STEP_ID,
            DatabaseHelper.ROW_STEP_RECIPE_ID,
            DatabaseHelper.ROW_STEP_NUMBER,
            DatabaseHelper.ROW_STEP_DESCRIPTION
    };

    public StepDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_STEPS, allColumns);
    }

    @Override
    protected List<Step> cursorToList(Cursor cursor) {
        List<Step> steps = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_STEP_ID));
                long recipeId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_STEP_RECIPE_ID));
                int number = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.ROW_STEP_NUMBER));
                String description = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_STEP_DESCRIPTION));

                Step step = new Step(id, recipeId, number, description);
                steps.add(step);
            }
        }
        return steps;
    }

    @Override
    protected long getEntryId(Step entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Step entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_STEP_RECIPE_ID, entry.getRecipeId());
        values.put(DatabaseHelper.ROW_STEP_NUMBER, entry.getNumber());
        values.put(DatabaseHelper.ROW_STEP_DESCRIPTION, entry.getDescription());

        return values;
    }

    @Override
    protected void setEntryId(Step entry, long insertId) {
        entry.setId(insertId);
    }
}
