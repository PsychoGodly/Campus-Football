package com.onesignal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import com.onesignal.a;
import com.onesignal.k3;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: OSSystemConditionController */
class y2 {

    /* renamed from: b  reason: collision with root package name */
    private static final String f28449b = "com.onesignal.y2";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f28450a;

    /* compiled from: OSSystemConditionController */
    class a extends n.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f28451a;

        a(n nVar) {
            this.f28451a = nVar;
        }

        public void e(n nVar, Fragment fragment) {
            super.e(nVar, fragment);
            if (fragment instanceof d) {
                this.f28451a.p1(this);
                y2.this.f28450a.c();
            }
        }
    }

    /* compiled from: OSSystemConditionController */
    interface b {
        void a(String str, a.c cVar);
    }

    /* compiled from: OSSystemConditionController */
    interface c {
        void c();
    }

    y2(c cVar) {
        this.f28450a = cVar;
    }

    /* access modifiers changed from: package-private */
    public boolean b(Context context) throws NoClassDefFoundError {
        if (!(context instanceof androidx.appcompat.app.d)) {
            return false;
        }
        n supportFragmentManager = ((androidx.appcompat.app.d) context).getSupportFragmentManager();
        supportFragmentManager.a1(new a(supportFragmentManager), true);
        List<Fragment> s02 = supportFragmentManager.s0();
        int size = s02.size();
        if (size <= 0) {
            return false;
        }
        Fragment fragment = s02.get(size - 1);
        if (!fragment.e0() || !(fragment instanceof d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (k3.Z() == null) {
            k3.A1(k3.r0.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (b(k3.Z())) {
                k3.A1(k3.r0.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e10) {
            k3.r0 r0Var = k3.r0.INFO;
            k3.A1(r0Var, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e10);
        }
        a b10 = b.b();
        boolean l10 = h3.l(new WeakReference(k3.Z()));
        if (l10 && b10 != null) {
            b10.d(f28449b, this.f28450a);
            k3.A1(k3.r0.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !l10;
    }
}
