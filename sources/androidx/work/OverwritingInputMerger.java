package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends k {
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e j10 : list) {
            hashMap.putAll(j10.j());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
