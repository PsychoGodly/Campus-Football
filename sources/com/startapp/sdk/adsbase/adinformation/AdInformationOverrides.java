package com.startapp.sdk.adsbase.adinformation;

import com.startapp.d9;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import java.io.Serializable;

/* compiled from: Sta */
public class AdInformationOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enable = true;
    private boolean enableOverride = false;
    @d9(type = AdInformationPositions.Position.class)
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.f16871a);
    private boolean positionOverride = false;

    private AdInformationOverrides() {
    }

    public static AdInformationOverrides a() {
        return new AdInformationOverrides();
    }

    public AdInformationPositions.Position b() {
        return this.position;
    }

    public boolean c() {
        return this.enable;
    }

    public boolean d() {
        return this.enableOverride;
    }

    public boolean e() {
        return this.positionOverride;
    }

    public void a(boolean z10) {
        this.enable = z10;
        this.enableOverride = true;
    }

    public void a(AdInformationPositions.Position position2) {
        this.position = position2;
        if (position2 != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }
}
