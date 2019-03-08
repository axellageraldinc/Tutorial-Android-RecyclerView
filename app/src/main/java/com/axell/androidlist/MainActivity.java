package com.axell.androidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGroceries;

    private GroceryRecyclerViewAdapter groceryRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGroceries = findViewById(R.id.rvGroceries);
        rvGroceries.setLayoutManager(new LinearLayoutManager(this));

        groceryRecyclerViewAdapter = new GroceryRecyclerViewAdapter();
        rvGroceries.setAdapter(groceryRecyclerViewAdapter);

        setData();
    }

    private void setData() {
        List<Grocery> dummyData = DummyGroceryData.groceryList();
        groceryRecyclerViewAdapter.updateData(dummyData);
    }
}
