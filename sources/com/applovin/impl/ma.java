package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.g5;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface ma extends g5 {

    public static final class a extends c {
        public a(IOException iOException, j5 j5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, j5Var, 2007, 1);
        }
    }

    public interface b extends g5.a {
        ma a();
    }

    public static final class d extends c {

        /* renamed from: d  reason: collision with root package name */
        public final String f9335d;

        public d(String str, j5 j5Var) {
            super("Invalid content type: " + str, j5Var, (int) AdError.INTERNAL_ERROR_2003, 1);
            this.f9335d = str;
        }
    }

    public static final class e extends c {

        /* renamed from: d  reason: collision with root package name */
        public final int f9336d;

        /* renamed from: f  reason: collision with root package name */
        public final String f9337f;

        /* renamed from: g  reason: collision with root package name */
        public final Map f9338g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f9339h;

        public e(int i10, String str, IOException iOException, Map map, j5 j5Var, byte[] bArr) {
            super("Response code: " + i10, iOException, j5Var, AdError.INTERNAL_ERROR_2004, 1);
            this.f9336d = i10;
            this.f9337f = str;
            this.f9338g = map;
            this.f9339h = bArr;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final Map f9340a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map f9341b;

        public synchronized Map a() {
            if (this.f9341b == null) {
                this.f9341b = Collections.unmodifiableMap(new HashMap(this.f9340a));
            }
            return this.f9341b;
        }
    }

    public static class c extends h5 {

        /* renamed from: b  reason: collision with root package name */
        public final j5 f9333b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9334c;

        public c(j5 j5Var, int i10, int i11) {
            super(a(i10, i11));
            this.f9333b = j5Var;
            this.f9334c = i11;
        }

        private static int a(int i10, int i11) {
            return (i10 == 2000 && i11 == 1) ? AdError.INTERNAL_ERROR_CODE : i10;
        }

        public static c a(IOException iOException, j5 j5Var, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = AdError.CACHE_ERROR_CODE;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            }
            if (i11 == 2007) {
                return new a(iOException, j5Var);
            }
            return new c(iOException, j5Var, i11, i10);
        }

        public c(IOException iOException, j5 j5Var, int i10, int i11) {
            super((Throwable) iOException, a(i10, i11));
            this.f9333b = j5Var;
            this.f9334c = i11;
        }

        public c(String str, j5 j5Var, int i10, int i11) {
            super(str, a(i10, i11));
            this.f9333b = j5Var;
            this.f9334c = i11;
        }

        public c(String str, IOException iOException, j5 j5Var, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f9333b = j5Var;
            this.f9334c = i11;
        }
    }
}
