package rf;

import android.media.MediaPlayer;
import kotlin.jvm.internal.m;

/* compiled from: UrlSource.kt */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f38025a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38026b;

    public c(String str, boolean z10) {
        m.e(str, "url");
        this.f38025a = str;
        this.f38026b = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        ce.b.a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] c(java.net.URL r7) {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.InputStream r7 = r7.openStream()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
        L_0x000d:
            int r2 = r7.read(r1)     // Catch:{ all -> 0x003d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            int r3 = r2.intValue()     // Catch:{ all -> 0x003d }
            r4 = 0
            if (r3 <= 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r5 = 0
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            if (r2 != 0) goto L_0x0035
            sd.w r1 = sd.w.f38141a     // Catch:{ all -> 0x003d }
            ce.b.a(r7, r5)
            byte[] r7 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.m.d(r7, r0)
            return r7
        L_0x0035:
            int r2 = r2.intValue()     // Catch:{ all -> 0x003d }
            r0.write(r1, r4, r2)     // Catch:{ all -> 0x003d }
            goto L_0x000d
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            ce.b.a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.c.c(java.net.URL):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        ce.b.a(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.File e() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f38025a
            java.net.URI r0 = java.net.URI.create(r0)
            java.net.URL r0 = r0.toURL()
            java.lang.String r1 = "create(url).toURL()"
            kotlin.jvm.internal.m.d(r0, r1)
            byte[] r0 = r3.c(r0)
            java.lang.String r1 = "sound"
            java.lang.String r2 = ""
            java.io.File r1 = java.io.File.createTempFile(r1, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            r2.write(r0)     // Catch:{ all -> 0x0032 }
            r1.deleteOnExit()     // Catch:{ all -> 0x0032 }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0032 }
            r0 = 0
            ce.b.a(r2, r0)
            java.lang.String r0 = "tempFile"
            kotlin.jvm.internal.m.d(r1, r0)
            return r1
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            ce.b.a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.c.e():java.io.File");
    }

    public void a(MediaPlayer mediaPlayer) {
        m.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f38025a);
    }

    public void b(qf.m mVar) {
        m.e(mVar, "soundPoolPlayer");
        mVar.release();
        mVar.r(this);
    }

    public final String d() {
        if (this.f38026b) {
            return p.Y(this.f38025a, "file://");
        }
        String absolutePath = e().getAbsolutePath();
        m.d(absolutePath, "loadTempFileFromNetwork().absolutePath");
        return absolutePath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f38025a, cVar.f38025a) && this.f38026b == cVar.f38026b;
    }

    public int hashCode() {
        int hashCode = this.f38025a.hashCode() * 31;
        boolean z10 = this.f38026b;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "UrlSource(url=" + this.f38025a + ", isLocal=" + this.f38026b + ')';
    }
}
