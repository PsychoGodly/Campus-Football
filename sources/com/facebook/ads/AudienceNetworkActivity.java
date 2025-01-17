package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Keep
public class AudienceNetworkActivity extends Activity {
    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new a();

    class a implements AudienceNetworkActivityApi {
        a() {
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AudienceNetworkActivity.super.dump(str, fileDescriptor, printWriter, strArr);
        }

        public void finish(int i10) {
            AudienceNetworkActivity.super.finish();
        }

        public void onActivityResult(int i10, int i11, Intent intent) {
            AudienceNetworkActivity.super.onActivityResult(i10, i11, intent);
        }

        public void onBackPressed() {
            AudienceNetworkActivity.super.onBackPressed();
        }

        public void onConfigurationChanged(Configuration configuration) {
            AudienceNetworkActivity.super.onConfigurationChanged(configuration);
        }

        public void onCreate(Bundle bundle) {
            AudienceNetworkActivity.super.onCreate(bundle);
        }

        public void onDestroy() {
            AudienceNetworkActivity.super.onDestroy();
        }

        public void onPause() {
            AudienceNetworkActivity.super.onPause();
        }

        public void onResume() {
            AudienceNetworkActivity.super.onResume();
        }

        public void onSaveInstanceState(Bundle bundle) {
            AudienceNetworkActivity.super.onSaveInstanceState(bundle);
        }

        public void onStart() {
            AudienceNetworkActivity.super.onStart();
        }

        public void onStop() {
            AudienceNetworkActivity.super.onStop();
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return AudienceNetworkActivity.super.onTouchEvent(motionEvent);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mAudienceNetworkActivityApi.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mAudienceNetworkActivityApi.onActivityResult(i10, i11, intent);
    }

    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AudienceNetworkActivityApi createAudienceNetworkActivity = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = createAudienceNetworkActivity;
        createAudienceNetworkActivity.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }
}
