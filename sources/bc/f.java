package bc;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import bd.e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: FlutterLoader */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31624a;

    /* renamed from: b  reason: collision with root package name */
    private c f31625b;

    /* renamed from: c  reason: collision with root package name */
    private long f31626c;

    /* renamed from: d  reason: collision with root package name */
    private b f31627d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f31628e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f31629f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f31630g;

    /* compiled from: FlutterLoader */
    class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f31631a;

        a(Context context) {
            this.f31631a = context;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            f.this.f31628e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public b call() {
            e.a("FlutterLoader initTask");
            try {
                g unused = f.this.m(this.f31631a);
                f.this.f31628e.loadLibrary();
                f.this.f31628e.updateRefreshRate();
                f.this.f31629f.execute(new e(this));
                return new b(bd.b.d(this.f31631a), bd.b.a(this.f31631a), bd.b.c(this.f31631a), (a) null);
            } finally {
                e.d();
            }
        }
    }

    /* compiled from: FlutterLoader */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f31633a;

        /* renamed from: b  reason: collision with root package name */
        final String f31634b;

        /* renamed from: c  reason: collision with root package name */
        final String f31635c;

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        private b(String str, String str2, String str3) {
            this.f31633a = str;
            this.f31634b = str2;
            this.f31635c = str3;
        }
    }

    /* compiled from: FlutterLoader */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f31636a;

        public String a() {
            return this.f31636a;
        }
    }

    public f() {
        this(xb.a.e().d().a());
    }

    private String j(String str) {
        return this.f31627d.f31620d + File.separator + str;
    }

    /* access modifiers changed from: private */
    public g m(Context context) {
        return null;
    }

    private static boolean o(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(Context context, String[] strArr, Handler handler, Runnable runnable) {
        g(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            b bVar = this.f31630g.get();
            bd.a.a(Looper.getMainLooper()).post(new d(this, context, strArr, handler, runnable));
        } catch (Exception e10) {
            xb.b.c("FlutterLoader", "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public boolean f() {
        return this.f31627d.f31623g;
    }

    public void g(Context context, String[] strArr) {
        if (!this.f31624a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f31625b != null) {
                e.a("FlutterLoader#ensureInitializationComplete");
                try {
                    b bVar = this.f31630g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--icu-native-lib-path=");
                    sb2.append(this.f31627d.f31622f);
                    String str = File.separator;
                    sb2.append(str);
                    sb2.append("libflutter.so");
                    arrayList.add(sb2.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.f31627d.f31617a);
                    arrayList.add("--aot-shared-library-name=" + this.f31627d.f31622f + str + this.f31627d.f31617a);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("--cache-dir-path=");
                    sb3.append(bVar.f31634b);
                    arrayList.add(sb3.toString());
                    if (this.f31627d.f31621e != null) {
                        arrayList.add("--domain-network-policy=" + this.f31627d.f31621e);
                    }
                    if (this.f31625b.a() != null) {
                        arrayList.add("--log-tag=" + this.f31625b.a());
                    }
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    int i10 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                    if (i10 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i10 = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i10);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                            arrayList.add("--enable-impeller");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=" + string);
                        }
                    }
                    String str2 = o(bundle) ? "true" : "false";
                    arrayList.add("--leak-vm=" + str2);
                    this.f31628e.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, bVar.f31633a, bVar.f31634b, SystemClock.uptimeMillis() - this.f31626c);
                    this.f31624a = true;
                    e.d();
                } catch (Exception e10) {
                    xb.b.c("FlutterLoader", "Flutter initialization failed.", e10);
                    throw new RuntimeException(e10);
                } catch (Throwable th) {
                    e.d();
                    throw th;
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    public void h(Context context, String[] strArr, Handler handler, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        } else if (this.f31625b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        } else if (this.f31624a) {
            handler.post(runnable);
        } else {
            this.f31629f.execute(new c(this, context, strArr, handler, runnable));
        }
    }

    public String i() {
        return this.f31627d.f31620d;
    }

    public String k(String str) {
        return j(str);
    }

    public String l(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("packages");
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str);
        return k(sb2.toString());
    }

    public boolean n() {
        return this.f31624a;
    }

    public void r(Context context) {
        s(context, new c());
    }

    public void s(Context context, c cVar) {
        h hVar;
        if (this.f31625b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e.a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f31625b = cVar;
                    this.f31626c = SystemClock.uptimeMillis();
                    this.f31627d = a.e(applicationContext);
                    if (Build.VERSION.SDK_INT >= 17) {
                        hVar = h.g((DisplayManager) applicationContext.getSystemService("display"), this.f31628e);
                    } else {
                        hVar = h.f(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f31628e);
                    }
                    hVar.h();
                    this.f31630g = this.f31629f.submit(new a(applicationContext));
                } finally {
                    e.d();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }

    public f(FlutterJNI flutterJNI) {
        this(flutterJNI, xb.a.e().b());
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f31624a = false;
        this.f31628e = flutterJNI;
        this.f31629f = executorService;
    }
}
