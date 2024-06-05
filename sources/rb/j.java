package rb;

import android.content.Intent;
import lc.k;
import lc.m;

/* compiled from: ScanResultHandler.kt */
public final class j implements m {

    /* renamed from: a  reason: collision with root package name */
    private final k.d f37905a;

    public j(k.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "result");
        this.f37905a = dVar;
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        byte[] bArr;
        byte[] byteArrayExtra;
        byte[] bArr2 = new byte[0];
        if (i11 == -1) {
            if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("scan_result")) == null)) {
                bArr2 = byteArrayExtra;
            }
            bArr = bArr2;
        } else if (i11 != 0) {
            bArr = ((h) h.j0().I(g.Error).F(e.unknown).H(intent == null ? null : intent.getStringExtra("error_code")).build()).i();
            kotlin.jvm.internal.m.d(bArr, "newBuilder()\n           …           .toByteArray()");
        } else {
            bArr = ((h) h.j0().I(g.Cancelled).build()).i();
            kotlin.jvm.internal.m.d(bArr, "newBuilder()\n           …           .toByteArray()");
        }
        this.f37905a.success(bArr);
        return true;
    }
}
