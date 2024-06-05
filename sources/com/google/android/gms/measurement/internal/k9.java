package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class k9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d0 f24750a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24751b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcv f24752c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v8 f24753d;

    k9(v8 v8Var, d0 d0Var, String str, zzcv zzcv) {
        this.f24753d = v8Var;
        this.f24750a = d0Var;
        this.f24751b = str;
        this.f24752c = zzcv;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            i w10 = this.f24753d.f25132d;
            if (w10 == null) {
                this.f24753d.zzj().B().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = w10.n0(this.f24750a, this.f24751b);
            this.f24753d.b0();
            this.f24753d.f().P(this.f24752c, bArr);
        } catch (RemoteException e10) {
            this.f24753d.zzj().B().b("Failed to send event to the service to bundle", e10);
        } finally {
            this.f24753d.f().P(this.f24752c, bArr);
        }
    }
}
