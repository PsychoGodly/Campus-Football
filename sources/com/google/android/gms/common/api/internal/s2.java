package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.q;
import h5.b;
import h5.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class s2 extends x2 {

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<r2> f15256f = new SparseArray<>();

    private s2(i iVar) {
        super(iVar, e.q());
        this.mLifecycleFragment.a("AutoManageHelper", this);
    }

    public static s2 i(h hVar) {
        i fragment = LifecycleCallback.getFragment(hVar);
        s2 s2Var = (s2) fragment.b("AutoManageHelper", s2.class);
        if (s2Var != null) {
            return s2Var;
        }
        return new s2(fragment);
    }

    private final r2 l(int i10) {
        if (this.f15256f.size() <= i10) {
            return null;
        }
        SparseArray<r2> sparseArray = this.f15256f;
        return sparseArray.get(sparseArray.keyAt(i10));
    }

    /* access modifiers changed from: protected */
    public final void b(b bVar, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        r2 r2Var = this.f15256f.get(i10);
        if (r2Var != null) {
            k(i10);
            GoogleApiClient.c cVar = r2Var.f15246c;
            if (cVar != null) {
                cVar.onConnectionFailed(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (int i10 = 0; i10 < this.f15256f.size(); i10++) {
            r2 l10 = l(i10);
            if (l10 != null) {
                l10.f15245b.connect();
            }
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f15256f.size(); i10++) {
            r2 l10 = l(i10);
            if (l10 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(l10.f15244a);
                printWriter.println(":");
                l10.f15245b.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void j(int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        q.l(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z10 = this.f15256f.indexOfKey(i10) < 0;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i10);
        q.o(z10, sb2.toString());
        u2 u2Var = this.f15326b.get();
        boolean z11 = this.f15325a;
        String valueOf = String.valueOf(u2Var);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 49);
        sb3.append("starting AutoManage for client ");
        sb3.append(i10);
        sb3.append(" ");
        sb3.append(z11);
        sb3.append(" ");
        sb3.append(valueOf);
        Log.d("AutoManageHelper", sb3.toString());
        r2 r2Var = new r2(this, i10, googleApiClient, cVar);
        googleApiClient.h(r2Var);
        this.f15256f.put(i10, r2Var);
        if (this.f15325a && u2Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void k(int i10) {
        r2 r2Var = this.f15256f.get(i10);
        this.f15256f.remove(i10);
        if (r2Var != null) {
            r2Var.f15245b.i(r2Var);
            r2Var.f15245b.disconnect();
        }
    }

    public final void onStart() {
        super.onStart();
        boolean z10 = this.f15325a;
        String valueOf = String.valueOf(this.f15256f);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        if (this.f15326b.get() == null) {
            for (int i10 = 0; i10 < this.f15256f.size(); i10++) {
                r2 l10 = l(i10);
                if (l10 != null) {
                    l10.f15245b.connect();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.f15256f.size(); i10++) {
            r2 l10 = l(i10);
            if (l10 != null) {
                l10.f15245b.disconnect();
            }
        }
    }
}
