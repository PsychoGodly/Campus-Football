package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: FlutterAdapterStatus */
class o {

    /* renamed from: a  reason: collision with root package name */
    final b f34106a;

    /* renamed from: b  reason: collision with root package name */
    final String f34107b;

    /* renamed from: c  reason: collision with root package name */
    final Number f34108c;

    /* compiled from: FlutterAdapterStatus */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34109a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.android.gms.ads.initialization.AdapterStatus$State[] r0 = com.google.android.gms.ads.initialization.AdapterStatus.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34109a = r0
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34109a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.gms.ads.initialization.AdapterStatus$State r1 = com.google.android.gms.ads.initialization.AdapterStatus.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.o.a.<clinit>():void");
        }
    }

    /* compiled from: FlutterAdapterStatus */
    enum b {
        NOT_READY,
        READY
    }

    o(b bVar, String str, Number number) {
        this.f34106a = bVar;
        this.f34107b = str;
        this.f34108c = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f34106a == oVar.f34106a && this.f34107b.equals(oVar.f34107b)) {
            return this.f34108c.equals(oVar.f34108c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34106a.hashCode() * 31) + this.f34107b.hashCode()) * 31) + this.f34108c.hashCode();
    }

    o(AdapterStatus adapterStatus) {
        int i10 = a.f34109a[adapterStatus.getInitializationState().ordinal()];
        if (i10 == 1) {
            this.f34106a = b.NOT_READY;
        } else if (i10 == 2) {
            this.f34106a = b.READY;
        } else {
            throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{adapterStatus.getInitializationState()}));
        }
        this.f34107b = adapterStatus.getDescription();
        this.f34108c = Integer.valueOf(adapterStatus.getLatency());
    }
}
