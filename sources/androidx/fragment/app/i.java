package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.h;
import androidx.lifecycle.p0;

/* compiled from: FragmentController */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final k<?> f3620a;

    private i(k<?> kVar) {
        this.f3620a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) h.g(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f3620a;
        kVar.f3626f.j(kVar, kVar, fragment);
    }

    public void c() {
        this.f3620a.f3626f.y();
    }

    public void d(Configuration configuration) {
        this.f3620a.f3626f.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f3620a.f3626f.B(menuItem);
    }

    public void f() {
        this.f3620a.f3626f.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f3620a.f3626f.D(menu, menuInflater);
    }

    public void h() {
        this.f3620a.f3626f.E();
    }

    public void i() {
        this.f3620a.f3626f.G();
    }

    public void j(boolean z10) {
        this.f3620a.f3626f.H(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f3620a.f3626f.J(menuItem);
    }

    public void l(Menu menu) {
        this.f3620a.f3626f.K(menu);
    }

    public void m() {
        this.f3620a.f3626f.M();
    }

    public void n(boolean z10) {
        this.f3620a.f3626f.N(z10);
    }

    public boolean o(Menu menu) {
        return this.f3620a.f3626f.O(menu);
    }

    public void p() {
        this.f3620a.f3626f.Q();
    }

    public void q() {
        this.f3620a.f3626f.R();
    }

    public void r() {
        this.f3620a.f3626f.T();
    }

    public boolean s() {
        return this.f3620a.f3626f.a0(true);
    }

    public n t() {
        return this.f3620a.f3626f;
    }

    public void u() {
        this.f3620a.f3626f.S0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3620a.f3626f.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f3620a;
        if (kVar instanceof p0) {
            kVar.f3626f.f1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f3620a.f3626f.h1();
    }
}
