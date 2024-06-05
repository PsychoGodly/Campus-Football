package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.d1;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

public abstract class am extends xl implements ue.a {

    /* renamed from: h  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f6541h;

    /* renamed from: i  reason: collision with root package name */
    protected final s2 f6542i;

    /* renamed from: j  reason: collision with root package name */
    private AppLovinAdLoadListener f6543j;

    /* renamed from: k  reason: collision with root package name */
    private final p f6544k;

    /* renamed from: l  reason: collision with root package name */
    private final Collection f6545l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6546m;

    /* renamed from: n  reason: collision with root package name */
    protected ExecutorService f6547n;

    /* renamed from: o  reason: collision with root package name */
    protected ExecutorService f6548o;

    /* renamed from: p  reason: collision with root package name */
    protected List f6549p;

    /* renamed from: q  reason: collision with root package name */
    protected String f6550q;

    class a implements e1.a {
        a() {
        }

        public void a(Uri uri) {
            am.this.f6541h.b(uri);
            t tVar = am.this.f13423c;
            if (t.a()) {
                am amVar = am.this;
                t tVar2 = amVar.f13423c;
                String str = amVar.f13422b;
                tVar2.a(str, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements e1.a {
        b() {
        }

        public void a(Uri uri) {
            am.this.f6541h.c(uri);
            t tVar = am.this.f13423c;
            if (t.a()) {
                am amVar = am.this;
                t tVar2 = amVar.f13423c;
                String str = amVar.f13422b;
                tVar2.a(str, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements e1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e1.a f6553a;

        c(e1.a aVar) {
            this.f6553a = aVar;
        }

        public void a(Uri uri) {
            if (uri != null) {
                t tVar = am.this.f13423c;
                if (t.a()) {
                    am amVar = am.this;
                    t tVar2 = amVar.f13423c;
                    String str = amVar.f13422b;
                    tVar2.a(str, "Finish caching video for ad #" + am.this.f6541h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f6553a.a(uri);
                return;
            }
            t tVar3 = am.this.f13423c;
            if (t.a()) {
                am amVar2 = am.this;
                amVar2.f13423c.b(amVar2.f13422b, "Failed to cache video");
            }
            am.this.a((int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        }
    }

    class d implements d1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f6555a;

        d(e eVar) {
            this.f6555a = eVar;
        }

        public void a(String str, boolean z10) {
            if (z10) {
                am.this.a((int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f6555a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    am(String str, com.applovin.impl.sdk.ad.b bVar, k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        if (bVar != null) {
            this.f6541h = bVar;
            this.f6543j = appLovinAdLoadListener;
            this.f6544k = kVar.D();
            this.f6545l = h();
            this.f6542i = new s2();
            if (((Boolean) kVar.a(oj.f10274c1)).booleanValue()) {
                this.f6550q = StringUtils.isValidString(bVar.H()) ? bVar.H() : UUID.randomUUID().toString();
                sm l02 = kVar.l0();
                this.f6547n = l02.a("com.applovin.sdk.caching." + this.f6550q, ((Integer) kVar.a(oj.f10282d1)).intValue());
                sm l03 = kVar.l0();
                this.f6548o = l03.a("com.applovin.sdk.caching.html." + this.f6550q, ((Integer) kVar.a(oj.f10289e1)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f13421a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6543j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f6541h);
            this.f6543j = null;
        }
    }

    /* access modifiers changed from: protected */
    public List a(List list) {
        this.f6549p = list;
        return this.f13421a.l0().a(list, this.f6547n);
    }

    /* access modifiers changed from: protected */
    public Uri b(String str) {
        return a(str, this.f6541h.X(), true);
    }

    /* access modifiers changed from: package-private */
    public Uri c(String str) {
        return c(str, this.f6541h.X(), true);
    }

    /* access modifiers changed from: protected */
    public String d(String str, List list, boolean z10) {
        InputStream a10;
        if (((Boolean) this.f13421a.a(oj.M)).booleanValue()) {
            try {
                a10 = this.f6544k.a(str, list, z10, this.f6542i);
                if (a10 == null) {
                    if (a10 != null) {
                        a10.close();
                    }
                    return null;
                }
                String a11 = this.f6544k.a(a10);
                a10.close();
                return a11;
            } catch (Throwable th) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Unknown failure to read input stream.", th);
                }
                this.f13423c.a(this.f13422b, th);
                this.f13421a.B().a(this.f13422b, "readInputStreamAsString", th);
                return null;
            }
        } else {
            InputStream a12 = this.f6544k.a(str, list, z10, this.f6542i);
            if (a12 == null) {
                return null;
            }
            try {
                return this.f6544k.a(a12);
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Unknown failure to read input stream.", th2);
                }
                this.f13421a.B().a(this.f13422b, "readInputStreamAsString", th2);
                return null;
            } finally {
                zp.a((Closeable) a12, this.f13421a);
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public List e() {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f6541h.L() != null) {
            arrayList.add(a(this.f6541h.L().toString(), (e1.a) new a()));
        }
        if (this.f6541h.e0() != null) {
            arrayList.add(a(this.f6541h.e0().toString(), (e1.a) new b()));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Rendered new ad:" + this.f6541h);
        }
        AppLovinSdkUtils.runOnUiThread(new it(this));
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f6546m = true;
        List list = this.f6549p;
        if (list != null && !list.isEmpty()) {
            for (c1 a10 : this.f6549p) {
                a10.a(true);
            }
        }
        ExecutorService executorService = this.f6547n;
        if (executorService != null) {
            executorService.shutdown();
            this.f6547n = null;
        }
        ExecutorService executorService2 = this.f6548o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6548o = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!x3.f()) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Caching mute images...");
            }
            Uri a10 = a(this.f6541h.L(), "mute");
            if (a10 != null) {
                this.f6541h.b(a10);
            }
            Uri a11 = a(this.f6541h.e0(), "unmute");
            if (a11 != null) {
                this.f6541h.c(a11);
            }
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Ad updated with muteImageFilename = " + this.f6541h.L() + ", unmuteImageFilename = " + this.f6541h.e0());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f13421a.U().b(this);
        ExecutorService executorService = this.f6547n;
        if (executorService != null) {
            executorService.shutdown();
            this.f6547n = null;
        }
        ExecutorService executorService2 = this.f6548o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6548o = null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return this.f6546m;
    }

    public void run() {
        if (this.f6541h.a1()) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Subscribing to timeout events...");
            }
            this.f13421a.U().a((ue.a) this);
        }
    }

    /* access modifiers changed from: package-private */
    public String b(String str, List list, boolean z10) {
        InputStream inputStream;
        InputStream a10;
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File a11 = this.f6544k.a(zp.a(parse, this.f6541h.getCachePrefix(), this.f13421a), a());
                if (!this.f6544k.a(a11)) {
                    if (((Boolean) this.f13421a.a(oj.M)).booleanValue()) {
                        try {
                            a10 = this.f6544k.a(str, list, z10, this.f6542i);
                            if (a10 != null) {
                                this.f6544k.a(a10, a11);
                            } else {
                                if (t.a()) {
                                    this.f13423c.b(this.f13422b, "Failed to load resource: " + str);
                                }
                                this.f13421a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                            }
                            if (a10 != null) {
                                a10.close();
                            }
                        } catch (Throwable th) {
                            this.f13423c.a(this.f13422b, th);
                            this.f13421a.B().a(this.f13422b, "cacheStringResource", th);
                        }
                    } else {
                        try {
                            inputStream = this.f6544k.a(str, list, z10, this.f6542i);
                            if (inputStream != null) {
                                this.f6544k.a(inputStream, a11);
                            } else {
                                if (t.a()) {
                                    this.f13423c.b(this.f13422b, "Failed to load resource: " + str);
                                }
                                this.f13421a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                            }
                            zp.a((Closeable) inputStream, this.f13421a);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = null;
                            zp.a((Closeable) inputStream, this.f13421a);
                            throw th;
                        }
                    }
                }
                return this.f6544k.e(a11);
            } catch (Throwable th3) {
                if (t.a()) {
                    this.f13423c.a(this.f13422b, "Resource at " + str + " failed to load.", th3);
                }
            }
        }
        return null;
        throw th;
    }

    /* access modifiers changed from: package-private */
    public Uri c(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.a(str2, "Caching video " + str + "...");
        }
        String a10 = this.f6544k.a(a(), str, this.f6541h.getCachePrefix(), list, z10, this.f6542i);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f6544k.a(a10, a());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    if (t.a()) {
                        t tVar2 = this.f13423c;
                        String str3 = this.f13422b;
                        tVar2.a(str3, "Finish caching video for ad #" + this.f6541h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                    }
                    return fromFile;
                }
                if (t.a()) {
                    t tVar3 = this.f13423c;
                    String str4 = this.f13422b;
                    tVar3.b(str4, "Unable to create URI from cached video file = " + a11);
                }
                this.f13421a.B().a(o.b.CACHE_ERROR, "extractUriFromVideoFile", (Map) CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (t.a()) {
                t tVar4 = this.f13423c;
                String str5 = this.f13422b;
                tVar4.b(str5, "Unable to retrieve File from cached video filename = " + a10);
            }
            this.f13421a.B().a(o.b.CACHE_ERROR, "retrieveVideoFile", (Map) CollectionUtils.hashMap("url", a10));
            return null;
        }
        if (t.a()) {
            t tVar5 = this.f13423c;
            String str6 = this.f13422b;
            tVar5.b(str6, "Failed to cache video: " + str);
        }
        this.f13421a.B().a(o.b.CACHE_ERROR, "cacheVideo", (Map) CollectionUtils.hashMap("url", str));
        a((int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    private Uri a(String str, String str2) {
        File a10 = this.f6544k.a(zp.a(Uri.parse(str2), this.f6541h.getCachePrefix(), this.f13421a), k.k());
        if (a10 == null) {
            return null;
        }
        if (this.f6544k.a(a10)) {
            this.f6542i.a(a10.length());
            return Uri.parse("file://" + a10.getAbsolutePath());
        }
        if (!this.f6544k.a(a10, str + str2, Arrays.asList(new String[]{str}), this.f6542i)) {
            return null;
        }
        return Uri.parse("file://" + a10.getAbsolutePath());
    }

    /* access modifiers changed from: package-private */
    public String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f13421a.a(oj.Y0)).booleanValue()) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = bVar.shouldCancelHtmlCachingIfShown();
        boolean I0 = bVar.I0();
        List W = bVar.W();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int i10 = 0;
            int i11 = 0;
            while (i10 < sb2.length()) {
                if (l()) {
                    return str;
                }
                i10 = sb2.indexOf(str2, i11);
                if (i10 == -1) {
                    continue;
                    break;
                }
                int length = sb2.length();
                int i12 = i10;
                while (!this.f6545l.contains(Character.valueOf(sb2.charAt(i12))) && i12 < length) {
                    i12++;
                }
                if (i12 <= i10 || i12 == length) {
                    if (t.a()) {
                        this.f13423c.b(this.f13422b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
                String substring = sb2.substring(str2.length() + i10, i12);
                if (StringUtils.isValidString(substring)) {
                    if (!shouldCancelHtmlCachingIfShown || !bVar.hasShown()) {
                        if (I0) {
                            if (bVar.P().equals(str2 + substring)) {
                                if (t.a()) {
                                    this.f13423c.a(this.f13422b, "Postponing caching for \"" + substring + "\" video resource");
                                }
                            }
                        }
                        Uri a10 = a(str2, substring);
                        if (a10 != null) {
                            sb2.replace(i10, i12, a10.toString());
                            bVar.a(a10);
                            this.f6542i.b();
                        } else {
                            String str3 = str2 + substring;
                            if (W.contains(str3)) {
                                a((int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.f6546m = true;
                            }
                            this.f6542i.a();
                            if (t.a()) {
                                this.f13423c.b(this.f13422b, "Failed to cache HTML Resource: " + str3);
                            }
                            this.f13421a.B().a(o.b.CACHE_ERROR, "cacheHtmlResource", (Map) CollectionUtils.hashMap("url", str3));
                        }
                    } else {
                        if (t.a()) {
                            this.f13423c.a(this.f13422b, "Cancelling HTML caching due to ad being shown already");
                        }
                        this.f6542i.c();
                        return str;
                    }
                } else if (t.a()) {
                    this.f13423c.a(this.f13422b, "Skip caching of non-resource " + substring);
                }
                i11 = i12;
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public e1 b(String str, e1.a aVar) {
        return a(str, this.f6541h.X(), true, aVar);
    }

    /* access modifiers changed from: package-private */
    public Uri a(String str, List list, boolean z10) {
        try {
            String a10 = this.f6544k.a(a(), str, this.f6541h.getCachePrefix(), list, z10, this.f6542i);
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f6544k.a(a10, a());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (t.a()) {
                        this.f13423c.b(this.f13422b, "Unable to extract Uri from image file");
                    }
                    this.f13421a.B().a(o.b.CACHE_ERROR, "extractUriFromImageFile", (Map) CollectionUtils.hashMap("url", a10));
                    return null;
                }
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str2 = this.f13422b;
                    tVar.b(str2, "Unable to retrieve File from cached image filename = " + a10);
                }
                this.f13421a.B().a(o.b.CACHE_ERROR, "retrieveImageFile", (Map) CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str3 = this.f13422b;
                tVar2.b(str3, "Failed to cache image: " + str);
            }
            this.f13421a.B().a(o.b.CACHE_ERROR, "cacheImageResource", (Map) CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th) {
            if (t.a()) {
                t tVar3 = this.f13423c;
                String str4 = this.f13422b;
                tVar3.a(str4, "Failed to cache image at url = " + str, th);
            }
            this.f13421a.B().a(this.f13422b, "cacheImageResource", th, (Map) CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str2 = this.f13422b;
                tVar.a(str2, "No " + str + " image to cache");
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str3 = this.f13422b;
                tVar2.a(str3, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (t.a()) {
            t tVar3 = this.f13423c;
            String str4 = this.f13422b;
            tVar3.a(str4, "Caching " + str + " image...");
        }
        return b(uri2);
    }

    /* access modifiers changed from: package-private */
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String a10 = a(bVar.g0(), bVar.h0(), bVar.N0(), bVar.X(), bVar.X0());
        if (bVar.M0() && StringUtils.isValidString(a10)) {
            String a11 = a(a10, bVar.X(), bVar);
            bVar.a(a11);
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.f(str, "Ad updated with video button HTML assets cached = " + a11);
        }
    }

    /* access modifiers changed from: protected */
    public e1 a(String str, List list, boolean z10, e1.a aVar) {
        if (!TextUtils.isEmpty(str)) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str2 = this.f13422b;
                tVar.a(str2, "Caching video " + str + "...");
            }
            return new e1(str, this.f6541h, list, z10, this.f6542i, this.f13421a, new c(aVar));
        } else if (!t.a()) {
            return null;
        } else {
            this.f13423c.a(this.f13422b, "No video to cache, skipping...");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        if (this.f6543j != null) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.a(str, "Calling back ad load failed with error code: " + i10);
            }
            this.f6543j.failedToReceiveAd(i10);
            this.f6543j = null;
        }
        g();
    }

    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f6541h.H())) {
            if (t.a()) {
                this.f13423c.b(this.f13422b, "Updating flag for timeout...");
            }
            g();
        }
        this.f13421a.U().b(this);
    }

    /* access modifiers changed from: package-private */
    public String a(String str, String str2, boolean z10, List list, boolean z11) {
        if (StringUtils.isValidString(str2)) {
            String a10 = a(str2, z10, list, z11);
            if (StringUtils.isValidString(a10)) {
                return a10;
            }
            if (TextUtils.isEmpty(str)) {
                a((int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str3 = this.f13422b;
                    tVar.b(str3, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.f13421a.B().a(o.b.CACHE_ERROR, "retrieveHtmlString", (Map) CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private String a(String str, boolean z10, List list, boolean z11) {
        if (z10) {
            return b(str, list, z11);
        }
        return d(str, list, z11);
    }

    /* access modifiers changed from: protected */
    public e1 a(String str, e1.a aVar) {
        return new e1(str, this.f6541h, this.f6542i, this.f13421a, aVar);
    }

    /* access modifiers changed from: protected */
    public d1 a(String str, List list, e eVar) {
        return new d1(str, this.f6541h, list, this.f6542i, this.f6548o, this.f13421a, new d(eVar));
    }
}
