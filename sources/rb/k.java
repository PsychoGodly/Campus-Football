package rb;

import af.a;
import android.content.Context;
import android.hardware.Camera;
import kotlin.jvm.internal.m;
import ze.e;

/* compiled from: ZXingAutofocusScannerView.kt */
public final class k extends a {
    private boolean A;

    /* renamed from: z  reason: collision with root package name */
    private boolean f37906z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        m.e(context, "context");
    }

    public void setAutoFocus(boolean z10) {
        if (this.A) {
            super.setAutoFocus(this.f37906z);
        }
    }

    public void setupCameraPreview(e eVar) {
        Camera camera;
        Camera.Parameters parameters;
        if (!(eVar == null || (camera = eVar.f39585a) == null || (parameters = camera.getParameters()) == null)) {
            try {
                this.A = parameters.getSupportedFocusModes().contains("auto");
                parameters.setFocusMode("continuous-picture");
                eVar.f39585a.setParameters(parameters);
            } catch (Exception unused) {
                this.f37906z = true;
            }
        }
        super.setupCameraPreview(eVar);
    }
}
