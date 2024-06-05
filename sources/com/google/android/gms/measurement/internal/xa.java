package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class xa implements t4 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f25253a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ va f25254b;

    xa(va vaVar, String str) {
        this.f25254b = vaVar;
        this.f25253a = str;
    }

    public final void a(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f25254b.D(true, i10, th, bArr, this.f25253a);
    }
}
