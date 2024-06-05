package ef;

import cf.c;
import java.io.IOException;

/* compiled from: RouteException */
public final class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private IOException f32550a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f32551b;

    public e(IOException iOException) {
        super(iOException);
        this.f32550a = iOException;
        this.f32551b = iOException;
    }

    public void a(IOException iOException) {
        c.a(this.f32550a, iOException);
        this.f32551b = iOException;
    }

    public IOException b() {
        return this.f32550a;
    }

    public IOException c() {
        return this.f32551b;
    }
}
