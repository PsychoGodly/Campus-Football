package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class p5 implements zzo {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24918a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i5 f24919b;

    p5(i5 i5Var, String str) {
        this.f24919b = i5Var;
        this.f24918a = str;
    }

    public final String zza(String str) {
        Map map = (Map) this.f24919b.f24667d.get(this.f24918a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
