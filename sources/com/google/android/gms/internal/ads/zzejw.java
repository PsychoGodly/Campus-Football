package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzejw implements zzepm {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzejw(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzh(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.zza);
    }
}
