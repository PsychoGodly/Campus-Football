package j9;

import java.util.List;

/* compiled from: BitArrayBuilder */
final class a {
    static z8.a a(List<b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).d() == null) {
            size--;
        }
        z8.a aVar = new z8.a(size * 12);
        int i10 = 0;
        int b10 = list.get(0).d().b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & b10) != 0) {
                aVar.l(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            int b11 = bVar.c().b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & b11) != 0) {
                    aVar.l(i10);
                }
                i10++;
            }
            if (bVar.d() != null) {
                int b12 = bVar.d().b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & b12) != 0) {
                        aVar.l(i10);
                    }
                    i10++;
                }
            }
        }
        return aVar;
    }
}
