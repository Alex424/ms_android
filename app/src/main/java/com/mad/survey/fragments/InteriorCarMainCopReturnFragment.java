package com.mad.survey.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mad.survey.MADSurveyApp;
import com.mad.survey.R;
import com.mad.survey.activities.BaseActivity;
import com.mad.survey.globals.GlobalConstant;
import com.mad.survey.listeners.OnFragmentResumedListener;
import com.mad.survey.models.BankData;
import com.mad.survey.models.InteriorCarDoorData;
import com.mad.survey.utils.ConversionUtils;
import com.mad.survey.utils.Utils;

public class InteriorCarMainCopReturnFragment extends BaseFragment implements View.OnClickListener , OnFragmentResumedListener{

    private TextView txtCarNumber;
    private EditText edtWidth, edtHeight, edtLeft, edtRight, edtTop, edtBottom, edtThroat, edtReturn;

    public static InteriorCarMainCopReturnFragment newInstance(){
        InteriorCarMainCopReturnFragment fragment = new InteriorCarMainCopReturnFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parent = inflater.inflate(R.layout.fragment_interior_car_maincop_return, container, false);

        initView(parent);
        updateUIs();

        return parent;
    }

    private void initView(View parent){
        setHeaderTitle(parent, MADSurveyApp.getInstance().getProjectData().getName());

        txtCarNumber = (TextView) parent.findViewById(R.id.txtCarNumber);
        edtWidth = (EditText) parent.findViewById(R.id.edtWidth);
        edtHeight = (EditText) parent.findViewById(R.id.edtHeight);
        edtLeft = (EditText) parent.findViewById(R.id.edtLeft);
        edtRight = (EditText) parent.findViewById(R.id.edtRight);
        edtTop = (EditText) parent.findViewById(R.id.edtTop);
        edtBottom = (EditText) parent.findViewById(R.id.edtBottom);
        edtThroat = (EditText) parent.findViewById(R.id.edtThroat);
        edtReturn = (EditText) parent.findViewById(R.id.edtReturn);

        parent.findViewById(R.id.btnBack).setOnClickListener(this);
        parent.findViewById(R.id.btnNext).setOnClickListener(this);
        parent.findViewById(R.id.btnHelp).setOnClickListener(this);

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                edtWidth.requestFocus();
                Utils.showKeyboard(getActivity(), true, edtWidth);
            }
        });

        setHeaderScrollConfiguration(parent, getString(R.string.sub_title_cab_interior), getString(R.string.sub_title_main_cop_return), true, true);
        setBackdoorTitle(parent);
    }

    private void updateUIs(){
        edtWidth.setText("");
        edtHeight.setText("");
        edtLeft.setText("");
        edtRight.setText("");
        edtTop.setText("");
        edtBottom.setText("");
        edtThroat.setText("");
        edtReturn.setText("");
        BankData bankData = MADSurveyApp.getInstance().getBankData();
        if (MADSurveyApp.getInstance().isEditMode()){
            txtSubTitle.setText(getString(R.string.bank_description_n_edit_title, MADSurveyApp.getInstance().getBankData().getName()));
            txtCarNumber.setText(getString(R.string.car_number_n_edit_title, MADSurveyApp.getInstance().getInteriorCarData().getCarDescription()));
        }else{
            txtSubTitle.setText(getString(R.string.bank_description_n_title, MADSurveyApp.getInstance().getBankNum() + 1, MADSurveyApp.getInstance().getBankData().getName()));
            txtCarNumber.setText(getString(R.string.car_number_n_title, MADSurveyApp.getInstance().getInteriorCarNum()+1, bankData.getNumOfInteriorCar(),MADSurveyApp.getInstance().getInteriorCarData().getCarDescription()));
        }
        InteriorCarDoorData interiorCarDoorData = MADSurveyApp.getInstance().getInteriorCarDoorData();
        double width = interiorCarDoorData.getMainCopWidth();
        double height = interiorCarDoorData.getMainCopHeight();
        double left = interiorCarDoorData.getMainCopLeft();
        double right = interiorCarDoorData.getMainCopRight();
        double top = interiorCarDoorData.getMainCopTop();
        double bottom = interiorCarDoorData.getMainCopBottom();
        double throat = interiorCarDoorData.getMainCopThroat();
        double returnR = interiorCarDoorData.getMainCopReturn();
        if(width >= 0)
            edtWidth.setText(width+"");
        if(height >= 0)
            edtHeight.setText(height+"");
        if(left >= 0)
            edtLeft.setText(left+"");
        if(right >= 0)
            edtRight.setText(right+"");
        if(top >= 0)
            edtTop.setText(top+"");
        if(bottom>= 0)
            edtBottom.setText(bottom+"");
        if(throat >= 0)
            edtThroat.setText(throat+"");
        if(returnR >= 0)
            edtReturn.setText(returnR+"");

    }

    private void goToNext(){
        double width = ConversionUtils.getDoubleFromEditText(edtWidth);
        double height = ConversionUtils.getDoubleFromEditText(edtHeight);
        double left = ConversionUtils.getDoubleFromEditText(edtLeft);
        double right = ConversionUtils.getDoubleFromEditText(edtRight);
        double top = ConversionUtils.getDoubleFromEditText(edtTop);
        double bottom = ConversionUtils.getDoubleFromEditText(edtBottom);
        double throat = ConversionUtils.getDoubleFromEditText(edtThroat);
        double returnR = ConversionUtils.getDoubleFromEditText(edtReturn);

        if(width<0){
            edtWidth.requestFocus();
            showToast(getString(R.string.valid_msg_input_width), Toast.LENGTH_SHORT);
            return;
        }
        if(height<0){
            edtHeight.requestFocus();
            showToast(getString(R.string.valid_msg_input_height), Toast.LENGTH_SHORT);
            return;
        }
        if(left<0){
            edtLeft.requestFocus();
            showToast(getString(R.string.valid_msg_input_left), Toast.LENGTH_SHORT);
            return;
        }
        if(right<0){
            edtRight.requestFocus();
            showToast(getString(R.string.valid_msg_input_right), Toast.LENGTH_SHORT);
            return;
        }
        if(top<0){
            edtTop.requestFocus();
            showToast(getString(R.string.valid_msg_input_top), Toast.LENGTH_SHORT);
            return;
        }
        if(bottom<0){
            edtBottom.requestFocus();
            showToast(getString(R.string.valid_msg_input_bottom), Toast.LENGTH_SHORT);
            return;
        }
        if(throat<0){
            edtThroat.requestFocus();
            showToast(getString(R.string.valid_msg_input_throat), Toast.LENGTH_SHORT);
            return;
        }
        if(returnR<0){
            edtReturn.requestFocus();
            showToast(getString(R.string.valid_msg_input_return), Toast.LENGTH_SHORT);
            return;
        }
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopWidth(width);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopHeight(height);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopLeft(left);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopRight(right);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopTop(top);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopBottom(bottom);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopThroat(throat);
        MADSurveyApp.getInstance().getInteriorCarDoorData().setMainCopReturn(returnR);
        interiorCarDoorDataHandler.update(MADSurveyApp.getInstance().getInteriorCarDoorData());

        ((BaseActivity) getActivity()).replaceFragment(BaseActivity.FRAGMENT_ID_INTERIOR_CAR_AUXCOP_RETURN, "interior_car_auxcop_return");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                getActivity().onBackPressed();
                break;
            case R.id.btnNext:
                goToNext();
                break   ;
            case R.id.btnHelp:
                showHelpDialog(getActivity(), getString(R.string.help_title_car_interior_measurements), R.drawable.img_help_50_interior_car_maincop_return_help, GlobalConstant.HELP_PHOTO_SIZE_RATE);
                break;
        }
    }

    @Override
    public void onFragmentResumed() {
        updateUIs();
    }
}
