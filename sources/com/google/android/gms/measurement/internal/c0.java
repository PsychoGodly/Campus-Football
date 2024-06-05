package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class c0 implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f24421a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z f24422b;

    c0(z zVar) {
        this.f24422b = zVar;
        this.f24421a = zVar.f25309a.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f24421a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f24421a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
