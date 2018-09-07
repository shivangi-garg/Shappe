package com.shappe.shappe.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.shappe.shappe.Interface.ItemClickListener;
import com.shappe.shappe.R;



public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtCategoryName, txtCategoryMeasure;


    private ItemClickListener itemClickListener;
    public CategoryViewHolder(View itemView) {
        super(itemView);

        txtCategoryName = (TextView) itemView.findViewById(R.id.category_name);
        txtCategoryMeasure = (TextView) itemView.findViewById(R.id.category_measure);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
