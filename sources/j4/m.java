package j4;

import java.io.IOException;

/* compiled from: DataSourceException */
public class m extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f19364a;

    public m(int i10) {
        this.f19364a = i10;
    }

    public static boolean a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof m) && ((m) th).f19364a == 2008) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    public m(Throwable th, int i10) {
        super(th);
        this.f19364a = i10;
    }

    public m(String str, int i10) {
        super(str);
        this.f19364a = i10;
    }

    public m(String str, Throwable th, int i10) {
        super(str, th);
        this.f19364a = i10;
    }
}
