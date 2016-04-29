package com.braincraftapps.gourmet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.model.Description;

import java.util.List;

public class RecipeDescriptionAdapter extends BaseAdapter {
    private static final int TYPE_ROW_IS_IMAGE = 0;
    private static final int TYPE_ROW_IS_DESCRIPTION = 1;

    private Context context;
    private List<Description> descriptions;

    public RecipeDescriptionAdapter(Context context, List<Description> descriptions) {
        this.context = context;
        this.descriptions = descriptions;
    }

    @Override
    public int getCount() {
        return descriptions.size();
    }

    @Override
    public Object getItem(int position) {
        return descriptions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
            return descriptions.get(position).isRowWithImage() ? TYPE_ROW_IS_IMAGE : TYPE_ROW_IS_DESCRIPTION;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        int type = getItemViewType(position);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.recipe_table_details_text, null);
            viewHolder = new ViewHolder();

            switch (type) {
                case TYPE_ROW_IS_IMAGE:
                    convertView = inflater.inflate(R.layout.recipe_table_details_image, null);
                    viewHolder.image = (ImageView) convertView.findViewById(R.id.detailStepImage);
                    break;
                case TYPE_ROW_IS_DESCRIPTION:
                    convertView = inflater.inflate(R.layout.recipe_table_details_text, null);
                    viewHolder.stepNumber = (TextView) convertView.findViewById(R.id.detailsStepNumber);
                    viewHolder.step = (TextView) convertView.findViewById(R.id.detailsStep);
                    break;
            }
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        switch (type) {
            case TYPE_ROW_IS_IMAGE:
                viewHolder.image.setImageResource(descriptions.get(position).getImage());
                break;
            case TYPE_ROW_IS_DESCRIPTION:
                viewHolder.stepNumber.setText("Шаг " + Integer.toString(descriptions.get(position).getStep()));
                viewHolder.step.setText(descriptions.get(position).getDescription());

                break;
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView step, stepNumber;
        ImageView image;
    }
}
