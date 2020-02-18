package com.dezzapps.sandwichnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dezzapps.sandwichnews.models.Builder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        layout.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        setContentView(layout);

        Builder builder = new Builder(this);

//        builder.headline.inflate(layout);
//
//        builder.header.inflate(layout);

       builder.headerGroup().inflate(layout);

       // builder.sandwichArray().inflate(layout);

        builder.sandwichLayout().inflate(layout);

        builder.feed().inflate(layout);


    }
}
