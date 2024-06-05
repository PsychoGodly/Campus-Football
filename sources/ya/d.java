package ya;

import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f39413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f39414b;

    public /* synthetic */ d(f fVar, k.d dVar) {
        this.f39413a = fVar;
        this.f39414b = dVar;
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        f.p(this.f39413a, this.f39414b, formError);
    }
}
