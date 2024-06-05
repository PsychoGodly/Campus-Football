package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbig implements zzbhp {
    private final Context zza;

    public zzbig(Context context) {
        this.zza = context;
    }

    public final void zza(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            n1.a("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                t.r();
                b2.q(this.zza, intent);
            } catch (ActivityNotFoundException e10) {
                t.q().zzu(e10, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
