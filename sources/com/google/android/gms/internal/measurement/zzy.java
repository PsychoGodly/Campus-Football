package com.google.android.gms.internal.measurement;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzy extends zzal {
    public zzy() {
        super("internal.platform");
        this.zzb.put(MobileAdsBridge.versionMethodName, new zzab(this, MobileAdsBridge.versionMethodName));
    }

    public final zzaq zza(zzh zzh, List<zzaq> list) {
        return zzaq.zzc;
    }
}
