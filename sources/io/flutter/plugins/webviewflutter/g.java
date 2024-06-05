package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.n;
import lc.c;

/* compiled from: DownloadListenerFlutterApiImpl */
public class g extends n.f {

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34247b;

    public g(c cVar, d4 d4Var) {
        super(cVar);
        this.f34247b = d4Var;
    }

    private long e(DownloadListener downloadListener) {
        Long h10 = this.f34247b.h(downloadListener);
        if (h10 != null) {
            return h10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public void f(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j10, n.f.a<Void> aVar) {
        d(Long.valueOf(e(downloadListener)), str, str2, str3, str4, Long.valueOf(j10), aVar);
    }
}
