package com.berwin.lincolnct.cocoadialog;

public enum CocoaDialogStyle {
    actionSheet(CocoaDialogStyleGroup.action_sheet.groupValue),
    alert(CocoaDialogStyleGroup.alert.groupValue),
    /**
     * the custom view will completely show in the dialog
     */
    custom(CocoaDialogStyleGroup.custom.groupValue),
    /**
     * the custom view will only show as the content in the dialog, so user can set title,actions and others which using alert style
     */
    customAlertContent(CocoaDialogStyleGroup.alert.groupValue | CocoaDialogStyleGroup.custom.groupValue),
    /**
     * the custom view will only show as the content in the dialog, so user can set title,actions and others which using action sheet style
     */
    customActionSheetContent(CocoaDialogStyleGroup.action_sheet.groupValue | CocoaDialogStyleGroup.custom.groupValue);

    int groupFlag;

    CocoaDialogStyle(int groupFlag) {
        this.groupFlag = groupFlag;
    }

    public boolean isGroup(CocoaDialogStyleGroup styleGroup) {
        return (this.groupFlag & styleGroup.groupValue) != 0;
    }
}
