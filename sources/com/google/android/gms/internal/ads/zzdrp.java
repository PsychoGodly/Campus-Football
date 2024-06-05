package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import o5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdrp {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;

    public zzdrp(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = ((Integer) a0.c().zzb(zzbar.zzis)).intValue();
        this.zzd = ((Integer) a0.c().zzb(zzbar.zzit)).intValue();
    }

    public final JSONObject zza() throws JSONException {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, c.a(this.zza).d(this.zzb.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.zzb.packageName);
        t.r();
        jSONObject.put("adMobAppId", b2.M(this.zza));
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) c.a(this.zza).e(this.zzb.packageName).f3081b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = MaxReward.DEFAULT_LABEL;
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap createBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = str;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
