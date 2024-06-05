package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* compiled from: SnapHelper */
public abstract class n extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f4650a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f4651b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.t f4652c = new a();

    /* compiled from: SnapHelper */
    class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        boolean f4653a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f4653a) {
                this.f4653a = false;
                n.this.l();
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f4653a = true;
            }
        }
    }

    /* compiled from: SnapHelper */
    class b extends g {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            n nVar = n.this;
            RecyclerView recyclerView = nVar.f4650a;
            if (recyclerView != null) {
                int[] c10 = nVar.c(recyclerView.getLayoutManager(), view);
                int i10 = c10[0];
                int i11 = c10[1];
                int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
                if (w10 > 0) {
                    aVar.d(i10, i11, w10, this.f4632j);
                }
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    private void g() {
        this.f4650a.removeOnScrollListener(this.f4652c);
        this.f4650a.setOnFlingListener((RecyclerView.r) null);
    }

    private void j() throws IllegalStateException {
        if (this.f4650a.getOnFlingListener() == null) {
            this.f4650a.addOnScrollListener(this.f4652c);
            this.f4650a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.z e10;
        int i12;
        if (!(oVar instanceof RecyclerView.z.b) || (e10 = e(oVar)) == null || (i12 = i(oVar, i10, i11)) == -1) {
            return false;
        }
        e10.p(i12);
        oVar.J1(e10);
        return true;
    }

    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f4650a.getLayoutManager();
        if (layoutManager == null || this.f4650a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4650a.getMinFlingVelocity();
        if ((Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && k(layoutManager, i10, i11)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4650a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.f4650a = recyclerView;
            if (recyclerView != null) {
                j();
                this.f4651b = new Scroller(this.f4650a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i10, int i11) {
        this.f4651b.fling(0, 0, i10, i11, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, a.e.API_PRIORITY_OTHER);
        return new int[]{this.f4651b.getFinalX(), this.f4651b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.z e(RecyclerView.o oVar) {
        return f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public g f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f4650a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i10, int i11);

    /* access modifiers changed from: package-private */
    public void l() {
        RecyclerView.o layoutManager;
        View h10;
        RecyclerView recyclerView = this.f4650a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h10 = h(layoutManager)) != null) {
            int[] c10 = c(layoutManager, h10);
            if (c10[0] != 0 || c10[1] != 0) {
                this.f4650a.smoothScrollBy(c10[0], c10[1]);
            }
        }
    }
}
