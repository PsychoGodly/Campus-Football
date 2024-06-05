package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper */
class l {
    static int a(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
        }
        return Math.min(jVar.n(), jVar.d(view2) - jVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z10, boolean z11) {
        int i10;
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.h0(view), oVar.h0(view2));
        int max = Math.max(oVar.h0(view), oVar.h0(view2));
        if (z11) {
            i10 = Math.max(0, (a0Var.b() - max) - 1);
        } else {
            i10 = Math.max(0, min);
        }
        if (!z10) {
            return i10;
        }
        return Math.round((((float) i10) * (((float) Math.abs(jVar.d(view2) - jVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)))) + ((float) (jVar.m() - jVar.g(view))));
    }

    static int c(RecyclerView.a0 a0Var, j jVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return a0Var.b();
        }
        return (int) ((((float) (jVar.d(view2) - jVar.g(view))) / ((float) (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) * ((float) a0Var.b()));
    }
}
