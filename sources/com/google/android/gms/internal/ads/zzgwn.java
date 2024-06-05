package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgwn extends zzgwq {
    final Logger zza;

    public zzgwn(String str) {
        this.zza = Logger.getLogger(str);
    }

    public final void zza(String str) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
