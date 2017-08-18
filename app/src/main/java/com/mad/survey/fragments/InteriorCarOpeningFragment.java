package com.mad.survey.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.mad.survey.MADSurveyApp;
import com.mad.survey.R;
import com.mad.survey.activities.BaseActivity;
import com.mad.survey.globals.GlobalConstant;
import com.mad.survey.listeners.OnFragmentResumedListener;
import com.mad.survey.models.BankData;
import com.mad.survey.models.InteriorCarData;
import com.mad.survey.models.InteriorCarDoorData;

public class InteriorCarOpeningFragment extends BaseFragment implements View.OnClickListener , OnFragmentResumedListener{

    private TextView txtCarNumber;
    private TextView txtSubTitle;
    private CheckBox chkYes,chkNo;

    public static InteriorCarOpeningFragment newInstance(){
        InteriorCarOpeningFragment fragment = new InteriorCarOpeningFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parent = inflater.inflate(R.layout.fragment_interior_car_opening, container, false);

        initView(parent);
        updateUIs();

        return parent;
    }

    private void initView(View parent){
        setHeaderTitle(parent, MADSurveyApp.getInstance().getProjectData().getName());

        txtSubTitle = (TextView) parent.findViewById(R.id.txtSubTitle);
        txtCarNumber = (TextView) parent.findViewById(R.id.txtCarNumber);
        chkYes = (CheckBox) parent.findViewById(R.id.chkYes);
        chkNo = (CheckBox) parent.findViewById(R.id.chkNo);
        parent.findViewById(R.id.btnYes).setOnClickListener(this);
        parent.findViewById(R.id.btnNo).setOnClickListener(this);
        parent.findViewById(R.id.btnBack).setOnClickListener(this);
        parent.findViewById(R.id.btnNext).setOnClickListener(this);
    }

    private void updateUIs(){
        chkYes.setChecked(false);
        chkNo.setChecked(false);
        BankData bankData = MADSurveyApp.getInstance().getBankData();
        if (MADSurveyApp.getInstance().isEditMode()){
            txtSubTitle.setText(getString(R.string.bank_description_n_edit_title, MADSurveyApp.getInstance().getBankData().getName()));
            txtCarNumber.setText(getString(R.string.car_number_n_edit_title, MADSurveyApp.getInstance().getInteriorCarData().getCarDescription()));
        }else{
            txtSubTitle.setText(getString(R.string.bank_description_n_title, MADSurveyApp.getInstance().getBankNum() + 1, MADSurveyApp.getInstance().getBankData().getName()));
            txtCarNumber.setText(getString(R.string.car_number_n_title, MADSurveyApp.getInstance().getInteriorCarNum()+1, bankData.getNumOfInteriorCar(),MADSurveyApp.getInstance().getInteriorCarData().getCarDescription()));
        }
        InteriorCarData interiorCarData = MADSurveyApp.getInstance().getInteriorCarData();
        int doorId = -1;
        if(BaseActivity.TEMP_DOOR_STYLE == 1)
            doorId = interiorCarData.getFrontDoorId();
        else
            doorId = interiorCarData.getBackDoorId();

        InteriorCarDoorData interiorCarDoorData = interiorCarDoorDataHandler.get(doorId);
        MADSurveyApp.getInstance().setInteriorCarDoorData(interiorCarDoorData);
        if(interiorCarDoorData!=null) {
            int yes = interiorCarDoorData.getCenterOpening();
            if (yes == 1) {
                chkYes.setChecked(true);
            } else if (yes == 2) {
                chkNo.setChecked(true);
            }
        }

    }
    private void setData(){
        InteriorCarData interiorCarData = MADSurveyApp.getInstance().getInteriorCarData();
        InteriorCarDoorData interiorCarDoorData = interiorCarDoorDataHandler.insertNewInteriorCarDoor(MADSurveyApp.getInstance().getProjectData().getId(),
                interiorCarData.getId(),
                BaseActivity.TEMP_DOOR_STYLE,
                BaseActivity.TEMP_OPENING);
        if(interiorCarDoorData != null){
            MADSurveyApp.getInstance().setInteriorCarDoorData(interiorCarDoorData);
                //front door
            if(BaseActivity.TEMP_DOOR_STYLE == 1)
                interiorCarData.setFrontDoorId(interiorCarDoorData.getId());
                //Back door
            else if(BaseActivity.TEMP_DOOR_STYLE == 2)
                interiorCarData.setBackDoorId(interiorCarDoorData.getId());
            MADSurveyApp.getInstance().setInteriorCarData(interiorCarData);
            interiorCarDataHandler.update(interiorCarData);
        }

        else{
            InteriorCarDoorData interiorCarDoorData1 = MADSurveyApp.getInstance().getInteriorCarDoorData();
            interiorCarDoorData1.setCenterOpening(BaseActivity.TEMP_OPENING);
            MADSurveyApp.getInstance().setInteriorCarDoorData(interiorCarDoorData1);
            interiorCarDoorDataHandler.update(interiorCarDoorData1);
        }

    }
    private void goToCenterMeasurements(){
        setData();
        interiorCarDoorDataHandler.update(MADSurveyApp.getInstance().getInteriorCarDoorData());
        ((BaseActivity) getActivity()).replaceFragment(BaseActivity.FRAGMENT_ID_INTERIOR_CAR_CENTER_MEASUREMENTS, "interior_car_center_measurements");
    }

    private void goToSingleSideMeasurements(){
        setData();
        interiorCarDoorDataHandler.update(MADSurveyApp.getInstance().getInteriorCarDoorData());
        ((BaseActivity) getActivity()).replaceFragment(BaseActivity.FRAGMENT_ID_INTERIOR_CAR_SINGLE_SIDE_MEASUREMENTS, "interior_car_single_side_measurements");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                getActivity().onBackPressed();
                break;
            case R.id.btnYes:
                BaseActivity.TEMP_OPENING = 1;
                goToCenterMeasurements();
                break;
            case R.id.btnNo:
                BaseActivity.TEMP_OPENING = 2;
                goToSingleSideMeasurements();
                break;
        }
    }

    @Override
    public void onFragmentResumed() {
        updateUIs();
    }
}
