package com.dezzapps.sandwichnews.models;

import android.view.ViewGroup;

public interface Component {

    void add(Component component);
    void setContent(int d);
    void inflate(ViewGroup layout);


}
