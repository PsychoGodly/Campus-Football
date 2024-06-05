package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3153a;

    /* renamed from: b  reason: collision with root package name */
    private a f3154b;

    /* renamed from: c  reason: collision with root package name */
    private C0047b f3155c;

    /* compiled from: ActionProvider */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* compiled from: ActionProvider */
    public interface C0047b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f3153a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f3155c = null;
        this.f3154b = null;
    }

    public void i(a aVar) {
        this.f3154b = aVar;
    }

    public void j(C0047b bVar) {
        if (!(this.f3155c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3155c = bVar;
    }
}
