package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfkt {
    static final String zza = new UUID(0, 0).toString();
    final zzfku zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    zzfkt(Context context, String str, String str2, String str3) {
        this.zzb = zzfku.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 == null || str3 == null) {
            String str4 = this.zzg;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
            String str5 = "null";
            sb2.append(str2 == null ? str5 : "not null");
            sb2.append(", hashKey is ");
            if (str3 != null) {
                str5 = "not null";
            }
            sb2.append(str5);
            throw new IllegalArgumentException(sb2.toString());
        }
        return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
    }

    /* access modifiers changed from: package-private */
    public final long zza(boolean z10) {
        return this.zzb.zza(z10 ? this.zzf : this.zze, -1);
    }

    /* access modifiers changed from: package-private */
    public final zzfks zzb(String str, String str2, long j10, boolean z10) throws IOException {
        String str3;
        boolean z11 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze2 = zze(true);
                    String zzc2 = this.zzb.zzc("paid_3p_hash_key", (String) null);
                    if (!(zze2 == null || zzc2 == null || zze2.equals(zzh(str, str2, zzc2)))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfks();
        }
        if (str == null) {
            z11 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z11);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfku zzfku = this.zzb;
                    if (z11) {
                        str3 = this.zzf;
                    } else {
                        str3 = this.zze;
                    }
                    zzfku.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j10) {
                    return zzc(str, str2);
                }
            }
            String zze3 = zze(z11);
            if (zze3 != null || z10) {
                return new zzfks(zze3, zza(z11));
            }
            return zzc(str, str2);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    /* access modifiers changed from: package-private */
    public final zzfks zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    /* access modifiers changed from: package-private */
    public final zzfks zzd(String str, boolean z10) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfku zzfku = this.zzb;
            if (z10) {
                str2 = this.zzf;
            } else {
                str2 = this.zze;
            }
            zzfku.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfku zzfku2 = this.zzb;
            if (z10) {
                str3 = this.zzd;
            } else {
                str3 = this.zzc;
            }
            zzfku2.zzd(str3, str);
            return new zzfks(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    /* access modifiers changed from: package-private */
    public final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zzd : this.zzc, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(boolean z10) throws IOException {
        String str;
        String str2;
        zzfku zzfku = this.zzb;
        if (z10) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        zzfku.zze(str);
        zzfku zzfku2 = this.zzb;
        if (z10) {
            str2 = this.zzd;
        } else {
            str2 = this.zzc;
        }
        zzfku2.zze(str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzc);
    }
}
