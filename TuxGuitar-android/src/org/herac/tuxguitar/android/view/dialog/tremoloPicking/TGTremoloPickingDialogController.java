package org.herac.tuxguitar.android.view.dialog.tremoloPicking;

import org.herac.tuxguitar.android.view.dialog.TGDialogContext;
import org.herac.tuxguitar.android.view.dialog.TGDialogController;
import org.herac.tuxguitar.android.view.dialog.TGDialogUtil;

import android.app.Activity;

public class TGTremoloPickingDialogController implements TGDialogController {

	@Override
	public void showDialog(Activity activity, TGDialogContext context) {
        TGDialogUtil.showDialog(activity, new TGTremoloPickingDialog(), context);
	}
}
