package com.berwin.cocoadialog;

public enum CocoaDialogStyleGroup {
    alert(1),
    action_sheet(1 << 1),
    custom(1 << 2);

    int groupValue;

    CocoaDialogStyleGroup(int groupValue) {
        this.groupValue = groupValue;
    }
}
