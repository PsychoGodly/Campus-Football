package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.n;

/* compiled from: DownloadListenerHostApiImpl */
public class h implements n.g {

    /* renamed from: a  reason: collision with root package name */
    private final d4 f34256a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34257b;

    /* renamed from: c  reason: collision with root package name */
    private final g f34258c;

    /* compiled from: DownloadListenerHostApiImpl */
    public static class a {
        public b a(g gVar) {
            return new b(gVar);
        }
    }

    /* compiled from: DownloadListenerHostApiImpl */
    public static class b implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        private final g f34259a;

        public b(g gVar) {
            this.f34259a = gVar;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void b(Void voidR) {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            this.f34259a.f(this, str, str2, str3, str4, j10, i.f34270a);
        }
    }

    public h(d4 d4Var, a aVar, g gVar) {
        this.f34256a = d4Var;
        this.f34257b = aVar;
        this.f34258c = gVar;
    }

    public void a(Long l10) {
        this.f34256a.b(this.f34257b.a(this.f34258c), l10.longValue());
    }
}
