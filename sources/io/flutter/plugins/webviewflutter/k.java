package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import dc.a;
import java.io.IOException;

/* compiled from: FlutterAssetManager */
abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final AssetManager f34289a;

    /* compiled from: FlutterAssetManager */
    static class a extends k {

        /* renamed from: b  reason: collision with root package name */
        final a.C0360a f34290b;

        a(AssetManager assetManager, a.C0360a aVar) {
            super(assetManager);
            this.f34290b = aVar;
        }

        public String a(String str) {
            return this.f34290b.a(str);
        }
    }

    public k(AssetManager assetManager) {
        this.f34289a = assetManager;
    }

    /* access modifiers changed from: package-private */
    public abstract String a(String str);

    public String[] b(String str) throws IOException {
        return this.f34289a.list(str);
    }
}
