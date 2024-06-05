package dd;

/* compiled from: ManagedChannelProvider */
public abstract class w0 {

    /* compiled from: ManagedChannelProvider */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static w0 d() {
        w0 d10 = x0.b().d();
        if (d10 != null) {
            return d10;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* access modifiers changed from: protected */
    public abstract v0<?> a(String str);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract int c();
}
