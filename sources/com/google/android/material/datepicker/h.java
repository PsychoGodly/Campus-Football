package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.a0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar */
public final class h<S> extends p<S> {

    /* renamed from: n0  reason: collision with root package name */
    static final Object f25631n0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: o0  reason: collision with root package name */
    static final Object f25632o0 = "NAVIGATION_PREV_TAG";

    /* renamed from: p0  reason: collision with root package name */
    static final Object f25633p0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: q0  reason: collision with root package name */
    static final Object f25634q0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: d0  reason: collision with root package name */
    private int f25635d0;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public d<S> f25636e0;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public a f25637f0;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public l f25638g0;

    /* renamed from: h0  reason: collision with root package name */
    private k f25639h0;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public c f25640i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public RecyclerView f25641j0;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public RecyclerView f25642k0;

    /* renamed from: l0  reason: collision with root package name */
    private View f25643l0;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public View f25644m0;

    /* compiled from: MaterialCalendar */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25645a;

        a(int i10) {
            this.f25645a = i10;
        }

        public void run() {
            h.this.f25642k0.smoothScrollToPosition(this.f25645a);
        }
    }

    /* compiled from: MaterialCalendar */
    class b extends androidx.core.view.a {
        b() {
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.Z((Object) null);
        }
    }

    /* compiled from: MaterialCalendar */
    class c extends q {
        final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        /* access modifiers changed from: protected */
        public void M1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.f25642k0.getWidth();
                iArr[1] = h.this.f25642k0.getWidth();
                return;
            }
            iArr[0] = h.this.f25642k0.getHeight();
            iArr[1] = h.this.f25642k0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    class d implements l {
        d() {
        }

        public void a(long j10) {
            if (h.this.f25637f0.e().o(j10)) {
                h.this.f25636e0.b0(j10);
                Iterator it = h.this.f25699c0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(h.this.f25636e0.W());
                }
                h.this.f25642k0.getAdapter().notifyDataSetChanged();
                if (h.this.f25641j0 != null) {
                    h.this.f25641j0.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f25649a = r.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f25650b = r.k();

        e() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i10;
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                s sVar = (s) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.d next : h.this.f25636e0.E()) {
                    F f10 = next.f3080a;
                    if (!(f10 == null || next.f3081b == null)) {
                        this.f25649a.setTimeInMillis(((Long) f10).longValue());
                        this.f25650b.setTimeInMillis(((Long) next.f3081b).longValue());
                        int c10 = sVar.c(this.f25649a.get(1));
                        int c11 = sVar.c(this.f25650b.get(1));
                        View C = gridLayoutManager.C(c10);
                        View C2 = gridLayoutManager.C(c11);
                        int X2 = c10 / gridLayoutManager.X2();
                        int X22 = c11 / gridLayoutManager.X2();
                        int i11 = X2;
                        while (i11 <= X22) {
                            View C3 = gridLayoutManager.C(gridLayoutManager.X2() * i11);
                            if (C3 != null) {
                                int top = C3.getTop() + h.this.f25640i0.f25621d.c();
                                int bottom = C3.getBottom() - h.this.f25640i0.f25621d.b();
                                int left = i11 == X2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i11 == X22) {
                                    i10 = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    i10 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i10, (float) bottom, h.this.f25640i0.f25625h);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class f extends androidx.core.view.a {
        f() {
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            String str;
            super.g(view, cVar);
            if (h.this.f25644m0.getVisibility() == 0) {
                str = h.this.O(x5.i.mtrl_picker_toggle_to_year_selection);
            } else {
                str = h.this.O(x5.i.mtrl_picker_toggle_to_day_selection);
            }
            cVar.i0(str);
        }
    }

    /* compiled from: MaterialCalendar */
    class g extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f25653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f25654b;

        g(n nVar, MaterialButton materialButton) {
            this.f25653a = nVar;
            this.f25654b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                CharSequence text = this.f25654b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            int i12;
            if (i10 < 0) {
                i12 = h.this.V1().Z1();
            } else {
                i12 = h.this.V1().c2();
            }
            l unused = h.this.f25638g0 = this.f25653a.b(i12);
            this.f25654b.setText(this.f25653a.c(i12));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h  reason: collision with other inner class name */
    /* compiled from: MaterialCalendar */
    class C0273h implements View.OnClickListener {
        C0273h() {
        }

        public void onClick(View view) {
            h.this.a2();
        }
    }

    /* compiled from: MaterialCalendar */
    class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f25657a;

        i(n nVar) {
            this.f25657a = nVar;
        }

        public void onClick(View view) {
            int Z1 = h.this.V1().Z1() + 1;
            if (Z1 < h.this.f25642k0.getAdapter().getItemCount()) {
                h.this.Y1(this.f25657a.b(Z1));
            }
        }
    }

    /* compiled from: MaterialCalendar */
    class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f25659a;

        j(n nVar) {
            this.f25659a = nVar;
        }

        public void onClick(View view) {
            int c22 = h.this.V1().c2() - 1;
            if (c22 >= 0) {
                h.this.Y1(this.f25659a.b(c22));
            }
        }
    }

    /* compiled from: MaterialCalendar */
    enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar */
    interface l {
        void a(long j10);
    }

    private void O1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(x5.f.month_navigation_fragment_toggle);
        materialButton.setTag(f25634q0);
        a0.n0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(x5.f.month_navigation_previous);
        materialButton2.setTag(f25632o0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(x5.f.month_navigation_next);
        materialButton3.setTag(f25633p0);
        this.f25643l0 = view.findViewById(x5.f.mtrl_calendar_year_selector_frame);
        this.f25644m0 = view.findViewById(x5.f.mtrl_calendar_day_selector_frame);
        Z1(k.DAY);
        materialButton.setText(this.f25638g0.h());
        this.f25642k0.addOnScrollListener(new g(nVar, materialButton));
        materialButton.setOnClickListener(new C0273h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n P1() {
        return new e();
    }

    static int U1(Context context) {
        return context.getResources().getDimensionPixelSize(x5.d.mtrl_calendar_day_height);
    }

    static <T> h<T> W1(d<T> dVar, int i10, a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.i());
        hVar.u1(bundle);
        return hVar;
    }

    private void X1(int i10) {
        this.f25642k0.post(new a(i10));
    }

    public void I0(Bundle bundle) {
        super.I0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f25635d0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f25636e0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f25637f0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f25638g0);
    }

    /* access modifiers changed from: package-private */
    public a Q1() {
        return this.f25637f0;
    }

    /* access modifiers changed from: package-private */
    public c R1() {
        return this.f25640i0;
    }

    /* access modifiers changed from: package-private */
    public l S1() {
        return this.f25638g0;
    }

    public d<S> T1() {
        return this.f25636e0;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager V1() {
        return (LinearLayoutManager) this.f25642k0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void Y1(l lVar) {
        n nVar = (n) this.f25642k0.getAdapter();
        int d10 = nVar.d(lVar);
        int d11 = d10 - nVar.d(this.f25638g0);
        boolean z10 = true;
        boolean z11 = Math.abs(d11) > 3;
        if (d11 <= 0) {
            z10 = false;
        }
        this.f25638g0 = lVar;
        if (z11 && z10) {
            this.f25642k0.scrollToPosition(d10 - 3);
            X1(d10);
        } else if (z11) {
            this.f25642k0.scrollToPosition(d10 + 3);
            X1(d10);
        } else {
            X1(d10);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z1(k kVar) {
        this.f25639h0 = kVar;
        if (kVar == k.YEAR) {
            this.f25641j0.getLayoutManager().x1(((s) this.f25641j0.getAdapter()).c(this.f25638g0.f25682d));
            this.f25643l0.setVisibility(0);
            this.f25644m0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f25643l0.setVisibility(8);
            this.f25644m0.setVisibility(0);
            Y1(this.f25638g0);
        }
    }

    /* access modifiers changed from: package-private */
    public void a2() {
        k kVar = this.f25639h0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            Z1(k.DAY);
        } else if (kVar == k.DAY) {
            Z1(kVar2);
        }
    }

    public void m0(Bundle bundle) {
        super.m0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.f25635d0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f25636e0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f25637f0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f25638g0 = (l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(p(), this.f25635d0);
        this.f25640i0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        l j10 = this.f25637f0.j();
        if (i.j2(contextThemeWrapper)) {
            i11 = x5.h.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = x5.h.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(x5.f.mtrl_calendar_days_of_week);
        a0.n0(gridView, new b());
        gridView.setAdapter(new g());
        gridView.setNumColumns(j10.f25683f);
        gridView.setEnabled(false);
        this.f25642k0 = (RecyclerView) inflate.findViewById(x5.f.mtrl_calendar_months);
        this.f25642k0.setLayoutManager(new c(p(), i10, false, i10));
        this.f25642k0.setTag(f25631n0);
        n nVar = new n(contextThemeWrapper, this.f25636e0, this.f25637f0, new d());
        this.f25642k0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(x5.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(x5.f.mtrl_calendar_year_selector_frame);
        this.f25641j0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f25641j0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f25641j0.setAdapter(new s(this));
            this.f25641j0.addItemDecoration(P1());
        }
        if (inflate.findViewById(x5.f.month_navigation_fragment_toggle) != null) {
            O1(inflate, nVar);
        }
        if (!i.j2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.h().b(this.f25642k0);
        }
        this.f25642k0.scrollToPosition(nVar.d(this.f25638g0));
        return inflate;
    }
}
