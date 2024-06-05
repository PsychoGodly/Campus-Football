package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.Map;
import s4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbqc extends zzbqf {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbqc(zzcei zzcei, Map map) {
        super(zzcei, "storePicture");
        this.zza = map;
        this.zzb = zzcei.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        t.r();
        if (!new zzbab(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            t.r();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = t.q().zzd();
                t.r();
                AlertDialog.Builder g10 = b2.g(this.zzb);
                g10.setTitle(zzd != null ? zzd.getString(b.f22497k) : "Save image");
                g10.setMessage(zzd != null ? zzd.getString(b.f22498l) : "Allow Ad to store image in Picture gallery?");
                g10.setPositiveButton(zzd != null ? zzd.getString(b.f22499m) : "Accept", new zzbqa(this, str, lastPathSegment));
                g10.setNegativeButton(zzd != null ? zzd.getString(b.f22500n) : "Decline", new zzbqb(this));
                g10.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
