package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzekm implements zzepm {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzekm(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzh(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zza);
    }
}
