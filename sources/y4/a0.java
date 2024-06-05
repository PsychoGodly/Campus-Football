package y4;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.a1;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzeyx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class a0 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "unspecified"
            return r1
        L_0x0009:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L_0x0062;
                case 1743582863: goto L_0x0058;
                case 1743582864: goto L_0x004e;
                case 1743582865: goto L_0x0044;
                case 1743582866: goto L_0x003a;
                case 1743582867: goto L_0x0030;
                case 1743582868: goto L_0x0026;
                case 1743582869: goto L_0x001c;
                case 1743582870: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x006c
        L_0x0011:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 8
            goto L_0x006d
        L_0x001c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 7
            goto L_0x006d
        L_0x0026:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 6
            goto L_0x006d
        L_0x0030:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 5
            goto L_0x006d
        L_0x003a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 4
            goto L_0x006d
        L_0x0044:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 3
            goto L_0x006d
        L_0x004e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 2
            goto L_0x006d
        L_0x0058:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x0062:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 0
            goto L_0x006d
        L_0x006c:
            r0 = -1
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0086;
                case 2: goto L_0x0083;
                case 3: goto L_0x0080;
                case 4: goto L_0x007d;
                case 5: goto L_0x007a;
                case 6: goto L_0x0077;
                case 7: goto L_0x0074;
                case 8: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            return r1
        L_0x0071:
            java.lang.String r1 = "8"
            return r1
        L_0x0074:
            java.lang.String r1 = "7"
            return r1
        L_0x0077:
            java.lang.String r1 = "6"
            return r1
        L_0x007a:
            java.lang.String r1 = "5"
            return r1
        L_0x007d:
            java.lang.String r1 = "4"
            return r1
        L_0x0080:
            java.lang.String r1 = "3"
            return r1
        L_0x0083:
            java.lang.String r1 = "2"
            return r1
        L_0x0086:
            java.lang.String r1 = "1"
            return r1
        L_0x0089:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.a0.a(java.lang.String):java.lang.String");
    }

    public static String b(u4 u4Var) {
        Bundle bundle = u4Var.f14553c;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void c(zzdpn zzdpn, zzdpd zzdpd, String str, Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(zzbar.zzgC)).booleanValue()) {
            zzbzn.zza.execute(new z(zzdpn, zzdpd, str, pairArr));
        }
    }

    static void d(zzdpn zzdpn, zzdpd zzdpd, String str, Pair... pairArr) {
        Map map;
        if (zzdpd == null) {
            map = zzdpn.zzc();
        } else {
            map = zzdpd.zza();
        }
        f(map, "action", str);
        for (Pair pair : pairArr) {
            f(map, (String) pair.first, (String) pair.second);
        }
        zzdpn.zze(map);
    }

    public static int e(zzeyx zzeyx) {
        if (zzeyx.zzq) {
            return 2;
        }
        u4 u4Var = zzeyx.zzd;
        a1 a1Var = u4Var.f14569t;
        if (a1Var == null && u4Var.f14574y == null) {
            return 1;
        }
        if (a1Var == null || u4Var.f14574y == null) {
            return a1Var != null ? 3 : 4;
        }
        return 5;
    }

    private static void f(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
