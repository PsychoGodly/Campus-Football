package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.y6;
import com.unity3d.services.UnityAdsConstants;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<y6.a, j> f24736a;

    k() {
        this.f24736a = new EnumMap<>(y6.a.class);
    }

    public static k b(String str) {
        EnumMap enumMap = new EnumMap(y6.a.class);
        if (str.length() >= y6.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                y6.a[] values = y6.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(values[i10], j.c(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new k(enumMap);
            }
        }
        return new k();
    }

    public final j a(y6.a aVar) {
        j jVar = this.f24736a.get(aVar);
        return jVar == null ? j.UNSET : jVar;
    }

    public final void c(y6.a aVar, int i10) {
        j jVar = j.UNSET;
        if (i10 != -20) {
            if (i10 == -10) {
                jVar = j.MANIFEST;
            } else if (i10 != 0) {
                if (i10 == 30) {
                    jVar = j.INITIALIZATION;
                }
            }
            this.f24736a.put(aVar, jVar);
        }
        jVar = j.API;
        this.f24736a.put(aVar, jVar);
    }

    public final void d(y6.a aVar, j jVar) {
        this.f24736a.put(aVar, jVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        for (y6.a aVar : y6.a.values()) {
            j jVar = this.f24736a.get(aVar);
            if (jVar == null) {
                jVar = j.UNSET;
            }
            sb2.append(jVar.f24714a);
        }
        return sb2.toString();
    }

    private k(EnumMap<y6.a, j> enumMap) {
        EnumMap<y6.a, j> enumMap2 = new EnumMap<>(y6.a.class);
        this.f24736a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
