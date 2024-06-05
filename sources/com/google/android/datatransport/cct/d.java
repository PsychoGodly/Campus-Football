package com.google.android.datatransport.cct;

import a2.j;
import a2.k;
import a2.l;
import a2.m;
import a2.n;
import a2.o;
import a2.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b2.h;
import b2.i;
import c2.f;
import c2.g;
import c2.m;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend */
final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final k7.a f14186a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f14187b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14188c;

    /* renamed from: d  reason: collision with root package name */
    final URL f14189d;

    /* renamed from: e  reason: collision with root package name */
    private final l2.a f14190e;

    /* renamed from: f  reason: collision with root package name */
    private final l2.a f14191f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14192g;

    /* compiled from: CctTransportBackend */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f14193a;

        /* renamed from: b  reason: collision with root package name */
        final j f14194b;

        /* renamed from: c  reason: collision with root package name */
        final String f14195c;

        a(URL url, j jVar, String str) {
            this.f14193a = url;
            this.f14194b = jVar;
            this.f14195c = str;
        }

        /* access modifiers changed from: package-private */
        public a a(URL url) {
            return new a(url, this.f14194b, this.f14195c);
        }
    }

    /* compiled from: CctTransportBackend */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f14196a;

        /* renamed from: b  reason: collision with root package name */
        final URL f14197b;

        /* renamed from: c  reason: collision with root package name */
        final long f14198c;

        b(int i10, URL url, long j10) {
            this.f14196a = i10;
            this.f14197b = url;
            this.f14198c = j10;
        }
    }

    d(Context context, l2.a aVar, l2.a aVar2, int i10) {
        this.f14186a = j.b();
        this.f14188c = context;
        this.f14187b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f14189d = n(a.f14176c);
        this.f14190e = aVar2;
        this.f14191f = aVar;
        this.f14192g = i10;
    }

    /* access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream m10;
        f2.a.f("CctTransportBackend", "Making request to: %s", aVar.f14193a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f14193a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f14192g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f14195c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f14186a.a(aVar.f14194b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                f2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                f2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                f2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, (URL) null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e10) {
            f2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new b(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, (URL) null, 0);
        } catch (IOException | k7.b e11) {
            f2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new b(CommonGatewayClient.CODE_400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.c();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.c();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            f2.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVar;
        HashMap hashMap = new HashMap();
        for (i next : fVar.b()) {
            String j10 = next.j();
            if (!hashMap.containsKey(j10)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j10, arrayList);
            } else {
                ((List) hashMap.get(j10)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar = (i) ((List) entry.getValue()).get(0);
            m.a b10 = a2.m.a().f(p.DEFAULT).g(this.f14191f.a()).h(this.f14190e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(a2.a.a().m(Integer.valueOf(iVar.g("sdk-version"))).j(iVar.b("model")).f(iVar.b("hardware")).d(iVar.b("device")).l(iVar.b(AppLovinEventTypes.USER_VIEWED_PRODUCT)).k(iVar.b("os-uild")).h(iVar.b("manufacturer")).e(iVar.b("fingerprint")).c(iVar.b("country")).g(iVar.b("locale")).i(iVar.b("mcc_mnc")).b(iVar.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar2 : (List) entry.getValue()) {
                h e10 = iVar2.e();
                z1.b b11 = e10.b();
                if (b11.equals(z1.b.b("proto"))) {
                    aVar = l.j(e10.a());
                } else if (b11.equals(z1.b.b("json"))) {
                    aVar = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    f2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                aVar.c(iVar2.f()).d(iVar2.k()).h(iVar2.h("tz-offset")).e(o.a().c(o.c.a(iVar2.g("net-type"))).b(o.b.a(iVar2.g("mobile-subtype"))).a());
                if (iVar2.d() != null) {
                    aVar.b(iVar2.d());
                }
                arrayList3.add(aVar.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f14197b;
        if (url == null) {
            return null;
        }
        f2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f14197b);
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f14187b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f14188c).getSimOperator()).c("application_build", Integer.toString(h(this.f14188c))).d();
    }

    public g b(f fVar) {
        j i10 = i(fVar);
        URL url = this.f14189d;
        String str = null;
        if (fVar.c() != null) {
            try {
                a c10 = a.c(fVar.c());
                if (c10.d() != null) {
                    str = c10.d();
                }
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) g2.b.a(5, new a(url, i10, str), new b(this), c.f14185a);
            int i11 = bVar.f14196a;
            if (i11 == 200) {
                return g.e(bVar.f14198c);
            }
            if (i11 < 500) {
                if (i11 != 404) {
                    if (i11 == 400) {
                        return g.d();
                    }
                    return g.a();
                }
            }
            return g.f();
        } catch (IOException e10) {
            f2.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    d(Context context, l2.a aVar, l2.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
