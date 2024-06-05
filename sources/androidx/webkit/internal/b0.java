package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: WebMessagePayloadAdapter */
public class b0 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private final int f4984a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4985b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f4986c;

    public b0(String str) {
        this.f4984a = 0;
        this.f4985b = str;
        this.f4986c = null;
    }

    private void a(int i10) {
        if (this.f4984a != i10) {
            throw new IllegalStateException("Expected " + i10 + ", but type is " + this.f4984a);
        }
    }

    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f4986c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    public String getAsString() {
        a(0);
        return this.f4985b;
    }

    public String[] getSupportedFeatures() {
        return new String[0];
    }

    public int getType() {
        return this.f4984a;
    }

    public b0(byte[] bArr) {
        this.f4984a = 1;
        this.f4985b = null;
        this.f4986c = bArr;
    }
}
