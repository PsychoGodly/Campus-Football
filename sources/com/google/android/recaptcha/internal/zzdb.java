package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzdb {
    public static final zzdb zza = new zzdb();
    private static final List zzb = zzc(q.f("www.recaptcha.net", "www.gstatic.com/recaptcha"));

    private zzdb() {
    }

    public static final boolean zza(Uri uri) {
        return !TextUtils.isEmpty(uri.toString()) && m.a(HttpRequest.DEFAULT_SCHEME, uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString());
    }

    private static final boolean zzb(String str) {
        List<String> list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String r10 : list) {
            if (o.r(str, r10, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        ArrayList arrayList = new ArrayList(r.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
        }
        return arrayList;
    }
}
