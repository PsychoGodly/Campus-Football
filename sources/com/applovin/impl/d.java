package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

public abstract class d extends qp {

    /* renamed from: a  reason: collision with root package name */
    private b f7057a = b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private Object f7058b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.impl.d$b[] r0 = com.applovin.impl.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7059a = r0
                com.applovin.impl.d$b r1 = com.applovin.impl.d.b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7059a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.impl.d$b r1 = com.applovin.impl.d.b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d.a.<clinit>():void");
        }
    }

    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected d() {
    }

    private boolean c() {
        this.f7057a = b.FAILED;
        this.f7058b = a();
        if (this.f7057a == b.DONE) {
            return false;
        }
        this.f7057a = b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public final Object b() {
        this.f7057a = b.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.f7057a != b.FAILED);
        int i10 = a.f7059a[this.f7057a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.f7057a = b.NOT_READY;
            Object obj = this.f7058b;
            this.f7058b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
