package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.d;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class k extends androidx.core.view.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f4645d;

    /* renamed from: e  reason: collision with root package name */
    private final a f4646e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        final k f4647d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, androidx.core.view.a> f4648e = new WeakHashMap();

        public a(k kVar) {
            this.f4647d = kVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        public d b(View view) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, c cVar) {
            if (this.f4647d.o() || this.f4647d.f4645d.getLayoutManager() == null) {
                super.g(view, cVar);
                return;
            }
            this.f4647d.f4645d.getLayoutManager().O0(view, cVar);
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                aVar.g(view, cVar);
            } else {
                super.g(view, cVar);
            }
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4648e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f4647d.o() || this.f4647d.f4645d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f4647d.f4645d.getLayoutManager().i1(view, i10, bundle);
        }

        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4648e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f4648e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a l10 = a0.l(view);
            if (l10 != null && l10 != this) {
                this.f4648e.put(view, l10);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.f4645d = recyclerView;
        androidx.core.view.a n10 = n();
        if (n10 == null || !(n10 instanceof a)) {
            this.f4646e = new a(this);
        } else {
            this.f4646e = (a) n10;
        }
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().K0(accessibilityEvent);
            }
        }
    }

    public void g(View view, c cVar) {
        super.g(view, cVar);
        if (!o() && this.f4645d.getLayoutManager() != null) {
            this.f4645d.getLayoutManager().M0(cVar);
        }
    }

    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f4645d.getLayoutManager() == null) {
            return false;
        }
        return this.f4645d.getLayoutManager().g1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f4646e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f4645d.hasPendingAdapterUpdates();
    }
}
