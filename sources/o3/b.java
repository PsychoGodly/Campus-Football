package o3;

import android.net.Uri;
import j4.j0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o3.a;

/* compiled from: FilteringManifestParser */
public final class b<T extends a<T>> implements j0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final j0.a<? extends T> f21069a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f21070b;

    public b(j0.a<? extends T> aVar, List<c> list) {
        this.f21069a = aVar;
        this.f21070b = list;
    }

    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T t10 = (a) this.f21069a.a(uri, inputStream);
        List<c> list = this.f21070b;
        return (list == null || list.isEmpty()) ? t10 : (a) t10.a(this.f21070b);
    }
}
