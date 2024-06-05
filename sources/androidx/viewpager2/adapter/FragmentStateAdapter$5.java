package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;

class FragmentStateAdapter$5 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f4972a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f4973b;

    public void onStateChanged(p pVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            this.f4972a.removeCallbacks(this.f4973b);
            pVar.getLifecycle().d(this);
        }
    }
}
