package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Debug;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzemw implements Callable {
    public static final /* synthetic */ zzemw zza = new zzemw();

    private /* synthetic */ zzemw() {
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        if (((Boolean) a0.c().zzb(zzbar.zzH)).booleanValue()) {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
            bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
            bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
            bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
            bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
            bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
            bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
            bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
            bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
        }
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", t.q().zza());
        return new zzemy(bundle);
    }
}
