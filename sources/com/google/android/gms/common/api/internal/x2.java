package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zaq;
import h5.b;
import h5.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class x2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    protected volatile boolean f15325a;

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicReference<u2> f15326b = new AtomicReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final Handler f15327c = new zaq(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    protected final e f15328d;

    x2(i iVar, e eVar) {
        super(iVar);
        this.f15328d = eVar;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar, int i10) {
        this.f15326b.set((Object) null);
        b(bVar, i10);
    }

    /* access modifiers changed from: private */
    public final void d() {
        this.f15326b.set((Object) null);
        c();
    }

    private static final int e(u2 u2Var) {
        if (u2Var == null) {
            return -1;
        }
        return u2Var.a();
    }

    /* access modifiers changed from: protected */
    public abstract void b(b bVar, int i10);

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void h(b bVar, int i10) {
        u2 u2Var = new u2(bVar, i10);
        if (this.f15326b.compareAndSet((Object) null, u2Var)) {
            this.f15327c.post(new w2(this, u2Var));
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        u2 u2Var = this.f15326b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = this.f15328d.i(getActivity());
                if (i12 == 0) {
                    d();
                    return;
                } else if (u2Var != null) {
                    if (u2Var.b().v() == 18 && i12 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (u2Var != null) {
                int i13 = 13;
                if (intent != null) {
                    i13 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                a(new b(i13, (PendingIntent) null, u2Var.b().toString()), e(u2Var));
                return;
            }
            return;
        }
        if (u2Var != null) {
            a(u2Var.b(), u2Var.a());
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(new b(13, (PendingIntent) null), e(this.f15326b.get()));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f15326b.set(bundle.getBoolean("resolving_error", false) ? new u2(new b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u2 u2Var = this.f15326b.get();
        if (u2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", u2Var.a());
            bundle.putInt("failed_status", u2Var.b().v());
            bundle.putParcelable("failed_resolution", u2Var.b().x());
        }
    }

    public void onStart() {
        super.onStart();
        this.f15325a = true;
    }

    public void onStop() {
        super.onStop();
        this.f15325a = false;
    }
}
