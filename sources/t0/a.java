package t0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: AdServicesInfo.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22549a = new a();

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* compiled from: AdServicesInfo.kt */
    private static final class C0236a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0236a f22550a = new C0236a();

        private C0236a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0236a.f22550a.a();
        }
        return 0;
    }
}
