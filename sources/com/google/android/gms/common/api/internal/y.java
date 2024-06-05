package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class y {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f15329a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<TaskCompletionSource<?>, Boolean> f15330b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f15329a) {
            hashMap = new HashMap(this.f15329a);
        }
        synchronized (this.f15330b) {
            hashMap2 = new HashMap(this.f15330b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(BasePendingResult<? extends i> basePendingResult, boolean z10) {
        this.f15329a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.a(new w(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void d(TaskCompletionSource<TResult> taskCompletionSource, boolean z10) {
        this.f15330b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new x(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, f.f15101s);
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return !this.f15329a.isEmpty() || !this.f15330b.isEmpty();
    }
}
