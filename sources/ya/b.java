package ya;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f39409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f39410b;

    public /* synthetic */ b(f fVar, k.d dVar) {
        this.f39409a = fVar;
        this.f39410b = dVar;
    }

    public final void onConsentInfoUpdateFailure(FormError formError) {
        f.j(this.f39409a, this.f39410b, formError);
    }
}
