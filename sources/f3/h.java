package f3;

import java.nio.ByteBuffer;
import k4.a;

/* compiled from: SimpleMetadataDecoder */
public abstract class h implements c {
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a.e(eVar.f21755c);
        a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.k()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract a b(e eVar, ByteBuffer byteBuffer);
}
