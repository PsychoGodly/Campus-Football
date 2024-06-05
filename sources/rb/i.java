package rb;

import kotlin.jvm.internal.m;
import lc.d;
import lc.p;

/* compiled from: RequestCameraPermissionHandler.kt */
public final class i implements p {

    /* renamed from: a  reason: collision with root package name */
    private final d.b f37904a;

    public i(d.b bVar) {
        this.f37904a = bVar;
    }

    private final boolean a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        if (iArr.length == 0) {
            return false;
        }
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = iArr[i10];
            i10++;
            if (i11 != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        m.e(strArr, "permissions");
        m.e(iArr, "grantResults");
        if (i10 != 200) {
            return false;
        }
        if (a(iArr)) {
            d.b bVar = this.f37904a;
            if (bVar == null) {
                return true;
            }
            bVar.success("PERMISSION_GRANTED");
            return true;
        }
        d.b bVar2 = this.f37904a;
        if (bVar2 == null) {
            return true;
        }
        bVar2.success("PERMISSION_NOT_GRANTED");
        return true;
    }
}
