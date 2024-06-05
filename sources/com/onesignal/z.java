package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: GoogleApiClientCompatProxy */
class z {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleApiClient f28464a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f28465b;

    z(GoogleApiClient googleApiClient) {
        this.f28464a = googleApiClient;
        this.f28465b = googleApiClient.getClass();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            this.f28465b.getMethod("connect", new Class[0]).invoke(this.f28464a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            this.f28465b.getMethod("disconnect", new Class[0]).invoke(this.f28464a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public GoogleApiClient c() {
        return this.f28464a;
    }
}
