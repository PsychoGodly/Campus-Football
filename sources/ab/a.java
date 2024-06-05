package ab;

import android.os.Bundle;

/* compiled from: RequestExtras */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static String f31541b = "query_info_type";

    /* renamed from: c  reason: collision with root package name */
    public static String f31542c = "requester_type_5";

    /* renamed from: d  reason: collision with root package name */
    public static String f31543d = "UnityScar";

    /* renamed from: a  reason: collision with root package name */
    private String f31544a;

    public a(String str) {
        this.f31544a = f31543d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f31541b, f31542c);
        return bundle;
    }

    public String b() {
        return this.f31544a;
    }
}
