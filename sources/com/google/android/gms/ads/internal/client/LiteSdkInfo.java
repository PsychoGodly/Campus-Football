package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class LiteSdkInfo extends l1 {
    public LiteSdkInfo(Context context) {
    }

    public zzbnf getAdapterCreator() {
        return new zzbnc();
    }

    public q3 getLiteSdkVersion() {
        return new q3(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "22.0.0");
    }
}
