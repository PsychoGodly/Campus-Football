package com.startapp;

import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.ads.list3d.List3DView;

/* compiled from: Sta */
public class r4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f16350a;

    public r4(List3DView list3DView) {
        this.f16350a = list3DView;
    }

    public void run() {
        int b10;
        List3DView list3DView = this.f16350a;
        if (list3DView.f16507b == 1 && (b10 = list3DView.b(list3DView.f16508c, list3DView.f16509d)) != -1) {
            List3DView list3DView2 = this.f16350a;
            View childAt = list3DView2.getChildAt(b10);
            int i10 = list3DView2.f16514i + b10;
            long itemId = list3DView2.f16506a.getItemId(i10);
            AdapterView.OnItemLongClickListener onItemLongClickListener = list3DView2.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                onItemLongClickListener.onItemLongClick(list3DView2, childAt, i10, itemId);
            }
        }
    }
}
