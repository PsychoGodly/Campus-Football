package v;

import java.util.ArrayList;
import java.util.Arrays;
import w.o;

/* compiled from: HelperWidget */
public class i extends e implements h {
    public e[] L0 = new e[4];
    public int M0 = 0;

    public void a() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    public void b(e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.M0 + 1;
            e[] eVarArr = this.L0;
            if (i10 > eVarArr.length) {
                this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.L0;
            int i11 = this.M0;
            eVarArr2[i11] = eVar;
            this.M0 = i11 + 1;
        }
    }

    public void c(f fVar) {
    }

    public void o1(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.M0; i11++) {
            oVar.a(this.L0[i11]);
        }
        for (int i12 = 0; i12 < this.M0; i12++) {
            w.i.a(this.L0[i12], i10, arrayList, oVar);
        }
    }

    public int p1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.M0; i13++) {
            e eVar = this.L0[i13];
            if (i10 == 0 && (i12 = eVar.I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.J0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}
