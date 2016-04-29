package com.braincraftapps.gourmet.model.NavigationDrawer;

import java.util.ArrayList;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class NavDrawerItem extends ArrayList<NavDrawerItem> {

    private String title;
    private int icon;
    private String count = "0";
    private int image;

    // boolean to set visiblity of the counter
    private boolean isCounterVisible = false;
    private boolean isGroupHeader = false;
    private boolean isButtonVisible = false;

    public NavDrawerItem() {
    }

    public NavDrawerItem(String title) {
        this.setTitle(title);
        isGroupHeader = true;
    }

    public NavDrawerItem(String title, int icon) {
        this.setTitle(title);
        this.setIcon(icon);
    }

    public NavDrawerItem(String title, int icon, boolean isCounterVisible, String count) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setCounterVisible(isCounterVisible);
        this.setCount(count);
    }

    public NavDrawerItem(String title, int icon, int image, boolean isButtonVisible) {
        this.setTitle(title);
        this.setIcon(icon);
        this.setImage(image);
        this.setButtonVisible(isButtonVisible);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return this.icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public boolean isCounterVisible() {
        return isCounterVisible;
    }

    public void setCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

    public boolean isGroupHeader() {
        return isGroupHeader;
    }

    public void setGroupHeader(boolean isGroupHeader) {
        this.isGroupHeader = isGroupHeader;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isButtonVisible() {
        return isButtonVisible;
    }

    public void setButtonVisible(boolean isButtonVisible) {
        this.isButtonVisible = isButtonVisible;
    }
}
