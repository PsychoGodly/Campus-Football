package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class q9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24982a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24983b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ lb f24984c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzcv f24985d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ v8 f24986f;

    q9(v8 v8Var, String str, String str2, lb lbVar, zzcv zzcv) {
        this.f24986f = v8Var;
        this.f24982a = str;
        this.f24983b = str2;
        this.f24984c = lbVar;
        this.f24985d = zzcv;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            i w10 = this.f24986f.f25132d;
            if (w10 == null) {
                this.f24986f.zzj().B().c("Failed to get conditional properties; not connected to service", this.f24982a, this.f24983b);
                return;
            }
            q.k(this.f24984c);
            arrayList = ib.o0(w10.n(this.f24982a, this.f24983b, this.f24984c));
            this.f24986f.b0();
            this.f24986f.f().N(this.f24985d, arrayList);
        } catch (RemoteException e10) {
            this.f24986f.zzj().B().d("Failed to get conditional properties; remote exception", this.f24982a, this.f24983b, e10);
        } finally {
            this.f24986f.f().N(this.f24985d, arrayList);
        }
    }
}
