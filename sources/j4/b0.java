package j4;

import com.facebook.ads.AdError;

/* compiled from: HttpDataSource */
public final class b0 extends a0 {

    /* renamed from: d  reason: collision with root package name */
    public final String f19289d;

    public b0(String str, p pVar) {
        super("Invalid content type: " + str, pVar, (int) AdError.INTERNAL_ERROR_2003, 1);
        this.f19289d = str;
    }
}
