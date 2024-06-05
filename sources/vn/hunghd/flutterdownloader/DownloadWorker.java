package vn.hunghd.flutterdownloader;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.l;
import androidx.core.app.o;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import io.flutter.view.FlutterCallbackInformation;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import lc.k;
import nf.c;
import nf.d;
import nf.e;
import nf.f;
import nf.i;
import nf.j;
import org.json.JSONException;
import org.json.JSONObject;
import sd.w;
import zb.a;

/* compiled from: DownloadWorker.kt */
public final class DownloadWorker extends Worker implements k.c {
    private static final ArrayDeque<List<Object>> A = new ArrayDeque<>();
    private static io.flutter.embedding.engine.a B;
    private static final HostnameVerifier C = f.f36564a;

    /* renamed from: x  reason: collision with root package name */
    public static final a f39152x = new a((h) null);

    /* renamed from: y  reason: collision with root package name */
    private static final String f39153y = DownloadWorker.class.getSimpleName();

    /* renamed from: z  reason: collision with root package name */
    private static final AtomicBoolean f39154z = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final Pattern f39155b = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");

    /* renamed from: c  reason: collision with root package name */
    private final Pattern f39156c = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");

    /* renamed from: d  reason: collision with root package name */
    private final Pattern f39157d = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");

    /* renamed from: f  reason: collision with root package name */
    private k f39158f;

    /* renamed from: g  reason: collision with root package name */
    private nf.k f39159g;

    /* renamed from: h  reason: collision with root package name */
    private j f39160h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39161i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f39162j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f39163k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f39164l;

    /* renamed from: m  reason: collision with root package name */
    private int f39165m;

    /* renamed from: n  reason: collision with root package name */
    private int f39166n;

    /* renamed from: o  reason: collision with root package name */
    private String f39167o;

    /* renamed from: p  reason: collision with root package name */
    private String f39168p;

    /* renamed from: q  reason: collision with root package name */
    private String f39169q;

    /* renamed from: r  reason: collision with root package name */
    private String f39170r;

    /* renamed from: s  reason: collision with root package name */
    private String f39171s;

    /* renamed from: t  reason: collision with root package name */
    private String f39172t;

    /* renamed from: u  reason: collision with root package name */
    private long f39173u;

    /* renamed from: v  reason: collision with root package name */
    private int f39174v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f39175w;

    /* compiled from: DownloadWorker.kt */
    public static final class a {

        /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a$a  reason: collision with other inner class name */
        /* compiled from: DownloadWorker.kt */
        public static final class C0456a implements X509TrustManager {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f39176a;

            C0456a(String str) {
                this.f39176a = str;
            }

            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                m.e(x509CertificateArr, "chain");
                m.e(str, "authType");
                Log.i(this.f39176a, "checkClientTrusted");
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                m.e(x509CertificateArr, "chain");
                m.e(str, "authType");
                Log.i(this.f39176a, "checkServerTrusted");
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b() {
            TrustManager[] trustManagerArr = {new C0456a("trustAllHosts")};
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                m.d(instance, "getInstance(\"TLS\")");
                instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: DownloadWorker.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39177a;

        static {
            int[] iArr = new int[nf.a.values().length];
            iArr[nf.a.RUNNING.ordinal()] = 1;
            iArr[nf.a.CANCELED.ordinal()] = 2;
            iArr[nf.a.FAILED.ordinal()] = 3;
            iArr[nf.a.PAUSED.ordinal()] = 4;
            iArr[nf.a.COMPLETE.ordinal()] = 5;
            f39177a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        m.e(context, "context");
        m.e(workerParameters, "params");
        new Handler(context.getMainLooper()).post(new d(this, context));
    }

    private final void A(Context context) {
        synchronized (f39154z) {
            if (B == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                m.d(sharedPreferences, "context.getSharedPrefere…PRIVATE\n                )");
                long j10 = sharedPreferences.getLong("callback_dispatcher_handle_key", 0);
                B = new io.flutter.embedding.engine.a(getApplicationContext(), (String[]) null, false);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                if (lookupCallbackInformation == null) {
                    t("Fatal: failed to find callback");
                    return;
                }
                String i10 = xb.a.e().c().i();
                m.d(i10, "instance().flutterLoader().findAppBundlePath()");
                AssetManager assets = getApplicationContext().getAssets();
                io.flutter.embedding.engine.a aVar = B;
                if (aVar != null) {
                    zb.a j11 = aVar.j();
                    if (j11 != null) {
                        j11.j(new a.b(assets, i10, lookupCallbackInformation));
                    }
                }
            }
            w wVar = w.f38141a;
            io.flutter.embedding.engine.a aVar2 = B;
            m.b(aVar2);
            k kVar = new k(aVar2.j(), "vn.hunghd/downloader_background");
            this.f39158f = kVar;
            kVar.e(this);
        }
    }

    private final void B(Context context, String str, nf.a aVar, int i10, PendingIntent pendingIntent, boolean z10) {
        v(aVar, i10);
        if (this.f39161i) {
            l.e D = new l.e(context, "FLUTTER_DOWNLOADER_NOTIFICATION").q(str).o(pendingIntent).C(true).k(true).D(-1);
            m.d(D, "Builder(context, CHANNEL…ationCompat.PRIORITY_LOW)");
            int i11 = b.f39177a[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    D.p(this.f39169q).E(0, 0, false);
                    D.B(false).G(17301634);
                } else if (i11 == 3) {
                    D.p(this.f39170r).E(0, 0, false);
                    D.B(false).G(17301634);
                } else if (i11 == 4) {
                    D.p(this.f39171s).E(0, 0, false);
                    D.B(false).G(17301634);
                } else if (i11 != 5) {
                    D.E(0, 0, false);
                    D.B(false).G(q());
                } else {
                    D.p(this.f39172t).E(0, 0, false);
                    D.B(false).G(17301634);
                }
            } else if (i10 <= 0) {
                D.p(this.f39167o).E(0, 0, false);
                D.B(false).G(q());
            } else if (i10 < 100) {
                D.p(this.f39168p).E(100, i10, false);
                D.B(true).G(17301633);
            } else {
                D.p(this.f39172t).E(0, 0, false);
                D.B(false).G(17301634);
            }
            if (System.currentTimeMillis() - this.f39173u < 1000) {
                if (z10) {
                    t("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    t("Update too frequently!!!!, this should be dropped");
                    return;
                }
            }
            t("Update notification: {notificationId: " + this.f39166n + ", title: " + str + ", status: " + aVar + ", progress: " + i10 + '}');
            o.e(context).g(this.f39166n, D.c());
            this.f39173u = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean e(String str, SSLSession sSLSession) {
        return true;
    }

    /* access modifiers changed from: private */
    public static final void g(DownloadWorker downloadWorker, Context context) {
        m.e(downloadWorker, "this$0");
        m.e(context, "$context");
        downloadWorker.A(context);
    }

    private final void h(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (!(str6 == null || str5 == null || str4 == null)) {
            if (o.r(str6, "image/", false, 2, (Object) null)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", str4);
                contentValues.put("_display_name", str4);
                contentValues.put("description", MaxReward.DEFAULT_LABEL);
                contentValues.put("mime_type", str6);
                contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("_data", str5);
                t("insert " + contentValues + " to MediaStore");
                getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                String str7 = " to MediaStore";
                if (o.r(str6, MimeTypes.BASE_TYPE_VIDEO, false, 2, (Object) null)) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("title", str4);
                    contentValues2.put("_display_name", str4);
                    contentValues2.put("description", MaxReward.DEFAULT_LABEL);
                    contentValues2.put("mime_type", str6);
                    contentValues2.put("date_added", Long.valueOf(System.currentTimeMillis()));
                    contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                    contentValues2.put("_data", str5);
                    t("insert " + contentValues2 + str7);
                    getApplicationContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues2);
                    return;
                }
                return;
            }
        }
    }

    private final void i() {
        j jVar = this.f39160h;
        m.b(jVar);
        String uuid = getId().toString();
        m.d(uuid, "id.toString()");
        c d10 = jVar.d(uuid);
        if (d10 != null && d10.l() != nf.a.COMPLETE && !d10.h()) {
            String b10 = d10.b();
            if (b10 == null) {
                b10 = d10.o().substring(p.K(d10.o(), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 0, false, 6, (Object) null) + 1, d10.o().length());
                m.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            File file = new File(d10.j() + File.separator + b10);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private final File j(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            u("It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            u("Create a file using java.io API failed ");
            return null;
        }
    }

    private final Uri k(String str, String str2) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        m.d(uri, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return getApplicationContext().getContentResolver().insert(uri, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            u("Create a file using MediaStore API failed.");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0497, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0498, code lost:
        r1 = r0;
        r7 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d4 A[Catch:{ IOException -> 0x049b, all -> 0x0497 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d5 A[Catch:{ IOException -> 0x049b, all -> 0x0497 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ed A[SYNTHETIC, Splitter:B:105:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0209 A[Catch:{ IOException -> 0x03cc, all -> 0x03c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025c A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02bf A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c4 A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02c6 A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02db A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f0 A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ff A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0310 A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03ab A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03ac A[Catch:{ IOException -> 0x03bd, all -> 0x03b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x044d A[SYNTHETIC, Splitter:B:224:0x044d] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0497 A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:58:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04de A[Catch:{ all -> 0x0511 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e1 A[Catch:{ all -> 0x0511 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ff A[SYNTHETIC, Splitter:B:266:0x04ff] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0527 A[SYNTHETIC, Splitter:B:281:0x0527] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0187 A[Catch:{ IOException -> 0x049b, all -> 0x0497 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018e A[Catch:{ IOException -> 0x049b, all -> 0x0497 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019a A[Catch:{ IOException -> 0x049b, all -> 0x0497 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34) {
        /*
            r27 = this;
            r8 = r27
            r1 = r30
            r9 = r31
            r2 = r34
            java.lang.String r10 = "id.toString()"
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            nf.j r4 = r8.f39160h     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
            if (r4 != 0) goto L_0x0015
            r4 = 0
            goto L_0x0024
        L_0x0015:
            java.util.UUID r5 = r27.getId()     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
            kotlin.jvm.internal.m.d(r5, r10)     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
            nf.c r4 = r4.d(r5)     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
        L_0x0024:
            if (r4 == 0) goto L_0x002c
            int r4 = r4.g()     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
            r8.f39165m = r4     // Catch:{ IOException -> 0x04bf, all -> 0x04b8 }
        L_0x002c:
            r4 = 0
            r6 = r29
            r7 = 0
        L_0x0031:
            boolean r12 = r3.containsKey(r6)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r15 = 1
            if (r12 != 0) goto L_0x0041
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r3.put(r6, r12)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r12 = 1
            goto L_0x004f
        L_0x0041:
            java.lang.Object r12 = r3.get(r6)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.b(r12)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            int r12 = r12.intValue()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            int r12 = r12 + r15
        L_0x004f:
            r13 = 3
            if (r12 > r13) goto L_0x04a6
            java.net.URL r12 = new java.net.URL     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r12.<init>(r6)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            boolean r13 = r8.f39164l     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.String r14 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.lang.String r11 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            java.lang.String r15 = "https"
            r17 = r3
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            r19 = r4
            java.lang.String r4 = "US"
            java.lang.String r5 = "resourceUrl.protocol"
            if (r13 == 0) goto L_0x00ac
            vn.hunghd.flutterdownloader.DownloadWorker$a r13 = f39152x     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r13.b()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.String r13 = r12.getProtocol()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r13, r5)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r5, r4)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.String r4 = r13.toLowerCase(r5)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r4, r3)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            boolean r3 = kotlin.jvm.internal.m.a(r4, r15)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x009d
            java.net.URLConnection r3 = r12.openConnection()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x0097
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            javax.net.ssl.HostnameVerifier r4 = C     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r3.setHostnameVerifier(r4)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            goto L_0x00dc
        L_0x0097:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r1.<init>(r14)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            throw r1     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x009d:
            java.net.URLConnection r3 = r12.openConnection()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x00a6
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            goto L_0x00dc
        L_0x00a6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r1.<init>(r11)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            throw r1     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x00ac:
            java.lang.String r13 = r12.getProtocol()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r13, r5)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r5, r4)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.String r4 = r13.toLowerCase(r5)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            kotlin.jvm.internal.m.d(r4, r3)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            boolean r3 = kotlin.jvm.internal.m.a(r4, r15)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x00d4
            java.net.URLConnection r3 = r12.openConnection()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x00ce
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            goto L_0x00dc
        L_0x00ce:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r1.<init>(r14)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            throw r1     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x00d4:
            java.net.URLConnection r3 = r12.openConnection()     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            if (r3 == 0) goto L_0x04a0
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x00dc:
            r11 = r3
            java.lang.String r3 = "Open connection to "
            java.lang.String r3 = kotlin.jvm.internal.m.m(r3, r6)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r11.setConnectTimeout(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r11.setReadTimeout(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r7 = 0
            r11.setInstanceFollowRedirects(r7)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "Mozilla/5.0..."
            r11.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r3 = r32
            r8.x(r11, r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r33 == 0) goto L_0x0104
            long r4 = r8.z(r11, r9, r1)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r19 = r4
        L_0x0104:
            int r12 = r11.getResponseCode()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r4 = 307(0x133, float:4.3E-43)
            if (r12 == r4) goto L_0x045b
            r4 = 308(0x134, float:4.32E-43)
            if (r12 == r4) goto L_0x045b
            switch(r12) {
                case 301: goto L_0x045b;
                case 302: goto L_0x045b;
                case 303: goto L_0x045b;
                default: goto L_0x0113;
            }     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
        L_0x0113:
            r11.connect()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r21 = "Download canceled"
            if (r12 == r2) goto L_0x0122
            if (r33 == 0) goto L_0x03d3
            r2 = 206(0xce, float:2.89E-43)
            if (r12 != r2) goto L_0x03d3
        L_0x0122:
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r2 != 0) goto L_0x03d3
            java.lang.String r5 = r11.getContentType()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = "httpConn.contentType"
            kotlin.jvm.internal.m.d(r5, r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r3 = 24
            if (r2 < r3) goto L_0x013c
            long r2 = r11.getContentLengthLong()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            goto L_0x0141
        L_0x013c:
            int r2 = r11.getContentLength()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            long r2 = (long) r2     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
        L_0x0141:
            r22 = r2
            java.lang.String r2 = "Content-Type = "
            java.lang.String r2 = kotlin.jvm.internal.m.m(r2, r5)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = "Content-Length = "
            java.lang.Long r3 = java.lang.Long.valueOf(r22)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = kotlin.jvm.internal.m.m(r2, r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = r8.m(r5)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r3 = "Charset = "
            java.lang.String r3 = kotlin.jvm.internal.m.m(r3, r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r33 != 0) goto L_0x01c6
            if (r9 != 0) goto L_0x01c6
            java.lang.String r3 = "Content-Disposition"
            java.lang.String r3 = r11.getHeaderField(r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "Content-Disposition = "
            java.lang.String r4 = kotlin.jvm.internal.m.m(r4, r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r3 == 0) goto L_0x0184
            int r4 = r3.length()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r4 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r4 = 0
            goto L_0x0185
        L_0x0184:
            r4 = 1
        L_0x0185:
            if (r4 != 0) goto L_0x018c
            java.lang.String r2 = r8.o(r3, r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r9 = r2
        L_0x018c:
            if (r9 == 0) goto L_0x0197
            int r2 = r9.length()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r2 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r2 = 0
            goto L_0x0198
        L_0x0197:
            r2 = 1
        L_0x0198:
            if (r2 == 0) goto L_0x01c6
            java.lang.String r13 = "/"
            r14 = 0
            r15 = 0
            r2 = 6
            r17 = 0
            r12 = r6
            r3 = 1
            r16 = r2
            int r2 = ne.p.K(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            int r2 = r2 + r3
            java.lang.String r2 = r6.substring(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.m.d(r2, r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r4)     // Catch:{ IllegalArgumentException -> 0x01bf }
            goto L_0x01c4
        L_0x01ba:
            r0 = move-exception
            r13 = r0
            r9 = r2
            goto L_0x049d
        L_0x01bf:
            r0 = move-exception
            r4 = r0
            r4.printStackTrace()     // Catch:{ IOException -> 0x01ba, all -> 0x0497 }
        L_0x01c4:
            r9 = r2
            goto L_0x01c7
        L_0x01c6:
            r3 = 1
        L_0x01c7:
            java.lang.String r2 = "fileName = "
            java.lang.String r2 = kotlin.jvm.internal.m.m(r2, r9)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            nf.j r2 = r8.f39160h     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r2 != 0) goto L_0x01d5
            goto L_0x01e5
        L_0x01d5:
            java.util.UUID r4 = r27.getId()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            kotlin.jvm.internal.m.d(r4, r10)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r2.g(r4, r9, r5)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            sd.w r2 = sd.w.f38141a     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
        L_0x01e5:
            java.io.InputStream r12 = r11.getInputStream()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r13 = 29
            if (r33 == 0) goto L_0x0209
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r2.<init>()     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r2.append(r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r2.append(r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r2.append(r9)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r14 = r1
            r15 = r2
            goto L_0x023e
        L_0x0209:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            if (r2 < r13) goto L_0x0229
            boolean r2 = r8.f39175w     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            if (r2 == 0) goto L_0x0229
            android.net.Uri r1 = r8.k(r9, r5)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.lang.String r2 = r8.p(r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            android.content.ContentResolver r3 = r28.getContentResolver()     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.lang.String r4 = "w"
            java.io.OutputStream r1 = r3.openOutputStream(r1, r4)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r15 = r1
            r14 = r2
            goto L_0x023e
        L_0x0229:
            kotlin.jvm.internal.m.b(r9)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.io.File r1 = r8.j(r9, r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.lang.String r2 = r1.getPath()     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r3.<init>(r1, r7)     // Catch:{ IOException -> 0x03cc, all -> 0x03c4 }
            r14 = r2
            r15 = r3
        L_0x023e:
            kotlin.jvm.internal.x r6 = new kotlin.jvm.internal.x     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r6.<init>()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r1]     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r1 = r19
        L_0x0249:
            int r3 = r12.read(r4)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r6.f36053a = r3     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            sd.w r16 = sd.w.f38141a     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r13 = -1
            r7 = 100
            if (r3 == r13) goto L_0x02bf
            boolean r3 = r27.isStopped()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r3 != 0) goto L_0x02bf
            int r3 = r6.f36053a     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r32 = r5
            r30 = r6
            long r5 = (long) r3     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            long r24 = r1 + r5
            long r1 = (long) r7     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            long r1 = r1 * r24
            long r5 = r22 + r19
            long r1 = r1 / r5
            int r5 = (int) r1     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r13 = 0
            if (r15 != 0) goto L_0x0270
            goto L_0x0273
        L_0x0270:
            r15.write(r4, r13, r3)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
        L_0x0273:
            int r1 = r8.f39165m     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r1 == 0) goto L_0x027e
            int r2 = r8.f39174v     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            int r2 = r2 + r1
            if (r5 > r2) goto L_0x027e
            if (r5 != r7) goto L_0x02ae
        L_0x027e:
            if (r5 == r1) goto L_0x02ae
            r8.f39165m = r5     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            nf.j r1 = r8.f39160h     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            nf.a r6 = nf.a.RUNNING     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r1.i(r2, r6, r5)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r7 = 0
            r16 = 0
            r1 = r27
            r2 = r28
            r3 = r9
            r17 = r4
            r4 = r6
            r6 = r32
            r26 = r30
            r13 = r6
            r6 = r7
            r7 = r16
            r1.B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            goto L_0x02b4
        L_0x02ae:
            r26 = r30
            r13 = r32
            r17 = r4
        L_0x02b4:
            r5 = r13
            r4 = r17
            r1 = r24
            r6 = r26
            r7 = 0
            r13 = 29
            goto L_0x0249
        L_0x02bf:
            r13 = r5
            nf.j r1 = r8.f39160h     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r1 != 0) goto L_0x02c6
            r1 = 0
            goto L_0x02d5
        L_0x02c6:
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            nf.c r1 = r1.d(r2)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
        L_0x02d5:
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r2 == 0) goto L_0x02e8
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            boolean r2 = r1.h()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r2 == 0) goto L_0x02e8
            int r2 = r8.f39165m     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r5 = r2
            goto L_0x02ea
        L_0x02e8:
            r5 = 100
        L_0x02ea:
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r2 == 0) goto L_0x02ff
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            boolean r1 = r1.h()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r1 == 0) goto L_0x02fc
            nf.a r1 = nf.a.PAUSED     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            goto L_0x0301
        L_0x02fc:
            nf.a r1 = nf.a.CANCELED     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            goto L_0x0301
        L_0x02ff:
            nf.a r1 = nf.a.COMPLETE     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
        L_0x0301:
            r4 = r1
            android.content.Context r1 = r27.getApplicationContext()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r1 = androidx.core.content.a.checkSelfPermission(r1, r2)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            nf.a r2 = nf.a.COMPLETE     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r4 != r2) goto L_0x0388
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r3 = 29
            if (r2 >= r3) goto L_0x0329
            boolean r3 = r8.s(r13)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r3 == 0) goto L_0x0329
            boolean r3 = r8.r(r14)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r3 == 0) goto L_0x0329
            java.lang.String r3 = r8.n(r13)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r8.h(r9, r14, r3)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
        L_0x0329:
            boolean r3 = r8.f39162j     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r3 == 0) goto L_0x0388
            r3 = 29
            if (r2 >= r3) goto L_0x034e
            if (r1 == 0) goto L_0x034e
            if (r15 == 0) goto L_0x0341
            r15.flush()
            r15.close()     // Catch:{ IOException -> 0x033c }
            goto L_0x0341
        L_0x033c:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0341:
            r12.close()     // Catch:{ IOException -> 0x0345 }
            goto L_0x034a
        L_0x0345:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x034a:
            r11.disconnect()
            return
        L_0x034e:
            nf.h r1 = nf.h.f36574a     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            android.content.Context r3 = r27.getApplicationContext()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.lang.String r6 = "applicationContext"
            kotlin.jvm.internal.m.d(r3, r6)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.b(r14)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            android.content.Intent r1 = r1.c(r3, r14, r13)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r1 == 0) goto L_0x037f
            java.lang.String r3 = "Setting an intent to open the file "
            java.lang.String r3 = kotlin.jvm.internal.m.m(r3, r14)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r8.t(r3)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r3 = 31
            if (r2 < r3) goto L_0x0372
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            goto L_0x0374
        L_0x0372:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0374:
            android.content.Context r3 = r27.getApplicationContext()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r6 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r3, r6, r1, r2)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r6 = r1
            goto L_0x0389
        L_0x037f:
            java.lang.String r1 = "There's no application that can open the file "
            java.lang.String r1 = kotlin.jvm.internal.m.m(r1, r14)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r8.t(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
        L_0x0388:
            r6 = 0
        L_0x0389:
            nf.j r1 = r8.f39160h     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r1.i(r2, r4, r5)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            r7 = 1
            r1 = r27
            r2 = r28
            r3 = r9
            r1.B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            boolean r1 = r27.isStopped()     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            if (r1 == 0) goto L_0x03ac
            goto L_0x03ae
        L_0x03ac:
            java.lang.String r21 = "File downloaded"
        L_0x03ae:
            r1 = r21
            r8.t(r1)     // Catch:{ IOException -> 0x03bd, all -> 0x03b5 }
            goto L_0x043d
        L_0x03b5:
            r0 = move-exception
            r1 = r0
            r7 = r11
            r18 = r12
            r11 = r15
            goto L_0x0517
        L_0x03bd:
            r0 = move-exception
            r13 = r0
            r18 = r11
            r11 = r15
            goto L_0x04c5
        L_0x03c4:
            r0 = move-exception
            r1 = r0
            r7 = r11
            r18 = r12
            r11 = 0
            goto L_0x0517
        L_0x03cc:
            r0 = move-exception
            r13 = r0
            r18 = r11
            r11 = 0
            goto L_0x04c5
        L_0x03d3:
            nf.j r1 = r8.f39160h     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            nf.c r1 = r1.d(r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            boolean r2 = r27.isStopped()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r2 == 0) goto L_0x03fc
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            boolean r1 = r1.h()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r1 == 0) goto L_0x03f9
            nf.a r1 = nf.a.PAUSED     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            goto L_0x03fe
        L_0x03f9:
            nf.a r1 = nf.a.CANCELED     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            goto L_0x03fe
        L_0x03fc:
            nf.a r1 = nf.a.FAILED     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
        L_0x03fe:
            r4 = r1
            nf.j r1 = r8.f39160h     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.util.UUID r2 = r27.getId()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            int r3 = r8.f39165m     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r1.i(r2, r4, r3)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r9 != 0) goto L_0x0419
            r3 = r29
            goto L_0x041a
        L_0x0419:
            r3 = r9
        L_0x041a:
            r5 = -1
            r6 = 0
            r7 = 1
            r1 = r27
            r2 = r28
            r1.B(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            boolean r1 = r27.isStopped()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            if (r1 == 0) goto L_0x042d
        L_0x042a:
            r1 = r21
            goto L_0x0438
        L_0x042d:
            java.lang.String r1 = "Server replied HTTP code: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r21 = kotlin.jvm.internal.m.m(r1, r2)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            goto L_0x042a
        L_0x0438:
            r8.t(r1)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r12 = 0
            r15 = 0
        L_0x043d:
            if (r15 == 0) goto L_0x044b
            r15.flush()
            r15.close()     // Catch:{ IOException -> 0x0446 }
            goto L_0x044b
        L_0x0446:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x044b:
            if (r12 == 0) goto L_0x0456
            r12.close()     // Catch:{ IOException -> 0x0451 }
            goto L_0x0456
        L_0x0451:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0456:
            r11.disconnect()
            goto L_0x0510
        L_0x045b:
            java.lang.String r4 = "Response with redirection code"
            r8.t(r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "Location"
            java.lang.String r4 = r11.getHeaderField(r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r5 = "httpConn.getHeaderField(\"Location\")"
            kotlin.jvm.internal.m.d(r4, r5)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r5 = "Location = "
            java.lang.String r5 = kotlin.jvm.internal.m.m(r5, r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r5)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r6.<init>(r5, r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r6 = r6.toExternalForm()     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "next.toExternalForm()"
            kotlin.jvm.internal.m.d(r6, r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            java.lang.String r4 = "New url: "
            java.lang.String r4 = kotlin.jvm.internal.m.m(r4, r6)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r8.t(r4)     // Catch:{ IOException -> 0x049b, all -> 0x0497 }
            r7 = r11
            r3 = r17
            r4 = r19
            goto L_0x0031
        L_0x0497:
            r0 = move-exception
            r1 = r0
            r7 = r11
            goto L_0x04bb
        L_0x049b:
            r0 = move-exception
            r13 = r0
        L_0x049d:
            r18 = r11
            goto L_0x04b5
        L_0x04a0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            r1.<init>(r11)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            throw r1     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x04a6:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            java.lang.String r2 = "Stuck in redirect loop"
            r1.<init>(r2)     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
            throw r1     // Catch:{ IOException -> 0x04b1, all -> 0x04ae }
        L_0x04ae:
            r0 = move-exception
            r1 = r0
            goto L_0x04bb
        L_0x04b1:
            r0 = move-exception
            r13 = r0
            r18 = r7
        L_0x04b5:
            r11 = 0
            r12 = 0
            goto L_0x04c5
        L_0x04b8:
            r0 = move-exception
            r1 = r0
            r7 = 0
        L_0x04bb:
            r11 = 0
            r18 = 0
            goto L_0x0517
        L_0x04bf:
            r0 = move-exception
            r13 = r0
            r11 = 0
            r12 = 0
            r18 = 0
        L_0x04c5:
            nf.j r1 = r8.f39160h     // Catch:{ all -> 0x0511 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ all -> 0x0511 }
            java.util.UUID r2 = r27.getId()     // Catch:{ all -> 0x0511 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0511 }
            kotlin.jvm.internal.m.d(r2, r10)     // Catch:{ all -> 0x0511 }
            nf.a r4 = nf.a.FAILED     // Catch:{ all -> 0x0511 }
            int r3 = r8.f39165m     // Catch:{ all -> 0x0511 }
            r1.i(r2, r4, r3)     // Catch:{ all -> 0x0511 }
            if (r9 != 0) goto L_0x04e1
            r3 = r29
            goto L_0x04e2
        L_0x04e1:
            r3 = r9
        L_0x04e2:
            r5 = -1
            r6 = 0
            r7 = 1
            r1 = r27
            r2 = r28
            r1.B(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0511 }
            r13.printStackTrace()     // Catch:{ all -> 0x0511 }
            if (r11 == 0) goto L_0x04fd
            r11.flush()
            r11.close()     // Catch:{ IOException -> 0x04f8 }
            goto L_0x04fd
        L_0x04f8:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x04fd:
            if (r12 == 0) goto L_0x0508
            r12.close()     // Catch:{ IOException -> 0x0503 }
            goto L_0x0508
        L_0x0503:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0508:
            if (r18 != 0) goto L_0x050b
            goto L_0x0510
        L_0x050b:
            r18.disconnect()
            sd.w r1 = sd.w.f38141a
        L_0x0510:
            return
        L_0x0511:
            r0 = move-exception
            r1 = r0
            r7 = r18
            r18 = r12
        L_0x0517:
            if (r11 == 0) goto L_0x0525
            r11.flush()
            r11.close()     // Catch:{ IOException -> 0x0520 }
            goto L_0x0525
        L_0x0520:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0525:
            if (r18 == 0) goto L_0x0530
            r18.close()     // Catch:{ IOException -> 0x052b }
            goto L_0x0530
        L_0x052b:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0530:
            if (r7 != 0) goto L_0x0533
            goto L_0x0538
        L_0x0533:
            r7.disconnect()
            sd.w r2 = sd.w.f38141a
        L_0x0538:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.l(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    private final String m(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f39155b.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = m.f(group.charAt(!z10 ? i10 : length), 32) <= 0;
            if (!z10) {
                if (!z11) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        String obj = group.subSequence(i10, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale locale = Locale.US;
        m.d(locale, "US");
        String upperCase = obj.toUpperCase(locale);
        m.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    private final String n(String str) {
        List f02;
        String str2;
        if (str == null || (f02 = p.f0(str, new String[]{";"}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        Object[] array = f02.toArray(new String[0]);
        m.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (strArr == null || (str2 = strArr[0]) == null) {
            return null;
        }
        int length = str2.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = m.f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
            if (!z10) {
                if (!z11) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!z11) {
                break;
            } else {
                length--;
            }
        }
        return str2.subSequence(i10, length + 1).toString();
    }

    private final String o(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f39157d.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f39156c.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                m.d(locale, "US");
                String upperCase = group2.toUpperCase(locale);
                m.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str2 = upperCase;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ce.b.a(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String p(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_data"
            r1 = 0
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ IllegalArgumentException -> 0x0038 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0038 }
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ IllegalArgumentException -> 0x0038 }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0038 }
            if (r10 != 0) goto L_0x001d
            ce.b.a(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0038 }
            return r1
        L_0x001d:
            boolean r2 = r10.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0025
            r0 = r1
            goto L_0x002d
        L_0x0025:
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            ce.b.a(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0038 }
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            ce.b.a(r10, r0)     // Catch:{ IllegalArgumentException -> 0x0038 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0038 }
        L_0x0038:
            r10 = move-exception
            r10.printStackTrace()
            java.lang.String r10 = "Get a path for a MediaStore failed"
            r9.u(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.p(android.net.Uri):java.lang.String");
    }

    private final int q() {
        try {
            ApplicationInfo applicationInfo = getApplicationContext().getPackageManager().getApplicationInfo(getApplicationContext().getPackageName(), 128);
            m.d(applicationInfo, "applicationContext.packa…ATA\n                    )");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private final boolean r(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        m.d(externalStorageDirectory, "getExternalStorageDirectory()");
        if (str == null) {
            return false;
        }
        String path = externalStorageDirectory.getPath();
        m.d(path, "externalStorageDir.path");
        if (o.r(str, path, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    private final boolean s(String str) {
        String n10 = n(str);
        if (n10 == null) {
            return false;
        }
        if (o.r(n10, "image/", false, 2, (Object) null) || o.r(n10, MimeTypes.BASE_TYPE_VIDEO, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    private final void t(String str) {
        if (this.f39163k) {
            Log.d(f39153y, str);
        }
    }

    private final void u(String str) {
        if (this.f39163k) {
            Log.e(f39153y, str);
        }
    }

    private final void v(nf.a aVar, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(getInputData().k("callback_handle", 0)));
        String uuid = getId().toString();
        m.d(uuid, "id.toString()");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(aVar.ordinal()));
        arrayList.add(Integer.valueOf(i10));
        AtomicBoolean atomicBoolean = f39154z;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                A.add(arrayList);
            } else {
                new Handler(getApplicationContext().getMainLooper()).post(new e(this, arrayList));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void w(DownloadWorker downloadWorker, List list) {
        m.e(downloadWorker, "this$0");
        m.e(list, "$args");
        k kVar = downloadWorker.f39158f;
        if (kVar != null) {
            kVar.c(MaxReward.DEFAULT_LABEL, list);
        }
    }

    private final void x(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            t(m.m("Headers = ", str));
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                m.d(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void y(Context context) {
        if (this.f39161i && Build.VERSION.SDK_INT >= 26) {
            Resources resources = getApplicationContext().getResources();
            String string = resources.getString(i.flutter_downloader_notification_channel_name);
            m.d(string, "res.getString(R.string.f…otification_channel_name)");
            String string2 = resources.getString(i.flutter_downloader_notification_channel_description);
            m.d(string2, "res.getString(R.string.f…tion_channel_description)");
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            o e10 = o.e(context);
            m.d(e10, "from(context)");
            e10.d(notificationChannel);
        }
    }

    private final long z(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(str2 + File.separator + str).length();
        t("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }

    public ListenableWorker.a doWork() {
        c cVar;
        boolean z10;
        Object l10;
        nf.k a10 = nf.k.f36577a.a(getApplicationContext());
        this.f39159g = a10;
        m.b(a10);
        this.f39160h = new j(a10);
        String l11 = getInputData().l("url");
        if (l11 != null) {
            String l12 = getInputData().l("file_name");
            String l13 = getInputData().l("saved_file");
            if (l13 != null) {
                String l14 = getInputData().l("headers");
                if (l14 != null) {
                    boolean h10 = getInputData().h("is_resume", false);
                    int i10 = getInputData().i("timeout", 15000);
                    this.f39163k = getInputData().h("debug", false);
                    this.f39174v = getInputData().i("step", 10);
                    this.f39164l = getInputData().h("ignoreSsl", false);
                    Resources resources = getApplicationContext().getResources();
                    this.f39167o = resources.getString(i.flutter_downloader_notification_started);
                    this.f39168p = resources.getString(i.flutter_downloader_notification_in_progress);
                    this.f39169q = resources.getString(i.flutter_downloader_notification_canceled);
                    this.f39170r = resources.getString(i.flutter_downloader_notification_failed);
                    this.f39171s = resources.getString(i.flutter_downloader_notification_paused);
                    this.f39172t = resources.getString(i.flutter_downloader_notification_complete);
                    j jVar = this.f39160h;
                    if (jVar == null) {
                        cVar = null;
                    } else {
                        String uuid = getId().toString();
                        m.d(uuid, "id.toString()");
                        cVar = jVar.d(uuid);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DownloadWorker{url=");
                    sb2.append(l11);
                    sb2.append(",filename=");
                    sb2.append(l12);
                    sb2.append(",savedDir=");
                    sb2.append(l13);
                    sb2.append(",header=");
                    sb2.append(l14);
                    sb2.append(",isResume=");
                    sb2.append(h10);
                    sb2.append(",status=");
                    Object obj = "GONE";
                    if (!(cVar == null || (l10 = cVar.l()) == null)) {
                        obj = l10;
                    }
                    sb2.append(obj);
                    t(sb2.toString());
                    if (cVar == null || cVar.l() == nf.a.CANCELED) {
                        ListenableWorker.a c10 = ListenableWorker.a.c();
                        m.d(c10, "success()");
                        return c10;
                    }
                    this.f39161i = getInputData().h("show_notification", false);
                    this.f39162j = getInputData().h("open_file_from_notification", false);
                    this.f39175w = getInputData().h("save_in_public_storage", false);
                    this.f39166n = cVar.f();
                    Context applicationContext = getApplicationContext();
                    m.d(applicationContext, "applicationContext");
                    y(applicationContext);
                    Context applicationContext2 = getApplicationContext();
                    m.d(applicationContext2, "applicationContext");
                    String str = l12 == null ? l11 : l12;
                    nf.a aVar = nf.a.RUNNING;
                    nf.a aVar2 = aVar;
                    boolean z11 = h10;
                    String str2 = "applicationContext";
                    B(applicationContext2, str, aVar, cVar.g(), (PendingIntent) null, false);
                    j jVar2 = this.f39160h;
                    if (jVar2 != null) {
                        String uuid2 = getId().toString();
                        m.d(uuid2, "id.toString()");
                        jVar2.i(uuid2, aVar2, cVar.g());
                    }
                    if (new File(l13 + File.separator + l12).exists()) {
                        t("exists file for " + l12 + "automatic resuming...");
                        z10 = true;
                    } else {
                        z10 = z11;
                    }
                    try {
                        Context applicationContext3 = getApplicationContext();
                        m.d(applicationContext3, str2);
                        l(applicationContext3, l11, l13, l12, l14, z10, i10);
                        i();
                        this.f39159g = null;
                        this.f39160h = null;
                        ListenableWorker.a c11 = ListenableWorker.a.c();
                        m.d(c11, "{\n            downloadFi…esult.success()\n        }");
                        return c11;
                    } catch (Exception e10) {
                        Context applicationContext4 = getApplicationContext();
                        m.d(applicationContext4, str2);
                        String str3 = l12 == null ? l11 : l12;
                        nf.a aVar3 = nf.a.FAILED;
                        B(applicationContext4, str3, aVar3, -1, (PendingIntent) null, true);
                        j jVar3 = this.f39160h;
                        if (jVar3 != null) {
                            String uuid3 = getId().toString();
                            m.d(uuid3, "id.toString()");
                            jVar3.i(uuid3, aVar3, this.f39165m);
                        }
                        e10.printStackTrace();
                        this.f39159g = null;
                        this.f39160h = null;
                        ListenableWorker.a a11 = ListenableWorker.a.a();
                        m.d(a11, "{\n            updateNoti…esult.failure()\n        }");
                        return a11;
                    }
                } else {
                    throw new IllegalArgumentException("Argument 'headers' should not be null");
                }
            } else {
                throw new IllegalArgumentException("Argument 'saved_file' should not be null");
            }
        } else {
            throw new IllegalArgumentException("Argument 'url' should not be null");
        }
    }

    public void onMethodCall(lc.j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        if (jVar.f36116a.equals("didInitializeDispatcher")) {
            synchronized (f39154z) {
                while (true) {
                    ArrayDeque<List<Object>> arrayDeque = A;
                    if (!arrayDeque.isEmpty()) {
                        k kVar = this.f39158f;
                        if (kVar != null) {
                            kVar.c(MaxReward.DEFAULT_LABEL, arrayDeque.remove());
                        }
                    } else {
                        f39154z.set(true);
                        dVar.success((Object) null);
                        w wVar = w.f38141a;
                    }
                }
            }
            return;
        }
        dVar.notImplemented();
    }

    public void onStopped() {
        c cVar;
        Context applicationContext = getApplicationContext();
        m.d(applicationContext, "applicationContext");
        nf.k a10 = nf.k.f36577a.a(applicationContext);
        this.f39159g = a10;
        m.b(a10);
        this.f39160h = new j(a10);
        String l10 = getInputData().l("url");
        String l11 = getInputData().l("file_name");
        j jVar = this.f39160h;
        if (jVar == null) {
            cVar = null;
        } else {
            String uuid = getId().toString();
            m.d(uuid, "id.toString()");
            cVar = jVar.d(uuid);
        }
        if (cVar != null && cVar.l() == nf.a.ENQUEUED) {
            if (l11 == null) {
                l11 = l10;
            }
            nf.a aVar = nf.a.CANCELED;
            B(applicationContext, l11, aVar, -1, (PendingIntent) null, true);
            j jVar2 = this.f39160h;
            if (jVar2 != null) {
                String uuid2 = getId().toString();
                m.d(uuid2, "id.toString()");
                jVar2.i(uuid2, aVar, this.f39165m);
            }
        }
    }
}
