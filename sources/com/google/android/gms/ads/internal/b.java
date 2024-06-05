package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbwb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14404a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14405b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbwb f14406c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbst f14407d = new zzbst(false, Collections.emptyList());

    public b(Context context, zzbwb zzbwb, zzbst zzbst) {
        this.f14404a = context;
        this.f14406c = zzbwb;
    }

    private final boolean d() {
        zzbwb zzbwb = this.f14406c;
        return (zzbwb != null && zzbwb.zza().zzf) || this.f14407d.zza;
    }

    public final void a() {
        this.f14405b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = MaxReward.DEFAULT_LABEL;
            }
            zzbwb zzbwb = this.f14406c;
            if (zzbwb != null) {
                zzbwb.zzd(str, (Map) null, 3);
                return;
            }
            zzbst zzbst = this.f14407d;
            if (zzbst.zza && (list = zzbst.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        t.r();
                        b2.h(this.f14404a, MaxReward.DEFAULT_LABEL, replace);
                    }
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f14405b;
    }
}
