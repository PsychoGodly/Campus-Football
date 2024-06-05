package t4;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class m extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    final t f22701a;

    /* renamed from: b  reason: collision with root package name */
    boolean f22702b;

    public m(Context context, String str, String str2, String str3) {
        super(context);
        t tVar = new t(context, str);
        this.f22701a = tVar;
        tVar.o(str2);
        tVar.n(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22702b) {
            return false;
        }
        this.f22701a.m(motionEvent);
        return false;
    }
}
