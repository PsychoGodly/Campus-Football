package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.firebase.auth.o0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.a;
import o5.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzadu {
    /* access modifiers changed from: private */
    public static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap<String, zzaeb> zzd = new HashMap<>();

    zzadu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public final void zze(String str) {
        zzaeb zzaeb = this.zzd.get(str);
        if (zzaeb != null && !zzaeb.zzh && !zzag.zzc(zzaeb.zzd)) {
            zza.h("Timed out waiting for SMS.", new Object[0]);
            for (zzacd zza2 : zzaeb.zzb) {
                zza2.zza(zzaeb.zzd);
            }
            zzaeb.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzf */
    public final void zzb(String str) {
        zzaeb zzaeb = this.zzd.get(str);
        if (zzaeb != null) {
            if (!zzaeb.zzi) {
                zze(str);
            }
            zzc(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzacd zza(zzacd zzacd, String str) {
        return new zzadz(this, zzacd, str);
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = c.a(this.zzb).f(packageName, 64).signatures;
            } else {
                signatureArr = c.a(this.zzb).f(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zza2 = zza(packageName, signatureArr[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzaeb zzaeb = this.zzd.get(str);
        if (zzaeb != null) {
            ScheduledFuture<?> scheduledFuture = zzaeb.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzaeb.zzf.cancel(false);
            }
            zzaeb.zzb.clear();
            this.zzd.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }

    static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str3.getBytes(zzq.zza));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.c("NoSuchAlgorithm: " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzacd zzacd, String str) {
        zzaeb zzaeb = this.zzd.get(str);
        if (zzaeb != null) {
            zzaeb.zzb.add(zzacd);
            if (zzaeb.zzg) {
                zzacd.zzb(zzaeb.zzd);
            }
            if (zzaeb.zzh) {
                zzacd.zza(o0.z(zzaeb.zzd, zzaeb.zze));
            }
            if (zzaeb.zzi) {
                zzacd.zza(zzaeb.zzd);
            }
        }
    }

    static /* synthetic */ void zza(zzadu zzadu, String str) {
        zzaeb zzaeb = zzadu.zzd.get(str);
        if (zzaeb != null && !zzag.zzc(zzaeb.zzd) && !zzag.zzc(zzaeb.zze) && !zzaeb.zzb.isEmpty()) {
            for (zzacd zza2 : zzaeb.zzb) {
                zza2.zza(o0.z(zzaeb.zzd, zzaeb.zze));
            }
            zzaeb.zzh = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzacd zzacd, long j10, boolean z10) {
        this.zzd.put(str, new zzaeb(j10, z10));
        zzb(zzacd, str);
        zzaeb zzaeb = this.zzd.get(str);
        if (zzaeb.zza <= 0) {
            zza.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeb.zzf = this.zzc.schedule(new zzadx(this, str), zzaeb.zza, TimeUnit.SECONDS);
        if (!zzaeb.zzc) {
            zza.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzady zzady = new zzady(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzady, intentFilter);
        d5.a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzadw(this));
    }
}
