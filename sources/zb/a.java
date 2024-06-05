package zb;

import android.content.res.AssetManager;
import bc.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import lc.c;
import lc.t;

/* compiled from: DartExecutor */
public class a implements lc.c {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f39479a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f39480b;

    /* renamed from: c  reason: collision with root package name */
    private final c f39481c;

    /* renamed from: d  reason: collision with root package name */
    private final lc.c f39482d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39483f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f39484g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public e f39485h;

    /* renamed from: i  reason: collision with root package name */
    private final c.a f39486i;

    /* renamed from: zb.a$a  reason: collision with other inner class name */
    /* compiled from: DartExecutor */
    class C0468a implements c.a {
        C0468a() {
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            String unused = a.this.f39484g = t.f36134b.b(byteBuffer);
            if (a.this.f39485h != null) {
                a.this.f39485h.a(a.this.f39484g);
            }
        }
    }

    /* compiled from: DartExecutor */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f39488a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39489b;

        /* renamed from: c  reason: collision with root package name */
        public final FlutterCallbackInformation f39490c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f39488a = assetManager;
            this.f39489b = str;
            this.f39490c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f39489b + ", library path: " + this.f39490c.callbackLibraryPath + ", function: " + this.f39490c.callbackName + " )";
        }
    }

    /* compiled from: DartExecutor */
    private static class d implements lc.c {

        /* renamed from: a  reason: collision with root package name */
        private final c f39494a;

        /* synthetic */ d(c cVar, C0468a aVar) {
            this(cVar);
        }

        public c.C0412c a(c.d dVar) {
            return this.f39494a.a(dVar);
        }

        public /* synthetic */ c.C0412c b() {
            return lc.b.a(this);
        }

        public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f39494a.d(str, byteBuffer, bVar);
        }

        public void e(String str, c.a aVar, c.C0412c cVar) {
            this.f39494a.e(str, aVar, cVar);
        }

        public void f(String str, ByteBuffer byteBuffer) {
            this.f39494a.d(str, byteBuffer, (c.b) null);
        }

        public void i(String str, c.a aVar) {
            this.f39494a.i(str, aVar);
        }

        private d(c cVar) {
            this.f39494a = cVar;
        }
    }

    /* compiled from: DartExecutor */
    public interface e {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C0468a aVar = new C0468a();
        this.f39486i = aVar;
        this.f39479a = flutterJNI;
        this.f39480b = assetManager;
        c cVar = new c(flutterJNI);
        this.f39481c = cVar;
        cVar.i("flutter/isolate", aVar);
        this.f39482d = new d(cVar, (C0468a) null);
        if (flutterJNI.isAttached()) {
            this.f39483f = true;
        }
    }

    @Deprecated
    public c.C0412c a(c.d dVar) {
        return this.f39482d.a(dVar);
    }

    public /* synthetic */ c.C0412c b() {
        return lc.b.a(this);
    }

    @Deprecated
    public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f39482d.d(str, byteBuffer, bVar);
    }

    @Deprecated
    public void e(String str, c.a aVar, c.C0412c cVar) {
        this.f39482d.e(str, aVar, cVar);
    }

    @Deprecated
    public void f(String str, ByteBuffer byteBuffer) {
        this.f39482d.f(str, byteBuffer);
    }

    @Deprecated
    public void i(String str, c.a aVar) {
        this.f39482d.i(str, aVar);
    }

    public void j(b bVar) {
        if (this.f39483f) {
            xb.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        bd.e.a("DartExecutor#executeDartCallback");
        try {
            xb.b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f39479a;
            String str = bVar.f39489b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f39490c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f39488a, (List<String>) null);
            this.f39483f = true;
        } finally {
            bd.e.d();
        }
    }

    public void k(c cVar) {
        l(cVar, (List<String>) null);
    }

    public void l(c cVar, List<String> list) {
        if (this.f39483f) {
            xb.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        bd.e.a("DartExecutor#executeDartEntrypoint");
        try {
            xb.b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f39479a.runBundleAndSnapshotFromLibrary(cVar.f39491a, cVar.f39493c, cVar.f39492b, this.f39480b, list);
            this.f39483f = true;
        } finally {
            bd.e.d();
        }
    }

    public String m() {
        return this.f39484g;
    }

    public boolean n() {
        return this.f39483f;
    }

    public void o() {
        if (this.f39479a.isAttached()) {
            this.f39479a.notifyLowMemoryWarning();
        }
    }

    public void p() {
        xb.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f39479a.setPlatformMessageHandler(this.f39481c);
    }

    public void q() {
        xb.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f39479a.setPlatformMessageHandler((f) null);
    }

    /* compiled from: DartExecutor */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f39491a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39492b;

        /* renamed from: c  reason: collision with root package name */
        public final String f39493c;

        public c(String str, String str2) {
            this.f39491a = str;
            this.f39492b = null;
            this.f39493c = str2;
        }

        public static c a() {
            f c10 = xb.a.e().c();
            if (c10.n()) {
                return new c(c10.i(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f39491a.equals(cVar.f39491a)) {
                return false;
            }
            return this.f39493c.equals(cVar.f39493c);
        }

        public int hashCode() {
            return (this.f39491a.hashCode() * 31) + this.f39493c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f39491a + ", function: " + this.f39493c + " )";
        }

        public c(String str, String str2, String str3) {
            this.f39491a = str;
            this.f39492b = str2;
            this.f39493c = str3;
        }
    }
}
