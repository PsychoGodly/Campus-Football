package t3;

import com.unity3d.services.UnityAdsConstants;
import h3.a;

/* compiled from: EventStream */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a[] f22616a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f22617b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22618c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22619d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22620e;

    public f(String str, String str2, long j10, long[] jArr, a[] aVarArr) {
        this.f22618c = str;
        this.f22619d = str2;
        this.f22620e = j10;
        this.f22617b = jArr;
        this.f22616a = aVarArr;
    }

    public String a() {
        return this.f22618c + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + this.f22619d;
    }
}
