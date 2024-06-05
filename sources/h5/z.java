package h5;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class z extends x {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f18869c = new WeakReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f18870b = f18869c;

    z(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] B1() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f18870b.get();
            if (bArr == null) {
                bArr = C1();
                this.f18870b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] C1();
}
