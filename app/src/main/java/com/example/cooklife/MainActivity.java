package com.example.cooklife;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView foodRecyclerView;
    private FoodListAdapter foodListAdapter;

    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView foodRecyclerView = findViewById(R.id.foodRecyclerView);

        // リサイクラービューの設定
        foodRecyclerView = findViewById(R.id.foodRecyclerView);
        foodRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 食材のリストデータを作成（仮のデータ）
        foodList = new ArrayList<>();
        foodList.add(new FoodItem("Apple", 5, true));
        foodList.add(new FoodItem("Banana", 10, false));
        foodList.add(new FoodItem("Orange", 3, true));

        // アダプターの設定
        foodListAdapter = new FoodListAdapter(foodList);
        foodRecyclerView.setAdapter(foodListAdapter);
    }
}