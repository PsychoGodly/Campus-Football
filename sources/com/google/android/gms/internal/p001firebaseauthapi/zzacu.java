package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import y6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzacu extends zzadi implements zzaef {
    private zzaco zza;
    private zzacn zzb;
    private zzadq zzc;
    private final zzacr zzd;
    private final f zze;
    private String zzf;
    private zzact zzg;

    zzacu(f fVar, zzacr zzacr) {
        this(fVar, zzacr, (zzadq) null, (zzaco) null, (zzacn) null);
    }

    private final zzact zzb() {
        if (this.zzg == null) {
            this.zzg = new zzact(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    public final void zza(zzaek zzaek, zzadk<zzaen> zzadk) {
        q.k(zzaek);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/createAuthUri", this.zzf), zzaek, zzadk, zzaen.class, zzaco.zza);
    }

    private zzacu(f fVar, zzacr zzacr, zzadq zzadq, zzaco zzaco, zzacn zzacn) {
        this.zze = fVar;
        this.zzf = fVar.r().b();
        this.zzd = (zzacr) q.k(zzacr);
        zza((zzadq) null, (zzaco) null, (zzacn) null);
        zzaed.zza(this.zzf, this);
    }

    public final void zza(zzaem zzaem, zzadk<Void> zzadk) {
        q.k(zzaem);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/deleteAccount", this.zzf), zzaem, zzadk, Void.class, zzaco.zza);
    }

    public final void zza(zzaep zzaep, zzadk<zzaeo> zzadk) {
        q.k(zzaep);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/emailLinkSignin", this.zzf), zzaep, zzadk, zzaeo.class, zzaco.zza);
    }

    public final void zza(zzaer zzaer, zzadk<zzaeq> zzadk) {
        q.k(zzaer);
        q.k(zzadk);
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaer, zzadk, zzaeq.class, zzacn.zza);
    }

    public final void zza(zzaet zzaet, zzadk<zzaes> zzadk) {
        q.k(zzaet);
        q.k(zzadk);
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaet, zzadk, zzaes.class, zzacn.zza);
    }

    public final void zza(zzafb zzafb, zzadk<zzafn> zzadk) {
        q.k(zzafb);
        q.k(zzadk);
        zzadq zzadq = this.zzc;
        zzadn.zza(zzadq.zza("/token", this.zzf), zzafb, zzadk, zzafn.class, zzadq.zza);
    }

    public final void zza(zzafa zzafa, zzadk<zzafd> zzadk) {
        q.k(zzafa);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/getAccountInfo", this.zzf), zzafa, zzadk, zzafd.class, zzaco.zza);
    }

    public final void zza(zzafe zzafe, zzadk<zzafh> zzadk) {
        q.k(zzafe);
        q.k(zzadk);
        if (zzafe.zzb() != null) {
            zzb().zzb(zzafe.zzb().zze());
        }
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/getOobConfirmationCode", this.zzf), zzafe, zzadk, zzafh.class, zzaco.zza);
    }

    public final void zza(zzafg zzafg, zzadk<zzafj> zzadk) {
        q.k(zzafg);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/getRecaptchaParam", this.zzf), zzadk, zzafj.class, zzaco.zza);
    }

    public final void zza(zzafl zzafl, zzadk<zzafk> zzadk) {
        q.k(zzafl);
        q.k(zzadk);
        zzacn zzacn = this.zzb;
        String zza2 = zzacn.zza("/recaptchaConfig", this.zzf);
        String zzb2 = zzafl.zzb();
        String zzc2 = zzafl.zzc();
        zzadn.zza(zza2 + "&clientType=" + zzb2 + "&version=" + zzc2, zzadk, zzafk.class, zzacn.zza);
    }

    public final void zza() {
        zza((zzadq) null, (zzaco) null, (zzacn) null);
    }

    public final void zza(zzafx zzafx, zzadk<zzafw> zzadk) {
        q.k(zzafx);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/resetPassword", this.zzf), zzafx, zzadk, zzafw.class, zzaco.zza);
    }

    public final void zza(zzafz zzafz, zzadk<zzagb> zzadk) {
        q.k(zzafz);
        q.k(zzadk);
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts:revokeToken", this.zzf), zzafz, zzadk, zzagb.class, zzacn.zza);
    }

    public final void zza(zzaga zzaga, zzadk<zzagd> zzadk) {
        q.k(zzaga);
        q.k(zzadk);
        if (!TextUtils.isEmpty(zzaga.zzc())) {
            zzb().zzb(zzaga.zzc());
        }
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/sendVerificationCode", this.zzf), zzaga, zzadk, zzagd.class, zzaco.zza);
    }

    public final void zza(zzagc zzagc, zzadk<zzagf> zzadk) {
        q.k(zzagc);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/setAccountInfo", this.zzf), zzagc, zzadk, zzagf.class, zzaco.zza);
    }

    public final void zza(String str, zzadk<Void> zzadk) {
        q.k(zzadk);
        zzb().zza(str);
        zzadk.zza(null);
    }

    public final void zza(zzage zzage, zzadk<zzagh> zzadk) {
        q.k(zzage);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/signupNewUser", this.zzf), zzage, zzadk, zzagh.class, zzaco.zza);
    }

    public final void zza(zzagg zzagg, zzadk<zzagj> zzadk) {
        q.k(zzagg);
        q.k(zzadk);
        if (zzagg instanceof zzagk) {
            zzagk zzagk = (zzagk) zzagg;
            if (!TextUtils.isEmpty(zzagk.zzb())) {
                zzb().zzb(zzagk.zzb());
            }
        }
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts/mfaEnrollment:start", this.zzf), zzagg, zzadk, zzagj.class, zzacn.zza);
    }

    public final void zza(zzagi zzagi, zzadk<zzagl> zzadk) {
        q.k(zzagi);
        q.k(zzadk);
        if (!TextUtils.isEmpty(zzagi.zzb())) {
            zzb().zzb(zzagi.zzb());
        }
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts/mfaSignIn:start", this.zzf), zzagi, zzadk, zzagl.class, zzacn.zza);
    }

    private final void zza(zzadq zzadq, zzaco zzaco, zzacn zzacn) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza2 = zzaea.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzaed.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza2);
        }
        if (this.zzc == null) {
            this.zzc = new zzadq(zza2, zzb());
        }
        String zza3 = zzaea.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzaed.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza3);
        }
        if (this.zza == null) {
            this.zza = new zzaco(zza3, zzb());
        }
        String zza4 = zzaea.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza4)) {
            zza4 = zzaed.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza4);
        }
        if (this.zzb == null) {
            this.zzb = new zzacn(zza4, zzb());
        }
    }

    public final void zza(zzagt zzagt, zzadk<zzagv> zzadk) {
        q.k(zzagt);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/verifyAssertion", this.zzf), zzagt, zzadk, zzagv.class, zzaco.zza);
    }

    public final void zza(zzagu zzagu, zzadk<zzagx> zzadk) {
        q.k(zzagu);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/verifyCustomToken", this.zzf), zzagu, zzadk, zzagx.class, zzaco.zza);
    }

    public final void zza(zzagw zzagw, zzadk<zzagz> zzadk) {
        q.k(zzagw);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/verifyPassword", this.zzf), zzagw, zzadk, zzagz.class, zzaco.zza);
    }

    public final void zza(zzagy zzagy, zzadk<zzahb> zzadk) {
        q.k(zzagy);
        q.k(zzadk);
        zzaco zzaco = this.zza;
        zzadn.zza(zzaco.zza("/verifyPhoneNumber", this.zzf), zzagy, zzadk, zzahb.class, zzaco.zza);
    }

    public final void zza(zzaha zzaha, zzadk<zzahd> zzadk) {
        q.k(zzaha);
        q.k(zzadk);
        zzacn zzacn = this.zzb;
        zzadn.zza(zzacn.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaha, zzadk, zzahd.class, zzacn.zza);
    }
}
