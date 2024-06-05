package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaaj {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i10 = zzew.zza;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbq zzbq) {
        for (int i10 = 0; i10 < zzbq.zza(); i10++) {
            zzbp zzb2 = zzbq.zzb(i10);
            if (zzb2 instanceof zzadi) {
                zzadi zzadi = (zzadi) zzb2;
                if ("iTunSMPB".equals(zzadi.zzb) && zzc(zzadi.zzc)) {
                    return true;
                }
            } else if (zzb2 instanceof zzadr) {
                zzadr zzadr = (zzadr) zzb2;
                if ("com.apple.iTunes".equals(zzadr.zza) && "iTunSMPB".equals(zzadr.zzb) && zzc(zzadr.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
