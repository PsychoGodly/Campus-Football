package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i3 extends Fragment implements i {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakHashMap f15154d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map f15155a = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f15156b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bundle f15157c;

    public static i3 f(Activity activity) {
        i3 i3Var;
        WeakHashMap weakHashMap = f15154d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (i3Var = (i3) weakReference.get()) != null) {
            return i3Var;
        }
        try {
            i3 i3Var2 = (i3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i3Var2 == null || i3Var2.isRemoving()) {
                i3Var2 = new i3();
                activity.getFragmentManager().beginTransaction().add(i3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i3Var2));
            return i3Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f15155a.containsKey(str)) {
            this.f15155a.put(str, lifecycleCallback);
            if (this.f15156b > 0) {
                new zzi(Looper.getMainLooper()).post(new h3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f15155a.get(str));
    }

    public final Activity c() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f15155a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f15155a.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15156b = 1;
        this.f15157c = bundle;
        for (Map.Entry entry : this.f15155a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f15156b = 5;
        for (LifecycleCallback onDestroy : this.f15155a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f15156b = 3;
        for (LifecycleCallback onResume : this.f15155a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f15155a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f15156b = 2;
        for (LifecycleCallback onStart : this.f15155a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f15156b = 4;
        for (LifecycleCallback onStop : this.f15155a.values()) {
            onStop.onStop();
        }
    }
}
