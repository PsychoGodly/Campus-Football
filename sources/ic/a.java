package ic;

import io.flutter.plugins.GeneratedPluginRegistrant;
import xb.b;

/* compiled from: GeneratedPluginRegister */
public class a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{io.flutter.embedding.engine.a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (Exception e10) {
            b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            b.c("GeneratedPluginsRegister", "Received exception while registering", e10);
        }
    }
}
