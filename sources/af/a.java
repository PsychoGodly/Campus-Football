package af;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import v8.c;
import v8.e;
import v8.i;
import v8.k;
import v8.m;
import v8.n;
import z8.j;
import ze.f;

/* compiled from: ZXingScannerView */
public class a extends ze.a {

    /* renamed from: y  reason: collision with root package name */
    public static final List<v8.a> f31598y;

    /* renamed from: v  reason: collision with root package name */
    private i f31599v;

    /* renamed from: w  reason: collision with root package name */
    private List<v8.a> f31600w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public b f31601x;

    /* renamed from: af.a$a  reason: collision with other inner class name */
    /* compiled from: ZXingScannerView */
    class C0354a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f31602a;

        C0354a(n nVar) {
            this.f31602a = nVar;
        }

        public void run() {
            b j10 = a.this.f31601x;
            b unused = a.this.f31601x = null;
            a.this.h();
            if (j10 != null) {
                j10.a(this.f31602a);
            }
        }
    }

    /* compiled from: ZXingScannerView */
    public interface b {
        void a(n nVar);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f31598y = arrayList;
        arrayList.add(v8.a.AZTEC);
        arrayList.add(v8.a.CODABAR);
        arrayList.add(v8.a.CODE_39);
        arrayList.add(v8.a.CODE_93);
        arrayList.add(v8.a.CODE_128);
        arrayList.add(v8.a.DATA_MATRIX);
        arrayList.add(v8.a.EAN_8);
        arrayList.add(v8.a.EAN_13);
        arrayList.add(v8.a.ITF);
        arrayList.add(v8.a.MAXICODE);
        arrayList.add(v8.a.PDF_417);
        arrayList.add(v8.a.QR_CODE);
        arrayList.add(v8.a.RSS_14);
        arrayList.add(v8.a.RSS_EXPANDED);
        arrayList.add(v8.a.UPC_A);
        arrayList.add(v8.a.UPC_E);
        arrayList.add(v8.a.UPC_EAN_EXTENSION);
    }

    public a(Context context) {
        super(context);
        m();
    }

    private void m() {
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.POSSIBLE_FORMATS, getFormats());
        i iVar = new i();
        this.f31599v = iVar;
        iVar.d(enumMap);
    }

    public Collection<v8.a> getFormats() {
        List<v8.a> list = this.f31600w;
        return list == null ? f31598y : list;
    }

    public k l(byte[] bArr, int i10, int i11) {
        Rect b10 = b(i10, i11);
        if (b10 == null) {
            return null;
        }
        try {
            return new k(bArr, i10, i11, b10.left, b10.top, b10.width(), b10.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        n nVar;
        i iVar;
        i iVar2;
        if (this.f31601x != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                int i10 = previewSize.width;
                int i11 = previewSize.height;
                if (f.a(getContext()) == 1) {
                    int rotationCount = getRotationCount();
                    if (rotationCount == 1 || rotationCount == 3) {
                        int i12 = i10;
                        i10 = i11;
                        i11 = i12;
                    }
                    bArr = c(bArr, camera);
                }
                nVar = null;
                k l10 = l(bArr, i10, i11);
                if (l10 != null) {
                    nVar = this.f31599v.c(new c(new j(l10)));
                    iVar = this.f31599v;
                    iVar.reset();
                    if (nVar == null) {
                        nVar = this.f31599v.c(new c(new j(l10.e())));
                        iVar2 = this.f31599v;
                        iVar2.reset();
                    }
                }
            } catch (v8.j unused) {
                iVar2 = this.f31599v;
            } catch (m unused2) {
                iVar = this.f31599v;
            } catch (NullPointerException unused3) {
                iVar = this.f31599v;
            } catch (ArrayIndexOutOfBoundsException unused4) {
                iVar = this.f31599v;
            } catch (RuntimeException e10) {
                Log.e("ZXingScannerView", e10.toString(), e10);
                return;
            } catch (Throwable th) {
                this.f31599v.reset();
                throw th;
            }
            if (nVar != null) {
                new Handler(Looper.getMainLooper()).post(new C0354a(nVar));
            } else {
                camera.setOneShotPreviewCallback(this);
            }
        }
    }

    public void setFormats(List<v8.a> list) {
        this.f31600w = list;
        m();
    }

    public void setResultHandler(b bVar) {
        this.f31601x = bVar;
    }
}
