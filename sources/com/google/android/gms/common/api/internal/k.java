package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.q;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Set<j<?>> f15169a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> j<L> a(L l10, Looper looper, String str) {
        q.l(l10, "Listener must not be null");
        q.l(looper, "Looper must not be null");
        q.l(str, "Listener type must not be null");
        return new j<>(looper, l10, str);
    }

    public final void b() {
        for (j<?> a10 : this.f15169a) {
            a10.a();
        }
        this.f15169a.clear();
    }
}
