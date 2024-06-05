package h1;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
class k0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f18647a;

    k0(IBinder iBinder) {
        this.f18647a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f18647a.equals(this.f18647a);
    }

    public int hashCode() {
        return this.f18647a.hashCode();
    }
}
