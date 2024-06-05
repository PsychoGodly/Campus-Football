package y3;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import q2.j;

/* compiled from: SimpleSubtitleDecoder */
public abstract class g extends j<l, m, j> implements i {

    /* renamed from: n  reason: collision with root package name */
    private final String f23876n;

    /* compiled from: SimpleSubtitleDecoder */
    class a extends m {
        a() {
        }

        public void q() {
            g.this.r(this);
        }
    }

    protected g(String str) {
        super(new l[2], new m[2]);
        this.f23876n = str;
        u(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final j j(l lVar, m mVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) k4.a.e(lVar.f21755c);
            m mVar2 = mVar;
            mVar2.r(lVar.f21757f, z(byteBuffer.array(), byteBuffer.limit(), z10), lVar.f23879j);
            mVar.h(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (j e10) {
            return e10;
        }
    }

    public void a(long j10) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final l g() {
        return new l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final m h() {
        return new a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final j i(Throwable th) {
        return new j("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    public abstract h z(byte[] bArr, int i10, boolean z10) throws j;
}
