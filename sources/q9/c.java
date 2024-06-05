package q9;

/* compiled from: DataMask */
enum c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (i10 & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return i11 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (i10 + i11) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (((i10 / 2) + (i11 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (i10 * i11) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (i10 * i11) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        public boolean a(int i10, int i11) {
            return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    public abstract boolean a(int i10, int i11);

    /* access modifiers changed from: package-private */
    public final void c(z8.b bVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (a(i11, i12)) {
                    bVar.c(i12, i11);
                }
            }
        }
    }
}
