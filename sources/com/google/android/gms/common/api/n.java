package com.google.android.gms.common.api;

import h5.d;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class n extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final d f15340a;

    public n(d dVar) {
        this.f15340a = dVar;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15340a));
    }
}
