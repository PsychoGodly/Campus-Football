package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.a;
import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgk {
    private static final a<String, Uri> zza = new a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzgk.class) {
            a<String, Uri> aVar = zza;
            uri = aVar.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + MaxReward.DEFAULT_LABEL + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }
}
