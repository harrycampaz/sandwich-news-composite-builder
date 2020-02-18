package com.dezzapps.sandwichnews.models;

import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CompositeLayout implements Component {

    private List<Component> components = new ArrayList<>();

    private LinearLayout linearLayout;

    public CompositeLayout(LinearLayout linearLayout, int id) {
        this.linearLayout = linearLayout;
        setContent(id);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int d) {

        linearLayout.setBackgroundResource(d);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

    }

    @Override
    public void inflate(ViewGroup layout) {

        layout.addView(linearLayout);

        for (Component c: components) {

            c.inflate(linearLayout);

        }

    }
}
