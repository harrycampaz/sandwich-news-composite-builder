package com.dezzapps.sandwichnews.models;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dezzapps.sandwichnews.R;

public class Builder  {

    public Context context;

    public Component header, headline;

    public Builder(Context context){
        this.context = context;
        init();

    }

    public void init(){
        header = new ImageLeaf(new ImageView(context), R.drawable.sandwich);
        headline = new TextLeaf(new TextView(context),  R.string.new_sandwch);
    }

    public  Component headerGroup() {
        Component c = new CompositeImage(new ImageView(context), R.drawable.sandwich);
        c.add(headline);
        return c;
    }

    public TextLeaf setText(int t) {
        TextLeaf leaf = new TextLeaf(new TextView(context), t);
        return leaf;
    }

    public ImageLeaf setImage(int t) {
        ImageLeaf leaf = new ImageLeaf(new ImageView(context), t);
        return leaf;
    }

    public  Component sandwichArray() {

        Component c = new CompositeShell();

        c.add(setImage(R.drawable.sandwichs));
        c.add(setImage(R.drawable.sliced));
        c.add(setImage(R.drawable.roll));

        return c;
    }

    public  Component sandwichLayout(){

        Component c = new CompositeLayout(new LinearLayout(context), R.color.colorAccent);

        c.add(sandwichArray());

        return c;

    }

    public Component feed(){
        Component c = new CompositeImage(new ImageView(context), R.drawable.sandwichs);
        c.add(setText(R.string.saludo));
        return c;
    }

}
