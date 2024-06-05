package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgk implements zzfgh {
    private final int[] zza = new int[2];

    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfgp.zza(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzfgp.zza(iArr[0], iArr[1], width, height);
    }

    public final void zzb(View view, JSONObject jSONObject, zzfgg zzfgg, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10 || Build.VERSION.SDK_INT < 21) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    zzfgg.zza(viewGroup.getChildAt(i11), this, jSONObject, z11);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 >= size2) {
                        break;
                    }
                    zzfgg.zza((View) arrayList3.get(i14), this, jSONObject, z11);
                    i14++;
                }
                i13 = i10;
            }
        }
    }
}
