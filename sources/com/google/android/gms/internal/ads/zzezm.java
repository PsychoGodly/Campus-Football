package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezm {
    private final Pattern zza;

    public zzezm() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) a0.c().zzb(zzbar.zzgv));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    public final String zza(String str) {
        Pattern pattern = this.zza;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
