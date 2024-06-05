package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl */
class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f3976c = false;

    /* renamed from: a  reason: collision with root package name */
    private final p f3977a;

    /* renamed from: b  reason: collision with root package name */
    private final C0064b f3978b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends w<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f3979l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f3980m;

        /* renamed from: n  reason: collision with root package name */
        private final q0.a<D> f3981n;

        /* renamed from: o  reason: collision with root package name */
        private p f3982o;

        /* access modifiers changed from: protected */
        public void f() {
            if (b.f3976c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        public void g() {
            if (b.f3976c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        public void i(x<? super D> xVar) {
            super.i(xVar);
            this.f3982o = null;
        }

        public void j(D d10) {
            super.j(d10);
        }

        /* access modifiers changed from: package-private */
        public q0.a<D> k(boolean z10) {
            if (b.f3976c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3979l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3980m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3981n);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void m() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f3979l);
            sb2.append(" : ");
            androidx.core.util.b.a(this.f3981n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0064b extends k0 {

        /* renamed from: f  reason: collision with root package name */
        private static final l0.b f3983f = new a();

        /* renamed from: d  reason: collision with root package name */
        private h<a> f3984d = new h<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f3985e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        /* compiled from: LoaderManagerImpl */
        static class a implements l0.b {
            a() {
            }

            public <T extends k0> T a(Class<T> cls) {
                return new C0064b();
            }

            public /* synthetic */ k0 b(Class cls, p0.a aVar) {
                return m0.b(this, cls, aVar);
            }
        }

        C0064b() {
        }

        static C0064b g(o0 o0Var) {
            return (C0064b) new l0(o0Var, f3983f).a(C0064b.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            int k10 = this.f3984d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3984d.l(i10).k(true);
            }
            this.f3984d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3984d.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f3984d.k(); i10++) {
                    a l10 = this.f3984d.l(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3984d.i(i10));
                    printWriter.print(": ");
                    printWriter.println(l10.toString());
                    l10.l(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int k10 = this.f3984d.k();
            for (int i10 = 0; i10 < k10; i10++) {
                this.f3984d.l(i10).m();
            }
        }
    }

    b(p pVar, o0 o0Var) {
        this.f3977a = pVar;
        this.f3978b = C0064b.g(o0Var);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3978b.f(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f3978b.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f3977a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
