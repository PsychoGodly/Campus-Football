package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import pe.c2;
import pe.q0;
import pe.r0;
import se.k0;
import se.v;
import xd.d;
import xd.g;

/* compiled from: AndroidLifecycleDataSource.kt */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, m {
    private final v<Boolean> appActive = k0.a(Boolean.TRUE);

    /* compiled from: AndroidLifecycleDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource.WhenMappings.<clinit>():void");
        }
    }

    public AndroidLifecycleDataSource() {
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        c2 unused = k.d(q0.b(), (g) null, (r0) null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, (d<? super AndroidLifecycleDataSource$registerAppLifecycle$1>) null), 3, (Object) null);
    }

    public boolean appIsForeground() {
        return this.appActive.getValue().booleanValue();
    }

    public void onStateChanged(p pVar, i.a aVar) {
        kotlin.jvm.internal.m.e(pVar, "source");
        kotlin.jvm.internal.m.e(aVar, "event");
        v<Boolean> vVar = this.appActive;
        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            z10 = false;
        } else if (i10 != 2) {
            z10 = this.appActive.getValue().booleanValue();
        }
        vVar.setValue(Boolean.valueOf(z10));
    }
}
