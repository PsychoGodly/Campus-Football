package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1129a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f1130b;

    /* renamed from: c  reason: collision with root package name */
    protected g f1131c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f1132d;

    /* renamed from: f  reason: collision with root package name */
    protected LayoutInflater f1133f;

    /* renamed from: g  reason: collision with root package name */
    private m.a f1134g;

    /* renamed from: h  reason: collision with root package name */
    private int f1135h;

    /* renamed from: i  reason: collision with root package name */
    private int f1136i;

    /* renamed from: j  reason: collision with root package name */
    protected n f1137j;

    /* renamed from: k  reason: collision with root package name */
    private int f1138k;

    public b(Context context, int i10, int i11) {
        this.f1129a = context;
        this.f1132d = LayoutInflater.from(context);
        this.f1135h = i10;
        this.f1136i = i11;
    }

    public void a(g gVar, boolean z10) {
        m.a aVar = this.f1134g;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1137j).addView(view, i10);
    }

    public void c(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f1137j;
        if (viewGroup != null) {
            g gVar = this.f1131c;
            int i10 = 0;
            if (gVar != null) {
                gVar.r();
                ArrayList<i> E = this.f1131c.E();
                int size = E.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    i iVar = E.get(i12);
                    if (q(i11, iVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View n10 = n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n10.setPressed(false);
                            n10.jumpDrawablesToCurrentState();
                        }
                        if (n10 != childAt) {
                            b(n10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean e(g gVar, i iVar) {
        return false;
    }

    public boolean f(g gVar, i iVar) {
        return false;
    }

    public void g(m.a aVar) {
        this.f1134g = aVar;
    }

    public void h(Context context, g gVar) {
        this.f1130b = context;
        this.f1133f = LayoutInflater.from(context);
        this.f1131c = gVar;
    }

    public abstract void i(i iVar, n.a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.appcompat.view.menu.r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f1134g
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f1131c
        L_0x0009:
            boolean r2 = r0.b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.j(androidx.appcompat.view.menu.r):boolean");
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f1132d.inflate(this.f1136i, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public m.a m() {
        return this.f1134g;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = k(viewGroup);
        }
        i(iVar, aVar);
        return (View) aVar;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f1137j == null) {
            n nVar = (n) this.f1132d.inflate(this.f1135h, viewGroup, false);
            this.f1137j = nVar;
            nVar.b(this.f1131c);
            c(true);
        }
        return this.f1137j;
    }

    public void p(int i10) {
        this.f1138k = i10;
    }

    public abstract boolean q(int i10, i iVar);
}
