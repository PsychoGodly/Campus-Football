package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LifecycleCallback {
    protected final i mLifecycleFragment;

    protected LifecycleCallback(i iVar) {
        this.mLifecycleFragment = iVar;
    }

    @Keep
    private static i getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static i getFragment(Activity activity) {
        return getFragment(new h(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity c10 = this.mLifecycleFragment.c();
        q.k(c10);
        return c10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static i getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static i getFragment(h hVar) {
        if (hVar.d()) {
            return k3.H1(hVar.b());
        }
        if (hVar.c()) {
            return i3.f(hVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
