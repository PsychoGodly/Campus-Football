package od;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.m;
import qd.c;

/* compiled from: Page.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f36762a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36763b;

    /* renamed from: c  reason: collision with root package name */
    private final PdfRenderer.Page f36764c;

    /* compiled from: Page.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f36765a;

        /* renamed from: b  reason: collision with root package name */
        private final int f36766b;

        /* renamed from: c  reason: collision with root package name */
        private final String f36767c;

        public a(int i10, int i11, String str) {
            m.e(str, "path");
            this.f36765a = i10;
            this.f36766b = i11;
            this.f36767c = str;
        }

        public final int a() {
            return this.f36766b;
        }

        public final String b() {
            return this.f36767c;
        }

        public final int c() {
            return this.f36765a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!m.a(a.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type io.scer.pdfx.document.Page.Data");
            return this.f36767c.contentEquals(((a) obj).f36767c);
        }

        public int hashCode() {
            return (((this.f36765a * 31) + this.f36766b) * 31) + this.f36767c.hashCode();
        }

        public String toString() {
            return "Data(width=" + this.f36765a + ", height=" + this.f36766b + ", path=" + this.f36767c + ')';
        }
    }

    public b(String str, String str2, PdfRenderer.Page page) {
        m.e(str, "id");
        m.e(str2, "documentId");
        m.e(page, "pageRenderer");
        this.f36762a = str;
        this.f36763b = str2;
        this.f36764c = page;
    }

    public final void a() {
        this.f36764c.close();
    }

    public final int b() {
        return this.f36764c.getHeight();
    }

    public final String c() {
        return this.f36762a;
    }

    public final int d() {
        return this.f36764c.getWidth();
    }

    public final a e(File file, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        m.e(file, "file");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i12);
        this.f36764c.render(createBitmap, (Rect) null, (Matrix) null, z11 ? 2 : 1);
        if (!z10 || (i16 == i10 && i17 == i11)) {
            m.d(createBitmap, "bitmap");
            c.a(createBitmap, file, i13, i18);
            String absolutePath = file.getAbsolutePath();
            m.d(absolutePath, "file.absolutePath");
            return new a(i10, i11, absolutePath);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i14, i15, i16, i17);
        m.d(createBitmap2, "cropped");
        c.a(createBitmap2, file, i13, i18);
        String absolutePath2 = file.getAbsolutePath();
        m.d(absolutePath2, "file.absolutePath");
        return new a(i16, i17, absolutePath2);
    }
}
