package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: CompositeReadableBuffer */
public class u extends c {

    /* renamed from: f  reason: collision with root package name */
    private static final f<Void> f35392f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final f<Void> f35393g = new b();

    /* renamed from: h  reason: collision with root package name */
    private static final f<byte[]> f35394h = new c();

    /* renamed from: i  reason: collision with root package name */
    private static final f<ByteBuffer> f35395i = new d();

    /* renamed from: j  reason: collision with root package name */
    private static final g<OutputStream> f35396j = new e();

    /* renamed from: a  reason: collision with root package name */
    private final Deque<v1> f35397a;

    /* renamed from: b  reason: collision with root package name */
    private Deque<v1> f35398b;

    /* renamed from: c  reason: collision with root package name */
    private int f35399c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35400d;

    /* compiled from: CompositeReadableBuffer */
    class a implements f<Void> {
        a() {
        }

        /* renamed from: b */
        public int a(v1 v1Var, int i10, Void voidR, int i11) {
            return v1Var.readUnsignedByte();
        }
    }

    /* compiled from: CompositeReadableBuffer */
    class b implements f<Void> {
        b() {
        }

        /* renamed from: b */
        public int a(v1 v1Var, int i10, Void voidR, int i11) {
            v1Var.skipBytes(i10);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer */
    class c implements f<byte[]> {
        c() {
        }

        /* renamed from: b */
        public int a(v1 v1Var, int i10, byte[] bArr, int i11) {
            v1Var.Y(bArr, i11, i10);
            return i11 + i10;
        }
    }

    /* compiled from: CompositeReadableBuffer */
    class d implements f<ByteBuffer> {
        d() {
        }

        /* renamed from: b */
        public int a(v1 v1Var, int i10, ByteBuffer byteBuffer, int i11) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            v1Var.P0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer */
    class e implements g<OutputStream> {
        e() {
        }

        /* renamed from: b */
        public int a(v1 v1Var, int i10, OutputStream outputStream, int i11) throws IOException {
            v1Var.B0(outputStream, i10);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer */
    private interface f<T> extends g<T> {
    }

    /* compiled from: CompositeReadableBuffer */
    private interface g<T> {
        int a(v1 v1Var, int i10, T t10, int i11) throws IOException;
    }

    public u(int i10) {
        this.f35397a = new ArrayDeque(i10);
    }

    private <T> int A(f<T> fVar, int i10, T t10, int i11) {
        try {
            return u(fVar, i10, t10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    private void j() {
        if (this.f35400d) {
            this.f35398b.add(this.f35397a.remove());
            v1 peek = this.f35397a.peek();
            if (peek != null) {
                peek.c0();
                return;
            }
            return;
        }
        this.f35397a.remove().close();
    }

    private void n() {
        if (this.f35397a.peek().d() == 0) {
            j();
        }
    }

    private void q(v1 v1Var) {
        if (!(v1Var instanceof u)) {
            this.f35397a.add(v1Var);
            this.f35399c += v1Var.d();
            return;
        }
        u uVar = (u) v1Var;
        while (!uVar.f35397a.isEmpty()) {
            this.f35397a.add(uVar.f35397a.remove());
        }
        this.f35399c += uVar.f35399c;
        uVar.f35399c = 0;
        uVar.close();
    }

    private <T> int u(g<T> gVar, int i10, T t10, int i11) throws IOException {
        h(i10);
        if (!this.f35397a.isEmpty()) {
            n();
        }
        while (i10 > 0 && !this.f35397a.isEmpty()) {
            v1 peek = this.f35397a.peek();
            int min = Math.min(i10, peek.d());
            i11 = gVar.a(peek, min, t10, i11);
            i10 -= min;
            this.f35399c -= min;
            n();
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public void B0(OutputStream outputStream, int i10) throws IOException {
        u(f35396j, i10, outputStream, 0);
    }

    public void P0(ByteBuffer byteBuffer) {
        A(f35395i, byteBuffer.remaining(), byteBuffer, 0);
    }

    public void Y(byte[] bArr, int i10, int i11) {
        A(f35394h, i11, bArr, i10);
    }

    public void c0() {
        if (this.f35398b == null) {
            this.f35398b = new ArrayDeque(Math.min(this.f35397a.size(), 16));
        }
        while (!this.f35398b.isEmpty()) {
            this.f35398b.remove().close();
        }
        this.f35400d = true;
        v1 peek = this.f35397a.peek();
        if (peek != null) {
            peek.c0();
        }
    }

    public void close() {
        while (!this.f35397a.isEmpty()) {
            this.f35397a.remove().close();
        }
        if (this.f35398b != null) {
            while (!this.f35398b.isEmpty()) {
                this.f35398b.remove().close();
            }
        }
    }

    public int d() {
        return this.f35399c;
    }

    public void i(v1 v1Var) {
        boolean z10 = this.f35400d && this.f35397a.isEmpty();
        q(v1Var);
        if (z10) {
            this.f35397a.peek().c0();
        }
    }

    public boolean markSupported() {
        for (v1 markSupported : this.f35397a) {
            if (!markSupported.markSupported()) {
                return false;
            }
        }
        return true;
    }

    public int readUnsignedByte() {
        return A(f35392f, 1, (Object) null, 0);
    }

    public void reset() {
        if (this.f35400d) {
            v1 peek = this.f35397a.peek();
            if (peek != null) {
                int d10 = peek.d();
                peek.reset();
                this.f35399c += peek.d() - d10;
            }
            while (true) {
                v1 pollLast = this.f35398b.pollLast();
                if (pollLast != null) {
                    pollLast.reset();
                    this.f35397a.addFirst(pollLast);
                    this.f35399c += pollLast.d();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    public void skipBytes(int i10) {
        A(f35393g, i10, (Object) null, 0);
    }

    public v1 z(int i10) {
        v1 v1Var;
        int i11;
        v1 v1Var2;
        if (i10 <= 0) {
            return w1.a();
        }
        h(i10);
        this.f35399c -= i10;
        u uVar = null;
        u uVar2 = null;
        while (true) {
            v1 peek = this.f35397a.peek();
            int d10 = peek.d();
            if (d10 > i10) {
                v1Var = peek.z(i10);
                i11 = 0;
            } else {
                if (this.f35400d) {
                    v1Var2 = peek.z(d10);
                    j();
                } else {
                    v1Var2 = this.f35397a.poll();
                }
                v1 v1Var3 = v1Var2;
                i11 = i10 - d10;
                v1Var = v1Var3;
            }
            if (uVar == null) {
                uVar = v1Var;
            } else {
                if (uVar2 == null) {
                    int i12 = 2;
                    if (i11 != 0) {
                        i12 = Math.min(this.f35397a.size() + 2, 16);
                    }
                    uVar2 = new u(i12);
                    uVar2.i(uVar);
                    uVar = uVar2;
                }
                uVar2.i(v1Var);
            }
            if (i11 <= 0) {
                return uVar;
            }
            i10 = i11;
        }
    }

    public u() {
        this.f35397a = new ArrayDeque();
    }
}
