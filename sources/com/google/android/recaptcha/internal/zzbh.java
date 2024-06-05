package com.google.android.recaptcha.internal;

import sd.t;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final /* synthetic */ class zzbh {
    public static String zza(zzbi zzbi, String str, byte b10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append((char) t.a(t.a(str.charAt(i10)) ^ t.a(b10)));
        }
        return sb2.toString();
    }
}
