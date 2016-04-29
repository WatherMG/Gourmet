package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Measurement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public class MeasurementDatasource extends GenericDatasource<Measurement>{
    private static final String[] allColumns = {
            DatabaseHelper.ROW_MEASUREMENTS_ID,
            DatabaseHelper.ROW_MEASUREMENTS_NAME
    };

    public MeasurementDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_MEASUREMENTS, allColumns);
    }

    @Override
    protected List<Measurement> cursorToList(Cursor cursor) {
        List<Measurement> measurements = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_MEASUREMENTS_ID));
                String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_MEASUREMENTS_NAME));

                Measurement measurement = new Measurement(id, name);
                measurements.add(measurement);
            }
        }
        return measurements;
    }

    @Override
    protected long getEntryId(Measurement entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Measurement entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_MEASUREMENTS_NAME, entry.getName());

        return values;
    }

    @Override
    protected void setEntryId(Measurement entry, long insertId) {
        entry.setId(insertId);
    }
}
