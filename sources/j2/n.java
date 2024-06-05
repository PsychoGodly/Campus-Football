package j2;

import android.database.sqlite.SQLiteDatabase;
import e2.a;
import j2.m0;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f35680a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f35681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f35682c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0183a f35683d;

    public /* synthetic */ n(m0 m0Var, String str, Map map, a.C0183a aVar) {
        this.f35680a = m0Var;
        this.f35681b = str;
        this.f35682c = map;
        this.f35683d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f35680a.B1(this.f35681b, this.f35682c, this.f35683d, (SQLiteDatabase) obj);
    }
}
