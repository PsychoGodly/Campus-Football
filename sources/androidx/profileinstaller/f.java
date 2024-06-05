package androidx.profileinstaller;

/* compiled from: FileSectionType */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: a  reason: collision with root package name */
    private final long f4295a;

    private f(long j10) {
        this.f4295a = j10;
    }

    public long c() {
        return this.f4295a;
    }
}
