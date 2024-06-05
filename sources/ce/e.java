package ce;

import fe.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import ne.c;
import sd.w;

/* compiled from: FileReadWrite.kt */
class e extends d {

    /* compiled from: FileReadWrite.kt */
    static final class a extends n implements l<String, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f31976a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f31976a = arrayList;
        }

        public final void a(String str) {
            m.e(str, "it");
            this.f31976a.add(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return w.f38141a;
        }
    }

    public static final void a(File file, Charset charset, l<? super String, w> lVar) {
        m.e(file, "<this>");
        m.e(charset, "charset");
        m.e(lVar, "action");
        i.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static final List<String> b(File file, Charset charset) {
        m.e(file, "<this>");
        m.e(charset, "charset");
        ArrayList arrayList = new ArrayList();
        a(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List c(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = c.f36512b;
        }
        return b(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        ce.b.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String d(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.m.e(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = ce.i.e(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            ce.b.a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            ce.b.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.e.d(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String e(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = c.f36512b;
        }
        return d(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        ce.b.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.m.e(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            sd.w r1 = sd.w.f38141a     // Catch:{ all -> 0x0019 }
            r1 = 0
            ce.b.a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            ce.b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.e.f(java.io.File, byte[]):void");
    }
}
