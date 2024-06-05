package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgqy extends IOException {
    private zzgrw zza = null;
    private boolean zzb;

    public zzgqy(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzgqx zza() {
        return new zzgqx("Protocol message tag had invalid wire type.");
    }

    static zzgqy zzb() {
        return new zzgqy("Protocol message end-group tag did not match expected tag.");
    }

    static zzgqy zzc() {
        return new zzgqy("Protocol message contained an invalid tag (zero).");
    }

    static zzgqy zzd() {
        return new zzgqy("Protocol message had invalid UTF-8.");
    }

    static zzgqy zze() {
        return new zzgqy("CodedInputStream encountered a malformed varint.");
    }

    static zzgqy zzf() {
        return new zzgqy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgqy zzg() {
        return new zzgqy("Failed to parse the message.");
    }

    static zzgqy zzi() {
        return new zzgqy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgqy zzj() {
        return new zzgqy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgqy zzh(zzgrw zzgrw) {
        this.zza = zzgrw;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public zzgqy(String str) {
        super(str);
    }
}
