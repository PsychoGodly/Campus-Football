package k4;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: UriUtil */
public final class l0 {
    private static int[] a(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean b(String str) {
        return (str == null || a(str)[0] == -1) ? false : true;
    }

    private static String c(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i14 = i10;
        int i15 = i14;
        while (i14 <= i11) {
            if (i14 == i11) {
                i12 = i14;
            } else if (sb2.charAt(i14) == '/') {
                i12 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb2.charAt(i15) == '.') {
                sb2.delete(i15, i12);
                i11 -= i12 - i15;
            } else {
                if (i14 == i15 + 2 && sb2.charAt(i15) == '.' && sb2.charAt(i16) == '.') {
                    i13 = sb2.lastIndexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, i15 - 2) + 1;
                    int i17 = i13 > i10 ? i13 : i10;
                    sb2.delete(i17, i12);
                    i11 -= i12 - i17;
                } else {
                    i13 = i14 + 1;
                }
                i15 = i13;
            }
            i14 = i15;
        }
        return sb2.toString();
    }

    public static String d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = MaxReward.DEFAULT_LABEL;
        }
        if (str2 == null) {
            str2 = MaxReward.DEFAULT_LABEL;
        }
        int[] a10 = a(str2);
        if (a10[0] != -1) {
            sb2.append(str2);
            c(sb2, a10[1], a10[2]);
            return sb2.toString();
        }
        int[] a11 = a(str);
        if (a10[3] == 0) {
            sb2.append(str, 0, a11[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (a10[2] == 0) {
            sb2.append(str, 0, a11[2]);
            sb2.append(str2);
            return sb2.toString();
        } else if (a10[1] != 0) {
            int i10 = a11[0] + 1;
            sb2.append(str, 0, i10);
            sb2.append(str2);
            return c(sb2, a10[1] + i10, i10 + a10[2]);
        } else if (str2.charAt(a10[1]) == '/') {
            sb2.append(str, 0, a11[1]);
            sb2.append(str2);
            return c(sb2, a11[1], a11[1] + a10[2]);
        } else if (a11[0] + 2 >= a11[1] || a11[1] != a11[2]) {
            int lastIndexOf = str.lastIndexOf(47, a11[2] - 1);
            int i11 = lastIndexOf == -1 ? a11[1] : lastIndexOf + 1;
            sb2.append(str, 0, i11);
            sb2.append(str2);
            return c(sb2, a11[1], i11 + a10[2]);
        } else {
            sb2.append(str, 0, a11[1]);
            sb2.append('/');
            sb2.append(str2);
            return c(sb2, a11[1], a11[1] + a10[2] + 1);
        }
    }

    public static Uri e(String str, String str2) {
        return Uri.parse(d(str, str2));
    }
}
