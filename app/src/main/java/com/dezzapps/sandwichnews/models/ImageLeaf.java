package com.dezzapps.sandwichnews.models;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageLeaf implements Component {

    private ImageView imageView;

    public ImageLeaf(ImageView imageView, int id) {
        this.imageView = imageView;
        setContent(id);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void setContent(int d) {

        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        imageView.setLayoutParams(
                new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,dp(120)));

        imageView.setImageResource(d);

    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);

    }

    private int dp(int px) {

        float scale = imageView.getResources().getDisplayMetrics().density;

        return (int) (scale *  px + 0.5f );

    }
}
