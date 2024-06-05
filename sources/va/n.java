package va;

/* compiled from: DatabaseWorkerPool */
public final /* synthetic */ class n {

    /* compiled from: DatabaseWorkerPool */
    class a implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f23389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f23390b;

        a(o oVar, i iVar) {
            this.f23390b = oVar;
            this.f23389a = iVar;
        }

        public int a() {
            return this.f23389a.f23369c;
        }

        public boolean b() {
            return this.f23389a.F();
        }
    }

    public static void a(o oVar, i iVar, Runnable runnable) {
        oVar.b(new k(iVar == null ? null : new a(oVar, iVar), runnable));
    }

    public static o b(String str, int i10, int i11) {
        if (i10 == 1) {
            return new s(str, i11);
        }
        return new q(str, i10, i11);
    }
}
