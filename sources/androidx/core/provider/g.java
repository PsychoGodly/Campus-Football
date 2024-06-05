package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.f;
import androidx.core.util.h;
import java.util.concurrent.Executor;

/* compiled from: FontsContractCompat */
public class g {

    /* compiled from: FontsContractCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f3019a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f3020b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f3019a = i10;
            this.f3020b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f3020b;
        }

        public int c() {
            return this.f3019a;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f3021a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3022b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3023c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3024d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3025e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f3021a = (Uri) h.f(uri);
            this.f3022b = i10;
            this.f3023c = i11;
            this.f3024d = z10;
            this.f3025e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f3025e;
        }

        public int c() {
            return this.f3022b;
        }

        public Uri d() {
            return this.f3021a;
        }

        public int e() {
            return this.f3023c;
        }

        public boolean f() {
            return this.f3024d;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return f.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        if (z10) {
            return f.e(context, eVar, aVar, i10, i11);
        }
        return f.d(context, eVar, i10, (Executor) null, aVar);
    }
}
