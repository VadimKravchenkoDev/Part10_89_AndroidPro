package com.kravchenkovadim.part10_89_androidpro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_anchor_24,
                "Anchor", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_downhill_skiing_24,
                "Downhill_skiing", "Yahu!"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.baseline_emoji_objects_24,
                "Lamp", "Yahu!"));

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}