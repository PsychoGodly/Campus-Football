package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import fe.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f719a;

    public /* synthetic */ m(a aVar) {
        this.f719a = aVar;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.c.c(this.f719a);
    }
}
