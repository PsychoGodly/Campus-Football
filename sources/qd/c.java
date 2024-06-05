package qd;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.m;

/* compiled from: Hooks.kt */
public final class c {
    public static final File a(Bitmap bitmap, File file, int i10, int i11) {
        m.e(bitmap, "<this>");
        m.e(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        bitmap.compress(a.a(i10), i11, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        ce.b.a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.io.InputStream r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.m.e(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r4)
            r4 = 0
            r1 = 2
            r2 = 0
            ce.a.b(r3, r0, r4, r1, r2)     // Catch:{ all -> 0x0019 }
            ce.b.a(r0, r2)
            return
        L_0x0019:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001b }
        L_0x001b:
            r4 = move-exception
            ce.b.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.c.b(java.io.InputStream, java.io.File):void");
    }
}
