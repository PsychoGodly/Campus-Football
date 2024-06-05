package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3150a;

    /* compiled from: AccessibilityNodeProviderCompat */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f3151a;

        a(d dVar) {
            this.f3151a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            c b10 = this.f3151a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.u0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<c> c10 = this.f3151a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).u0());
            }
            return arrayList;
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f3151a.f(i10, i11, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            c d10 = this.f3151a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.u0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3151a.a(i10, c.v0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f3150a = new c(this);
        } else if (i10 >= 19) {
            this.f3150a = new b(this);
        } else if (i10 >= 16) {
            this.f3150a = new a(this);
        } else {
            this.f3150a = null;
        }
    }

    public void a(int i10, c cVar, String str, Bundle bundle) {
    }

    public c b(int i10) {
        return null;
    }

    public List<c> c(String str, int i10) {
        return null;
    }

    public c d(int i10) {
        return null;
    }

    public Object e() {
        return this.f3150a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f3150a = obj;
    }
}
