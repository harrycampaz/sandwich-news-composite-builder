package com.dezzapps.sandwichnews.models;

import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CompositeImage implements Component {

    List<Component> components = new ArrayList<Component>();
    private ImageView imageView;

    public CompositeImage(ImageView imageView, int id) {
        this.imageView = imageView;
        setContent(id);
    }

    @Override
    public void add(Component component) {

        components.add(component);

    }

    @Override
    public void setContent(int d) {

        imageView.setImageResource(d);

    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);

        for (Component c: components){
            c.inflate(layout);
        }

    }

}
