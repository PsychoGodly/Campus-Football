package j4;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.core.network.model.HttpRequest;
import j4.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import k4.n0;
import k4.r;
import r6.p;
import s6.v;
import s6.y0;

/* compiled from: DefaultHttpDataSource */
public class u extends g {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f19465e;

    /* renamed from: f  reason: collision with root package name */
    private final int f19466f;

    /* renamed from: g  reason: collision with root package name */
    private final int f19467g;

    /* renamed from: h  reason: collision with root package name */
    private final String f19468h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f19469i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f19470j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f19471k;

    /* renamed from: l  reason: collision with root package name */
    private p<String> f19472l;

    /* renamed from: m  reason: collision with root package name */
    private p f19473m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f19474n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f19475o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19476p;

    /* renamed from: q  reason: collision with root package name */
    private int f19477q;

    /* renamed from: r  reason: collision with root package name */
    private long f19478r;

    /* renamed from: s  reason: collision with root package name */
    private long f19479s;

    /* compiled from: DefaultHttpDataSource */
    public static final class b implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f19480a = new d0();

        /* renamed from: b  reason: collision with root package name */
        private p0 f19481b;

        /* renamed from: c  reason: collision with root package name */
        private p<String> f19482c;

        /* renamed from: d  reason: collision with root package name */
        private String f19483d;

        /* renamed from: e  reason: collision with root package name */
        private int f19484e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f19485f = 8000;

        /* renamed from: g  reason: collision with root package name */
        private boolean f19486g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f19487h;

        /* renamed from: b */
        public u a() {
            u uVar = new u(this.f19483d, this.f19484e, this.f19485f, this.f19486g, this.f19480a, this.f19482c, this.f19487h);
            p0 p0Var = this.f19481b;
            if (p0Var != null) {
                uVar.e(p0Var);
            }
            return uVar;
        }

        public b c(boolean z10) {
            this.f19486g = z10;
            return this;
        }

        public final b d(Map<String, String> map) {
            this.f19480a.a(map);
            return this;
        }

        public b e(String str) {
            this.f19483d = str;
            return this;
        }
    }

    /* compiled from: DefaultHttpDataSource */
    private static class c extends s6.p<String, List<String>> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, List<String>> f19488a;

        public c(Map<String, List<String>> map) {
            this.f19488a = map;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean k(String str) {
            return str != null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, List<String>> a() {
            return this.f19488a;
        }

        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return super.d(obj);
        }

        public Set<Map.Entry<String, List<String>>> entrySet() {
            return y0.b(super.entrySet(), w.f35715a);
        }

        public boolean equals(Object obj) {
            return obj != null && super.e(obj);
        }

        public int hashCode() {
            return super.f();
        }

        /* renamed from: i */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public boolean isEmpty() {
            if (!super.isEmpty()) {
                return super.size() == 1 && super.containsKey((Object) null);
            }
            return true;
        }

        public Set<String> keySet() {
            return y0.b(super.keySet(), v.f35714a);
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    private int B(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19478r;
        if (j10 != -1) {
            long j11 = j10 - this.f19479s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min((long) i11, j11);
        }
        int read = ((InputStream) n0.j(this.f19475o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f19479s += (long) read;
        q(read);
        return read;
    }

    private void C(long j10, p pVar) throws IOException {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int read = ((InputStream) n0.j(this.f19475o)).read(bArr, 0, (int) Math.min(j10, (long) 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new a0((IOException) new InterruptedIOException(), pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                } else if (read != -1) {
                    j10 -= (long) read;
                    q(read);
                } else {
                    throw new a0(pVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            }
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.f19474n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f19474n = null;
        }
    }

    private URL v(URL url, String str, p pVar) throws a0 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new a0("Unsupported protocol redirect: " + protocol, pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.f19465e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new a0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e10) {
                throw new a0((IOException) e10, pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        } else {
            throw new a0("Null location redirect", pVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(p pVar) throws IOException {
        HttpURLConnection y10;
        p pVar2 = pVar;
        URL url = new URL(pVar2.f19387a.toString());
        int i10 = pVar2.f19389c;
        byte[] bArr = pVar2.f19390d;
        long j10 = pVar2.f19393g;
        long j11 = pVar2.f19394h;
        boolean d10 = pVar2.d(1);
        if (!this.f19465e && !this.f19471k) {
            return y(url, i10, bArr, j10, j11, d10, true, pVar2.f19391e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                long j12 = j10;
                int i14 = i11;
                long j13 = j10;
                int i15 = i13;
                URL url3 = url2;
                long j14 = j11;
                y10 = y(url2, i11, bArr2, j12, j11, d10, false, pVar2.f19391e);
                int responseCode = y10.getResponseCode();
                String headerField = y10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    y10.disconnect();
                    url2 = v(url3, headerField, pVar2);
                    i11 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return y10;
                } else {
                    y10.disconnect();
                    if (!(this.f19471k && responseCode == 302)) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = v(url3, headerField, pVar2);
                }
                i12 = i15;
                j10 = j13;
                j11 = j14;
            } else {
                throw new a0((IOException) new NoRouteToHostException("Too many redirects: " + i13), pVar2, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        return y10;
    }

    private HttpURLConnection y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.f19466f);
        A.setReadTimeout(this.f19467g);
        HashMap hashMap = new HashMap();
        d0 d0Var = this.f19469i;
        if (d0Var != null) {
            hashMap.putAll(d0Var.b());
        }
        hashMap.putAll(this.f19470j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = e0.a(j10, j11);
        if (a10 != null) {
            A.setRequestProperty("Range", a10);
        }
        String str = this.f19468h;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z11);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(p.c(i10));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    private static void z(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = n0.f19738a) >= 19 && i10 <= 20) {
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
                    Method declaredMethod = ((Class) k4.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection A(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public void close() throws a0 {
        try {
            InputStream inputStream = this.f19475o;
            if (inputStream != null) {
                long j10 = this.f19478r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f19479s;
                }
                z(this.f19474n, j11);
                inputStream.close();
            }
            this.f19475o = null;
            u();
            if (this.f19476p) {
                this.f19476p = false;
                r();
            }
        } catch (IOException e10) {
            throw new a0(e10, (p) n0.j(this.f19473m), (int) AdError.SERVER_ERROR_CODE, 3);
        } catch (Throwable th) {
            this.f19475o = null;
            u();
            if (this.f19476p) {
                this.f19476p = false;
                r();
            }
            throw th;
        }
    }

    public long f(p pVar) throws a0 {
        byte[] bArr;
        this.f19473m = pVar;
        long j10 = 0;
        this.f19479s = 0;
        this.f19478r = 0;
        s(pVar);
        try {
            HttpURLConnection x10 = x(pVar);
            this.f19474n = x10;
            this.f19477q = x10.getResponseCode();
            String responseMessage = x10.getResponseMessage();
            int i10 = this.f19477q;
            long j11 = -1;
            if (i10 < 200 || i10 > 299) {
                Map headerFields = x10.getHeaderFields();
                if (this.f19477q == 416) {
                    if (pVar.f19393g == e0.c(x10.getHeaderField("Content-Range"))) {
                        this.f19476p = true;
                        t(pVar);
                        long j12 = pVar.f19394h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0;
                    }
                }
                InputStream errorStream = x10.getErrorStream();
                if (errorStream != null) {
                    try {
                        bArr = n0.V0(errorStream);
                    } catch (IOException unused) {
                        bArr = n0.f19743f;
                    }
                } else {
                    bArr = n0.f19743f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new c0(this.f19477q, responseMessage, this.f19477q == 416 ? new m(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, pVar, bArr2);
            }
            String contentType = x10.getContentType();
            p<String> pVar2 = this.f19472l;
            if (pVar2 == null || pVar2.apply(contentType)) {
                if (this.f19477q == 200) {
                    long j13 = pVar.f19393g;
                    if (j13 != 0) {
                        j10 = j13;
                    }
                }
                boolean w10 = w(x10);
                if (!w10) {
                    long j14 = pVar.f19394h;
                    if (j14 != -1) {
                        this.f19478r = j14;
                    } else {
                        long b10 = e0.b(x10.getHeaderField("Content-Length"), x10.getHeaderField("Content-Range"));
                        if (b10 != -1) {
                            j11 = b10 - j10;
                        }
                        this.f19478r = j11;
                    }
                } else {
                    this.f19478r = pVar.f19394h;
                }
                try {
                    this.f19475o = x10.getInputStream();
                    if (w10) {
                        this.f19475o = new GZIPInputStream(this.f19475o);
                    }
                    this.f19476p = true;
                    t(pVar);
                    try {
                        C(j10, pVar);
                        return this.f19478r;
                    } catch (IOException e10) {
                        u();
                        if (e10 instanceof a0) {
                            throw ((a0) e10);
                        }
                        throw new a0(e10, pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                    }
                } catch (IOException e11) {
                    u();
                    throw new a0(e11, pVar, (int) AdError.SERVER_ERROR_CODE, 1);
                }
            } else {
                u();
                throw new b0(contentType, pVar);
            }
        } catch (IOException e12) {
            u();
            throw a0.c(e12, pVar, 1);
        }
    }

    public Map<String, List<String>> k() {
        HttpURLConnection httpURLConnection = this.f19474n;
        if (httpURLConnection == null) {
            return v.k();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    public Uri o() {
        HttpURLConnection httpURLConnection = this.f19474n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int read(byte[] bArr, int i10, int i11) throws a0 {
        try {
            return B(bArr, i10, i11);
        } catch (IOException e10) {
            throw a0.c(e10, (p) n0.j(this.f19473m), 2);
        }
    }

    private u(String str, int i10, int i11, boolean z10, d0 d0Var, p<String> pVar, boolean z11) {
        super(true);
        this.f19468h = str;
        this.f19466f = i10;
        this.f19467g = i11;
        this.f19465e = z10;
        this.f19469i = d0Var;
        this.f19472l = pVar;
        this.f19470j = new d0();
        this.f19471k = z11;
    }
}
