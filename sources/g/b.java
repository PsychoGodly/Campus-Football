package g;

import android.content.Context;
import android.content.Intent;
import g.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.n;
import sd.s;

/* compiled from: ActivityResultContracts.kt */
public final class b extends a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18089a = new a((h) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            m.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            m.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        m.e(context, "context");
        m.e(strArr, "input");
        return f18089a.a(strArr);
    }

    /* renamed from: e */
    public a.C0190a<Map<String, Boolean>> b(Context context, String[] strArr) {
        m.e(context, "context");
        m.e(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0190a<>(k0.g());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.checkSelfPermission(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.a(j0.d(strArr.length), 16));
        for (String a10 : strArr) {
            n a11 = s.a(a10, Boolean.TRUE);
            linkedHashMap.put(a11.c(), a11.d());
        }
        return new a.C0190a<>(linkedHashMap);
    }

    /* renamed from: f */
    public Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 != -1) {
            return k0.g();
        }
        if (intent == null) {
            return k0.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return k0.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return k0.r(y.R(m.k(stringArrayExtra), arrayList));
    }
}
