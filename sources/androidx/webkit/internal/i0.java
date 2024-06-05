package androidx.webkit.internal;

import android.net.Uri;
import j1.l;
import j1.m;
import j1.r;
import j1.u;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import mf.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: WebViewProviderAdapter */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderBoundaryInterface f5027a;

    public i0(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f5027a = webViewProviderBoundaryInterface;
    }

    public s a(String str, String[] strArr) {
        return s.b(this.f5027a.addDocumentStartJavaScript(str, strArr));
    }

    public void b(String str, String[] strArr, r.b bVar) {
        this.f5027a.addWebMessageListener(str, strArr, a.c(new a0(bVar)));
    }

    public m[] c() {
        InvocationHandler[] createWebMessageChannel = this.f5027a.createWebMessageChannel();
        m[] mVarArr = new m[createWebMessageChannel.length];
        for (int i10 = 0; i10 < createWebMessageChannel.length; i10++) {
            mVarArr[i10] = new c0(createWebMessageChannel[i10]);
        }
        return mVarArr;
    }

    public void d(l lVar, Uri uri) {
        this.f5027a.postMessageToMainFrame(a.c(new y(lVar)), uri);
    }

    public void e(String str) {
        this.f5027a.removeWebMessageListener(str);
    }

    public void f(Executor executor, u uVar) {
        this.f5027a.setWebViewRendererClient(uVar != null ? a.c(new l0(executor, uVar)) : null);
    }
}
