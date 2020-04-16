package com.example.zowu.layoutfun;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.zowu.layoutfun.databinding.ItemBinding;

public class ItemAdapterVertical extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item, parent, false);
        binding.itemEntryImageSpace.setVisibility(View.GONE);
        binding.itemEntryImage.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
        binding.itemEntryImage.setScaleType(ImageView.ScaleType.CENTER);
        return new RecyclerView.ViewHolder(binding.getRoot()) {};
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DataBindingUtil.getBinding(holder.itemView).setVariable(BR.data, FakeViewData.values()[position].itemViewData);
    }

    @Override
    public int getItemCount() {
        return FakeViewData.values().length - 1;
    }
}
