package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzjn extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjn(int i10) {
        super(i10 != 1 ? i10 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
