package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class n8 extends ua {
    public n8(va vaVar) {
        super(vaVar);
    }

    private static String b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    public final byte[] t(d0 d0Var, String str) {
        jb jbVar;
        zzfi.zzi.zza zza;
        Bundle bundle;
        zzfi.zzj.zza zza2;
        r5 r5Var;
        byte[] bArr;
        a0 a0Var;
        long j10;
        d0 d0Var2 = d0Var;
        String str2 = str;
        i();
        this.f25124a.L();
        q.k(d0Var);
        q.g(str);
        if (!a().w(str2, e0.f24503f0)) {
            zzj().A().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(d0Var2.f24457a) || "_iapx".equals(d0Var2.f24457a)) {
            zzfi.zzi.zza zzb = zzfi.zzi.zzb();
            l().L0();
            r5 y02 = l().y0(str2);
            if (y02 == null) {
                zzj().A().b("Log and bundle not available. package_name", str2);
                byte[] bArr2 = new byte[0];
                l().M0();
                return bArr2;
            } else if (!y02.r()) {
                zzj().A().b("Log and bundle disabled. package_name", str2);
                byte[] bArr3 = new byte[0];
                l().M0();
                return bArr3;
            } else {
                zzfi.zzj.zza zzp = zzfi.zzj.zzu().zzg(1).zzp("android");
                if (!TextUtils.isEmpty(y02.t0())) {
                    zzp.zzb(y02.t0());
                }
                if (!TextUtils.isEmpty(y02.v0())) {
                    zzp.zzd((String) q.k(y02.v0()));
                }
                if (!TextUtils.isEmpty(y02.h())) {
                    zzp.zze((String) q.k(y02.h()));
                }
                if (y02.z() != -2147483648L) {
                    zzp.zze((int) y02.z());
                }
                zzp.zzf(y02.g0()).zzd(y02.c0());
                String j11 = y02.j();
                String r02 = y02.r0();
                if (!TextUtils.isEmpty(j11)) {
                    zzp.zzm(j11);
                } else if (!TextUtils.isEmpty(r02)) {
                    zzp.zza(r02);
                }
                zzp.zzj(y02.p0());
                y6 L = this.f25029b.L(str2);
                zzp.zzc(y02.a0());
                if (this.f25124a.k() && a().F(zzp.zzr()) && L.x() && !TextUtils.isEmpty((CharSequence) null)) {
                    zzp.zzj((String) null);
                }
                zzp.zzg(L.v());
                if (L.x() && y02.q()) {
                    Pair<String, Boolean> u10 = n().u(y02.t0(), L);
                    if (y02.q() && u10 != null && !TextUtils.isEmpty((CharSequence) u10.first)) {
                        try {
                            zzp.zzq(b((String) u10.first, Long.toString(d0Var2.f24460d)));
                            Object obj = u10.second;
                            if (obj != null) {
                                zzp.zzc(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            zzj().A().b("Resettable device id encryption failed", e10.getMessage());
                            return new byte[0];
                        } finally {
                            l().M0();
                        }
                    }
                }
                c().j();
                zzfi.zzj.zza zzi = zzp.zzi(Build.MODEL);
                c().j();
                zzi.zzo(Build.VERSION.RELEASE).zzi((int) c().q()).zzs(c().r());
                try {
                    if (L.y() && y02.u0() != null) {
                        zzp.zzc(b((String) q.k(y02.u0()), Long.toString(d0Var2.f24460d)));
                    }
                    if (!TextUtils.isEmpty(y02.i())) {
                        zzp.zzl((String) q.k(y02.i()));
                    }
                    String t02 = y02.t0();
                    List<jb> H0 = l().H0(t02);
                    Iterator<jb> it = H0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jbVar = null;
                            break;
                        }
                        jbVar = it.next();
                        if ("_lte".equals(jbVar.f24733c)) {
                            break;
                        }
                    }
                    if (jbVar == null || jbVar.f24735e == null) {
                        jb jbVar2 = new jb(t02, "auto", "_lte", zzb().a(), 0L);
                        H0.add(jbVar2);
                        l().Z(jbVar2);
                    }
                    zzfi.zzn[] zznArr = new zzfi.zzn[H0.size()];
                    for (int i10 = 0; i10 < H0.size(); i10++) {
                        zzfi.zzn.zza zzb2 = zzfi.zzn.zze().zza(H0.get(i10).f24733c).zzb(H0.get(i10).f24734d);
                        j().P(zzb2, H0.get(i10).f24735e);
                        zznArr[i10] = (zzfi.zzn) ((zzix) zzb2.zzab());
                    }
                    zzp.zze((Iterable<? extends zzfi.zzn>) Arrays.asList(zznArr));
                    j().O(zzp);
                    if (zznp.zza() && a().n(e0.T0)) {
                        this.f25029b.q(y02, zzp);
                    }
                    r4 b10 = r4.b(d0Var);
                    f().H(b10.f24995d, l().v0(str2));
                    f().Q(b10, a().t(str2));
                    Bundle bundle2 = b10.f24995d;
                    bundle2.putLong("_c", 1);
                    zzj().A().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", d0Var2.f24459c);
                    if (f().A0(zzp.zzr())) {
                        f().I(bundle2, "_dbg", 1L);
                        f().I(bundle2, "_r", 1L);
                    }
                    a0 x02 = l().x0(str2, d0Var2.f24457a);
                    if (x02 == null) {
                        zza2 = zzp;
                        bundle = bundle2;
                        r5Var = y02;
                        zza = zzb;
                        bArr = null;
                        a0Var = new a0(str, d0Var2.f24457a, 0, 0, d0Var2.f24460d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j10 = 0;
                    } else {
                        zza2 = zzp;
                        bundle = bundle2;
                        r5Var = y02;
                        zza = zzb;
                        bArr = null;
                        j10 = x02.f24342f;
                        a0Var = x02.a(d0Var2.f24460d);
                    }
                    l().P(a0Var);
                    w wVar = new w(this.f25124a, d0Var2.f24459c, str, d0Var2.f24457a, d0Var2.f24460d, j10, bundle);
                    zzfi.zze.zza zza3 = zzfi.zze.zze().zzb(wVar.f25175d).zza(wVar.f25173b).zza(wVar.f25176e);
                    Iterator<String> it2 = wVar.f25177f.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        zzfi.zzg.zza zza4 = zzfi.zzg.zze().zza(next);
                        Object y10 = wVar.f25177f.y(next);
                        if (y10 != null) {
                            j().N(zza4, y10);
                            zza3.zza(zza4);
                        }
                    }
                    zzfi.zzj.zza zza5 = zza2;
                    zza5.zza(zza3).zza(zzfi.zzk.zza().zza(zzfi.zzf.zza().zza(a0Var.f24339c).zza(d0Var2.f24457a)));
                    zza5.zza((Iterable<? extends zzfi.zzc>) k().u(r5Var.t0(), Collections.emptyList(), zza5.zzx(), Long.valueOf(zza3.zzc()), Long.valueOf(zza3.zzc())));
                    if (zza3.zzg()) {
                        zza5.zzi(zza3.zzc()).zze(zza3.zzc());
                    }
                    long i02 = r5Var.i0();
                    int i11 = (i02 > 0 ? 1 : (i02 == 0 ? 0 : -1));
                    if (i11 != 0) {
                        zza5.zzg(i02);
                    }
                    long m02 = r5Var.m0();
                    if (m02 != 0) {
                        zza5.zzh(m02);
                    } else if (i11 != 0) {
                        zza5.zzh(i02);
                    }
                    String m10 = r5Var.m();
                    if (zzps.zza()) {
                        if (a().w(str, e0.f24541y0) && m10 != null) {
                            zza5.zzr(m10);
                        }
                    } else {
                        String str3 = str;
                    }
                    r5Var.p();
                    zza5.zzf((int) r5Var.k0()).zzl(82001).zzk(zzb().a()).zzd(true);
                    if (a().n(e0.C0)) {
                        this.f25029b.v(zza5.zzr(), zza5);
                    }
                    zzfi.zzi.zza zza6 = zza;
                    zza6.zza(zza5);
                    r5 r5Var2 = r5Var;
                    r5Var2.j0(zza5.zzd());
                    r5Var2.f0(zza5.zzc());
                    l().Q(r5Var2);
                    l().O0();
                    try {
                        return j().b0(((zzfi.zzi) ((zzix) zza6.zzab())).zzbv());
                    } catch (IOException e11) {
                        zzj().B().c("Data loss. Failed to bundle and serialize. appId", n4.q(str), e11);
                        return bArr;
                    }
                } catch (SecurityException e12) {
                    zzj().A().b("app instance id encryption failed", e12.getMessage());
                    byte[] bArr4 = new byte[0];
                    l().M0();
                    return bArr4;
                }
            }
        } else {
            zzj().A().c("Generating a payload for this event is not available. package_name, event_name", str2, d0Var2.f24457a);
            return null;
        }
    }
}
