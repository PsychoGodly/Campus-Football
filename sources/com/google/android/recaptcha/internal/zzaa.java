package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import kotlin.jvm.internal.h;
import pe.r0;
import xd.d;
import xd.g;
import ye.a;
import ye.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzaa implements RecaptchaClient, RecaptchaTasksClient {
    public static final zzw zza = new zzw((h) null);
    /* access modifiers changed from: private */
    public static zzaa zzb;
    /* access modifiers changed from: private */
    public static final String zzc = UUID.randomUUID().toString();
    /* access modifiers changed from: private */
    public static String zzd;
    /* access modifiers changed from: private */
    public static final a zze = c.b(false, 1, (Object) null);
    private final zzda zzf;

    public zzaa(zzda zzda) {
        this.zzf = zzda;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: execute-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m10executegIAlus(com.google.android.recaptcha.RecaptchaAction r6, xd.d<? super sd.o<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzx
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzx r0 = (com.google.android.recaptcha.internal.zzx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzx r0 = new com.google.android.recaptcha.internal.zzx
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r7)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r7)
            com.google.android.recaptcha.internal.zzp r7 = com.google.android.recaptcha.internal.zzp.zza
            pe.p0 r7 = com.google.android.recaptcha.internal.zzp.zzb()
            xd.g r7 = r7.getCoroutineContext()
            com.google.android.recaptcha.internal.zzy r2 = new com.google.android.recaptcha.internal.zzy
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.zzc = r3
            java.lang.Object r7 = pe.i.g(r7, r2, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            sd.o r7 = (sd.o) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaa.m10executegIAlus(com.google.android.recaptcha.RecaptchaAction, xd.d):java.lang.Object");
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        zzp zzp = zzp.zza;
        return zzb.zza(k.b(zzp.zzb(), (g) null, (r0) null, new zzz(this, recaptchaAction, (d) null), 3, (Object) null));
    }

    public final zzda zzb() {
        return this.zzf;
    }
}
