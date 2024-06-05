package h5;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class y extends x {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f18868b;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f18868b = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] B1() {
        return this.f18868b;
    }
}
