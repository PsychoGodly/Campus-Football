package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;

class FragmentManager$6 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f3475a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f3476b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f3477c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f3478d;

    public void onStateChanged(p pVar, i.a aVar) {
        Bundle bundle;
        if (aVar == i.a.ON_START && (bundle = (Bundle) this.f3478d.f3643j.get(this.f3475a)) != null) {
            this.f3476b.a(this.f3475a, bundle);
            this.f3478d.q(this.f3475a);
        }
        if (aVar == i.a.ON_DESTROY) {
            this.f3477c.d(this);
            this.f3478d.f3644k.remove(this.f3475a);
        }
    }
}
