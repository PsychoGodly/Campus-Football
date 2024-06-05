package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private Object f1011a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1012b;

    /* compiled from: ActionMode */
    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f1011a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f1012b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f1011a = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f1012b = z10;
    }
}
