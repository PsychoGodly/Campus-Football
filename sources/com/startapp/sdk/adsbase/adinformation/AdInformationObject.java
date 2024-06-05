package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.d;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u1;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class AdInformationObject implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f16859a;

    /* renamed from: b  reason: collision with root package name */
    public final AdInformationView f16860b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences.Placement f16861c;

    /* renamed from: d  reason: collision with root package name */
    public final ConsentData f16862d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16863e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16864f;

    /* renamed from: g  reason: collision with root package name */
    public final AdInformationOverrides f16865g;

    /* compiled from: Sta */
    public enum Size {
        SMALL(AdInformationConfig.ImageResourceType.INFO_S, AdInformationConfig.ImageResourceType.INFO_EX_S),
        LARGE(AdInformationConfig.ImageResourceType.INFO_L, AdInformationConfig.ImageResourceType.INFO_EX_L);
        
        private final AdInformationConfig.ImageResourceType infoExtendedType;
        private final AdInformationConfig.ImageResourceType infoType;

        /* access modifiers changed from: public */
        Size(AdInformationConfig.ImageResourceType imageResourceType, AdInformationConfig.ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        public AdInformationConfig.ImageResourceType a() {
            return this.infoType;
        }
    }

    /* compiled from: Sta */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f16869a;

        public a(d dVar) {
            this.f16869a = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ all -> 0x00ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[Catch:{ all -> 0x00ad }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.startapp.d r8 = r7.f16869a
                com.startapp.sdk.adsbase.adinformation.AdInformationObject r0 = com.startapp.sdk.adsbase.adinformation.AdInformationObject.this
                java.lang.String r1 = r0.f16863e
                java.lang.String r0 = r0.f16864f
                com.startapp.i2<com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata> r2 = r8.f15718c
                java.lang.Object r2 = r2.a()
                com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata r2 = (com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata) r2
                if (r2 == 0) goto L_0x002a
                boolean r2 = r2.b()
                if (r2 == 0) goto L_0x002a
                com.startapp.i3 r2 = new com.startapp.i3
                com.startapp.j3 r3 = com.startapp.j3.f15951d
                r2.<init>((com.startapp.j3) r3)
                java.lang.String r3 = "adDebugInfo"
                r2.f15914d = r3
                r2.f15915e = r1
                r2.f15917g = r0
                r2.a()
            L_0x002a:
                java.lang.String r2 = "Ad debug info"
                r3 = 0
                if (r1 != 0) goto L_0x004c
                if (r0 != 0) goto L_0x004c
                android.content.Context r8 = r8.f15716a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = " not available"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r3)
                r8.show()
                goto L_0x00ad
            L_0x004c:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r2)
                java.lang.String r5 = "\n"
                r4.append(r5)
                if (r1 == 0) goto L_0x0061
                java.lang.String r6 = "url: "
                r4.append(r6)
                r4.append(r1)
                goto L_0x0063
            L_0x0061:
                java.lang.String r5 = ""
            L_0x0063:
                if (r0 == 0) goto L_0x0070
                r4.append(r5)
                java.lang.String r1 = "d: "
                r4.append(r1)
                r4.append(r0)
            L_0x0070:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 11
                if (r0 < r1) goto L_0x008d
                android.content.Context r0 = r8.f15716a     // Catch:{ all -> 0x008d }
                java.lang.String r1 = "clipboard"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x008d }
                boolean r1 = r0 instanceof android.content.ClipboardManager     // Catch:{ all -> 0x008d }
                if (r1 == 0) goto L_0x008d
                android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ all -> 0x008d }
                android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r4)     // Catch:{ all -> 0x008d }
                r0.setPrimaryClip(r1)     // Catch:{ all -> 0x008d }
                r0 = 1
                goto L_0x008e
            L_0x008d:
                r0 = 0
            L_0x008e:
                android.content.Context r8 = r8.f15716a     // Catch:{ all -> 0x00ad }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                r1.<init>()     // Catch:{ all -> 0x00ad }
                r1.append(r2)     // Catch:{ all -> 0x00ad }
                if (r0 == 0) goto L_0x009d
                java.lang.String r0 = " copied to clipboard"
                goto L_0x009f
            L_0x009d:
                java.lang.String r0 = " printed to logcat"
            L_0x009f:
                r1.append(r0)     // Catch:{ all -> 0x00ad }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ad }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r3)     // Catch:{ all -> 0x00ad }
                r8.show()     // Catch:{ all -> 0x00ad }
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.adinformation.AdInformationObject.a.onClick(android.view.View):void");
        }
    }

    public AdInformationObject(Context context, Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2) {
        this.f16859a = new WeakReference<>(context);
        this.f16861c = placement;
        this.f16865g = adInformationOverrides;
        this.f16862d = consentData;
        this.f16863e = str;
        this.f16864f = str2;
        this.f16860b = new AdInformationView(context, size, placement, adInformationOverrides, this);
    }

    public void a(RelativeLayout relativeLayout) {
        boolean z10;
        Context context = relativeLayout.getContext();
        AdInformationConfig a10 = AdInformationMetaData.f16857a.a();
        AdInformationOverrides adInformationOverrides = this.f16865g;
        if (adInformationOverrides == null || !adInformationOverrides.d()) {
            z10 = a10.b(context);
        } else {
            z10 = this.f16865g.c();
        }
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f16865g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                AdPreferences.Placement placement = this.f16861c;
                AdInformationPositions.Position position = a10.Positions.get(placement);
                if (position == null) {
                    position = AdInformationPositions.Position.BOTTOM_LEFT;
                    a10.Positions.put(placement, position);
                }
                position.addRules(layoutParams);
            } else {
                this.f16865g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f16860b, layoutParams);
        }
        d a11 = ComponentLocator.a(context).L.a();
        if (a11.a()) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, ((float) (this.f16860b.c() * 2)) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new a(a11));
            AdInformationPositions.Position position2 = this.f16860b.f16878f;
            if (position2 == null) {
                position2 = AdInformationPositions.Position.BOTTOM_LEFT;
            }
            AdInformationPositions.Position flipHorizontal = position2.flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f16860b.d(), this.f16860b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            AdInformationView adInformationView = this.f16860b;
            float e10 = adInformationView.f16876d.e();
            AdInformationView adInformationView2 = this.f16860b;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) (e10 * ((float) adInformationView.d())), (int) (adInformationView2.f16876d.e() * ((float) adInformationView2.c())));
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    public void onClick(View view) {
        Context context = (Context) this.f16859a.get();
        if (context != null) {
            u1 g10 = ComponentLocator.a(context).g();
            ConsentData consentData = this.f16862d;
            String str = null;
            String c10 = consentData != null ? consentData.c() : null;
            ConsentData consentData2 = this.f16862d;
            String d10 = consentData2 != null ? consentData2.d() : null;
            ConsentData consentData3 = this.f16862d;
            if (consentData3 != null) {
                str = consentData3.b();
            }
            g10.a(true, c10, d10, str);
        }
    }
}
