package zb;

import java.nio.ByteBuffer;
import zb.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f39495a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f39496b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f39497c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.f f39498d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f39499f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f39500g;

    public /* synthetic */ b(c cVar, String str, int i10, c.f fVar, ByteBuffer byteBuffer, long j10) {
        this.f39495a = cVar;
        this.f39496b = str;
        this.f39497c = i10;
        this.f39498d = fVar;
        this.f39499f = byteBuffer;
        this.f39500g = j10;
    }

    public final void run() {
        this.f39495a.m(this.f39496b, this.f39497c, this.f39498d, this.f39499f, this.f39500g);
    }
}
