package i9;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import h9.k;
import v8.j;

/* compiled from: AbstractRSSReader */
public abstract class a extends k {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f28997a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final int[] f28998b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f28999c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f29000d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f29001e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f29002f;

    protected a() {
        int[] iArr = new int[8];
        this.f28998b = iArr;
        this.f28999c = new float[4];
        this.f29000d = new float[4];
        this.f29001e = new int[(iArr.length / 2)];
        this.f29002f = new int[(iArr.length / 2)];
    }

    protected static void g(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] < f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    protected static void n(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] > f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    protected static boolean o(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = ((float) i10) / ((float) ((iArr[2] + i10) + iArr[3]));
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i11 = a.e.API_PRIORITY_OTHER;
            int i12 = RecyclerView.UNDEFINED_DURATION;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int p(int[] iArr, int[][] iArr2) throws j {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (k.d(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public final int[] h() {
        return this.f28998b;
    }

    /* access modifiers changed from: protected */
    public final int[] i() {
        return this.f28997a;
    }

    /* access modifiers changed from: protected */
    public final int[] j() {
        return this.f29002f;
    }

    /* access modifiers changed from: protected */
    public final float[] k() {
        return this.f29000d;
    }

    /* access modifiers changed from: protected */
    public final int[] l() {
        return this.f29001e;
    }

    /* access modifiers changed from: protected */
    public final float[] m() {
        return this.f28999c;
    }
}
