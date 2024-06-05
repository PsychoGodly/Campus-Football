package h5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class m extends d {

    /* renamed from: s0  reason: collision with root package name */
    private Dialog f18858s0;

    /* renamed from: t0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f18859t0;

    /* renamed from: u0  reason: collision with root package name */
    private Dialog f18860u0;

    public static m U1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) q.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        mVar.f18858s0 = dialog2;
        if (onCancelListener != null) {
            mVar.f18859t0 = onCancelListener;
        }
        return mVar;
    }

    public Dialog M1(Bundle bundle) {
        Dialog dialog = this.f18858s0;
        if (dialog != null) {
            return dialog;
        }
        R1(false);
        if (this.f18860u0 == null) {
            this.f18860u0 = new AlertDialog.Builder((Context) q.k(p())).create();
        }
        return this.f18860u0;
    }

    public void T1(n nVar, String str) {
        super.T1(nVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f18859t0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
