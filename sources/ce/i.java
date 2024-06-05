package ce;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.m;
import me.d;

/* compiled from: ReadWrite.kt */
public final class i {
    public static final long a(Reader reader, Writer writer, int i10) {
        m.e(reader, "<this>");
        m.e(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += (long) read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        ce.b.a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.io.Reader r3, fe.l<? super java.lang.String, sd.w> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.m.e(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            me.d r1 = d(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.invoke(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            sd.w r4 = sd.w.f38141a     // Catch:{ all -> 0x0036 }
            ce.b.a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            ce.b.a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.i.c(java.io.Reader, fe.l):void");
    }

    public static final d<String> d(BufferedReader bufferedReader) {
        m.e(bufferedReader, "<this>");
        return j.d(new h(bufferedReader));
    }

    public static final String e(Reader reader) {
        m.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        m.d(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
