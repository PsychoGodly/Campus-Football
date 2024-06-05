package r2;

import android.media.MediaDrm;
import r2.g0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f37784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0.b f37785b;

    public /* synthetic */ i0(k0 k0Var, g0.b bVar) {
        this.f37784a = k0Var;
        this.f37785b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f37784a.z(this.f37785b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
