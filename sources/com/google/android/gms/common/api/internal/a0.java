package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final b<?> f15047a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<Boolean> f15048b = new TaskCompletionSource<>();

    public a0(b<?> bVar) {
        this.f15047a = bVar;
    }

    public final b<?> a() {
        return this.f15047a;
    }

    public final TaskCompletionSource<Boolean> b() {
        return this.f15048b;
    }
}
