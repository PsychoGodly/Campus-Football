package r5;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import h5.l;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f29772a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29773b;

    public p(Context context, String str) {
        q.k(context);
        this.f29772a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f29773b = str;
        } else {
            this.f29773b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(l.f18852a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f29772a.getIdentifier(str, "string", this.f29773b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f29772a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
