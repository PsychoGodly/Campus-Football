package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcfo {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        int i10 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            while (i10 <= 0) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i10++;
            }
            sb2.append(str.substring(end));
        } else {
            if (!zzb.matcher(str).find()) {
                while (i10 <= 0) {
                    String str3 = strArr[i10];
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    i10++;
                }
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
