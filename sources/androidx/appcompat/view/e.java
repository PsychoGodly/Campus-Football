package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class e extends b implements g.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f1019c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f1020d;

    /* renamed from: f  reason: collision with root package name */
    private b.a f1021f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f1022g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1023h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1024i;

    /* renamed from: j  reason: collision with root package name */
    private g f1025j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f1019c = context;
        this.f1020d = actionBarContextView;
        this.f1021f = aVar;
        g S = new g(actionBarContextView.getContext()).S(1);
        this.f1025j = S;
        S.R(this);
        this.f1024i = z10;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f1021f.d(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.f1020d.l();
    }

    public void c() {
        if (!this.f1023h) {
            this.f1023h = true;
            this.f1021f.a(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f1022g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f1025j;
    }

    public MenuInflater f() {
        return new g(this.f1020d.getContext());
    }

    public CharSequence g() {
        return this.f1020d.getSubtitle();
    }

    public CharSequence i() {
        return this.f1020d.getTitle();
    }

    public void k() {
        this.f1021f.c(this, this.f1025j);
    }

    public boolean l() {
        return this.f1020d.j();
    }

    public void m(View view) {
        this.f1020d.setCustomView(view);
        this.f1022g = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i10) {
        o(this.f1019c.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f1020d.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f1019c.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f1020d.setTitle(charSequence);
    }

    public void s(boolean z10) {
        super.s(z10);
        this.f1020d.setTitleOptional(z10);
    }
}
