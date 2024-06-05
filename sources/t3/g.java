package t3;

import java.util.Collections;
import java.util.List;

/* compiled from: Period */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f22621a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22622b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f22623c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f22624d;

    /* renamed from: e  reason: collision with root package name */
    public final e f22625e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, (e) null);
    }

    public int a(int i10) {
        int size = this.f22623c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f22623c.get(i11).f22577b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f22621a = str;
        this.f22622b = j10;
        this.f22623c = Collections.unmodifiableList(list);
        this.f22624d = Collections.unmodifiableList(list2);
        this.f22625e = eVar;
    }
}
