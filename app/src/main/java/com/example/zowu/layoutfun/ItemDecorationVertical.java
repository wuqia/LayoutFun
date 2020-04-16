package com.example.zowu.layoutfun;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDecorationVertical extends RecyclerView.ItemDecoration {
    @Override
    public void getItemOffsets(@NonNull Rect outRect,
                               @NonNull View view,
                               @NonNull RecyclerView parent,
                               @NonNull RecyclerView.State state) {
        outRect.left = view.getResources().getDimensionPixelSize(R.dimen.item_spacing);
        outRect.right = view.getResources().getDimensionPixelSize(R.dimen.item_spacing);
        outRect.top = view.getResources().getDimensionPixelSize(R.dimen.item_spacing);
    }
}
