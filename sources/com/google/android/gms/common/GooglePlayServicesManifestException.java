package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    private final int f14985a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f14985a = i10;
    }
}
