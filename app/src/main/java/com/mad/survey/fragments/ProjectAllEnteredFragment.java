package com.mad.survey.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.mad.survey.MADSurveyApp;
import com.mad.survey.R;
import com.mad.survey.activities.BaseActivity;

public class ProjectAllEnteredFragment extends BaseFragment implements View.OnClickListener {

    private CheckBox chkSubmitSurvey,chkReturnToMain;


    public static ProjectAllEnteredFragment newInstance(){
        ProjectAllEnteredFragment fragment = new ProjectAllEnteredFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parent = inflater.inflate(R.layout.fragment_project_all_entered, container, false);

        initView(parent);
        updateUIs();

        return parent;
    }

    private void initView(View parent){
        setHeaderTitle(parent, MADSurveyApp.getInstance().getProjectData().getName());

        chkSubmitSurvey = (CheckBox) parent.findViewById(R.id.chkSubmitSurvey);
        chkReturnToMain = (CheckBox) parent.findViewById(R.id.chkReturnToMain);

        parent.findViewById(R.id.btnSubmitSurvey).setOnClickListener(this);
        parent.findViewById(R.id.btnReturnToMain).setOnClickListener(this);

        parent.findViewById(R.id.btnBack).setOnClickListener(this);
        parent.findViewById(R.id.btnNext).setOnClickListener(this);
    }

    private void updateUIs(){

    }

    private void goToSubmitSurvey(){
        ((BaseActivity) getActivity()).replaceFragment(BaseActivity.FRAGMENT_ID_SUBMIT_PROJECT, "submit_project");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                getActivity().onBackPressed();
                break;
            case R.id.btnNext:
                goToSubmitSurvey();
                break;
            case R.id.btnSubmitSurvey:
                goToSubmitSurvey();
                break;
            case R.id.btnReturnToMain:
                getActivity().finish();
                break;
        }
    }
}
