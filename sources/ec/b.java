package ec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.i;
import io.flutter.embedding.android.c;

/* compiled from: ActivityControlSurface */
public interface b {
    void b(Bundle bundle);

    void c();

    void d(Intent intent);

    void e(c<Activity> cVar, i iVar);

    void g();

    void h();

    boolean onActivityResult(int i10, int i11, Intent intent);

    boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);

    void onSaveInstanceState(Bundle bundle);
}
