package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* compiled from: LinearSnapHelper */
public class h extends n {

    /* renamed from: d  reason: collision with root package name */
    private j f4639d;

    /* renamed from: e  reason: collision with root package name */
    private j f4640e;

    private float m(RecyclerView.o oVar, j jVar) {
        int max;
        int J = oVar.J();
        if (J == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = RecyclerView.UNDEFINED_DURATION;
        for (int i12 = 0; i12 < J; i12++) {
            View I = oVar.I(i12);
            int h02 = oVar.h0(I);
            if (h02 != -1) {
                if (h02 < i10) {
                    view = I;
                    i10 = h02;
                }
                if (h02 > i11) {
                    view2 = I;
                    i11 = h02;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(jVar.d(view), jVar.d(view2)) - Math.min(jVar.g(view), jVar.g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i11 - i10) + 1));
    }

    private int n(RecyclerView.o oVar, View view, j jVar) {
        return (jVar.g(view) + (jVar.e(view) / 2)) - (jVar.m() + (jVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, j jVar, int i10, int i11) {
        int[] d10 = d(i10, i11);
        float m10 = m(oVar, jVar);
        if (m10 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d10[0]) > Math.abs(d10[1]) ? d10[0] : d10[1])) / m10);
    }

    private View p(RecyclerView.o oVar, j jVar) {
        int J = oVar.J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m10 = jVar.m() + (jVar.n() / 2);
        int i10 = a.e.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < J; i11++) {
            View I = oVar.I(i11);
            int abs = Math.abs((jVar.g(I) + (jVar.e(I) / 2)) - m10);
            if (abs < i10) {
                view = I;
                i10 = abs;
            }
        }
        return view;
    }

    private j q(RecyclerView.o oVar) {
        j jVar = this.f4640e;
        if (jVar == null || jVar.f4642a != oVar) {
            this.f4640e = j.a(oVar);
        }
        return this.f4640e;
    }

    private j r(RecyclerView.o oVar) {
        j jVar = this.f4639d;
        if (jVar == null || jVar.f4642a != oVar) {
            this.f4639d = j.c(oVar);
        }
        return this.f4639d;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View h(RecyclerView.o oVar) {
        if (oVar.l()) {
            return p(oVar, r(oVar));
        }
        if (oVar.k()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    public int i(RecyclerView.o oVar, int i10, int i11) {
        int Y;
        View h10;
        int h02;
        int i12;
        PointF a10;
        int i13;
        int i14;
        if (!(oVar instanceof RecyclerView.z.b) || (Y = oVar.Y()) == 0 || (h10 = h(oVar)) == null || (h02 = oVar.h0(h10)) == -1 || (a10 = ((RecyclerView.z.b) oVar).a(i12)) == null) {
            return -1;
        }
        int i15 = 0;
        if (oVar.k()) {
            i13 = o(oVar, q(oVar), i10, 0);
            if (a10.x < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (oVar.l()) {
            i14 = o(oVar, r(oVar), 0, i11);
            if (a10.y < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (oVar.l()) {
            i13 = i14;
        }
        if (i13 == 0) {
            return -1;
        }
        int i16 = h02 + i13;
        if (i16 >= 0) {
            i15 = i16;
        }
        return i15 >= Y ? Y - 1 : i15;
    }
}
