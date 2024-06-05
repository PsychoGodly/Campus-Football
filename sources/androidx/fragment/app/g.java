package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer */
public abstract class g {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.U(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
