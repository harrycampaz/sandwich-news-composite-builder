package com.dezzapps.sandwichnews.models;

import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CompositeShell implements Component {

    List<Component> components = new ArrayList<Component>();


    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int d) {

    }

    @Override
    public void inflate(ViewGroup layout) {

        for (Component c: components){
            c.inflate(layout);
        }

    }
}
