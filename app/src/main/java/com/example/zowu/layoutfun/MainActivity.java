package com.example.zowu.layoutfun;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this));
        new StartSnapHelper().attachToRecyclerView(recyclerView);
        recyclerView.addItemDecoration(new ItemDecoration());

        final RecyclerView recyclerViewVertical = findViewById(R.id.recycler_view_verticle);
        recyclerViewVertical.setAdapter(new ItemAdapterVertical());
        recyclerViewVertical.addItemDecoration(new ItemDecorationVertical());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (recyclerView.getVisibility() == View.VISIBLE) {
                    ((Button) v).setText("Horizontal");
                    recyclerView.setVisibility(View.GONE);
                    recyclerViewVertical.setVisibility(View.VISIBLE);
                } else {
                    ((Button) v).setText("Vertical");
                    recyclerView.setVisibility(View.VISIBLE);
                    recyclerViewVertical.setVisibility(View.GONE);
                }
            }
        });
    }
}