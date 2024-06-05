package androidx.activity;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f701a;

    public /* synthetic */ e(ComponentActivity componentActivity) {
        this.f701a = componentActivity;
    }

    public final void run() {
        this.f701a.invalidateMenu();
    }
}
