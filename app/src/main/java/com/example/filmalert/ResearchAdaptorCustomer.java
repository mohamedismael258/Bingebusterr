package com.example.filmalert;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmalert.databinding.ItemResearchBinding;

import java.util.ArrayList;

public class ResearchAdaptorCustomer extends RecyclerView.Adapter<ResearchAdaptorCustomer.Holder> {
    private ArrayList<ModelResearch> list;
    public void setList(ArrayList<ModelResearch> list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemResearchBinding binding =ItemResearchBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(list.get(position).getTextView().toString().trim());
    }

    @Override
    public int getItemCount() {
        return list!=null?list.size():0;
    }

    public class Holder extends RecyclerView.ViewHolder
    {

        TextView textView;

        public Holder(ItemResearchBinding binding) {
            super(binding.getRoot());

            textView=binding.text;
        }
        public void bind (String text )

        {
            textView.setText(text);

        }
    }
}
