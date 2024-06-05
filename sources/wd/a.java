package wd;

import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: Thread.kt */
public final class a {

    /* renamed from: wd.a$a  reason: collision with other inner class name */
    /* compiled from: Thread.kt */
    public static final class C0458a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fe.a<w> f39218a;

        C0458a(fe.a<w> aVar) {
            this.f39218a = aVar;
        }

        public void run() {
            this.f39218a.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, fe.a<w> aVar) {
        m.e(aVar, "block");
        C0458a aVar2 = new C0458a(aVar);
        if (z11) {
            aVar2.setDaemon(true);
        }
        if (i10 > 0) {
            aVar2.setPriority(i10);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, fe.a aVar, int i11, Object obj) {
        return a((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : classLoader, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? -1 : i10, aVar);
    }
}
