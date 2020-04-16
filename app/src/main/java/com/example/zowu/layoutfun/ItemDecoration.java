package com.example.zowu.layoutfun;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDecoration extends RecyclerView.ItemDecoration {
    @Override
    public void getItemOffsets(@NonNull Rect outRect,
                               @NonNull View view,
                               @NonNull RecyclerView parent,
                               @NonNull RecyclerView.State state) {
        int spacingPx = view.getResources().getDimensionPixelSize(R.dimen.item_spacing);
        if (parent.getAdapter() != null) {
            outRect.left = spacingPx;
            if ((parent.getChildAdapterPosition(view) == parent.getAdapter()
                                                               .getItemCount() - 1 && parent.getLayoutDirection() == View.LAYOUT_DIRECTION_LTR)
                || (parent.getChildAdapterPosition(view) == 0 && parent.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL)) {
                outRect.right = spacingPx;
            }
        }
    }
}
