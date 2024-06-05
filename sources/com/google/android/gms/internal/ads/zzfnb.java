package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfnb {
    public static String zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zze(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (zze(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (zzd(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (zzd(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzd(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean zze(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    private static int zzf(char c10) {
        return (char) ((c10 | ' ') - 'a');
    }
}
