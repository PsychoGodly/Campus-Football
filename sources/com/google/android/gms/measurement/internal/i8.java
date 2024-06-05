package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class i8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f24687a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Uri f24688b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24689c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f24690d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f8 f24691f;

    i8(f8 f8Var, boolean z10, Uri uri, String str, String str2) {
        this.f24691f = f8Var;
        this.f24687a = z10;
        this.f24688b = uri;
        this.f24689c = str;
        this.f24690d = str2;
    }

    public final void run() {
        f8.a(this.f24691f, this.f24687a, this.f24688b, this.f24689c, this.f24690d);
    }
}
