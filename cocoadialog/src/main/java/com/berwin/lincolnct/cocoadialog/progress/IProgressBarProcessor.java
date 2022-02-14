package com.berwin.lincolnct.cocoadialog.progress;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

public interface IProgressBarProcessor {
    @NonNull
    View getProgressBar(@NonNull Context context);

    void setProgress(int progress);

    int getProgressMax();

    int getProgressMin();

    int getProgress();
}
