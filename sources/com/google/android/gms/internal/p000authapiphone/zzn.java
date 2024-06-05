package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzn extends e<a.d.c> {
    private static final a.g<zzv> zza;
    private static final a.C0154a<zzv, a.d.c> zzb;
    private static final a<a.d.c> zzc;

    static {
        a.g<zzv> gVar = new a.g<>();
        zza = gVar;
        zzr zzr = new zzr();
        zzb = zzr;
        zzc = new a<>("SmsCodeAutofill.API", zzr, gVar);
    }

    public zzn(Context context) {
        super(context, zzc, null, e.a.f15026c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(s.a().d(zzaa.zza).b(new zzp(this)).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(String str) {
        q.k(str);
        q.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(s.a().d(zzaa.zza).b(new zzo(this, str)).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(s.a().d(zzaa.zza).b(new zzm(this)).a());
    }

    public zzn(Activity activity) {
        super(activity, zzc, null, e.a.f15026c);
    }
}
