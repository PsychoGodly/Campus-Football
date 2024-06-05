package rb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.b;
import de.mintware.barcode_scan.BarcodeScannerActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import lc.d;
import lc.k;
import lc.m;
import lc.p;

/* compiled from: ActivityHelper.kt */
public final class a implements m, p {

    /* renamed from: f  reason: collision with root package name */
    public static final C0427a f37871f = new C0427a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private Context f37872a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f37873b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Integer, m> f37874c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<Integer, p> f37875d;

    /* renamed from: rb.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityHelper.kt */
    public static final class C0427a {
        private C0427a() {
        }

        public /* synthetic */ C0427a(h hVar) {
            this();
        }
    }

    public a(Context context, Activity activity) {
        this.f37872a = context;
        this.f37873b = activity;
        this.f37874c = new LinkedHashMap();
        this.f37875d = new LinkedHashMap();
    }

    public final boolean a(d.b bVar) {
        if (this.f37873b == null) {
            Log.d("BarcodeScanPlugin", "Could not launch BarcodeScannerActivity because the plugin is not attached to any activity");
            return false;
        }
        this.f37875d.put(200, new i(bVar));
        String[] strArr = {"android.permission.CAMERA"};
        Activity activity = this.f37873b;
        kotlin.jvm.internal.m.b(activity);
        if (androidx.core.content.a.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            return false;
        }
        Activity activity2 = this.f37873b;
        kotlin.jvm.internal.m.b(activity2);
        b.g(activity2, strArr, 200);
        return true;
    }

    public final void b(Activity activity) {
        this.f37873b = activity;
    }

    public final void c(k.d dVar, f fVar) {
        kotlin.jvm.internal.m.e(dVar, "result");
        kotlin.jvm.internal.m.e(fVar, "config");
        if (this.f37873b == null) {
            Log.d("BarcodeScanPlugin", "Could not launch BarcodeScannerActivity because the plugin is not attached to any activity");
            return;
        }
        this.f37874c.put(100, new j(dVar));
        Intent intent = new Intent(this.f37872a, BarcodeScannerActivity.class);
        intent.putExtra("config", fVar.i());
        Activity activity = this.f37873b;
        kotlin.jvm.internal.m.b(activity);
        activity.startActivityForResult(intent, 100);
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f37874c.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        return ((m) k0.h(this.f37874c, Integer.valueOf(i10))).onActivityResult(i10, i11, intent);
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.m.e(strArr, "permissions");
        kotlin.jvm.internal.m.e(iArr, "grantResults");
        if (!this.f37875d.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        return ((p) k0.h(this.f37875d, Integer.valueOf(i10))).onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, Activity activity, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : activity);
    }
}
