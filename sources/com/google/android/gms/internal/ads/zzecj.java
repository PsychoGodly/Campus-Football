package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import t4.c0;
import t4.e0;
import t4.i;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzecj implements zzeat {
    private final Context zza;
    private final zzddw zzb;
    private final Executor zzc;
    private final zzeyb zzd;

    public zzecj(Context context, Executor executor, zzddw zzddw, zzeyb zzeyb) {
        this.zza = context;
        this.zzb = zzddw;
        this.zzc = executor;
        this.zzd = zzeyb;
    }

    private static String zzd(zzeyc zzeyc) {
        try {
            return zzeyc.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzfut zza(zzeyo zzeyo, zzeyc zzeyc) {
        String zzd2 = zzd(zzeyc);
        return zzfuj.zzm(zzfuj.zzh((Object) null), new zzech(this, zzd2 != null ? Uri.parse(zzd2) : null, zzeyo, zzeyc), this.zzc);
    }

    public final boolean zzb(zzeyo zzeyo, zzeyc zzeyc) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbbs.zzg(context) && !TextUtils.isEmpty(zzd(zzeyc));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(Uri uri, zzeyo zzeyo, zzeyc zzeyc, Object obj) throws Exception {
        try {
            d b10 = new d.b().b();
            b10.f1921a.setData(uri);
            i iVar = new i(b10.f1921a, (c0) null);
            zzbzs zzbzs = new zzbzs();
            zzdcw zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, (String) null), new zzdcz(new zzeci(zzbzs), (zzcei) null));
            zzbzs.zzd(new AdOverlayInfoParcel(iVar, (a) null, zze.zza(), (e0) null, new zzbzg(0, 0, false, false, false), (zzcei) null, (zzdcc) null));
            this.zzd.zza();
            return zzfuj.zzh(zze.zzg());
        } catch (Throwable th) {
            zzbza.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
