package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbqe extends zzbqf implements zzbhp {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcei zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbab zzk;
    private float zzl;
    private int zzm;

    public zzbqe(zzcei zzcei, Context context, zzbab zzbab) {
        super(zzcei, MaxReward.DEFAULT_LABEL);
        this.zzh = zzcei;
        this.zzi = context;
        this.zzk = zzbab;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcei zzcei = (zzcei) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        x.b();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbyt.zzw(displayMetrics, displayMetrics.widthPixels);
        x.b();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbyt.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi2 = this.zzh.zzi();
        if (zzi2 == null || zzi2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            t.r();
            int[] n10 = b2.n(zzi2);
            x.b();
            this.zzd = zzbyt.zzw(this.zza, n10[0]);
            x.b();
            this.zze = zzbyt.zzw(this.zza, n10[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbqd zzbqd = new zzbqd();
        zzbab zzbab = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbqd.zze(zzbab.zza(intent));
        zzbab zzbab2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbqd.zzc(zzbab2.zza(intent2));
        zzbqd.zza(this.zzk.zzb());
        zzbqd.zzd(this.zzk.zzc());
        zzbqd.zzb(true);
        boolean zzh2 = zzbqd.zza;
        boolean zzj2 = zzbqd.zzb;
        boolean zzf2 = zzbqd.zzc;
        boolean zzi3 = zzbqd.zzd;
        boolean zzg2 = zzbqd.zze;
        zzcei zzcei2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi3).put("inlineVideo", zzg2);
        } catch (JSONException e10) {
            zzbza.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        zzcei2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(x.b().zzb(this.zzi, iArr[0]), x.b().zzb(this.zzi, iArr[1]));
        if (zzbza.zzm(2)) {
            zzbza.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.zzi instanceof Activity) {
            t.r();
            i12 = b2.o((Activity) this.zzi)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) a0.c().zzb(zzbar.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = x.b().zzb(this.zzi, width);
                    this.zzg = x.b().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = x.b().zzb(this.zzi, width);
            this.zzg = x.b().zzb(this.zzi, i13);
        }
        zzf(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i10, i11);
    }
}
