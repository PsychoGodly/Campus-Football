package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.o;
import androidx.core.util.h;
import j0.b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final b f3404a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f3405b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3406c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f3407d;

    /* compiled from: MetadataRepo */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f3408a;

        /* renamed from: b  reason: collision with root package name */
        private g f3409b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f3408a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* access modifiers changed from: package-private */
        public final g b() {
            return this.f3409b;
        }

        /* access modifiers changed from: package-private */
        public void c(g gVar, int i10, int i11) {
            a a10 = a(gVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f3408a.put(gVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(gVar, i10 + 1, i11);
            } else {
                a10.f3409b = gVar;
            }
        }

        a(int i10) {
            this.f3408a = new SparseArray<>(i10);
        }
    }

    private m(Typeface typeface, b bVar) {
        this.f3407d = typeface;
        this.f3404a = bVar;
        this.f3405b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.f(), this.f3405b, i10 * 2);
            h(gVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public char[] c() {
        return this.f3405b;
    }

    public b d() {
        return this.f3404a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f3404a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f3406c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f3407d;
    }

    /* access modifiers changed from: package-private */
    public void h(g gVar) {
        h.g(gVar, "emoji metadata cannot be null");
        h.a(gVar.c() > 0, "invalid metadata codepoint length");
        this.f3406c.c(gVar, 0, gVar.c() - 1);
    }
}
