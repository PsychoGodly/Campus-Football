package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import h.g;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f1176a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f1177b;

    /* renamed from: c  reason: collision with root package name */
    g f1178c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f1179d;

    /* renamed from: f  reason: collision with root package name */
    int f1180f;

    /* renamed from: g  reason: collision with root package name */
    int f1181g;

    /* renamed from: h  reason: collision with root package name */
    int f1182h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f1183i;

    /* renamed from: j  reason: collision with root package name */
    a f1184j;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f1185a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i v10 = e.this.f1178c.v();
            if (v10 != null) {
                ArrayList<i> z10 = e.this.f1178c.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f1185a = i10;
                        return;
                    }
                }
            }
            this.f1185a = -1;
        }

        /* renamed from: b */
        public i getItem(int i10) {
            ArrayList<i> z10 = e.this.f1178c.z();
            int i11 = i10 + e.this.f1180f;
            int i12 = this.f1185a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        public int getCount() {
            int size = e.this.f1178c.z().size() - e.this.f1180f;
            return this.f1185a < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1177b.inflate(eVar.f1182h, viewGroup, false);
            }
            ((n.a) view).e(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f1176a = context;
        this.f1177b = LayoutInflater.from(context);
    }

    public void a(g gVar, boolean z10) {
        m.a aVar = this.f1183i;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f1184j == null) {
            this.f1184j = new a();
        }
        return this.f1184j;
    }

    public void c(boolean z10) {
        a aVar = this.f1184j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public boolean e(g gVar, i iVar) {
        return false;
    }

    public boolean f(g gVar, i iVar) {
        return false;
    }

    public void g(m.a aVar) {
        this.f1183i = aVar;
    }

    public void h(Context context, g gVar) {
        if (this.f1181g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1181g);
            this.f1176a = contextThemeWrapper;
            this.f1177b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1176a != null) {
            this.f1176a = context;
            if (this.f1177b == null) {
                this.f1177b = LayoutInflater.from(context);
            }
        }
        this.f1178c = gVar;
        a aVar = this.f1184j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n i(ViewGroup viewGroup) {
        if (this.f1179d == null) {
            this.f1179d = (ExpandedMenuView) this.f1177b.inflate(g.f18273g, viewGroup, false);
            if (this.f1184j == null) {
                this.f1184j = new a();
            }
            this.f1179d.setAdapter(this.f1184j);
            this.f1179d.setOnItemClickListener(this);
        }
        return this.f1179d;
    }

    public boolean j(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d((IBinder) null);
        m.a aVar = this.f1183i;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1178c.M(this.f1184j.getItem(i10), this, 0);
    }

    public e(int i10, int i11) {
        this.f1182h = i10;
        this.f1181g = i11;
    }
}
