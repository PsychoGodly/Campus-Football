package com.google.firebase.installations;

import y6.l;

/* compiled from: FirebaseInstallationsException */
public class d extends l {

    /* renamed from: a  reason: collision with root package name */
    private final a f26686a;

    /* compiled from: FirebaseInstallationsException */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f26686a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f26686a = aVar;
    }
}
