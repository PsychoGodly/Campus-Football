package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.c;
import io.flutter.plugin.platform.f;
import io.flutter.plugins.googlemobileads.h0;
import java.util.Map;
import uc.b;

/* compiled from: FlutterNativeAd */
class w extends e {

    /* renamed from: b  reason: collision with root package name */
    private final a f34137b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34138c;

    /* renamed from: d  reason: collision with root package name */
    private final h0.c f34139d;

    /* renamed from: e  reason: collision with root package name */
    private final h f34140e;

    /* renamed from: f  reason: collision with root package name */
    private l f34141f;

    /* renamed from: g  reason: collision with root package name */
    private i f34142g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Object> f34143h;

    /* renamed from: i  reason: collision with root package name */
    private NativeAdView f34144i;

    /* renamed from: j  reason: collision with root package name */
    private final z f34145j;

    /* renamed from: k  reason: collision with root package name */
    private final b f34146k;

    /* renamed from: l  reason: collision with root package name */
    private TemplateView f34147l;

    /* renamed from: m  reason: collision with root package name */
    private final Context f34148m;

    /* compiled from: FlutterNativeAd */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private a f34149a;

        /* renamed from: b  reason: collision with root package name */
        private String f34150b;

        /* renamed from: c  reason: collision with root package name */
        private h0.c f34151c;

        /* renamed from: d  reason: collision with root package name */
        private l f34152d;

        /* renamed from: e  reason: collision with root package name */
        private i f34153e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, Object> f34154f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f34155g;

        /* renamed from: h  reason: collision with root package name */
        private z f34156h;

        /* renamed from: i  reason: collision with root package name */
        private h f34157i;

        /* renamed from: j  reason: collision with root package name */
        private b f34158j;

        /* renamed from: k  reason: collision with root package name */
        private final Context f34159k;

        a(Context context) {
            this.f34159k = context;
        }

        /* access modifiers changed from: package-private */
        public w a() {
            if (this.f34149a == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            } else if (this.f34150b == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            } else if (this.f34151c == null && this.f34158j == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            } else {
                l lVar = this.f34152d;
                if (lVar == null && this.f34153e == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                } else if (lVar == null) {
                    return new w(this.f34159k, this.f34155g.intValue(), this.f34149a, this.f34150b, this.f34151c, this.f34153e, this.f34157i, this.f34154f, this.f34156h, this.f34158j);
                } else {
                    return new w(this.f34159k, this.f34155g.intValue(), this.f34149a, this.f34150b, this.f34151c, this.f34152d, this.f34157i, this.f34154f, this.f34156h, this.f34158j);
                }
            }
        }

        public a b(h0.c cVar) {
            this.f34151c = cVar;
            return this;
        }

        public a c(i iVar) {
            this.f34153e = iVar;
            return this;
        }

        public a d(String str) {
            this.f34150b = str;
            return this;
        }

        public a e(Map<String, Object> map) {
            this.f34154f = map;
            return this;
        }

        public a f(h hVar) {
            this.f34157i = hVar;
            return this;
        }

        public a g(int i10) {
            this.f34155g = Integer.valueOf(i10);
            return this;
        }

        public a h(a aVar) {
            this.f34149a = aVar;
            return this;
        }

        public a i(z zVar) {
            this.f34156h = zVar;
            return this;
        }

        public a j(b bVar) {
            this.f34158j = bVar;
            return this;
        }

        public a k(l lVar) {
            this.f34152d = lVar;
            return this;
        }
    }

    protected w(Context context, int i10, a aVar, String str, h0.c cVar, l lVar, h hVar, Map<String, Object> map, z zVar, b bVar) {
        super(i10);
        this.f34148m = context;
        this.f34137b = aVar;
        this.f34138c = str;
        this.f34139d = cVar;
        this.f34141f = lVar;
        this.f34140e = hVar;
        this.f34143h = map;
        this.f34145j = zVar;
        this.f34146k = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        NativeAdView nativeAdView = this.f34144i;
        if (nativeAdView != null) {
            nativeAdView.a();
            this.f34144i = null;
        }
        TemplateView templateView = this.f34147l;
        if (templateView != null) {
            templateView.c();
            this.f34147l = null;
        }
    }

    public f b() {
        NativeAdView nativeAdView = this.f34144i;
        if (nativeAdView != null) {
            return new b0(nativeAdView);
        }
        TemplateView templateView = this.f34147l;
        if (templateView != null) {
            return new b0(templateView);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        c cVar;
        y yVar = new y(this);
        x xVar = new x(this.f33956a, this.f34137b);
        z zVar = this.f34145j;
        if (zVar == null) {
            cVar = new c.a().a();
        } else {
            cVar = zVar.a();
        }
        c cVar2 = cVar;
        l lVar = this.f34141f;
        if (lVar != null) {
            h hVar = this.f34140e;
            String str = this.f34138c;
            hVar.h(str, yVar, cVar2, xVar, lVar.b(str));
            return;
        }
        i iVar = this.f34142g;
        if (iVar != null) {
            this.f34140e.c(this.f34138c, yVar, cVar2, xVar, iVar.k(this.f34138c));
            return;
        }
        Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    public void d(com.google.android.gms.ads.nativead.b bVar) {
        b bVar2 = this.f34146k;
        if (bVar2 != null) {
            TemplateView b10 = bVar2.b(this.f34148m);
            this.f34147l = b10;
            b10.setNativeAd(bVar);
        } else {
            this.f34144i = this.f34139d.a(bVar, this.f34143h);
        }
        bVar.setOnPaidEventListener(new a0(this.f34137b, this));
        this.f34137b.m(this.f33956a, bVar.getResponseInfo());
    }

    protected w(Context context, int i10, a aVar, String str, h0.c cVar, i iVar, h hVar, Map<String, Object> map, z zVar, b bVar) {
        super(i10);
        this.f34148m = context;
        this.f34137b = aVar;
        this.f34138c = str;
        this.f34139d = cVar;
        this.f34142g = iVar;
        this.f34140e = hVar;
        this.f34143h = map;
        this.f34145j = zVar;
        this.f34146k = bVar;
    }
}
