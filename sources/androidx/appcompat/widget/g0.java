package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* compiled from: DecorToolbar */
public interface g0 {
    void a(Drawable drawable);

    void b(Menu menu, m.a aVar);

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    int getVisibility();

    boolean h();

    void i();

    void j(s0 s0Var);

    boolean k();

    void l(int i10);

    Menu m();

    void n(int i10);

    int o();

    androidx.core.view.g0 p(int i10, long j10);

    void q(m.a aVar, g.a aVar2);

    void r(int i10);

    ViewGroup s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z10);

    int u();

    void v();

    void w();

    void x(boolean z10);
}
