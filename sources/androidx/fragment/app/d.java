package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.lifecycle.x;

/* compiled from: DialogFragment */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0  reason: collision with root package name */
    private Handler f3573c0;

    /* renamed from: d0  reason: collision with root package name */
    private Runnable f3574d0 = new a();

    /* renamed from: e0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f3575e0 = new b();
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f3576f0 = new c();

    /* renamed from: g0  reason: collision with root package name */
    private int f3577g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    private int f3578h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f3579i0 = true;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3580j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    private int f3581k0 = -1;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f3582l0;

    /* renamed from: m0  reason: collision with root package name */
    private x<p> f3583m0 = new C0055d();
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public Dialog f3584n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f3585o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f3586p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f3587q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f3588r0 = false;

    /* compiled from: DialogFragment */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.f3576f0.onDismiss(d.this.f3584n0);
        }
    }

    /* compiled from: DialogFragment */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f3584n0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f3584n0);
            }
        }
    }

    /* compiled from: DialogFragment */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f3584n0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f3584n0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* compiled from: DialogFragment */
    class C0055d implements x<p> {
        C0055d() {
        }

        /* renamed from: b */
        public void a(p pVar) {
            if (pVar != null && d.this.f3580j0) {
                View n12 = d.this.n1();
                if (n12.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.f3584n0 != null) {
                    if (n.F0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f3584n0);
                    }
                    d.this.f3584n0.setContentView(n12);
                }
            }
        }
    }

    /* compiled from: DialogFragment */
    class e extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3593a;

        e(g gVar) {
            this.f3593a = gVar;
        }

        public View c(int i10) {
            if (this.f3593a.d()) {
                return this.f3593a.c(i10);
            }
            return d.this.N1(i10);
        }

        public boolean d() {
            return this.f3593a.d() || d.this.O1();
        }
    }

    private void J1(boolean z10, boolean z11) {
        if (!this.f3586p0) {
            this.f3586p0 = true;
            this.f3587q0 = false;
            Dialog dialog = this.f3584n0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f3584n0.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f3573c0.getLooper()) {
                        onDismiss(this.f3584n0);
                    } else {
                        this.f3573c0.post(this.f3574d0);
                    }
                }
            }
            this.f3585o0 = true;
            if (this.f3581k0 >= 0) {
                C().V0(this.f3581k0, 1);
                this.f3581k0 = -1;
                return;
            }
            w l10 = C().l();
            l10.l(this);
            if (z10) {
                l10.g();
            } else {
                l10.f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void P1(Bundle bundle) {
        if (this.f3580j0 && !this.f3588r0) {
            try {
                this.f3582l0 = true;
                Dialog M1 = M1(bundle);
                this.f3584n0 = M1;
                if (this.f3580j0) {
                    S1(M1, this.f3577g0);
                    Context p10 = p();
                    if (p10 instanceof Activity) {
                        this.f3584n0.setOwnerActivity((Activity) p10);
                    }
                    this.f3584n0.setCancelable(this.f3579i0);
                    this.f3584n0.setOnCancelListener(this.f3575e0);
                    this.f3584n0.setOnDismissListener(this.f3576f0);
                    this.f3588r0 = true;
                } else {
                    this.f3584n0 = null;
                }
                this.f3582l0 = false;
            } catch (Throwable th) {
                this.f3582l0 = false;
                throw th;
            }
        }
    }

    public void I0(Bundle bundle) {
        super.I0(bundle);
        Dialog dialog = this.f3584n0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f3577g0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f3578h0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f3579i0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f3580j0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f3581k0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void I1() {
        J1(false, false);
    }

    public void J0() {
        super.J0();
        Dialog dialog = this.f3584n0;
        if (dialog != null) {
            this.f3585o0 = false;
            dialog.show();
            View decorView = this.f3584n0.getWindow().getDecorView();
            q0.a(decorView, this);
            r0.a(decorView, this);
            b1.e.a(decorView, this);
        }
    }

    public void K0() {
        super.K0();
        Dialog dialog = this.f3584n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog K1() {
        return this.f3584n0;
    }

    public int L1() {
        return this.f3578h0;
    }

    public void M0(Bundle bundle) {
        Bundle bundle2;
        super.M0(bundle);
        if (this.f3584n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3584n0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog M1(Bundle bundle) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1(), L1());
    }

    /* access modifiers changed from: package-private */
    public View N1(int i10) {
        Dialog dialog = this.f3584n0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean O1() {
        return this.f3588r0;
    }

    public final Dialog Q1() {
        Dialog K1 = K1();
        if (K1 != null) {
            return K1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void R1(boolean z10) {
        this.f3580j0 = z10;
    }

    public void S1(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* access modifiers changed from: package-private */
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T0(layoutInflater, viewGroup, bundle);
        if (this.I == null && this.f3584n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3584n0.onRestoreInstanceState(bundle2);
        }
    }

    public void T1(n nVar, String str) {
        this.f3586p0 = false;
        this.f3587q0 = true;
        w l10 = nVar.l();
        l10.d(this, str);
        l10.f();
    }

    /* access modifiers changed from: package-private */
    public g e() {
        return new e(super.e());
    }

    public void j0(Context context) {
        super.j0(context);
        R().e(this.f3583m0);
        if (!this.f3587q0) {
            this.f3586p0 = false;
        }
    }

    public void m0(Bundle bundle) {
        super.m0(bundle);
        this.f3573c0 = new Handler();
        this.f3580j0 = this.f3442y == 0;
        if (bundle != null) {
            this.f3577g0 = bundle.getInt("android:style", 0);
            this.f3578h0 = bundle.getInt("android:theme", 0);
            this.f3579i0 = bundle.getBoolean("android:cancelable", true);
            this.f3580j0 = bundle.getBoolean("android:showsDialog", this.f3580j0);
            this.f3581k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3585o0) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            J1(true, true);
        }
    }

    public void t0() {
        super.t0();
        Dialog dialog = this.f3584n0;
        if (dialog != null) {
            this.f3585o0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f3584n0.dismiss();
            if (!this.f3586p0) {
                onDismiss(this.f3584n0);
            }
            this.f3584n0 = null;
            this.f3588r0 = false;
        }
    }

    public void u0() {
        super.u0();
        if (!this.f3587q0 && !this.f3586p0) {
            this.f3586p0 = true;
        }
        R().i(this.f3583m0);
    }

    public LayoutInflater v0(Bundle bundle) {
        LayoutInflater v02 = super.v0(bundle);
        if (!this.f3580j0 || this.f3582l0) {
            if (n.F0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f3580j0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return v02;
        }
        P1(bundle);
        if (n.F0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f3584n0;
        return dialog != null ? v02.cloneInContext(dialog.getContext()) : v02;
    }
}
