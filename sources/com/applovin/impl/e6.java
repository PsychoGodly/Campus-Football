package com.applovin.impl;

import com.applovin.impl.hc;
import com.applovin.impl.jc;
import com.applovin.impl.ma;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;

public class e6 implements hc {

    /* renamed from: a  reason: collision with root package name */
    private final int f7372a;

    public e6() {
        this(-1);
    }

    public int a(int i10) {
        int i11 = this.f7372a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    public /* synthetic */ void a(long j10) {
        ux.a(this, j10);
    }

    public e6(int i10) {
        this.f7372a = i10;
    }

    public long a(hc.a aVar) {
        IOException iOException = aVar.f8296c;
        if ((iOException instanceof ah) || (iOException instanceof FileNotFoundException) || (iOException instanceof ma.a) || (iOException instanceof jc.h) || h5.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f8297d - 1) * 1000, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
    }
}
