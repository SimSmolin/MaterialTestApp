package com.example.materialtestapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

// вьюхолдер для одной фотографии состоит из собственно фото и подписи к ней
// причем картинка класса NetworkImageView

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public NetworkImageView productImage;
    public TextView productTitle;

    RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        productImage = itemView.findViewById(R.id.photo_image);
        productTitle = itemView.findViewById(R.id.photo_title);
    }

}
