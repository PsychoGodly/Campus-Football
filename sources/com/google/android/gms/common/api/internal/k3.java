package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class k3 extends Fragment implements i {

    /* renamed from: f0  reason: collision with root package name */
    private static final WeakHashMap f15181f0 = new WeakHashMap();

    /* renamed from: c0  reason: collision with root package name */
    private final Map f15182c0 = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public int f15183d0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public Bundle f15184e0;

    public static k3 H1(e eVar) {
        k3 k3Var;
        WeakHashMap weakHashMap = f15181f0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (k3Var = (k3) weakReference.get()) != null) {
            return k3Var;
        }
        try {
            k3 k3Var2 = (k3) eVar.getSupportFragmentManager().i0("SupportLifecycleFragmentImpl");
            if (k3Var2 == null || k3Var2.b0()) {
                k3Var2 = new k3();
                eVar.getSupportFragmentManager().l().d(k3Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(k3Var2));
            return k3Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void H0() {
        super.H0();
        this.f15183d0 = 3;
        for (LifecycleCallback onResume : this.f15182c0.values()) {
            onResume.onResume();
        }
    }

    public final void I0(Bundle bundle) {
        super.I0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f15182c0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void J0() {
        super.J0();
        this.f15183d0 = 2;
        for (LifecycleCallback onStart : this.f15182c0.values()) {
            onStart.onStart();
        }
    }

    public final void K0() {
        super.K0();
        this.f15183d0 = 4;
        for (LifecycleCallback onStop : this.f15182c0.values()) {
            onStop.onStop();
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f15182c0.containsKey(str)) {
            this.f15182c0.put(str, lifecycleCallback);
            if (this.f15183d0 > 0) {
                new zzi(Looper.getMainLooper()).post(new j3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f15182c0.get(str));
    }

    public final /* synthetic */ Activity c() {
        return i();
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f15182c0.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void h0(int i10, int i11, Intent intent) {
        super.h0(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f15182c0.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void m0(Bundle bundle) {
        super.m0(bundle);
        this.f15183d0 = 1;
        this.f15184e0 = bundle;
        for (Map.Entry entry : this.f15182c0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void r0() {
        super.r0();
        this.f15183d0 = 5;
        for (LifecycleCallback onDestroy : this.f15182c0.values()) {
            onDestroy.onDestroy();
        }
    }
}
