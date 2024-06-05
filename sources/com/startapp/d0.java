package com.startapp;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public class d0 {
    public static List<AdDetails> a(Context context, List<AdDetails> list, int i10, Set<String> set, boolean z10) {
        Context context2 = context;
        int i11 = i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z11 = false;
        for (AdDetails next : list) {
            ArrayList arrayList5 = (ArrayList) j9.a((List<String>) Arrays.asList(next.w()));
            AppPresenceDetails appPresenceDetails = new AppPresenceDetails(arrayList5.isEmpty() ? null : (String) arrayList5.get(0), next.c(), i11, next.o());
            boolean z12 = next.c() != null && next.c().startsWith("!");
            boolean a10 = a0.a(context, z12 ? next.c().substring(1) : next.c(), next.o());
            boolean z13 = AdsCommonMetaData.f16770h.H() && ((a10 && !z12) || (!a10 && z12));
            arrayList3.add(appPresenceDetails);
            if (z13) {
                appPresenceDetails.a(a10);
                appPresenceDetails.b(false);
                if (!z12) {
                    arrayList2.add(next);
                    arrayList4.add(appPresenceDetails);
                }
                set.add(next.p());
                z11 = true;
            } else {
                Set<String> set2 = set;
                arrayList.add(next);
            }
        }
        if (arrayList.size() < 5 && (list.size() != 1 || i11 > 0)) {
            int min = Math.min(5 - arrayList.size(), arrayList2.size());
            arrayList.addAll(arrayList2.subList(0, min));
            for (AppPresenceDetails b10 : arrayList4.subList(0, min)) {
                b10.b(true);
            }
        }
        if (z11) {
            SimpleTokenUtils.f(context);
            if (z10) {
                new c0(context, arrayList3).a();
            }
        }
        return arrayList;
    }

    public static List<AppPresenceDetails> a(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[0];
        String a10 = j9.a(str, "@tracking@", "@tracking@");
        if (a10 != null) {
            strArr = a10.split(",");
        }
        String[] strArr2 = new String[0];
        String a11 = j9.a(str, "@appPresencePackage@", "@appPresencePackage@");
        if (a11 != null) {
            strArr2 = a11.split(",");
        }
        String[] strArr3 = new String[0];
        String a12 = j9.a(str, "@minAppVersion@", "@minAppVersion@");
        if (a12 != null) {
            strArr3 = a12.split(",");
        }
        int i11 = 0;
        while (i11 < strArr2.length) {
            arrayList.add(new AppPresenceDetails(strArr.length > i11 ? strArr[i11] : null, strArr2[i11], i10, strArr3.length > i11 ? Integer.valueOf(strArr3[i11]).intValue() : 0));
            i11++;
        }
        while (i11 < strArr.length) {
            arrayList.add(new AppPresenceDetails(strArr[i11], MaxReward.DEFAULT_LABEL, i10, strArr3.length > i11 ? Integer.valueOf(strArr3[i11]).intValue() : 0));
            i11++;
        }
        return arrayList;
    }

    public static Boolean a(Context context, List<AppPresenceDetails> list, int i10, Set<String> set, List<AppPresenceDetails> list2) {
        boolean z10 = false;
        for (AppPresenceDetails next : list) {
            boolean startsWith = next.b().startsWith("!");
            boolean a10 = a0.a(context, startsWith ? next.b().substring(1) : next.b(), next.a());
            if ((!startsWith && a10) || (startsWith && !a10)) {
                next.a(a10);
                z10 = i10 == 0;
                if (z10 && !startsWith) {
                    set.add(next.b());
                } else if (!z10 && next.c() != null) {
                    next.a(next.c() + "&isShown=" + next.e() + "&appPresence=" + next.d());
                }
            }
            list2.add(next);
        }
        if (z10) {
            for (int i11 = 0; i11 < list2.size(); i11++) {
                list2.get(i11).b(false);
            }
        }
        return Boolean.valueOf(z10);
    }
}
