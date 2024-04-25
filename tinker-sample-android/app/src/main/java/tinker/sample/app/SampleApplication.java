package tinker.sample.app;

import com.tencent.tinker.loader.app.TinkerApplication;

public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(15, "tinker.sample.app.SampleApplicationLike", "com.tencent.tinker.loader.TinkerLoader", false, true);
    }
}
