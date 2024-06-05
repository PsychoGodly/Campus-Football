package pd;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import kotlin.jvm.internal.m;
import qd.d;
import sd.n;

/* compiled from: DocumentRepository.kt */
public final class a extends c<od.a> {
    public void b(String str) {
        m.e(str, "id");
        ((od.a) d(str)).a();
        super.b(str);
    }

    public final od.a f(n<? extends ParcelFileDescriptor, PdfRenderer> nVar) {
        String b10 = d.b();
        m.b(nVar);
        od.a aVar = new od.a(b10, nVar.b(), (ParcelFileDescriptor) nVar.a());
        e(b10, aVar);
        return aVar;
    }
}
