package com.applovin.impl;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.ma;
import com.facebook.ads.AdError;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class b6 extends z1 implements ma {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6647e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6648f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6649g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6650h;

    /* renamed from: i  reason: collision with root package name */
    private final ma.f f6651i;

    /* renamed from: j  reason: collision with root package name */
    private final ma.f f6652j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f6653k;

    /* renamed from: l  reason: collision with root package name */
    private Predicate f6654l;

    /* renamed from: m  reason: collision with root package name */
    private j5 f6655m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f6656n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f6657o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6658p;

    /* renamed from: q  reason: collision with root package name */
    private int f6659q;

    /* renamed from: r  reason: collision with root package name */
    private long f6660r;

    /* renamed from: s  reason: collision with root package name */
    private long f6661s;

    private b6(String str, int i10, int i11, boolean z10, ma.f fVar, Predicate predicate, boolean z11) {
        super(true);
        this.f6650h = str;
        this.f6648f = i10;
        this.f6649g = i11;
        this.f6647e = z10;
        this.f6651i = fVar;
        this.f6654l = predicate;
        this.f6652j = new ma.f();
        this.f6653k = z11;
    }

    private URL a(URL url, String str, j5 j5Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new ma.c("Unsupported protocol redirect: " + protocol, j5Var, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.f6647e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new ma.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", j5Var, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e10) {
                throw new ma.c((IOException) e10, j5Var, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        } else {
            throw new ma.c("Null location redirect", j5Var, (int) AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private HttpURLConnection d(j5 j5Var) {
        HttpURLConnection a10;
        j5 j5Var2 = j5Var;
        URL url = new URL(j5Var2.f8675a.toString());
        int i10 = j5Var2.f8677c;
        byte[] bArr = j5Var2.f8678d;
        long j10 = j5Var2.f8681g;
        long j11 = j5Var2.f8682h;
        boolean b10 = j5Var2.b(1);
        if (!this.f6647e && !this.f6653k) {
            return a(url, i10, bArr, j10, j11, b10, true, j5Var2.f8679e);
        }
        int i11 = 0;
        URL url2 = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 <= 20) {
                long j12 = j10;
                int i14 = i12;
                long j13 = j10;
                int i15 = i13;
                URL url3 = url2;
                long j14 = j11;
                a10 = a(url2, i12, bArr2, j12, j11, b10, false, j5Var2.f8679e);
                int responseCode = a10.getResponseCode();
                String headerField = a10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a10.disconnect();
                    url2 = a(url3, headerField, j5Var2);
                    i11 = i15;
                    i12 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a10;
                } else {
                    a10.disconnect();
                    if (!this.f6653k || responseCode != 302) {
                        bArr2 = null;
                        i12 = 1;
                    } else {
                        i12 = i14;
                    }
                    url2 = a(url3, headerField, j5Var2);
                    i11 = i15;
                }
                j10 = j13;
                j11 = j14;
            } else {
                throw new ma.c((IOException) new NoRouteToHostException("Too many redirects: " + i13), j5Var2, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        return a10;
    }

    private void h() {
        HttpURLConnection httpURLConnection = this.f6656n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                kc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f6656n = null;
        }
    }

    public Uri c() {
        HttpURLConnection httpURLConnection = this.f6656n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public void close() {
        try {
            InputStream inputStream = this.f6657o;
            if (inputStream != null) {
                long j10 = this.f6660r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f6661s;
                }
                a(this.f6656n, j11);
                inputStream.close();
            }
            this.f6657o = null;
            h();
            if (this.f6658p) {
                this.f6658p = false;
                g();
            }
        } catch (IOException e10) {
            throw new ma.c(e10, (j5) yp.a((Object) this.f6655m), (int) AdError.SERVER_ERROR_CODE, 3);
        } catch (Throwable th) {
            this.f6657o = null;
            h();
            if (this.f6658p) {
                this.f6658p = false;
                g();
            }
            throw th;
        }
    }

    public Map e() {
        HttpURLConnection httpURLConnection = this.f6656n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public static final class b implements ma.b {

        /* renamed from: a  reason: collision with root package name */
        private final ma.f f6662a = new ma.f();

        /* renamed from: b  reason: collision with root package name */
        private yo f6663b;

        /* renamed from: c  reason: collision with root package name */
        private Predicate f6664c;

        /* renamed from: d  reason: collision with root package name */
        private String f6665d;

        /* renamed from: e  reason: collision with root package name */
        private int f6666e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f6667f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f6668g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f6669h;

        /* renamed from: b */
        public b6 a() {
            b6 b6Var = new b6(this.f6665d, this.f6666e, this.f6667f, this.f6668g, this.f6662a, this.f6664c, this.f6669h);
            yo yoVar = this.f6663b;
            if (yoVar != null) {
                b6Var.a(yoVar);
            }
            return b6Var;
        }

        public b a(String str) {
            this.f6665d = str;
            return this;
        }
    }

    private int e(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6660r;
        if (j10 != -1) {
            long j11 = j10 - this.f6661s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) yp.a((Object) this.f6657o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f6661s += (long) read;
        d(read);
        return read;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        HttpURLConnection a10 = a(url);
        a10.setConnectTimeout(this.f6648f);
        a10.setReadTimeout(this.f6649g);
        HashMap hashMap = new HashMap();
        ma.f fVar = this.f6651i;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f6652j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = oa.a(j10, j11);
        if (a11 != null) {
            a10.setRequestProperty("Range", a11);
        }
        String str = this.f6650h;
        if (str != null) {
            a10.setRequestProperty("User-Agent", str);
        }
        a10.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        a10.setInstanceFollowRedirects(z11);
        a10.setDoOutput(bArr != null);
        a10.setRequestMethod(j5.a(i10));
        if (bArr != null) {
            a10.setFixedLengthStreamingMode(bArr.length);
            a10.connect();
            OutputStream outputStream = a10.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a10.connect();
        }
        return a10;
    }

    private static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = yp.f13662a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) a1.a((Object) inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public long a(j5 j5Var) {
        byte[] bArr;
        this.f6655m = j5Var;
        long j10 = 0;
        this.f6661s = 0;
        this.f6660r = 0;
        b(j5Var);
        try {
            HttpURLConnection d10 = d(j5Var);
            this.f6656n = d10;
            this.f6659q = d10.getResponseCode();
            String responseMessage = d10.getResponseMessage();
            int i10 = this.f6659q;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = d10.getHeaderFields();
                if (this.f6659q == 416) {
                    if (j5Var.f8681g == oa.a(d10.getHeaderField("Content-Range"))) {
                        this.f6658p = true;
                        c(j5Var);
                        long j12 = j5Var.f8682h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = d10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = yp.a(errorStream);
                    } catch (IOException unused) {
                        bArr = yp.f13667f;
                    }
                } else {
                    bArr = yp.f13667f;
                }
                byte[] bArr2 = bArr;
                h();
                throw new ma.e(this.f6659q, responseMessage, this.f6659q == 416 ? new h5(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, j5Var, bArr2);
            }
            String contentType = d10.getContentType();
            Predicate predicate = this.f6654l;
            if (predicate == null || predicate.apply(contentType)) {
                if (this.f6659q == 200) {
                    long j13 = j5Var.f8681g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean a10 = a(d10);
                if (!a10) {
                    long j14 = j5Var.f8682h;
                    if (j14 != -1) {
                        this.f6660r = j14;
                    } else {
                        long a11 = oa.a(d10.getHeaderField("Content-Length"), d10.getHeaderField("Content-Range"));
                        if (a11 != -1) {
                            j11 = a11 - j10;
                        }
                        this.f6660r = j11;
                    }
                } else {
                    this.f6660r = j5Var.f8682h;
                }
                try {
                    this.f6657o = d10.getInputStream();
                    if (a10) {
                        this.f6657o = new GZIPInputStream(this.f6657o);
                    }
                    this.f6658p = true;
                    c(j5Var);
                    try {
                        a(j10, j5Var);
                        return this.f6660r;
                    } catch (IOException e10) {
                        h();
                        if (e10 instanceof ma.c) {
                            throw ((ma.c) e10);
                        }
                        throw new ma.c(e10, j5Var, (int) AdError.SERVER_ERROR_CODE, 1);
                    }
                } catch (IOException e11) {
                    h();
                    throw new ma.c(e11, j5Var, (int) AdError.SERVER_ERROR_CODE, 1);
                }
            } else {
                h();
                throw new ma.d(contentType, j5Var);
            }
        } catch (IOException e12) {
            h();
            throw ma.c.a(e12, j5Var, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public int a(byte[] bArr, int i10, int i11) {
        try {
            return e(bArr, i10, i11);
        } catch (IOException e10) {
            throw ma.c.a(e10, (j5) yp.a((Object) this.f6655m), 2);
        }
    }

    private void a(long j10, j5 j5Var) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int read = ((InputStream) yp.a((Object) this.f6657o)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new ma.c((IOException) new InterruptedIOException(), j5Var, (int) AdError.SERVER_ERROR_CODE, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    d(read);
                } else {
                    throw new ma.c(j5Var, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }
}
