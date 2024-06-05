package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.o3;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w0;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n4.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdjj {
    private final Context zza;
    private final zzdis zzb;
    private final zzapw zzc;
    private final zzbzg zzd;
    private final a zze;
    private final zzawe zzf;
    private final Executor zzg;
    private final zzbdl zzh;
    private final zzdkb zzi;
    private final zzdmq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdll zzl;
    private final zzdpi zzm;
    private final zzfdk zzn;
    private final zzfff zzo;
    private final zzeaf zzp;

    public zzdjj(Context context, zzdis zzdis, zzapw zzapw, zzbzg zzbzg, a aVar, zzawe zzawe, Executor executor, zzeyx zzeyx, zzdkb zzdkb, zzdmq zzdmq, ScheduledExecutorService scheduledExecutorService, zzdpi zzdpi, zzfdk zzfdk, zzfff zzfff, zzeaf zzeaf, zzdll zzdll) {
        this.zza = context;
        this.zzb = zzdis;
        this.zzc = zzapw;
        this.zzd = zzbzg;
        this.zze = aVar;
        this.zzf = zzawe;
        this.zzg = executor;
        this.zzh = zzeyx.zzi;
        this.zzi = zzdkb;
        this.zzj = zzdmq;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdpi;
        this.zzn = zzfdk;
        this.zzo = zzfff;
        this.zzp = zzeaf;
        this.zzl = zzdll;
    }

    public static final o3 zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfqk.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfqk.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            o3 zzr = zzr(optJSONArray.optJSONObject(i10));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfqk.zzm(arrayList);
    }

    private final z4 zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return z4.w();
            }
            i10 = 0;
        }
        return new z4(this.zza, new h(i10, i11));
    }

    private static zzfut zzl(zzfut zzfut, Object obj) {
        return zzfuj.zzf(zzfut, Exception.class, new zzdjg((Object) null), zzbzn.zzf);
    }

    private static zzfut zzm(boolean z10, zzfut zzfut, Object obj) {
        if (z10) {
            return zzfuj.zzm(zzfut, new zzdje(zzfut), zzbzn.zzf);
        }
        return zzl(zzfut, (Object) null);
    }

    private final zzfut zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzfuj.zzh((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfuj.zzh((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzfuj.zzh(new zzbdj((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfuj.zzl(this.zzb.zzb(optString, optDouble, optBoolean), new zzdjh(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final zzfut zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10));
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), zzdjf.zza, this.zzg);
    }

    private final zzfut zzp(JSONObject jSONObject, zzeyc zzeyc, zzeyf zzeyf) {
        zzfut zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzeyc, zzeyf, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfuj.zzm(zzb2, new zzdji(zzb2), zzbzn.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final o3 zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new o3(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbdg zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbdg(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(z4 z4Var, zzeyc zzeyc, zzeyf zzeyf, String str, String str2, Object obj) throws Exception {
        zzcei zza2 = this.zzj.zza(z4Var, zzeyc, zzeyf);
        zzbzr zza3 = zzbzr.zza(zza2);
        zzdli zzb2 = this.zzl.zzb();
        zzdli zzdli = zzb2;
        zzcfv zzN = zza2.zzN();
        b bVar = r3;
        b bVar2 = new b(this.zza, (zzbwb) null, (zzbst) null);
        zzN.zzM(zzb2, zzdli, zzb2, zzb2, zzb2, false, (zzbhr) null, bVar, (zzbqg) null, (zzbwb) null, this.zzp, this.zzo, this.zzm, this.zzn, (zzbih) null, zzb2, (zzbig) null, (zzbia) null);
        if (((Boolean) a0.c().zzb(zzbar.zzdo)).booleanValue()) {
            zza2.zzad("/getNativeAdViewSignals", zzbho.zzs);
        }
        zza2.zzad("/getNativeClickMeta", zzbho.zzt);
        zza2.zzN().zzA(new zzdjd(zza3));
        zza2.zzab(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(String str, Object obj) throws Exception {
        t.B();
        zzcei zza2 = zzceu.zza(this.zza, zzcfx.zza(), "native-omid", false, false, this.zzc, (zzbbt) null, this.zzd, (zzbbj) null, (l) null, this.zze, this.zzf, (zzeyc) null, (zzeyf) null);
        zzbzr zza3 = zzbzr.zza(zza2);
        zza2.zzN().zzA(new zzdiz(zza3));
        if (((Boolean) a0.c().zzb(zzbar.zzeF)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final zzfut zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfuj.zzh((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfuj.zzl(zzo(optJSONArray, false, true), new zzdja(this, optJSONObject), this.zzg), (Object) null);
    }

    public final zzfut zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfut zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbdl zzbdl = this.zzh;
        return zzo(optJSONArray, zzbdl.zzb, zzbdl.zzd);
    }

    public final zzfut zzg(JSONObject jSONObject, String str, zzeyc zzeyc, zzeyf zzeyf) {
        if (!((Boolean) a0.c().zzb(zzbar.zziT)).booleanValue()) {
            return zzfuj.zzh((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfuj.zzh((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfuj.zzh((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        z4 zzk2 = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfuj.zzh((Object) null);
        }
        zzfut zzm2 = zzfuj.zzm(zzfuj.zzh((Object) null), new zzdjb(this, zzk2, zzeyc, zzeyf, optString, optString2), zzbzn.zze);
        return zzfuj.zzm(zzm2, new zzdjc(zzm2), zzbzn.zzf);
    }

    public final zzfut zzh(JSONObject jSONObject, zzeyc zzeyc, zzeyf zzeyf) {
        zzfut zzfut;
        JSONObject g10 = w0.g(jSONObject, "html_containers", "instream");
        if (g10 != null) {
            return zzp(g10, zzeyc, zzeyf);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO);
        if (optJSONObject == null) {
            return zzfuj.zzh((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) a0.c().zzb(zzbar.zziS)).booleanValue() && optJSONObject.has("html")) {
            z10 = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z10) {
                zzbza.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzfuj.zzh((Object) null);
            }
        } else if (!z10) {
            zzfut = this.zzi.zza(optJSONObject);
            return zzl(zzfuj.zzn(zzfut, (long) ((Integer) a0.c().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        zzfut = zzp(optJSONObject, zzeyc, zzeyf);
        return zzl(zzfuj.zzn(zzfut, (long) ((Integer) a0.c().zzb(zzbar.zzdp)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }
}
