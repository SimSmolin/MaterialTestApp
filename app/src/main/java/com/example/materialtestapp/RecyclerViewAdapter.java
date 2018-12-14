package com.example.materialtestapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialtestapp.model.PhotoElement;
import com.example.materialtestapp.model.network.ImageRequester;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<PhotoElement> photoElementList;
    private ImageRequester imageRequester;

    RecyclerViewAdapter(List<PhotoElement> photoElementList) {
        this.photoElementList = photoElementList;
        imageRequester = ImageRequester.getInstance();
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_card, viewGroup, false);
        return new RecyclerViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        //
        //TODO: Всталяем binding
        //TODO: Put ViewHolder binding code here
        //
        if (photoElementList != null && position < photoElementList.size()) {
            PhotoElement product = photoElementList.get(position);
            holder.productTitle.setText(product.title);
            imageRequester.setImageFromUrl(holder.productImage, product.url);
        }

    }

    @Override
    public int getItemCount() {
        return photoElementList.size();
    }
}

