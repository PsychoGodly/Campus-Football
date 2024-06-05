package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.core.util.h;

/* compiled from: FragmentHostCallback */
public abstract class k<E> extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3622a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3623b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f3624c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3625d;

    /* renamed from: f  reason: collision with root package name */
    final n f3626f;

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    public View c(int i10) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f3622a;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f3623b;
    }

    /* access modifiers changed from: package-private */
    public Handler g() {
        return this.f3624c;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f3623b);
    }

    public boolean j(Fragment fragment) {
        return true;
    }

    public void k(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            a.startActivity(this.f3623b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void l(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            b.l(this.f3622a, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void m() {
    }

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f3626f = new o();
        this.f3622a = activity;
        this.f3623b = (Context) h.g(context, "context == null");
        this.f3624c = (Handler) h.g(handler, "handler == null");
        this.f3625d = i10;
    }
}
