package com.braincraftapps.gourmet.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.model.NavigationDrawer.NavDrawerItem;

import java.util.ArrayList;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class NavDrawerListAdapter extends BaseAdapter {

    private static final int TYPE_ROW_ITEM = 0;
    private static final int TYPE_ROW_HEADER = 1;
    private static final int TYPE_ROW_BUTTON = 2;
    private static final int TYPE_ROW_COUNT = 3;
    private Context context;
    private ArrayList<NavDrawerItem> navDrawerItems;


    public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems) {
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        if (navDrawerItems.get(position).isGroupHeader()) {
            return TYPE_ROW_HEADER;
        } else if (navDrawerItems.get(position).isButtonVisible()) {
            return TYPE_ROW_BUTTON;
        } else if (navDrawerItems.get(position).isCounterVisible()) {
            return TYPE_ROW_COUNT;
        } else {
            return TYPE_ROW_ITEM;
        }
    }

    @Override
    public int getCount() {
        return navDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        int type = getItemViewType(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.drawer_list_item, null);

            viewHolder = new ViewHolder();

            switch (type) {
                case TYPE_ROW_ITEM:
                    convertView = inflater.inflate(R.layout.drawer_list_item, null);
                    viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
                    viewHolder.title = (TextView) convertView.findViewById(R.id.title);
                    break;
                case TYPE_ROW_HEADER:
                    convertView = inflater.inflate(R.layout.drawer_header, null);
                    viewHolder.header = (TextView) convertView.findViewById(R.id.header);
                    break;
                case TYPE_ROW_BUTTON:
                    convertView = inflater.inflate(R.layout.drawer_add_button, null);
                    viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
                    viewHolder.title = (TextView) convertView.findViewById(R.id.title);
                    viewHolder.imageButton = (ImageButton) convertView.findViewById(R.id.navigation_add_recipe);
                    break;
                case TYPE_ROW_COUNT:
                    convertView = inflater.inflate(R.layout.drawer_counter, null);
                    viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
                    viewHolder.title = (TextView) convertView.findViewById(R.id.title);
                    viewHolder.count = (TextView) convertView.findViewById(R.id.counter);
                    break;
            }
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        switch (type) {
            case TYPE_ROW_ITEM:
                viewHolder.icon.setImageResource(navDrawerItems.get(position).getIcon());
                viewHolder.title.setText(navDrawerItems.get(position).getTitle());
                break;
            case TYPE_ROW_COUNT:
                viewHolder.icon.setImageResource(navDrawerItems.get(position).getIcon());
                viewHolder.title.setText(navDrawerItems.get(position).getTitle());
                viewHolder.count.setText(navDrawerItems.get(position).getCount());
                break;
            case TYPE_ROW_HEADER:
                viewHolder.header.setText(navDrawerItems.get(position).getTitle());
                break;
            case TYPE_ROW_BUTTON:
                viewHolder.icon.setImageResource(navDrawerItems.get(position).getIcon());
                viewHolder.title.setText(navDrawerItems.get(position).getTitle());
                viewHolder.imageButton.setImageResource(navDrawerItems.get(position).getImage());
                break;




        }

        return convertView;
    }

    private static class ViewHolder {
        public TextView title;
        public TextView count;
        public TextView header;
        public ImageView icon;
        public ImageButton imageButton;
    }

}