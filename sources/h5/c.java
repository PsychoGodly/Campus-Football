package h5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f18815a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnCancelListener f18816b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f18817c;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) q.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f18815a = dialog2;
        if (onCancelListener != null) {
            cVar.f18816b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f18816b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f18815a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f18817c == null) {
            this.f18817c = new AlertDialog.Builder((Context) q.k(getActivity())).create();
        }
        return this.f18817c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
