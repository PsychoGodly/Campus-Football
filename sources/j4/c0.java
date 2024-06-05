package j4;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: HttpDataSource */
public final class c0 extends a0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f19295d;

    /* renamed from: f  reason: collision with root package name */
    public final String f19296f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, List<String>> f19297g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f19298h;

    public c0(int i10, String str, IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
        super("Response code: " + i10, iOException, pVar, AdError.INTERNAL_ERROR_2004, 1);
        this.f19295d = i10;
        this.f19296f = str;
        this.f19297g = map;
        this.f19298h = bArr;
    }
}
