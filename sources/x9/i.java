package x9;

public enum i {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f31265a;

    private i(String str) {
        this.f31265a = str;
    }

    public String toString() {
        return this.f31265a;
    }
}
