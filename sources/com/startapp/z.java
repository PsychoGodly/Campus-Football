package com.startapp;

import android.view.View;
import android.widget.VideoView;
import com.startapp.a0;
import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class z implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.b f17570a;

    public z(a0.b bVar) {
        this.f17570a = bVar;
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        VideoView videoView;
        ia iaVar = (ia) this.f17570a;
        boolean unused = iaVar.f15931a.R = true;
        VideoMode videoMode = iaVar.f15931a;
        if (videoMode.Q && videoMode.F()) {
            VideoMode videoMode2 = iaVar.f15931a;
            if (videoMode2.Y && (videoView = videoMode2.L) != null) {
                videoMode2.b((View) videoView);
            }
        }
    }
}
