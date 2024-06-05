package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzfki implements zzfkl {
    public final /* synthetic */ URL zza;

    public /* synthetic */ zzfki(URL url) {
        this.zza = url;
    }

    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}
