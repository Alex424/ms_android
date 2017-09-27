package com.mad.survey.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.mad.survey.MADSurveyApp;
import com.mad.survey.R;
import com.mad.survey.activities.BaseActivity;
import com.mad.survey.dialogs.CustomProgressDialog;
import com.mad.survey.dialogs.HelpPhotoDialog;
import com.mad.survey.dialogs.SurveyDeleteDialog;
import com.mad.survey.dialogs.SurveyExitDialog;
import com.mad.survey.globals.GlobalConstant;
import com.mad.survey.models.PhotoData;
import com.mad.survey.models.handlers.BankDataHandler;
import com.mad.survey.models.handlers.CarDataHandler;
import com.mad.survey.models.handlers.CopDataHandler;
import com.mad.survey.models.handlers.HallEntranceDataHandler;
import com.mad.survey.models.handlers.HallStationDataHandler;
import com.mad.survey.models.handlers.InteriorCarDataHandler;
import com.mad.survey.models.handlers.InteriorCarDoorDataHandler;
import com.mad.survey.models.handlers.LanternDataHandler;
import com.mad.survey.models.handlers.LobbyDataHandler;
import com.mad.survey.models.handlers.PhotoDataHandler;
import com.mad.survey.models.handlers.ProjectDataHandler;
import com.mad.survey.utils.Utils;

import java.io.File;
import java.util.zip.Inflater;

public class BaseFragment extends Fragment {

	public int TAKE_CAMERA = 52;
	protected int displayWidth = 0;
	protected int displayHeight = 0;

    protected ScrollView contentScroll;
    protected LinearLayout layoutPromptTitle;
    protected TextView txtSubTitle;
    protected TextView txtHeaderSubTitle1;
    protected TextView txtHeaderSubTitle2;

	protected ProjectDataHandler projectDataHandler;
	protected PhotoDataHandler photoDataHandler;
	protected LobbyDataHandler lobbyDataHandler;
	protected BankDataHandler bankDataHandler;
	protected HallStationDataHandler hallStationDataHandler;
	protected LanternDataHandler lanternDataHandler;
	protected CarDataHandler carDataHandler;
	protected CopDataHandler copDataHandler;
	protected InteriorCarDataHandler interiorCarDataHandler;
	protected InteriorCarDoorDataHandler interiorCarDoorDataHandler;
	protected HallEntranceDataHandler hallEntranceDataHandler;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		WindowManager wm = getActivity().getWindowManager();
		Display display = wm.getDefaultDisplay();
		if( Build.VERSION.SDK_INT >= 13 ) {
			Point size = new Point();
			display.getSize(size);
			displayWidth = size.x;
			displayHeight = size.y;
		} else {
			displayWidth = display.getWidth();
			displayHeight = display.getHeight();
		}

		projectDataHandler = new ProjectDataHandler(MADSurveyApp.getInstance().getDbHelper(), MADSurveyApp.getInstance().getDatabase());
		photoDataHandler = new PhotoDataHandler(MADSurveyApp.getInstance().getDbHelper(), MADSurveyApp.getInstance().getDatabase());
		lobbyDataHandler = new LobbyDataHandler(MADSurveyApp.getInstance().getDbHelper(), MADSurveyApp.getInstance().getDatabase());
 		bankDataHandler = new BankDataHandler(MADSurveyApp.getInstance().getDbHelper(), MADSurveyApp.getInstance().getDatabase());
		hallStationDataHandler = new HallStationDataHandler(MADSurveyApp.getInstance().getDbHelper(), MADSurveyApp.getInstance().getDatabase());
		lanternDataHandler = new LanternDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
		carDataHandler = new CarDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
		copDataHandler = new CopDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
		interiorCarDataHandler = new InteriorCarDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
		interiorCarDoorDataHandler = new InteriorCarDoorDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
		hallEntranceDataHandler = new HallEntranceDataHandler(MADSurveyApp.getInstance().getDbHelper(),MADSurveyApp.getInstance().getDatabase());
	}

	int nPadding = 0;
	public void setHeaderScrollConfiguration(View parent, String subTitle1, String subTitle2, final boolean subTitle1Visible, final boolean subTitle2Visible){
		txtSubTitle = (TextView) parent.findViewById(R.id.txtSubTitle);
		contentScroll = (ScrollView) parent.findViewById(R.id.contentScroll);
		layoutPromptTitle = (LinearLayout) parent.findViewById(R.id.layoutPromptTitle);
		txtHeaderSubTitle1 = (TextView) parent.findViewById(R.id.txtHeaderSubTitle1);
		txtHeaderSubTitle1.setText(subTitle1);
		txtHeaderSubTitle2 = (TextView) parent.findViewById(R.id.txtHeaderSubTitle2);
		txtHeaderSubTitle2.setText(subTitle2);

		contentScroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
			@Override
			public void onScrollChanged() {
				int scrollY = contentScroll.getScrollY(); // For ScrollView
				int scrollX = contentScroll.getScrollX(); // For HorizontalScrollView
				// DO SOMETHING WITH THE SCROLL COORDINATES

				if (nPadding == 0) nPadding = txtSubTitle.getHeight() + layoutPromptTitle.getHeight();

				Log.d(getClass().getName(), "Padding:" + nPadding);

				if (scrollY > nPadding){
					txtHeaderSubTitle1.setVisibility(subTitle1Visible? View.VISIBLE:View.GONE);
					txtHeaderSubTitle2.setVisibility(subTitle2Visible? View.VISIBLE:View.GONE);
				}else{
					txtHeaderSubTitle1.setVisibility(View.GONE);
					txtHeaderSubTitle2.setVisibility(View.GONE);
				}
			}
		});
	}

	SurveyExitDialog stopDlg;
	public void setHeaderTitle(View root, String title){
		if (!MADSurveyApp.getInstance().isEditMode()) {
			((TextView) root.findViewById(R.id.txtHeaderTitle)).setText(title);
		}else{
			((TextView) root.findViewById(R.id.txtHeaderTitle)).setText(getResources().getString(R.string.header_title_edit_mode, title));
		}

        if (MADSurveyApp.getInstance().isEditMode()){
            hideSubtitleViewsForEditMode(root);
        }

        root.findViewById(R.id.imgMADLogo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				stopDlg  = new SurveyExitDialog(getActivity(), MADSurveyApp.getInstance().getProjectData(), new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						switch(v.getId()){
							case R.id.btnYes:
								stopDlg.dismiss();
								getActivity().finish();
								break;
							case R.id.btnNo:
								stopDlg.dismiss();
								break;
						}
					}
				});
				stopDlg.show();
            }
        });
	}

    // Function to hide the sub titles that shows the 1 of N labels, in only the edit-mode case
    // 2017/08/11
    private void hideSubtitleViewsForEditMode(View root){
        if (root instanceof LinearLayout || root instanceof RelativeLayout || root instanceof FrameLayout){
            ViewGroup rootView = (ViewGroup) root;
            for (int i = 0; i < rootView.getChildCount(); i++){
                hideSubtitleViewsForEditMode(rootView.getChildAt(i));
            }
        }else{
            if (root.getTag() != null){
                try{
                    String tagStr = root.getTag().toString();
                    if (tagStr.equals(getString(R.string.edit_subtitle_hidden_tag))){
                        root.setVisibility(View.GONE);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

	public void showHelpDialog(Context ctx, String title, int resId, double rate){
		HelpPhotoDialog dlg = new HelpPhotoDialog(ctx, displayWidth, title, resId, rate);
		dlg.show();
	}

	protected void showToast(String text, int duration) {
		FragmentActivity activity = getActivity();
		if( activity == null || (activity instanceof BaseActivity
				&& ((BaseActivity)activity).isActivityStopped() ) ) {
			return;
		}

		Toast.makeText(activity, text, duration).show();
	}
	public void doTakePhoto(){
	//	if (isActivityActive) {
			Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			File file = new File(GlobalConstant.getCameraTempFilePath());
			//it.putExtra(MediaStore.EXTRA_OUTPUT, tempPictuePath ) ;
			it.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
			startActivityForResult(it, TAKE_CAMERA);
	//	}
	}

	protected CustomProgressDialog showProgressDialog(CustomProgressDialog dialog, String text) {
		FragmentActivity activity = getActivity();
		if( activity == null || (activity instanceof BaseActivity
				&& ((BaseActivity)activity).isActivityStopped() ) ) {
			return null;
		}

		if( dialog == null ) {
			dialog = new CustomProgressDialog(getActivity(), text);
		}else{
			dialog.setMessage(text);
		}

		if( !dialog.isShowing() ) {
			dialog.show();
		}
		return dialog;
	}
	protected void dismissProgressDialog(ProgressDialog dialog) {
		FragmentActivity activity = getActivity();
		if( dialog == null || activity == null || (activity instanceof BaseActivity
				&& ((BaseActivity)activity).isActivityStopped() ) ) {
			return;
		}
		dialog.dismiss();
	}

	protected void showLanternHelpDialog(String descriptor){
		if (descriptor.equals(GlobalConstant.LANTERN_LANTERN)){
			showHelpDialog(getActivity(), getString(R.string.help_title_lantern_pi), R.drawable.img_help_21_lantern_only_help, GlobalConstant.HELP_PHOTO_SIZE_RATE);
		}else if (descriptor.equals(GlobalConstant.LANTERN_POSITION_INDICATOR)){
			showHelpDialog(getActivity(), getString(R.string.help_title_lantern_pi), R.drawable.img_help_21_position_indicator_only, GlobalConstant.HELP_PHOTO_SIZE_RATE);
		}else if (descriptor.equals(GlobalConstant.LANTERN_PI_LANTERN_COMBO)){
			showHelpDialog(getActivity(), getString(R.string.help_title_lantern_pi), R.drawable.img_help_21_lantern_pi_combo_help, GlobalConstant.HELP_PHOTO_SIZE_RATE);
		}
	}
}
