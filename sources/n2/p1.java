package n2;

/* compiled from: ExoTimeoutException */
public final class p1 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f20611a;

    public p1(int i10) {
        super(a(i10));
        this.f20611a = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
