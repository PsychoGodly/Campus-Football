package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaji  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzaji extends IOException {
    private zzakn zza = null;
    private boolean zzb;

    public zzaji(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzajl zza() {
        return new zzajl("Protocol message tag had invalid wire type.");
    }

    static zzaji zzb() {
        return new zzaji("Protocol message end-group tag did not match expected tag.");
    }

    static zzaji zzc() {
        return new zzaji("Protocol message contained an invalid tag (zero).");
    }

    static zzaji zzd() {
        return new zzaji("Protocol message had invalid UTF-8.");
    }

    static zzaji zze() {
        return new zzaji("CodedInputStream encountered a malformed varint.");
    }

    static zzaji zzf() {
        return new zzaji("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzaji zzg() {
        return new zzaji("Failed to parse the message.");
    }

    static zzaji zzh() {
        return new zzaji("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzaji zzi() {
        return new zzaji("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    public final void zzj() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzk() {
        return this.zzb;
    }

    public final zzaji zza(zzakn zzakn) {
        this.zza = zzakn;
        return this;
    }

    public zzaji(String str) {
        super(str);
    }
}
