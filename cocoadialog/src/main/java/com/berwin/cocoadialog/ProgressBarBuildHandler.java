package com.berwin.cocoadialog;

import android.content.Context;
import android.widget.ProgressBar;

/**
 * @deprecated Recommend not using this interface and using {@link com.berwin.cocoadialog.progress.IProgressBarProcessor} instead. You can get more freedom custom configuration.
 */
@Deprecated
public interface ProgressBarBuildHandler {
    ProgressBar build(Context context);
}
