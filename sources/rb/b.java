package rb;

import android.app.Activity;
import dc.a;
import de.mintware.barcode_scan.ChannelHandler;
import ec.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: BarcodeScanPlugin.kt */
public final class b implements dc.a, ec.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37876c = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private ChannelHandler f37877a;

    /* renamed from: b  reason: collision with root package name */
    private a f37878b;

    /* compiled from: BarcodeScanPlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public void onAttachedToActivity(c cVar) {
        m.e(cVar, "binding");
        if (this.f37877a != null) {
            a aVar = this.f37878b;
            m.b(aVar);
            cVar.b(aVar);
            a aVar2 = this.f37878b;
            m.b(aVar2);
            cVar.a(aVar2);
            a aVar3 = this.f37878b;
            m.b(aVar3);
            aVar3.b(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "flutterPluginBinding");
        a aVar = new a(bVar.a(), (Activity) null, 2, (h) null);
        this.f37878b = aVar;
        m.b(aVar);
        ChannelHandler channelHandler = new ChannelHandler(aVar);
        this.f37877a = channelHandler;
        m.b(channelHandler);
        lc.c b10 = bVar.b();
        m.d(b10, "flutterPluginBinding.binaryMessenger");
        channelHandler.b(b10);
    }

    public void onDetachedFromActivity() {
        if (this.f37877a != null) {
            a aVar = this.f37878b;
            m.b(aVar);
            aVar.b((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        ChannelHandler channelHandler = this.f37877a;
        if (channelHandler != null) {
            m.b(channelHandler);
            channelHandler.c();
            this.f37877a = null;
            this.f37878b = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        m.e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
