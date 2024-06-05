package va;

/* compiled from: DatabaseTask */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private final j f23381a;

    /* renamed from: b  reason: collision with root package name */
    final Runnable f23382b;

    k(j jVar, Runnable runnable) {
        this.f23381a = jVar;
        this.f23382b = runnable;
    }

    public Integer a() {
        j jVar = this.f23381a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.f23381a;
        return jVar != null && jVar.b();
    }
}
