package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.w0;
import com.google.firebase.auth.z0;
import java.util.concurrent.ScheduledExecutorService;
import k5.a;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzacg {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyj zzb;
    private final zzadu zzc;

    zzacg(f fVar, ScheduledExecutorService scheduledExecutorService) {
        q.k(fVar);
        Context m10 = fVar.m();
        q.k(m10);
        this.zzb = new zzyj(new zzacu(fVar, zzacr.zza()));
        this.zzc = new zzadu(m10, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zza(str, str2, new zzacd(zzace, zza));
    }

    public final void zzb(String str, String str2, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.k(zzace);
        this.zzb.zzb(str, str2, new zzacd(zzace, zza));
    }

    public final void zzc(String str, String str2, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.k(zzace);
        this.zzb.zzc(str, str2, new zzacd(zzace, zza));
    }

    public final void zzd(String str, String str2, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zzd(str, str2, new zzacd(zzace, zza));
    }

    public final void zze(String str, String str2, zzace zzace) {
        q.g(str);
        this.zzb.zze(str, str2, new zzacd(zzace, zza));
    }

    public final void zzf(String str, String str2, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.k(zzace);
        this.zzb.zzf(str, str2, new zzacd(zzace, zza));
    }

    public final void zze(String str, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zzf(str, new zzacd(zzace, zza));
    }

    public final void zza(zzxv zzxv, zzace zzace) {
        q.k(zzxv);
        q.g(zzxv.zza());
        q.g(zzxv.zzb());
        q.k(zzace);
        this.zzb.zza(zzxv.zza(), zzxv.zzb(), zzxv.zzc(), new zzacd(zzace, zza));
    }

    public final void zzd(String str, zzace zzace) {
        q.k(zzace);
        this.zzb.zze(str, new zzacd(zzace, zza));
    }

    public final void zzb(String str, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zzb(str, new zzacd(zzace, zza));
    }

    public final void zzc(String str, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zzc(str, new zzacd(zzace, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.k(zzace);
        q.k(zzace);
        this.zzb.zzb(str, str2, str3, str4, new zzacd(zzace, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.k(zzace);
        this.zzb.zza(str, str2, str3, str4, new zzacd(zzace, zza));
    }

    public final void zza(String str, zzace zzace) {
        q.g(str);
        q.k(zzace);
        this.zzb.zza(str, new zzacd(zzace, zza));
    }

    public final void zza(i0 i0Var, String str, String str2, String str3, zzace zzace) {
        zzaer zzaer;
        q.k(i0Var);
        q.h(str, "cachedTokenState should not be empty.");
        q.k(zzace);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            zzaer = zzaev.zza(str, (String) q.k(a10.zzc()), (String) q.k(a10.y()), str2, str3);
        } else if (i0Var instanceof w0) {
            w0 w0Var = (w0) i0Var;
            zzaer = zzaex.zza(str, q.g(str2), q.g(((z0) q.k(w0Var.a())).e()), q.g(w0Var.c()), str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zzaer, str, new zzacd(zzace, zza));
    }

    public final void zza(String str, i0 i0Var, String str2, zzace zzace) {
        q.g(str);
        q.k(i0Var);
        q.k(zzace);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            this.zzb.zza((zzaet) zzaeu.zza(str, (String) q.k(a10.zzc()), (String) q.k(a10.y()), str2), new zzacd(zzace, zza));
        } else if (i0Var instanceof w0) {
            w0 w0Var = (w0) i0Var;
            this.zzb.zza((zzaet) zzaew.zza(str, q.g(w0Var.c()), str2, q.g(w0Var.b())), new zzacd(zzace, zza));
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zza(zzxy zzxy, zzace zzace) {
        q.k(zzxy);
        this.zzb.zza(zzafg.zzb(), new zzacd(zzace, zza));
    }

    public final void zza(zzxx zzxx, zzace zzace) {
        q.k(zzxx);
        this.zzb.zza(zzafl.zza(zzxx.zzb(), zzxx.zza()), new zzacd(zzace, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzace zzace) {
        q.g(str);
        q.g(str2);
        q.g(str3);
        q.k(zzace);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacd(zzace, zza));
    }

    public final void zza(String str, zzagt zzagt, zzace zzace) {
        q.g(str);
        q.k(zzagt);
        q.k(zzace);
        this.zzb.zza(str, zzagt, new zzacd(zzace, zza));
    }

    public final void zza(zzya zzya, zzace zzace) {
        q.k(zzace);
        q.k(zzya);
        this.zzb.zza(q.g(zzya.zzb()), zzado.zza((o0) q.k(zzya.zza())), new zzacd(zzace, zza));
    }

    public final void zza(zzafz zzafz, zzace zzace) {
        q.k(zzafz);
        this.zzb.zza(zzafz, new zzacd(zzace, zza));
    }

    public final void zza(zzxz zzxz, zzace zzace) {
        q.k(zzxz);
        q.g(zzxz.zzb());
        q.k(zzace);
        this.zzb.zza(zzxz.zzb(), zzxz.zza(), new zzacd(zzace, zza));
    }

    public final void zza(zzyc zzyc, zzace zzace) {
        q.k(zzyc);
        q.g(zzyc.zzc());
        q.k(zzace);
        this.zzb.zza(zzyc.zzc(), zzyc.zza(), zzyc.zzd(), zzyc.zzb(), new zzacd(zzace, zza));
    }

    public final void zza(zzyb zzyb, zzace zzace) {
        q.k(zzace);
        q.k(zzyb);
        zzaga zzaga = (zzaga) q.k(zzyb.zza());
        String zzd = zzaga.zzd();
        zzacd zzacd = new zzacd(zzace, zza);
        if (this.zzc.zzd(zzd)) {
            if (zzaga.zze()) {
                this.zzc.zzc(zzd);
            } else {
                this.zzc.zzb(zzacd, zzd);
                return;
            }
        }
        long zzb2 = zzaga.zzb();
        boolean zzf = zzaga.zzf();
        if (zza(zzb2, zzf)) {
            zzaga.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzacd, zzb2, zzf);
        this.zzb.zza(zzaga, this.zzc.zza(zzacd, zzd));
    }

    public final void zza(zzye zzye, zzace zzace) {
        q.k(zzye);
        q.k(zzace);
        this.zzb.zzd(zzye.zza(), new zzacd(zzace, zza));
    }

    public final void zza(zzagt zzagt, zzace zzace) {
        q.k(zzagt);
        q.k(zzace);
        this.zzb.zza(zzagt, new zzacd(zzace, zza));
    }

    public final void zza(zzagu zzagu, zzace zzace) {
        q.k(zzagu);
        q.k(zzace);
        this.zzb.zza(zzagu, new zzacd(zzace, zza));
    }

    public final void zza(zzyd zzyd, zzace zzace) {
        q.k(zzyd);
        q.k(zzyd.zza());
        q.k(zzace);
        this.zzb.zza(zzyd.zza(), zzyd.zzb(), new zzacd(zzace, zza));
    }

    public final void zza(zzyg zzyg, zzace zzace) {
        q.k(zzace);
        q.k(zzyg);
        this.zzb.zza(zzado.zza((o0) q.k(zzyg.zza())), new zzacd(zzace, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzace zzace) {
        String str6 = str2;
        String str7 = str;
        q.h(str, "idToken should not be empty.");
        q.k(zzace);
        zzacd zzacd = new zzacd(zzace, zza);
        if (this.zzc.zzd(str2)) {
            if (z10) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacd, str2);
                return;
            }
        }
        zzagk zza2 = zzagk.zza(str, str2, str3, str4, str5, (String) null);
        long j11 = j10;
        if (zza(j10, z12)) {
            zza2.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacd, j10, z12);
        this.zzb.zza((zzagg) zza2, this.zzc.zza(zzacd, str2));
    }

    public final void zza(zzyf zzyf, zzace zzace) {
        q.k(zzyf);
        q.k(zzace);
        String phoneNumber = zzyf.zzb().getPhoneNumber();
        zzacd zzacd = new zzacd(zzace, zza);
        if (this.zzc.zzd(phoneNumber)) {
            if (zzyf.zzg()) {
                this.zzc.zzc(phoneNumber);
            } else {
                this.zzc.zzb(zzacd, phoneNumber);
                return;
            }
        }
        long zza2 = zzyf.zza();
        boolean zzh = zzyf.zzh();
        zzagi zza3 = zzagi.zza(zzyf.zzd(), zzyf.zzb().c(), zzyf.zzb().getPhoneNumber(), zzyf.zzc(), zzyf.zzf(), zzyf.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaee(this.zzc.zzb()));
        }
        this.zzc.zza(phoneNumber, zzacd, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacd, phoneNumber));
    }

    public final void zza(zzagm zzagm, zzace zzace) {
        this.zzb.zza((zzagg) zzagm, new zzacd((zzace) q.k(zzace), zza));
    }

    public final void zza(String str, String str2, String str3, zzace zzace) {
        q.h(str, "cachedTokenState should not be empty.");
        q.h(str2, "uid should not be empty.");
        q.k(zzace);
        this.zzb.zzb(str, str2, str3, new zzacd(zzace, zza));
    }

    public final void zza(String str, d1 d1Var, zzace zzace) {
        q.g(str);
        q.k(d1Var);
        q.k(zzace);
        this.zzb.zza(str, d1Var, new zzacd(zzace, zza));
    }

    public final void zza(zzyi zzyi, zzace zzace) {
        q.k(zzyi);
        this.zzb.zza(zzafe.zza(zzyi.zza(), zzyi.zzb(), zzyi.zzc()), new zzacd(zzace, zza));
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
