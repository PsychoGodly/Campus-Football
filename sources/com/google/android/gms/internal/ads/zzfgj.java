package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgj implements zzfgh {
    private final zzfgh zza;

    public zzfgj(zzfgh zzfgh) {
        this.zza = zzfgh;
    }

    public final JSONObject zza(View view) {
        throw null;
    }

    public final void zzb(View view, JSONObject jSONObject, zzfgg zzfgg, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzffz zza2 = zzffz.zza();
        if (zza2 != null) {
            Collection<zzffo> zzb = zza2.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzffo zzf : zzb) {
                View zzf2 = zzf.zzf();
                if (zzf2 != null && zzf2.isAttachedToWindow() && zzf2.isShown()) {
                    View view2 = zzf2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = zzf2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza3 = zzfgs.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (zzfgs.zza((View) arrayList.get(i10)) <= zza3) {
                                        break;
                                    }
                                    size2 = i10;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfgg.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
