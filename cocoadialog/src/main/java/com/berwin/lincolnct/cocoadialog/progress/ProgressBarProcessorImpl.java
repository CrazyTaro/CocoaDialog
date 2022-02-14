package com.berwin.lincolnct.cocoadialog.progress;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ProgressBar;

/**
 * The progress bar builder impl delegating {@link IProgressBarProcessor} to compat the old method.
 */
public class ProgressBarProcessorImpl implements IProgressBarProcessor {
    ProgressBar progressBar;

    public ProgressBarProcessorImpl(@NonNull ProgressBar handler) {
        this.progressBar = handler;
    }

    @NonNull
    @Override
    public View getProgressBar(@NonNull Context context) {
        return progressBar;
    }

    @Override
    public void setProgress(int progress) {
        if (progressBar != null) {
            progressBar.setProgress(progress);
        }
    }

    @Override
    public int getProgressMax() {
        return progressBar != null ? progressBar.getMax() : 0;
    }

    @Override
    public int getProgressMin() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return progressBar != null ? progressBar.getMin() : 0;
        } else {
            return 0;
        }
    }

    @Override
    public int getProgress() {
        return progressBar != null ? progressBar.getProgress() : 0;
    }
}
