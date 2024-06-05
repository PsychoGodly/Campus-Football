package r5;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class b0 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        q.k(strArr);
        q.k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
