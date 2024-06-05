package pd;

import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.m;
import qd.d;

/* compiled from: PageRepository.kt */
public final class b extends c<od.b> {
    public void b(String str) {
        m.e(str, "id");
        ((od.b) d(str)).a();
        super.b(str);
    }

    public final od.b f(String str, PdfRenderer.Page page) {
        m.e(str, "documentId");
        m.e(page, "pageRenderer");
        String b10 = d.b();
        od.b bVar = new od.b(b10, str, page);
        e(b10, bVar);
        return bVar;
    }
}
