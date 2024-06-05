package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class b0 extends GoogleApiClient {

    /* renamed from: b  reason: collision with root package name */
    private final String f15070b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public b0(String str) {
    }

    public final void connect() {
        throw new UnsupportedOperationException(this.f15070b);
    }

    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f15070b);
    }

    public final void disconnect() {
        throw new UnsupportedOperationException(this.f15070b);
    }

    public final boolean g() {
        throw new UnsupportedOperationException(this.f15070b);
    }

    public final void h(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f15070b);
    }

    public final void i(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f15070b);
    }
}
