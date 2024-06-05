package com.applovin.impl;

import java.util.UUID;

public final class j9 implements x4 {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8708d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f8709a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8710b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8711c;

    static {
        boolean z10;
        if ("Amazon".equals(yp.f13664c)) {
            String str = yp.f13665d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f8708d = z10;
            }
        }
        z10 = false;
        f8708d = z10;
    }

    public j9(UUID uuid, byte[] bArr, boolean z10) {
        this.f8709a = uuid;
        this.f8710b = bArr;
        this.f8711c = z10;
    }
}
