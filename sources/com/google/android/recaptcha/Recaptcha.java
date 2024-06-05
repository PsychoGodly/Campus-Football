package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzp;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        zzp zzp = zzp.zza;
        return zzb.zza(k.b(zzp.zzb(), (g) null, (r0) null, new Recaptcha$getTasksClient$1(application, str, (d) null), 3, (Object) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: getClient-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m8getClient0E7RQCE(android.app.Application r6, java.lang.String r7, xd.d<? super sd.o<? extends com.google.android.recaptcha.RecaptchaClient>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            sd.p.b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x0051
        L_0x0029:
            r6 = move-exception
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            sd.p.b(r8)
            sd.o$a r8 = sd.o.f38128b     // Catch:{ all -> 0x0029 }
            com.google.android.recaptcha.internal.zzp r8 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ all -> 0x0029 }
            pe.p0 r8 = com.google.android.recaptcha.internal.zzp.zzb()     // Catch:{ all -> 0x0029 }
            xd.g r8 = r8.getCoroutineContext()     // Catch:{ all -> 0x0029 }
            com.google.android.recaptcha.Recaptcha$getClient$2$1 r2 = new com.google.android.recaptcha.Recaptcha$getClient$2$1     // Catch:{ all -> 0x0029 }
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch:{ all -> 0x0029 }
            r0.zzc = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r8 = pe.i.g(r8, r2, r0)     // Catch:{ all -> 0x0029 }
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            com.google.android.recaptcha.internal.zzaa r8 = (com.google.android.recaptcha.internal.zzaa) r8     // Catch:{ all -> 0x0029 }
            java.lang.Object r6 = sd.o.b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x0062
        L_0x0058:
            sd.o$a r7 = sd.o.f38128b
            java.lang.Object r6 = sd.p.a(r6)
            java.lang.Object r6 = sd.o.b(r6)
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m8getClient0E7RQCE(android.app.Application, java.lang.String, xd.d):java.lang.Object");
    }
}
