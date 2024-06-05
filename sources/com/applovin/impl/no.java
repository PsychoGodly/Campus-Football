package com.applovin.impl;

import com.applovin.impl.ro;

public final class no {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10007a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10008b;

    /* renamed from: c  reason: collision with root package name */
    public final ro.a f10009c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10010d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f10011e;

    public no(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11 = true;
        a1.a((bArr2 != null ? false : z11) ^ (i10 == 0));
        this.f10007a = z10;
        this.f10008b = str;
        this.f10010d = i10;
        this.f10011e = bArr2;
        this.f10009c = new ro.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                kc.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
