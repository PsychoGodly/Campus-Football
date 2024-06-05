package s;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import s.b;

/* compiled from: ArrayLinkedVariables */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f22185l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f22186a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f22187b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f22188c;

    /* renamed from: d  reason: collision with root package name */
    private int f22189d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f22190e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f22191f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f22192g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f22193h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f22194i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f22195j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22196k = false;

    a(b bVar, c cVar) {
        this.f22187b = bVar;
        this.f22188c = cVar;
    }

    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f22194i;
        if (i10 == -1) {
            this.f22194i = 0;
            this.f22193h[0] = f10;
            this.f22191f[0] = iVar.f22249c;
            this.f22192g[0] = -1;
            iVar.f22259n++;
            iVar.a(this.f22187b);
            this.f22186a++;
            if (!this.f22196k) {
                int i11 = this.f22195j + 1;
                this.f22195j = i11;
                int[] iArr = this.f22191f;
                if (i11 >= iArr.length) {
                    this.f22196k = true;
                    this.f22195j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f22186a) {
            int[] iArr2 = this.f22191f;
            int i14 = iArr2[i10];
            int i15 = iVar.f22249c;
            if (i14 == i15) {
                this.f22193h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i13 = i10;
            }
            i10 = this.f22192g[i10];
            i12++;
        }
        int i16 = this.f22195j;
        int i17 = i16 + 1;
        if (this.f22196k) {
            int[] iArr3 = this.f22191f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f22191f;
        if (i16 >= iArr4.length && this.f22186a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f22191f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f22191f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f22189d * 2;
            this.f22189d = i19;
            this.f22196k = false;
            this.f22195j = i16 - 1;
            this.f22193h = Arrays.copyOf(this.f22193h, i19);
            this.f22191f = Arrays.copyOf(this.f22191f, this.f22189d);
            this.f22192g = Arrays.copyOf(this.f22192g, this.f22189d);
        }
        this.f22191f[i16] = iVar.f22249c;
        this.f22193h[i16] = f10;
        if (i13 != -1) {
            int[] iArr7 = this.f22192g;
            iArr7[i16] = iArr7[i13];
            iArr7[i13] = i16;
        } else {
            this.f22192g[i16] = this.f22194i;
            this.f22194i = i16;
        }
        iVar.f22259n++;
        iVar.a(this.f22187b);
        int i20 = this.f22186a + 1;
        this.f22186a = i20;
        if (!this.f22196k) {
            this.f22195j++;
        }
        int[] iArr8 = this.f22191f;
        if (i20 >= iArr8.length) {
            this.f22196k = true;
        }
        if (this.f22195j >= iArr8.length) {
            this.f22196k = true;
            this.f22195j = iArr8.length - 1;
        }
    }

    public int b() {
        return this.f22186a;
    }

    public float c(b bVar, boolean z10) {
        float f10 = f(bVar.f22197a);
        d(bVar.f22197a, z10);
        b.a aVar = bVar.f22201e;
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            i e10 = aVar.e(i10);
            k(e10, aVar.f(e10) * f10, z10);
        }
        return f10;
    }

    public final void clear() {
        int i10 = this.f22194i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            i iVar = this.f22188c.f22206d[this.f22191f[i10]];
            if (iVar != null) {
                iVar.e(this.f22187b);
            }
            i10 = this.f22192g[i10];
            i11++;
        }
        this.f22194i = -1;
        this.f22195j = -1;
        this.f22196k = false;
        this.f22186a = 0;
    }

    public final float d(i iVar, boolean z10) {
        if (this.f22190e == iVar) {
            this.f22190e = null;
        }
        int i10 = this.f22194i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f22186a) {
            if (this.f22191f[i10] == iVar.f22249c) {
                if (i10 == this.f22194i) {
                    this.f22194i = this.f22192g[i10];
                } else {
                    int[] iArr = this.f22192g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.e(this.f22187b);
                }
                iVar.f22259n--;
                this.f22186a--;
                this.f22191f[i10] = -1;
                if (this.f22196k) {
                    this.f22195j = i10;
                }
                return this.f22193h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f22192g[i10];
        }
        return 0.0f;
    }

    public i e(int i10) {
        int i11 = this.f22194i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f22186a) {
            if (i12 == i10) {
                return this.f22188c.f22206d[this.f22191f[i11]];
            }
            i11 = this.f22192g[i11];
            i12++;
        }
        return null;
    }

    public final float f(i iVar) {
        int i10 = this.f22194i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            if (this.f22191f[i10] == iVar.f22249c) {
                return this.f22193h[i10];
            }
            i10 = this.f22192g[i10];
            i11++;
        }
        return 0.0f;
    }

    public void g() {
        int i10 = this.f22194i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            float[] fArr = this.f22193h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f22192g[i10];
            i11++;
        }
    }

    public float h(int i10) {
        int i11 = this.f22194i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f22186a) {
            if (i12 == i10) {
                return this.f22193h[i11];
            }
            i11 = this.f22192g[i11];
            i12++;
        }
        return 0.0f;
    }

    public boolean i(i iVar) {
        int i10 = this.f22194i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            if (this.f22191f[i10] == iVar.f22249c) {
                return true;
            }
            i10 = this.f22192g[i10];
            i11++;
        }
        return false;
    }

    public void j(float f10) {
        int i10 = this.f22194i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            float[] fArr = this.f22193h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f22192g[i10];
            i11++;
        }
    }

    public void k(i iVar, float f10, boolean z10) {
        float f11 = f22185l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f22194i;
            if (i10 == -1) {
                this.f22194i = 0;
                this.f22193h[0] = f10;
                this.f22191f[0] = iVar.f22249c;
                this.f22192g[0] = -1;
                iVar.f22259n++;
                iVar.a(this.f22187b);
                this.f22186a++;
                if (!this.f22196k) {
                    int i11 = this.f22195j + 1;
                    this.f22195j = i11;
                    int[] iArr = this.f22191f;
                    if (i11 >= iArr.length) {
                        this.f22196k = true;
                        this.f22195j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f22186a) {
                int[] iArr2 = this.f22191f;
                int i14 = iArr2[i10];
                int i15 = iVar.f22249c;
                if (i14 == i15) {
                    float[] fArr = this.f22193h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f22185l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f22194i) {
                            this.f22194i = this.f22192g[i10];
                        } else {
                            int[] iArr3 = this.f22192g;
                            iArr3[i13] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.e(this.f22187b);
                        }
                        if (this.f22196k) {
                            this.f22195j = i10;
                        }
                        iVar.f22259n--;
                        this.f22186a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i13 = i10;
                }
                i10 = this.f22192g[i10];
                i12++;
            }
            int i16 = this.f22195j;
            int i17 = i16 + 1;
            if (this.f22196k) {
                int[] iArr4 = this.f22191f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f22191f;
            if (i16 >= iArr5.length && this.f22186a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f22191f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f22191f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f22189d * 2;
                this.f22189d = i19;
                this.f22196k = false;
                this.f22195j = i16 - 1;
                this.f22193h = Arrays.copyOf(this.f22193h, i19);
                this.f22191f = Arrays.copyOf(this.f22191f, this.f22189d);
                this.f22192g = Arrays.copyOf(this.f22192g, this.f22189d);
            }
            this.f22191f[i16] = iVar.f22249c;
            this.f22193h[i16] = f10;
            if (i13 != -1) {
                int[] iArr8 = this.f22192g;
                iArr8[i16] = iArr8[i13];
                iArr8[i13] = i16;
            } else {
                this.f22192g[i16] = this.f22194i;
                this.f22194i = i16;
            }
            iVar.f22259n++;
            iVar.a(this.f22187b);
            this.f22186a++;
            if (!this.f22196k) {
                this.f22195j++;
            }
            int i20 = this.f22195j;
            int[] iArr9 = this.f22191f;
            if (i20 >= iArr9.length) {
                this.f22196k = true;
                this.f22195j = iArr9.length - 1;
            }
        }
    }

    public String toString() {
        int i10 = this.f22194i;
        String str = MaxReward.DEFAULT_LABEL;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f22186a) {
            str = ((str + " -> ") + this.f22193h[i10] + " : ") + this.f22188c.f22206d[this.f22191f[i10]];
            i10 = this.f22192g[i10];
            i11++;
        }
        return str;
    }
}
