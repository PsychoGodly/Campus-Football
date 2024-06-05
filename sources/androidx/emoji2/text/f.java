package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.b f3364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.h f3365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f3366c;

    public /* synthetic */ f(EmojiCompatInitializer.b bVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f3364a = bVar;
        this.f3365b = hVar;
        this.f3366c = threadPoolExecutor;
    }

    public final void run() {
        this.f3364a.d(this.f3365b, this.f3366c);
    }
}
