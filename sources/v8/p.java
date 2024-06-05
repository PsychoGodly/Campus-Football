package v8;

import a9.a;

/* compiled from: ResultPoint */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final float f30790a;

    /* renamed from: b  reason: collision with root package name */
    private final float f30791b;

    public p(float f10, float f11) {
        this.f30790a = f10;
        this.f30791b = f11;
    }

    private static float a(p pVar, p pVar2, p pVar3) {
        float f10 = pVar2.f30790a;
        float f11 = pVar2.f30791b;
        return ((pVar3.f30790a - f10) * (pVar.f30791b - f11)) - ((pVar3.f30791b - f11) * (pVar.f30790a - f10));
    }

    public static float b(p pVar, p pVar2) {
        return a.a(pVar.f30790a, pVar.f30791b, pVar2.f30790a, pVar2.f30791b);
    }

    public static void e(p[] pVarArr) {
        p pVar;
        p pVar2;
        p pVar3;
        float b10 = b(pVarArr[0], pVarArr[1]);
        float b11 = b(pVarArr[1], pVarArr[2]);
        float b12 = b(pVarArr[0], pVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (a(pVar2, pVar3, pVar) < 0.0f) {
            p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    public final float c() {
        return this.f30790a;
    }

    public final float d() {
        return this.f30791b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f30790a == pVar.f30790a && this.f30791b == pVar.f30791b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f30790a) * 31) + Float.floatToIntBits(this.f30791b);
    }

    public final String toString() {
        return "(" + this.f30790a + ',' + this.f30791b + ')';
    }
}
