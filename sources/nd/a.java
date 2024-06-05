package nd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import dc.a;
import fe.l;
import io.flutter.view.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import od.b;
import pd.b;
import qd.c;
import qd.d;
import sb.a;
import sd.w;

/* compiled from: Messages.kt */
public final class a implements a.g {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f36497a;

    /* renamed from: b  reason: collision with root package name */
    private final pd.a f36498b;

    /* renamed from: c  reason: collision with root package name */
    private final b f36499c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<f.c> f36500d = new SparseArray<>();

    /* renamed from: nd.a$a  reason: collision with other inner class name */
    /* compiled from: Messages.kt */
    static final class C0421a extends n implements l<Surface, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f36501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f36502b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f36503c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36504d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bitmap f36505f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0421a(int i10, int i11, int i12, int i13, Bitmap bitmap) {
            super(1);
            this.f36501a = i10;
            this.f36502b = i11;
            this.f36503c = i12;
            this.f36504d = i13;
            this.f36505f = bitmap;
        }

        public final void a(Surface surface) {
            m.e(surface, "it");
            Canvas lockCanvas = surface.lockCanvas(new Rect(this.f36501a, this.f36502b, this.f36503c, this.f36504d));
            lockCanvas.drawBitmap(this.f36505f, (float) this.f36501a, (float) this.f36502b, (Paint) null);
            this.f36505f.recycle();
            surface.unlockCanvasAndPost(lockCanvas);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Surface) obj);
            return w.f38141a;
        }
    }

    public a(a.b bVar, pd.a aVar, b bVar2) {
        m.e(bVar, "binding");
        m.e(aVar, "documents");
        m.e(bVar2, "pages");
        this.f36497a = bVar;
        this.f36498b = aVar;
        this.f36499c = bVar2;
    }

    private final sd.n<ParcelFileDescriptor, PdfRenderer> l(String str) {
        String a10 = this.f36497a.c().a(str);
        File file = new File(this.f36497a.a().getCacheDir(), m.m(d.a(), ".pdf"));
        if (!file.exists()) {
            InputStream open = this.f36497a.a().getAssets().open(a10);
            m.d(open, "binding.applicationConte…ssets.open(fullAssetPath)");
            c.b(open, file);
            open.close();
        }
        Log.d("pdf_renderer", m.m("OpenAssetDocument. Created file: ", file.getPath()));
        return n(file);
    }

    private final sd.n<ParcelFileDescriptor, PdfRenderer> m(byte[] bArr) {
        File file = new File(this.f36497a.a().getCacheDir(), m.m(d.a(), ".pdf"));
        if (!file.exists()) {
            e.f(file, bArr);
        }
        Log.d("pdf_renderer", m.m("OpenDataDocument. Created file: ", file.getPath()));
        return n(file);
    }

    private final sd.n<ParcelFileDescriptor, PdfRenderer> n(File file) {
        Log.d("pdf_renderer", m.m("OpenFileDocument. File: ", file.getPath()));
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        if (open != null) {
            return new sd.n<>(open, new PdfRenderer(open));
        }
        throw new qd.b();
    }

    public void a(a.l lVar, a.m<Void> mVar) {
        SurfaceTexture b10;
        m.e(lVar, "message");
        m.e(mVar, "result");
        Long c10 = lVar.c();
        m.b(c10);
        int longValue = (int) c10.longValue();
        Long d10 = lVar.d();
        m.b(d10);
        int longValue2 = (int) d10.longValue();
        Long b11 = lVar.b();
        m.b(b11);
        int longValue3 = (int) b11.longValue();
        f.c cVar = this.f36500d.get(longValue);
        if (!(cVar == null || (b10 = cVar.b()) == null)) {
            b10.setDefaultBufferSize(longValue2, longValue3);
        }
        mVar.success(null);
    }

    public void b(a.c cVar) {
        m.e(cVar, "message");
        try {
            String b10 = cVar.b();
            pd.a aVar = this.f36498b;
            m.b(b10);
            aVar.b(b10);
        } catch (NullPointerException unused) {
            throw new c("pdf_renderer", "Need call arguments: id!", (Object) null);
        } catch (pd.d unused2) {
            throw new c("pdf_renderer", "Document not exist in documents repository", (Object) null);
        } catch (Exception unused3) {
            throw new c("pdf_renderer", "Unknown error", (Object) null);
        }
    }

    public void c(a.n nVar) {
        m.e(nVar, "message");
        Long b10 = nVar.b();
        m.b(b10);
        int longValue = (int) b10.longValue();
        f.c cVar = this.f36500d.get(longValue);
        if (cVar != null) {
            cVar.release();
        }
        this.f36500d.remove(longValue);
    }

    public void d(a.c cVar) {
        m.e(cVar, "message");
        try {
            String b10 = cVar.b();
            m.b(b10);
            m.d(b10, "message.id!!");
            this.f36499c.b(b10);
        } catch (NullPointerException unused) {
            throw new c("pdf_renderer", "Need call arguments: id!", (Object) null);
        } catch (pd.d unused2) {
            throw new c("pdf_renderer", "Page not exist in pages repository", (Object) null);
        } catch (Exception unused3) {
            throw new c("pdf_renderer", "Unknown error", (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        de.a.a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(sb.a.C0429a r7, sb.a.m<sb.a.b> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "pdf_renderer"
            java.lang.String r1 = "message"
            kotlin.jvm.internal.m.e(r7, r1)
            java.lang.String r1 = "result"
            kotlin.jvm.internal.m.e(r8, r1)
            sb.a$b r1 = new sb.a$b
            r1.<init>()
            r2 = 0
            java.lang.String r3 = r7.c()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            kotlin.jvm.internal.m.b(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.String r4 = "message.documentId!!"
            kotlin.jvm.internal.m.d(r3, r4)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Long r4 = r7.d()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            kotlin.jvm.internal.m.b(r4)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            long r4 = r4.longValue()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            int r5 = (int) r4     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Boolean r7 = r7.b()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            kotlin.jvm.internal.m.b(r7)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.String r4 = "message.autoCloseAndroid!!"
            kotlin.jvm.internal.m.d(r7, r4)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            boolean r7 = r7.booleanValue()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            if (r7 == 0) goto L_0x006d
            pd.a r7 = r6.f36498b     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Object r7 = r7.d(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            od.a r7 = (od.a) r7     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            android.graphics.pdf.PdfRenderer$Page r7 = r7.d(r5)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            int r3 = r7.getWidth()     // Catch:{ all -> 0x0066 }
            double r3 = (double) r3     // Catch:{ all -> 0x0066 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x0066 }
            r1.d(r3)     // Catch:{ all -> 0x0066 }
            int r3 = r7.getHeight()     // Catch:{ all -> 0x0066 }
            double r3 = (double) r3     // Catch:{ all -> 0x0066 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x0066 }
            r1.b(r3)     // Catch:{ all -> 0x0066 }
            sd.w r3 = sd.w.f38141a     // Catch:{ all -> 0x0066 }
            de.a.a(r7, r2)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            goto L_0x009e
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r3 = move-exception
            de.a.a(r7, r1)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            throw r3     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
        L_0x006d:
            pd.a r7 = r6.f36498b     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Object r7 = r7.d(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            od.a r7 = (od.a) r7     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            android.graphics.pdf.PdfRenderer$Page r7 = r7.d(r5)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            pd.b r4 = r6.f36499c     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            od.b r7 = r4.f(r3, r7)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.String r3 = r7.c()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            r1.c(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            int r3 = r7.d()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            double r3 = (double) r3     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            r1.d(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            int r7 = r7.b()     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            double r3 = (double) r7     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            java.lang.Double r7 = java.lang.Double.valueOf(r3)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            r1.b(r7)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
        L_0x009e:
            r8.success(r1)     // Catch:{ NullPointerException -> 0x00b8, d -> 0x00ad, Exception -> 0x00a2 }
            goto L_0x00c2
        L_0x00a2:
            nd.c r7 = new nd.c
            java.lang.String r1 = "Unknown error"
            r7.<init>(r0, r1, r2)
            r8.a(r7)
            goto L_0x00c2
        L_0x00ad:
            nd.c r7 = new nd.c
            java.lang.String r1 = "Document not exist in documents"
            r7.<init>(r0, r1, r2)
            r8.a(r7)
            goto L_0x00c2
        L_0x00b8:
            nd.c r7 = new nd.c
            java.lang.String r1 = "Need call arguments: documentId & page!"
            r7.<init>(r0, r1, r2)
            r8.a(r7)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.a.e(sb.a$a, sb.a$m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = null;
        r0.a(new nd.c(r5, "updateTexture Unknown error", (java.lang.Object) null));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x016a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(sb.a.o r20, sb.a.m<java.lang.Void> r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            java.lang.String r2 = "message"
            r3 = r20
            kotlin.jvm.internal.m.e(r3, r2)
            java.lang.String r2 = "result"
            kotlin.jvm.internal.m.e(r0, r2)
            java.lang.Long r2 = r20.m()
            kotlin.jvm.internal.m.b(r2)
            long r4 = r2.longValue()
            int r2 = (int) r4
            java.lang.Long r4 = r20.i()
            kotlin.jvm.internal.m.b(r4)
            long r4 = r4.longValue()
            int r5 = (int) r4
            android.util.SparseArray<io.flutter.view.f$c> r4 = r1.f36500d
            java.lang.Object r2 = r4.get(r2)
            io.flutter.view.f$c r2 = (io.flutter.view.f.c) r2
            pd.a r4 = r1.f36498b
            java.lang.String r6 = r20.e()
            kotlin.jvm.internal.m.b(r6)
            java.lang.String r7 = "message.documentId!!"
            kotlin.jvm.internal.m.d(r6, r7)
            java.lang.Object r4 = r4.d(r6)
            od.a r4 = (od.a) r4
            android.graphics.pdf.PdfRenderer$Page r4 = r4.d(r5)
            java.lang.Double r5 = r20.g()     // Catch:{ all -> 0x017b }
            if (r5 != 0) goto L_0x0057
            int r5 = r4.getWidth()     // Catch:{ all -> 0x017b }
            double r5 = (double) r5     // Catch:{ all -> 0x017b }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x017b }
        L_0x0057:
            double r5 = r5.doubleValue()     // Catch:{ all -> 0x017b }
            java.lang.Double r7 = r20.f()     // Catch:{ all -> 0x017b }
            if (r7 != 0) goto L_0x006a
            int r7 = r4.getHeight()     // Catch:{ all -> 0x017b }
            double r7 = (double) r7     // Catch:{ all -> 0x017b }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x017b }
        L_0x006a:
            double r7 = r7.doubleValue()     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.c()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            long r9 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r12 = (int) r9     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.d()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            long r9 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r13 = (int) r9     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.o()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            long r9 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r14 = (int) r9     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.h()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            long r9 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r15 = (int) r9     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.j()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            long r9 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r10 = (int) r9     // Catch:{ all -> 0x017b }
            java.lang.Long r9 = r20.k()     // Catch:{ all -> 0x017b }
            kotlin.jvm.internal.m.b(r9)     // Catch:{ all -> 0x017b }
            r16 = r12
            long r11 = r9.longValue()     // Catch:{ all -> 0x017b }
            int r9 = (int) r11     // Catch:{ all -> 0x017b }
            java.lang.String r11 = r20.b()     // Catch:{ all -> 0x017b }
            java.lang.String r12 = "pdf_renderer"
            if (r14 <= 0) goto L_0x00c6
            if (r15 > 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            r17 = r13
            goto L_0x00d3
        L_0x00c6:
            nd.c r1 = new nd.c     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "updateTexture width/height == 0"
            r17 = r13
            r13 = 0
            r1.<init>(r12, r3, r13)     // Catch:{ all -> 0x017b }
            r0.a(r1)     // Catch:{ all -> 0x017b }
        L_0x00d3:
            android.graphics.Matrix r1 = new android.graphics.Matrix     // Catch:{ all -> 0x017b }
            r1.<init>()     // Catch:{ all -> 0x017b }
            r3 = 9
            float[] r3 = new float[r3]     // Catch:{ all -> 0x017b }
            int r13 = r4.getWidth()     // Catch:{ all -> 0x017b }
            r18 = r12
            double r12 = (double) r13     // Catch:{ all -> 0x017b }
            double r5 = r5 / r12
            float r5 = (float) r5     // Catch:{ all -> 0x017b }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x017b }
            r5 = 1
            r6 = 0
            r3[r5] = r6     // Catch:{ all -> 0x017b }
            r12 = 2
            float r10 = (float) r10     // Catch:{ all -> 0x017b }
            float r10 = -r10
            r3[r12] = r10     // Catch:{ all -> 0x017b }
            r10 = 3
            r3[r10] = r6     // Catch:{ all -> 0x017b }
            r10 = 4
            int r12 = r4.getHeight()     // Catch:{ all -> 0x017b }
            double r12 = (double) r12     // Catch:{ all -> 0x017b }
            double r7 = r7 / r12
            float r7 = (float) r7     // Catch:{ all -> 0x017b }
            r3[r10] = r7     // Catch:{ all -> 0x017b }
            r7 = 5
            float r8 = (float) r9     // Catch:{ all -> 0x017b }
            float r8 = -r8
            r3[r7] = r8     // Catch:{ all -> 0x017b }
            r7 = 6
            r3[r7] = r6     // Catch:{ all -> 0x017b }
            r7 = 7
            r3[r7] = r6     // Catch:{ all -> 0x017b }
            r6 = 8
            r7 = 1065353216(0x3f800000, float:1.0)
            r3[r6] = r7     // Catch:{ all -> 0x017b }
            r1.setValues(r3)     // Catch:{ all -> 0x017b }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0168 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r14, r15, r3)     // Catch:{ Exception -> 0x0168 }
            if (r11 == 0) goto L_0x0121
            int r6 = android.graphics.Color.parseColor(r11)     // Catch:{ Exception -> 0x0168 }
            r3.eraseColor(r6)     // Catch:{ Exception -> 0x0168 }
        L_0x0121:
            r6 = 0
            r4.render(r3, r6, r1, r5)     // Catch:{ Exception -> 0x0168 }
            java.lang.Long r1 = r20.n()     // Catch:{ Exception -> 0x0168 }
            kotlin.jvm.internal.m.b(r1)     // Catch:{ Exception -> 0x0168 }
            long r5 = r1.longValue()     // Catch:{ Exception -> 0x0168 }
            int r1 = (int) r5     // Catch:{ Exception -> 0x0168 }
            java.lang.Long r5 = r20.l()     // Catch:{ Exception -> 0x0168 }
            kotlin.jvm.internal.m.b(r5)     // Catch:{ Exception -> 0x0168 }
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x0168 }
            int r6 = (int) r5     // Catch:{ Exception -> 0x0168 }
            if (r1 == 0) goto L_0x0148
            if (r6 == 0) goto L_0x0148
            android.graphics.SurfaceTexture r5 = r2.b()     // Catch:{ Exception -> 0x0168 }
            r5.setDefaultBufferSize(r1, r6)     // Catch:{ Exception -> 0x0168 }
        L_0x0148:
            android.view.Surface r1 = new android.view.Surface     // Catch:{ Exception -> 0x0168 }
            android.graphics.SurfaceTexture r2 = r2.b()     // Catch:{ Exception -> 0x0168 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0168 }
            nd.a$a r2 = new nd.a$a     // Catch:{ Exception -> 0x0168 }
            r11 = r2
            r5 = r18
            r12 = r16
            r13 = r17
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x016a }
            nd.b.a(r1, r2)     // Catch:{ Exception -> 0x016a }
            r1 = 0
            r0.success(r1)     // Catch:{ Exception -> 0x016a }
            r3 = 0
            goto L_0x0175
        L_0x0168:
            r5 = r18
        L_0x016a:
            nd.c r1 = new nd.c     // Catch:{ all -> 0x017b }
            java.lang.String r2 = "updateTexture Unknown error"
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch:{ all -> 0x017b }
            r0.a(r1)     // Catch:{ all -> 0x017b }
        L_0x0175:
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x017b }
            de.a.a(r4, r3)
            return
        L_0x017b:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            r2 = r0
            de.a.a(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.a.f(sb.a$o, sb.a$m):void");
    }

    public void g(a.e eVar, a.m<a.f> mVar) {
        m.e(eVar, "message");
        m.e(mVar, "result");
        a.f fVar = new a.f();
        try {
            String b10 = eVar.b();
            m.b(b10);
            od.a f10 = this.f36498b.f(n(new File(b10)));
            fVar.b(f10.b());
            fVar.c(Long.valueOf((long) f10.c()));
            mVar.success(fVar);
        } catch (NullPointerException unused) {
            mVar.a(new c("pdf_renderer", "Need call arguments: path", (Object) null));
        } catch (FileNotFoundException unused2) {
            mVar.a(new c("pdf_renderer", "File not found", (Object) null));
        } catch (IOException unused3) {
            mVar.a(new c("pdf_renderer", "Can't open file", (Object) null));
        } catch (qd.b unused4) {
            mVar.a(new c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused5) {
            mVar.a(new c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    public void h(a.e eVar, a.m<a.f> mVar) {
        m.e(eVar, "message");
        m.e(mVar, "result");
        a.f fVar = new a.f();
        try {
            String b10 = eVar.b();
            m.b(b10);
            od.a f10 = this.f36498b.f(l(b10));
            fVar.b(f10.b());
            fVar.c(Long.valueOf((long) f10.c()));
            mVar.success(fVar);
        } catch (NullPointerException unused) {
            mVar.a(new c("pdf_renderer", "Need call arguments: path", (Object) null));
        } catch (FileNotFoundException unused2) {
            mVar.a(new c("pdf_renderer", "File not found", (Object) null));
        } catch (IOException unused3) {
            mVar.a(new c("pdf_renderer", "Can't open file", (Object) null));
        } catch (qd.b unused4) {
            mVar.a(new c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused5) {
            mVar.a(new c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    public void i(a.d dVar, a.m<a.f> mVar) {
        m.e(dVar, "message");
        m.e(mVar, "result");
        a.f fVar = new a.f();
        try {
            byte[] b10 = dVar.b();
            m.b(b10);
            m.d(b10, "message.data!!");
            od.a f10 = this.f36498b.f(m(b10));
            fVar.b(f10.b());
            fVar.c(Long.valueOf((long) f10.c()));
            mVar.success(fVar);
        } catch (IOException unused) {
            mVar.a(new c("pdf_renderer", "Can't open file", (Object) null));
        } catch (qd.b unused2) {
            mVar.a(new c("pdf_renderer", "Can't create PDF renderer", (Object) null));
        } catch (Exception unused3) {
            mVar.a(new c("pdf_renderer", "Unknown error", (Object) null));
        }
    }

    public a.i j() {
        f.c h10 = this.f36497a.f().h();
        m.d(h10, "binding.textureRegistry.createSurfaceTexture()");
        int c10 = (int) h10.c();
        this.f36500d.put(c10, h10);
        a.i iVar = new a.i();
        iVar.b(Long.valueOf((long) c10));
        return iVar;
    }

    public void k(a.j jVar, a.m<a.k> mVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        a.m<a.k> mVar2 = mVar;
        m.e(jVar, "message");
        m.e(mVar2, "result");
        a.k kVar = new a.k();
        try {
            String k10 = jVar.k();
            m.b(k10);
            m.d(k10, "message.pageId!!");
            Long m10 = jVar.m();
            m.b(m10);
            int longValue = (int) m10.longValue();
            Long j10 = jVar.j();
            m.b(j10);
            int longValue2 = (int) j10.longValue();
            Long i14 = jVar.i();
            int longValue3 = i14 == null ? 1 : (int) i14.longValue();
            Boolean h10 = jVar.h();
            if (h10 == null) {
                h10 = Boolean.FALSE;
            }
            boolean booleanValue = h10.booleanValue();
            String b10 = jVar.b();
            int parseColor = b10 != null ? Color.parseColor(b10) : 0;
            Boolean c10 = jVar.c();
            m.b(c10);
            m.d(c10, "message.crop!!");
            boolean booleanValue2 = c10.booleanValue();
            if (booleanValue2) {
                Long f10 = jVar.f();
                m.b(f10);
                i10 = (int) f10.longValue();
            } else {
                i10 = 0;
            }
            if (booleanValue2) {
                Long g10 = jVar.g();
                m.b(g10);
                i11 = (int) g10.longValue();
            } else {
                i11 = 0;
            }
            if (booleanValue2) {
                Long d10 = jVar.d();
                m.b(d10);
                i12 = (int) d10.longValue();
            } else {
                i12 = 0;
            }
            if (booleanValue2) {
                Long e10 = jVar.e();
                m.b(e10);
                i13 = (int) e10.longValue();
            } else {
                i13 = 0;
            }
            Long l10 = jVar.l();
            int longValue4 = l10 == null ? 100 : (int) l10.longValue();
            od.b bVar = (od.b) this.f36499c.d(k10);
            String str = "jpg";
            if (longValue3 != 0) {
                if (longValue3 == 1) {
                    str = "png";
                } else if (longValue3 == 2) {
                    str = "webp";
                }
            }
            File file = new File(this.f36497a.a().getCacheDir(), "pdf_renderer_cache");
            file.mkdirs();
            b.a e11 = bVar.e(new File(file, d.a() + '.' + str), longValue, longValue2, parseColor, longValue3, booleanValue2, i10, i11, i13, i12, longValue4, booleanValue);
            kVar.d(e11.b());
            kVar.e(Long.valueOf((long) e11.c()));
            kVar.c(Long.valueOf((long) e11.a()));
            mVar2.success(kVar);
        } catch (Exception e12) {
            mVar2.a(new c("pdf_renderer", "Unexpected error", e12));
        }
    }
}
