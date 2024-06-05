package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;

/* compiled from: SmoothCalendarLayoutManager */
class q extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    class a extends g {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    q(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        J1(aVar);
    }
}
