package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzge {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzee.zzb("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String group = matcher.group(2);
            Objects.requireNonNull(group);
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            Objects.requireNonNull(group2);
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (i10 < 0) {
                return parseLong2;
            }
            if (j10 == parseLong2) {
                return j10;
            }
            zzee.zze("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j10, parseLong2);
        } catch (NumberFormatException unused2) {
            zzee.zzb("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j10;
        }
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }
}
