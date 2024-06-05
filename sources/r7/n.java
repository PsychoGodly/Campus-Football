package r7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import r7.m;
import u7.l;
import y7.b;

/* compiled from: DocumentViewChangeSet */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<l, m> f29950a = new TreeMap<>();

    public void a(m mVar) {
        l key = mVar.b().getKey();
        m mVar2 = this.f29950a.get(key);
        if (mVar2 == null) {
            this.f29950a.put(key, mVar);
            return;
        }
        m.a c10 = mVar2.c();
        m.a c11 = mVar.c();
        m.a aVar = m.a.ADDED;
        if (c11 != aVar && c10 == m.a.METADATA) {
            this.f29950a.put(key, mVar);
        } else if (c11 != m.a.METADATA || c10 == m.a.REMOVED) {
            m.a aVar2 = m.a.MODIFIED;
            if (c11 == aVar2 && c10 == aVar2) {
                this.f29950a.put(key, m.a(aVar2, mVar.b()));
            } else if (c11 == aVar2 && c10 == aVar) {
                this.f29950a.put(key, m.a(aVar, mVar.b()));
            } else {
                m.a aVar3 = m.a.REMOVED;
                if (c11 == aVar3 && c10 == aVar) {
                    this.f29950a.remove(key);
                } else if (c11 == aVar3 && c10 == aVar2) {
                    this.f29950a.put(key, m.a(aVar3, mVar2.b()));
                } else if (c11 == aVar && c10 == aVar3) {
                    this.f29950a.put(key, m.a(aVar2, mVar.b()));
                } else {
                    throw b.a("Unsupported combination of changes %s after %s", c11, c10);
                }
            }
        } else {
            this.f29950a.put(key, m.a(c10, mVar.b()));
        }
    }

    /* access modifiers changed from: package-private */
    public List<m> b() {
        return new ArrayList(this.f29950a.values());
    }
}
