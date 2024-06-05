package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzago  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzago {
    private final int zza;
    private List<String> zzb;

    public zzago() {
        this((List<String>) null);
    }

    public static zzago zza() {
        return new zzago((List<String>) null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }

    private zzago(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public zzago(int i10, List<String> list) {
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            this.zzb = Collections.emptyList();
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.set(i11, q.a(list.get(i11)));
        }
        this.zzb = Collections.unmodifiableList(list);
    }
}
