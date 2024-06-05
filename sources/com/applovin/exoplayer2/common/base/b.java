package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class b implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private C0111b f6099a = C0111b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private Object f6100b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6101a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.exoplayer2.common.base.b$b[] r0 = com.applovin.exoplayer2.common.base.b.C0111b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6101a = r0
                com.applovin.exoplayer2.common.base.b$b r1 = com.applovin.exoplayer2.common.base.b.C0111b.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6101a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.exoplayer2.common.base.b$b r1 = com.applovin.exoplayer2.common.base.b.C0111b.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.b.a.<clinit>():void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$b  reason: collision with other inner class name */
    private enum C0111b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f6099a = C0111b.FAILED;
        this.f6100b = a();
        if (this.f6099a == C0111b.DONE) {
            return false;
        }
        this.f6099a = C0111b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public final Object b() {
        this.f6099a = C0111b.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.f6099a != C0111b.FAILED);
        int i10 = a.f6101a[this.f6099a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return c();
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            this.f6099a = C0111b.NOT_READY;
            Object obj = this.f6100b;
            this.f6100b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
