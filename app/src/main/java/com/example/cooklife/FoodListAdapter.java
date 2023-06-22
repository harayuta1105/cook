package com.example.cooklife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {

    private List<FoodItem> foodList;

    public FoodListAdapter(List<FoodItem> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_food, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodItem foodItem = foodList.get(position);
        holder.foodNameTextView.setText(foodItem.getName());
        holder.foodQuantityTextView.setText("Quantity: " + foodItem.getQuantity());
        holder.foodStatusTextView.setText(foodItem.isPurchased() ? "Purchased" : "Not Purchased");
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodNameTextView;
        TextView foodQuantityTextView;
        TextView foodStatusTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodNameTextView = itemView.findViewById(R.id.foodNameTextView);
            foodQuantityTextView = itemView.findViewById(R.id.foodQuantityTextView);
            foodStatusTextView = itemView.findViewById(R.id.foodStatusTextView);
        }
    }
}
