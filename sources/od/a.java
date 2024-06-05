package od;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.m;

/* compiled from: Document.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36759a;

    /* renamed from: b  reason: collision with root package name */
    private final PdfRenderer f36760b;

    /* renamed from: c  reason: collision with root package name */
    private final ParcelFileDescriptor f36761c;

    public a(String str, PdfRenderer pdfRenderer, ParcelFileDescriptor parcelFileDescriptor) {
        m.e(str, "id");
        m.e(pdfRenderer, "documentRenderer");
        m.e(parcelFileDescriptor, "fileDescriptor");
        this.f36759a = str;
        this.f36760b = pdfRenderer;
        this.f36761c = parcelFileDescriptor;
    }

    public final void a() {
        this.f36760b.close();
        this.f36761c.close();
    }

    public final String b() {
        return this.f36759a;
    }

    public final int c() {
        return this.f36760b.getPageCount();
    }

    public final PdfRenderer.Page d(int i10) {
        PdfRenderer.Page openPage = this.f36760b.openPage(i10 - 1);
        m.d(openPage, "documentRenderer.openPage(pageNumber - 1)");
        return openPage;
    }
}
