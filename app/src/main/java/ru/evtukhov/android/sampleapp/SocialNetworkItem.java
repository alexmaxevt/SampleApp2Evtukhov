package ru.evtukhov.android.sampleapp;

import android.graphics.drawable.Drawable;

public class SocialNetworkItem {
    private Drawable icon;
    private String name;
    private String link;
    private boolean select;

    SocialNetworkItem(Drawable icon, String name, String link, boolean select) {
        this.icon = icon;
        this.name = name;
        this.link = link;
        this.select = select;
    }

    public String getName() {
        return name;
    }

    public boolean isSelect() {
        return select;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getLink() {
        return link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
