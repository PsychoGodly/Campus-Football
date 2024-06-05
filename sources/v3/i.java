package v3;

import java.util.Collections;
import java.util.List;
import o3.a;

/* compiled from: HlsPlaylist */
public abstract class i implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final String f23277a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f23278b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23279c;

    protected i(String str, List<String> list, boolean z10) {
        this.f23277a = str;
        this.f23278b = Collections.unmodifiableList(list);
        this.f23279c = z10;
    }
}
