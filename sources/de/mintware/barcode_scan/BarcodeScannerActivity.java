package de.mintware.barcode_scan;

import af.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import rb.e;
import rb.f;
import rb.g;
import rb.h;
import rb.k;
import sd.s;
import v8.n;

/* compiled from: BarcodeScannerActivity.kt */
public final class BarcodeScannerActivity extends Activity implements a.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f32426c = new a((h) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Map<e, v8.a> f32427d = k0.j(s.a(e.aztec, v8.a.AZTEC), s.a(e.code39, v8.a.CODE_39), s.a(e.code93, v8.a.CODE_93), s.a(e.code128, v8.a.CODE_128), s.a(e.dataMatrix, v8.a.DATA_MATRIX), s.a(e.ean8, v8.a.EAN_8), s.a(e.ean13, v8.a.EAN_13), s.a(e.interleaved2of5, v8.a.ITF), s.a(e.pdf417, v8.a.PDF_417), s.a(e.qr, v8.a.QR_CODE), s.a(e.upce, v8.a.UPC_E));

    /* renamed from: a  reason: collision with root package name */
    private f f32428a;

    /* renamed from: b  reason: collision with root package name */
    private af.a f32429b;

    /* compiled from: BarcodeScannerActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public BarcodeScannerActivity() {
        setTitle(MaxReward.DEFAULT_LABEL);
    }

    private final List<v8.a> b() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.f32428a;
        if (fVar == null) {
            m.t("config");
            fVar = null;
        }
        List<e> o02 = fVar.o0();
        m.d(o02, "this.config.restrictFormatList");
        for (e eVar : y.p(o02)) {
            Map<e, v8.a> map = f32427d;
            if (!map.containsKey(eVar)) {
                System.out.print("Unrecognized");
            } else {
                arrayList.add(k0.h(map, eVar));
            }
        }
        return arrayList;
    }

    private final void c() {
        if (this.f32429b == null) {
            k kVar = new k(this);
            f fVar = this.f32428a;
            f fVar2 = null;
            if (fVar == null) {
                m.t("config");
                fVar = null;
            }
            kVar.setAutoFocus(fVar.l0().j0());
            List<v8.a> b10 = b();
            if (!b10.isEmpty()) {
                kVar.setFormats(b10);
            }
            f fVar3 = this.f32428a;
            if (fVar3 == null) {
                m.t("config");
                fVar3 = null;
            }
            kVar.setAspectTolerance((float) fVar3.l0().h0());
            f fVar4 = this.f32428a;
            if (fVar4 == null) {
                m.t("config");
                fVar4 = null;
            }
            if (fVar4.m0()) {
                f fVar5 = this.f32428a;
                if (fVar5 == null) {
                    m.t("config");
                } else {
                    fVar2 = fVar5;
                }
                kVar.setFlash(fVar2.m0());
                invalidateOptionsMenu();
            }
            this.f32429b = kVar;
            setContentView(kVar);
        }
    }

    public void a(n nVar) {
        Intent intent = new Intent();
        setRequestedOrientation(-1);
        h.a j02 = rb.h.j0();
        if (nVar == null) {
            j02.F(e.unknown);
            j02.H("No data was scanned");
            j02.I(g.Error);
        } else {
            Map<e, v8.a> map = f32427d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                if (((v8.a) next.getValue()) == nVar.b()) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            e eVar = (e) y.t(linkedHashMap.keySet());
            if (eVar == null) {
                eVar = e.unknown;
            }
            String str = eVar == e.unknown ? nVar.b().toString() : MaxReward.DEFAULT_LABEL;
            j02.F(eVar);
            j02.G(str);
            j02.H(nVar.f());
            j02.I(g.Barcode);
        }
        intent.putExtra("scan_result", ((rb.h) j02.build()).i());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        int i10 = 1;
        if (rotation != 0) {
            i10 = rotation != 1 ? rotation != 2 ? 8 : 9 : 0;
        }
        setRequestedOrientation(i10);
        Bundle extras = getIntent().getExtras();
        m.b(extras);
        f u02 = f.u0(extras.getByteArray("config"));
        m.d(u02, "parseFrom(intent.extras!…tByteArray(EXTRA_CONFIG))");
        this.f32428a = u02;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        m.e(menu, "menu");
        f fVar = this.f32428a;
        f fVar2 = null;
        if (fVar == null) {
            m.t("config");
            fVar = null;
        }
        String str = fVar.p0().get("flash_on");
        af.a aVar = this.f32429b;
        boolean z10 = true;
        if (aVar == null || !aVar.getFlash()) {
            z10 = false;
        }
        if (z10) {
            f fVar3 = this.f32428a;
            if (fVar3 == null) {
                m.t("config");
                fVar3 = null;
            }
            str = fVar3.p0().get("flash_off");
        }
        menu.add(0, 200, 0, str).setShowAsAction(2);
        f fVar4 = this.f32428a;
        if (fVar4 == null) {
            m.t("config");
        } else {
            fVar2 = fVar4;
        }
        menu.add(0, 300, 0, fVar2.p0().get("cancel")).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        m.e(menuItem, "item");
        if (menuItem.getItemId() == 200) {
            af.a aVar = this.f32429b;
            if (aVar != null) {
                aVar.i();
            }
            invalidateOptionsMenu();
            return true;
        } else if (menuItem.getItemId() != 300) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(0);
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        af.a aVar = this.f32429b;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        c();
        af.a aVar = this.f32429b;
        if (aVar != null) {
            aVar.setResultHandler(this);
        }
        f fVar = this.f32428a;
        f fVar2 = null;
        if (fVar == null) {
            m.t("config");
            fVar = null;
        }
        if (fVar.q0() > -1) {
            af.a aVar2 = this.f32429b;
            if (aVar2 != null) {
                f fVar3 = this.f32428a;
                if (fVar3 == null) {
                    m.t("config");
                } else {
                    fVar2 = fVar3;
                }
                aVar2.f(fVar2.q0());
                return;
            }
            return;
        }
        af.a aVar3 = this.f32429b;
        if (aVar3 != null) {
            aVar3.e();
        }
    }
}
