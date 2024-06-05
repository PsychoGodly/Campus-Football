package ue;

/* compiled from: SystemProps.kt */
final /* synthetic */ class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f38821a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f38821a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
