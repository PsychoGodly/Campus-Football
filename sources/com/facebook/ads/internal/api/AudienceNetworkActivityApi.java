package com.facebook.ads.internal.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStripAny;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Nullsafe(Nullsafe.Mode.LOCAL)
@DoNotStripAny
@Keep
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON = 0;

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void finish(int i10);

    void onActivityResult(int i10, int i11, Intent intent);

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    boolean onTouchEvent(MotionEvent motionEvent);
}
