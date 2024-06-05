package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public class zzgy extends IOException {
    private zzhy zza = null;
    private boolean zzb;

    public zzgy(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzgx zza() {
        return new zzgx("Protocol message tag had invalid wire type.");
    }

    static zzgy zzb() {
        return new zzgy("Protocol message end-group tag did not match expected tag.");
    }

    static zzgy zzc() {
        return new zzgy("Protocol message contained an invalid tag (zero).");
    }

    static zzgy zzd() {
        return new zzgy("Protocol message had invalid UTF-8.");
    }

    static zzgy zze() {
        return new zzgy("CodedInputStream encountered a malformed varint.");
    }

    static zzgy zzf() {
        return new zzgy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgy zzg() {
        return new zzgy("Failed to parse the message.");
    }

    static zzgy zzi() {
        return new zzgy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgy zzj() {
        return new zzgy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgy zzh(zzhy zzhy) {
        this.zza = zzhy;
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

    public zzgy(String str) {
        super(str);
    }
}
