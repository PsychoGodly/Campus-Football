package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.jvm.internal.h;
import sd.s;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzh extends Exception {
    public static final zzg zza = new zzg((h) null);
    /* access modifiers changed from: private */
    public static final Map zzb;
    private final zzf zzc;
    private final zzd zzd;
    private final Map zze = k0.j(s.a(zzf.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, (String) null, 2, (h) null)), s.a(zzf.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, (String) null, 2, (h) null)), s.a(zzf.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, (String) null, 2, (h) null)), s.a(zzf.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, (String) null, 2, (h) null)), s.a(zzf.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, (String) null, 2, (h) null)), s.a(zzf.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (h) null)));

    static {
        zzmf zzmf = zzmf.JS_INTERNAL_ERROR;
        zzf zzf = zzf.zzc;
        zzb = k0.j(s.a(zzmf.JS_NETWORK_ERROR, new zzh(zzf.zze, zzd.zzm)), s.a(zzmf, new zzh(zzf, zzd.zzk)), s.a(zzmf.JS_INVALID_SITE_KEY, new zzh(zzf.zzf, zzd.zzn)), s.a(zzmf.JS_INVALID_SITE_KEY_TYPE, new zzh(zzf.zzg, zzd.zzo)), s.a(zzmf.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzh(zzf.zzh, zzd.zzp)), s.a(zzmf.JS_INVALID_ACTION, new zzh(zzf.zzi, zzd.zzq)), s.a(zzmf.JS_PROGRAM_ERROR, new zzh(zzf, zzd.zzv)));
    }

    public zzh(zzf zzf, zzd zzd2) {
        this.zzc = zzf;
        this.zzd = zzd2;
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final zzf zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        RecaptchaException recaptchaException = (RecaptchaException) this.zze.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.UNKNOWN_ERROR, (String) null, 2, (h) null) : recaptchaException;
    }
}
