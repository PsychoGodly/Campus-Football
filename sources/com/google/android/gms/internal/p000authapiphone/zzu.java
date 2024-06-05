package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.Task;
import d5.b;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzu  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzu extends b {
    public zzu(Context context) {
        super(context);
    }

    public final Task<Void> startSmsRetriever() {
        return doWrite(s.a().b(new zzx(this)).d(zzaa.zzb).a());
    }

    public final Task<Void> startSmsUserConsent(String str) {
        return doWrite(s.a().b(new zzw(this, str)).d(zzaa.zzc).a());
    }

    public zzu(Activity activity) {
        super(activity);
    }
}
