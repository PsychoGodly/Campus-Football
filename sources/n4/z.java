package n4;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class z {

    /* renamed from: a  reason: collision with root package name */
    protected final int f20972a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f20973b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f20974c;

    public z(int i10, int i11, int i12) {
        this.f20972a = i10;
        this.f20973b = i11;
        this.f20974c = i12;
    }

    public int a() {
        return this.f20972a;
    }

    public int b() {
        return this.f20974c;
    }

    public int c() {
        return this.f20973b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", new Object[]{Integer.valueOf(this.f20972a), Integer.valueOf(this.f20973b), Integer.valueOf(this.f20974c)});
    }
}
