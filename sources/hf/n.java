package hf;

import java.io.IOException;

/* compiled from: StreamResetException */
public final class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final b f33241a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f33241a = bVar;
    }
}
