package xa;

/* compiled from: BaseOperation */
public abstract class a extends b {
    public void error(String str, String str2, Object obj) {
        m().error(str, str2, obj);
    }

    /* access modifiers changed from: protected */
    public abstract f m();

    public void success(Object obj) {
        m().success(obj);
    }
}
