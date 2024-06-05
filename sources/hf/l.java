package hf;

import java.io.IOException;
import java.util.List;
import lf.e;

/* compiled from: PushObserver */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f33238a = new a();

    /* compiled from: PushObserver */
    class a implements l {
        a() {
        }

        public boolean a(int i10, List<c> list) {
            return true;
        }

        public boolean b(int i10, List<c> list, boolean z10) {
            return true;
        }

        public void c(int i10, b bVar) {
        }

        public boolean d(int i10, e eVar, int i11, boolean z10) throws IOException {
            eVar.skip((long) i11);
            return true;
        }
    }

    boolean a(int i10, List<c> list);

    boolean b(int i10, List<c> list, boolean z10);

    void c(int i10, b bVar);

    boolean d(int i10, e eVar, int i11, boolean z10) throws IOException;
}
