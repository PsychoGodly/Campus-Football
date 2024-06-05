package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import bc.f;
import com.google.firebase.messaging.p0;
import io.flutter.embedding.engine.g;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.c;
import lc.j;
import lc.k;
import zb.a;

/* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
public class b implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f33865a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private k f33866b;

    /* renamed from: c  reason: collision with root package name */
    private io.flutter.embedding.engine.a f33867c;

    /* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
    class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f33868a;

        a(CountDownLatch countDownLatch) {
            this.f33868a = countDownLatch;
        }

        public void error(String str, String str2, Object obj) {
            this.f33868a.countDown();
        }

        public void notImplemented() {
            this.f33868a.countDown();
        }

        public void success(Object obj) {
            this.f33868a.countDown();
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.b$b  reason: collision with other inner class name */
    /* compiled from: FlutterFirebaseMessagingBackgroundExecutor */
    class C0385b extends HashMap<String, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f33870a;

        C0385b(Map map) {
            this.f33870a = map;
            put("userCallbackHandle", Long.valueOf(b.this.f()));
            put("message", map);
        }
    }

    private long e() {
        return tc.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0);
    }

    /* access modifiers changed from: private */
    public long f() {
        return tc.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0);
    }

    private void g(c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_messaging_background");
        this.f33866b = kVar;
        kVar.e(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(f fVar, g gVar, long j10) {
        String i10 = fVar.i();
        AssetManager assets = tc.a.a().getAssets();
        if (i()) {
            if (gVar != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(gVar.b()));
                this.f33867c = new io.flutter.embedding.engine.a(tc.a.a(), gVar.b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f33867c = new io.flutter.embedding.engine.a(tc.a.a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
            zb.a j11 = this.f33867c.j();
            g(j11);
            if (i10 == null) {
                Log.w("FLTFireBGExecutor", "startBackgroundIsolate: 'appBundlePath' was null, using alternative lookup method.");
                i10 = xb.a.e().c().i();
            }
            j11.j(new a.b(assets, i10, lookupCallbackInformation));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(f fVar, Handler handler, g gVar, long j10) {
        fVar.r(tc.a.a());
        fVar.h(tc.a.a(), (String[]) null, handler, new tc.c(this, fVar, gVar, j10));
    }

    private void l() {
        this.f33865a.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }

    public static void m(long j10) {
        tc.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j10).apply();
    }

    public static void n(long j10) {
        tc.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j10).apply();
    }

    public void d(Intent intent, CountDownLatch countDownLatch) {
        if (this.f33867c == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = null;
        if (countDownLatch != null) {
            aVar = new a(countDownLatch);
        }
        p0 p0Var = (p0) intent.getParcelableExtra("notification");
        if (p0Var != null) {
            this.f33866b.d("MessagingBackground#onMessage", new C0385b(g.f(p0Var)), aVar);
            return;
        }
        Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return e() != 0;
    }

    public boolean i() {
        return !this.f33865a.get();
    }

    public void o() {
        if (i()) {
            long e10 = e();
            if (e10 != 0) {
                p(e10, (g) null);
            }
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        try {
            if (jVar.f36116a.equals("MessagingBackground#initialized")) {
                l();
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.notImplemented();
        } catch (j unused) {
            new StringBuilder().append("Flutter FCM error: ");
            throw null;
        }
    }

    public void p(long j10, g gVar) {
        if (this.f33867c != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        f fVar = new f();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new tc.b(this, fVar, handler, gVar, j10));
    }
}
