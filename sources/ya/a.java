package ya;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ConsentForm.OnConsentFormDismissedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f39407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f39408b;

    public /* synthetic */ a(f fVar, k.d dVar) {
        this.f39407a = fVar;
        this.f39408b = dVar;
    }

    public final void onConsentFormDismissed(FormError formError) {
        f.o(this.f39407a, this.f39408b, formError);
    }
}
