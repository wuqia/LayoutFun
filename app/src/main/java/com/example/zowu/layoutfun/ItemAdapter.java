package com.example.zowu.layoutfun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.zowu.layoutfun.databinding.ItemBinding;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int cardWidth;
    private final int cardHeight;

    public ItemAdapter(@NonNull Context context) {
        this.cardWidth = computeCardWidth(context);
        this.cardHeight = computeCardHeight(context, cardWidth);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item, parent, false);
        binding.getRoot().getLayoutParams().width = cardWidth;
        binding.getRoot().getLayoutParams().height = cardHeight;

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

    private int computeCardWidth(@NonNull Context context) {
        return context.getResources().getDisplayMetrics().widthPixels
            - context.getResources().getDimensionPixelSize(R.dimen.peek_width)
            - context.getResources().getDimensionPixelSize(R.dimen.item_spacing);
    }

    private int computeCardHeight(@NonNull Context context, int width) {
        ItemBinding fakeViewBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item, null, false);
        fakeViewBinding.setVariable(BR.data, FakeViewData.MAX_ALL.itemViewData);
        fakeViewBinding.getRoot().measure(View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY), 0);
        return fakeViewBinding.getRoot().getMeasuredHeight();
    }
}
