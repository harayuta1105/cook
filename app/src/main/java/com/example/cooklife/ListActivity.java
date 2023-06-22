package com.example.cooklife;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private EditText householdEditText;
    private EditText shoppingEditText;
    private TextView householdTextView;
    private TextView shoppingTextView;
    private Button addHouseholdButton;
    private Button addShoppingButton;

    private List<String> householdItems;
    private List<String> shoppingItems;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        householdEditText = findViewById(R.id.householdEditText);
        shoppingEditText = findViewById(R.id.shoppingEditText);
        householdTextView = findViewById(R.id.householdTextView);
        shoppingTextView = findViewById(R.id.shoppingTextView);
        addHouseholdButton = findViewById(R.id.addHouseholdButton);
        addShoppingButton = findViewById(R.id.addShoppingButton);

        householdItems = new ArrayList<>();
        shoppingItems = new ArrayList<>();

        addHouseholdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = householdEditText.getText().toString();
                householdItems.add(item);
                updateHouseholdList();
                householdEditText.setText("");
            }
        });

        addShoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = shoppingEditText.getText().toString();
                shoppingItems.add(item);
                updateShoppingList();
                shoppingEditText.setText("");
            }
        });
    }

    private void updateHouseholdList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : householdItems) {
            stringBuilder.append(item).append("\n");
        }
        householdTextView.setText(stringBuilder.toString());
    }

    private void updateShoppingList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : shoppingItems) {
            stringBuilder.append(item).append("\n");
        }
        shoppingTextView.setText(stringBuilder.toString());
    }
}