package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;
import java.util.Map;
import q5.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbmv extends zzcfy {
    private final a zza;

    zzbmv(a aVar) {
        this.zza = aVar;
    }

    public final int zzb(String str) throws RemoteException {
        return this.zza.l(str);
    }

    public final long zzc() throws RemoteException {
        return this.zza.d();
    }

    public final Bundle zzd(Bundle bundle) throws RemoteException {
        return this.zza.p(bundle);
    }

    public final String zze() throws RemoteException {
        return this.zza.e();
    }

    public final String zzf() throws RemoteException {
        return this.zza.f();
    }

    public final String zzg() throws RemoteException {
        return this.zza.h();
    }

    public final String zzh() throws RemoteException {
        return this.zza.i();
    }

    public final String zzi() throws RemoteException {
        return this.zza.j();
    }

    public final List zzj(String str, String str2) throws RemoteException {
        return this.zza.g(str, str2);
    }

    public final Map zzk(String str, String str2, boolean z10) throws RemoteException {
        return this.zza.m(str, str2, z10);
    }

    public final void zzl(String str) throws RemoteException {
        this.zza.a(str);
    }

    public final void zzm(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.b(str, str2, bundle);
    }

    public final void zzn(String str) throws RemoteException {
        this.zza.c(str);
    }

    public final void zzo(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.n(str, str2, bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zza.o(bundle);
    }

    public final void zzq(Bundle bundle) throws RemoteException {
        this.zza.q(bundle);
    }

    public final void zzr(Bundle bundle) throws RemoteException {
        this.zza.r(bundle);
    }

    public final void zzs(com.google.android.gms.dynamic.a aVar, String str, String str2) throws RemoteException {
        this.zza.s(aVar != null ? (Activity) b.A1(aVar) : null, str, str2);
    }

    public final void zzt(String str, String str2, com.google.android.gms.dynamic.a aVar) throws RemoteException {
        this.zza.t(str, str2, aVar != null ? b.A1(aVar) : null);
    }
}
