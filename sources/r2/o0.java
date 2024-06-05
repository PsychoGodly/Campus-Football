package r2;

import android.net.Uri;
import j4.p;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: MediaDrmCallbackException */
public final class o0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final p f22087a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f22088b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f22089c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22090d;

    public o0(p pVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f22087a = pVar;
        this.f22088b = uri;
        this.f22089c = map;
        this.f22090d = j10;
    }
}
