package com.braincraftapps.gourmet.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.vm.CategoryVM;

import java.util.List;

/**
 * Created by Alex Sysoiev on 14.03.2015.
 */
public class CategoryGridAdapter extends BaseAdapter {

    private Context context;
    private List<CategoryVM> categories;

    public CategoryGridAdapter(Context context, List<CategoryVM> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        ViewHolder viewHolder;
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.category_item, null);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) convertView.findViewById(R.id.category_title);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.category_image);
            viewHolder.counter = (TextView) convertView.findViewById(R.id.category_counter);

            viewHolder.textView.setText(categories.get(position).getName());
            //viewHolder.image.setImageResource(categories.get(position).getImage());
            viewHolder.counter.setText(categories.get(position).getRecipesCount());
        }

        return convertView;
    }


    private static class ViewHolder {
        TextView textView;
        ImageView image;
        TextView counter;
    }
}
