package com.google.android.gms.common.api.internal;

import androidx.collection.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.b;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    private final a<b<?>, b> f15258a;

    /* renamed from: b  reason: collision with root package name */
    private final a<b<?>, String> f15259b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<Map<b<?>, String>> f15260c;

    /* renamed from: d  reason: collision with root package name */
    private int f15261d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15262e;

    public final Set<b<?>> a() {
        return this.f15258a.keySet();
    }

    public final void b(b<?> bVar, b bVar2, String str) {
        this.f15258a.put(bVar, bVar2);
        this.f15259b.put(bVar, str);
        this.f15261d--;
        if (!bVar2.z()) {
            this.f15262e = true;
        }
        if (this.f15261d != 0) {
            return;
        }
        if (this.f15262e) {
            this.f15260c.setException(new c(this.f15258a));
            return;
        }
        this.f15260c.setResult(this.f15259b);
    }
}
