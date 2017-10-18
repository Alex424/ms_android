package com.mad.survey.models;

import android.content.ContentValues;
import android.database.Cursor;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;

public class InteriorCarDoorData extends  BaseData implements Serializable {
    private int id = 0;
    private int projectId = 0;
    private int interiorCarId = 0;
    private int doorStyle = 0;

    private int centerOpening = 0;
    private double width = 0 , height = 0,  sideWallMainWidth = 0,sideWallAuxWidth = 0;
    private double doorOpeningWidth = 0 , doorOpeningHeight = 0;
    private double returnSideWallDepth = 0 , slamSideWallDepth = 0 , slideWallWidth = 0;
    private String typeOfSlamPost = "";
    private String otherSlamPost = "";
    private double slamPostMeasurementsA = 0;
    private double slamPostMeasurementsB = 0;
    private double slamPostMeasurementsC = 0;
    private double slamPostMeasurementsD = 0;
    private double slamPostMeasurementsE = 0;
    private double slamPostMeasurementsF = 0;
    private double slamPostMeasurementsG = 0;
    private double slamPostMeasurementsH = 0;

    private String typeOfFrontReturn = "";
    private double leftSideA = 0;
    private double leftSideB = 0;
    private double leftSideC = 0;
    private double leftSideD = 0;
    private double leftSideE = 0;

    private double rightSideA = 0;
    private double rightSideB = 0;
    private double rightSideC = 0;
    private double rightSideD = 0;
    private double rightSideE = 0;

    private double leftSideATypeB = 0;
    private double leftSideBTypeB = 0;
    private double leftSideCTypeB = 0;

    private double rightSideATypeB = 0;
    private double rightSideBTypeB = 0;
    private double rightSideCTypeB = 0;


    private double frontReturnMeasurementsHeight = 0;
    private String otherFrontReturnMeasurements = "";
    private int carDoorType = 0;
    private int carDoorOpeningDirection = 0;

    private double transomMeasurementsHeight = 0;
    private double transomMeasurementsWidth = 0;
    private double transomMeasurementsLeft = 0;
    private double transomMeasurementsCenterLeft = 0;
    private double transomMeasurementsCenterRight = 0;
    private double transomMeasurementsRight = 0;
    private double transomMeasurementsCenter = 0;

    private double transomProfileHeight = 0;
    private double transomProfileDepth = 0;
    private double transomProfileReturn = 0;
    private double transomProfileColonnade = 0;
    private double transomProfileColonnade2 = 0;

    private String isThereNewCop = "";

    private double mainCopWidth = 0;
    private double mainCopHeight = 0;
    private double mainCopLeft = 0;
    private double mainCopRight = 0;
    private double mainCopTop = 0;
    private double mainCopBottom = 0;
    private double mainCopThroat = 0;
    private double mainCopReturn = 0;

    private double auxCopWidth = 0;
    private double auxCopHeight = 0;
    private double auxCopLeft = 0;
    private double auxCopRight = 0;
    private double auxCopTop = 0;
    private double auxCopBottom = 0;
    private double auxCopThroat = 0;
    private double auxCopReturn = 0;

    private String notes = "";
    private String uuid = "";

    @Override
    public int getProjectId() {
        return projectId;
    }

    @Override
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getIsThereNewCop() {
        return isThereNewCop;
    }

    public void setIsThereNewCop(String isThereNewCop) {
        this.isThereNewCop = isThereNewCop;
    }

    public double getLeftSideATypeB() {
        return leftSideATypeB;
    }

    public void setLeftSideATypeB(double leftSideATypeB) {
        this.leftSideATypeB = leftSideATypeB;
    }

    public double getLeftSideBTypeB() {
        return leftSideBTypeB;
    }

    public void setLeftSideBTypeB(double leftSideBTypeB) {
        this.leftSideBTypeB = leftSideBTypeB;
    }

    public double getLeftSideCTypeB() {
        return leftSideCTypeB;
    }

    public void setLeftSideCTypeB(double leftSideCTypeB) {
        this.leftSideCTypeB = leftSideCTypeB;
    }

    public double getRightSideATypeB() {
        return rightSideATypeB;
    }

    public void setRightSideATypeB(double rightSideATypeB) {
        this.rightSideATypeB = rightSideATypeB;
    }

    public double getRightSideBTypeB() {
        return rightSideBTypeB;
    }

    public void setRightSideBTypeB(double rightSideBTypeB) {
        this.rightSideBTypeB = rightSideBTypeB;
    }

    public double getRightSideCTypeB() {
        return rightSideCTypeB;
    }

    public void setRightSideCTypeB(double rightSideCTypeB) {
        this.rightSideCTypeB = rightSideCTypeB;
    }

    public String getTypeOfFrontReturn() {
        return typeOfFrontReturn;
    }

    public double getTransomMeasurementsHeight() {
        return transomMeasurementsHeight;
    }

    public void setTransomMeasurementsHeight(double transomMeasurementsHeight) {
        this.transomMeasurementsHeight = transomMeasurementsHeight;
    }

    public void setTypeOfFrontReturn(String typeOfFrontReturn) {
        this.typeOfFrontReturn = typeOfFrontReturn;
    }

    public double getLeftSideA() {
        return leftSideA;
    }

    public void setLeftSideA(double leftSideA) {
        this.leftSideA = leftSideA;
    }

    public double getLeftSideB() {
        return leftSideB;
    }

    public void setLeftSideB(double leftSideB) {
        this.leftSideB = leftSideB;
    }

    public double getLeftSideC() {
        return leftSideC;
    }

    public void setLeftSideC(double leftSideC) {
        this.leftSideC = leftSideC;
    }

    public double getLeftSideD() {
        return leftSideD;
    }

    public void setLeftSideD(double leftSideD) {
        this.leftSideD = leftSideD;
    }

    public double getLeftSideE() {
        return leftSideE;
    }

    public void setLeftSideE(double leftSideE) {
        this.leftSideE = leftSideE;
    }

    public double getRightSideA() {
        return rightSideA;
    }

    public void setRightSideA(double rightSideA) {
        this.rightSideA = rightSideA;
    }

    public double getRightSideB() {
        return rightSideB;
    }

    public void setRightSideB(double rightSideB) {
        this.rightSideB = rightSideB;
    }

    public double getRightSideC() {
        return rightSideC;
    }

    public void setRightSideC(double rightSideC) {
        this.rightSideC = rightSideC;
    }

    public double getRightSideD() {
        return rightSideD;
    }

    public void setRightSideD(double rightSideD) {
        this.rightSideD = rightSideD;
    }

    public double getRightSideE() {
        return rightSideE;
    }

    public void setRightSideE(double rightSideE) {
        this.rightSideE = rightSideE;
    }

    public double getFrontReturnMeasurementsHeight() {
        return frontReturnMeasurementsHeight;
    }

    public void setFrontReturnMeasurementsHeight(double frontReturnMeasurementsHeight) {
        this.frontReturnMeasurementsHeight = frontReturnMeasurementsHeight;
    }

    public String getOtherFrontReturnMeasurements() {
        return otherFrontReturnMeasurements;
    }

    public void setOtherFrontReturnMeasurements(String otherFrontReturnMeasurements) {
        this.otherFrontReturnMeasurements = otherFrontReturnMeasurements;
    }

    public int getCarDoorType() {
        return carDoorType;
    }

    public void setCarDoorType(int carDoorType) {
        this.carDoorType = carDoorType;
    }

    public int getCarDoorOpeningDirection() {
        return carDoorOpeningDirection;
    }

    public void setCarDoorOpeningDirection(int carDoorOpeningDirection) {
        this.carDoorOpeningDirection = carDoorOpeningDirection;
    }


    public double getTransomMeasurementsWidth() {
        return transomMeasurementsWidth;
    }

    public void setTransomMeasurementsWidth(double transomMeasurementsWidth) {
        this.transomMeasurementsWidth = transomMeasurementsWidth;
    }

    public double getTransomMeasurementsLeft() {
        return transomMeasurementsLeft;
    }

    public void setTransomMeasurementsLeft(double transomMeasurementsLeft) {
        this.transomMeasurementsLeft = transomMeasurementsLeft;
    }

    public double getTransomMeasurementsCenterLeft() {
        return transomMeasurementsCenterLeft;
    }

    public void setTransomMeasurementsCenterLeft(double transomMeasurementsCenterLeft) {
        this.transomMeasurementsCenterLeft = transomMeasurementsCenterLeft;
    }

    public double getTransomMeasurementsCenterRight() {
        return transomMeasurementsCenterRight;
    }

    public void setTransomMeasurementsCenterRight(double transomMeasurementsCenterRight) {
        this.transomMeasurementsCenterRight = transomMeasurementsCenterRight;
    }

    public double getTransomMeasurementsRight() {
        return transomMeasurementsRight;
    }

    public void setTransomMeasurementsRight(double transomMeasurementsRight) {
        this.transomMeasurementsRight = transomMeasurementsRight;
    }

    public double getTransomMeasurementsCenter() {
        return transomMeasurementsCenter;
    }

    public void setTransomMeasurementsCenter(double transomMeasurementsCenter) {
        this.transomMeasurementsCenter = transomMeasurementsCenter;
    }

    public double getTransomProfileHeight() {
        return transomProfileHeight;
    }

    public void setTransomProfileHeight(double transomProfileHeight) {
        this.transomProfileHeight = transomProfileHeight;
    }

    public double getTransomProfileDepth() {
        return transomProfileDepth;
    }

    public void setTransomProfileDepth(double transomProfileDepth) {
        this.transomProfileDepth = transomProfileDepth;
    }

    public double getTransomProfileReturn() {
        return transomProfileReturn;
    }

    public void setTransomProfileReturn(double transomProfileReturn) {
        this.transomProfileReturn = transomProfileReturn;
    }

    public double getTransomProfileColonnade() {
        return transomProfileColonnade;
    }

    public void setTransomProfileColonnade(double transomProfileColonnade) {
        this.transomProfileColonnade = transomProfileColonnade;
    }

    public double getTransomProfileColonnade2() {
        return transomProfileColonnade2;
    }

    public void setTransomProfileColonnade2(double transomProfileColonnade2) {
        this.transomProfileColonnade2 = transomProfileColonnade2;
    }

    public double getMainCopWidth() {
        return mainCopWidth;
    }

    public void setMainCopWidth(double mainCopWidth) {
        this.mainCopWidth = mainCopWidth;
    }

    public double getMainCopHeight() {
        return mainCopHeight;
    }

    public void setMainCopHeight(double mainCopHeight) {
        this.mainCopHeight = mainCopHeight;
    }

    public double getMainCopLeft() {
        return mainCopLeft;
    }

    public void setMainCopLeft(double mainCopLeft) {
        this.mainCopLeft = mainCopLeft;
    }

    public double getMainCopRight() {
        return mainCopRight;
    }

    public void setMainCopRight(double mainCopRight) {
        this.mainCopRight = mainCopRight;
    }

    public double getMainCopTop() {
        return mainCopTop;
    }

    public void setMainCopTop(double mainCopTop) {
        this.mainCopTop = mainCopTop;
    }

    public double getMainCopBottom() {
        return mainCopBottom;
    }

    public void setMainCopBottom(double mainCopBottom) {
        this.mainCopBottom = mainCopBottom;
    }

    public double getMainCopThroat() {
        return mainCopThroat;
    }

    public void setMainCopThroat(double mainCopThroat) {
        this.mainCopThroat = mainCopThroat;
    }

    public double getMainCopReturn() {
        return mainCopReturn;
    }

    public void setMainCopReturn(double mainCopReturn) {
        this.mainCopReturn = mainCopReturn;
    }

    public double getAuxCopWidth() {
        return auxCopWidth;
    }

    public void setAuxCopWidth(double auxCopWidth) {
        this.auxCopWidth = auxCopWidth;
    }

    public double getAuxCopHeight() {
        return auxCopHeight;
    }

    public void setAuxCopHeight(double auxCopHeight) {
        this.auxCopHeight = auxCopHeight;
    }

    public double getAuxCopLeft() {
        return auxCopLeft;
    }

    public void setAuxCopLeft(double auxCopLeft) {
        this.auxCopLeft = auxCopLeft;
    }

    public double getAuxCopRight() {
        return auxCopRight;
    }

    public void setAuxCopRight(double auxCopRight) {
        this.auxCopRight = auxCopRight;
    }

    public double getAuxCopTop() {
        return auxCopTop;
    }

    public void setAuxCopTop(double auxCopTop) {
        this.auxCopTop = auxCopTop;
    }

    public double getAuxCopBottom() {
        return auxCopBottom;
    }

    public void setAuxCopBottom(double auxCopBottom) {
        this.auxCopBottom = auxCopBottom;
    }

    public double getAuxCopThroat() {
        return auxCopThroat;
    }

    public void setAuxCopThroat(double auxCopThroat) {
        this.auxCopThroat = auxCopThroat;
    }

    public double getAuxCopReturn() {
        return auxCopReturn;
    }

    public void setAuxCopReturn(double auxCopReturn) {
        this.auxCopReturn = auxCopReturn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(int doorStyle) {
        this.doorStyle = doorStyle;
    }

    public int getInteriorCarId() {
        return interiorCarId;
    }

    public void setInteriorCarId(int interiorCarId) {
        this.interiorCarId = interiorCarId;
    }

    public String getOtherSlamPost() {
        return otherSlamPost;
    }

    public void setOtherSlamPost(String otherSlamPost) {
        this.otherSlamPost = otherSlamPost;
    }

    public int getCenterOpening() {
        return centerOpening;
    }

    public void setCenterOpening(int centerOpening) {
        this.centerOpening = centerOpening;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideWallMainWidth() {
        return sideWallMainWidth;
    }

    public void setSideWallMainWidth(double sideWallMainWidth) {
        this.sideWallMainWidth = sideWallMainWidth;
    }

    public double getSideWallAuxWidth() {
        return sideWallAuxWidth;
    }

    public void setSideWallAuxWidth(double sideWallAuxWidth) {
        this.sideWallAuxWidth = sideWallAuxWidth;
    }

    public double getDoorOpeningWidth() {
        return doorOpeningWidth;
    }

    public void setDoorOpeningWidth(double doorOpeningWidth) {
        this.doorOpeningWidth = doorOpeningWidth;
    }

    public double getDoorOpeningHeight() {
        return doorOpeningHeight;
    }

    public void setDoorOpeningHeight(double doorOpeningHeight) {
        this.doorOpeningHeight = doorOpeningHeight;
    }

    public double getReturnSideWallDepth() {
        return returnSideWallDepth;
    }

    public void setReturnSideWallDepth(double returnSideWallDepth) {
        this.returnSideWallDepth = returnSideWallDepth;
    }

    public double getSlamSideWallDepth() {
        return slamSideWallDepth;
    }

    public void setSlamSideWallDepth(double slamSideWallDepth) {
        this.slamSideWallDepth = slamSideWallDepth;
    }

    public double getSlideWallWidth() {
        return slideWallWidth;
    }

    public void setSlideWallWidth(double slideWallWidth) {
        this.slideWallWidth = slideWallWidth;
    }

    public String getTypeOfSlamPost() {
        return typeOfSlamPost;
    }

    public void setTypeOfSlamPost(String typeOfSlamPost) {
        this.typeOfSlamPost = typeOfSlamPost;
    }

    public double getSlamPostMeasurementsA() {
        return slamPostMeasurementsA;
    }

    public void setSlamPostMeasurementsA(double slamPostMeasurementsA) {
        this.slamPostMeasurementsA = slamPostMeasurementsA;
    }

    public double getSlamPostMeasurementsB() {
        return slamPostMeasurementsB;
    }

    public void setSlamPostMeasurementsB(double slamPostMeasurementsB) {
        this.slamPostMeasurementsB = slamPostMeasurementsB;
    }

    public double getSlamPostMeasurementsC() {
        return slamPostMeasurementsC;
    }

    public void setSlamPostMeasurementsC(double slamPostMeasurementsC) {
        this.slamPostMeasurementsC = slamPostMeasurementsC;
    }

    public double getSlamPostMeasurementsD() {
        return slamPostMeasurementsD;
    }

    public void setSlamPostMeasurementsD(double slamPostMeasurementsD) {
        this.slamPostMeasurementsD = slamPostMeasurementsD;
    }

    public double getSlamPostMeasurementsE() {
        return slamPostMeasurementsE;
    }

    public void setSlamPostMeasurementsE(double slamPostMeasurementsE) {
        this.slamPostMeasurementsE = slamPostMeasurementsE;
    }

    public double getSlamPostMeasurementsF() {
        return slamPostMeasurementsF;
    }

    public void setSlamPostMeasurementsF(double slamPostMeasurementsF) {
        this.slamPostMeasurementsF = slamPostMeasurementsF;
    }

    public double getSlamPostMeasurementsG() {
        return slamPostMeasurementsG;
    }

    public void setSlamPostMeasurementsG(double slamPostMeasurementsG) {
        this.slamPostMeasurementsG = slamPostMeasurementsG;
    }

    public double getSlamPostMeasurementsH() {
        return slamPostMeasurementsH;
    }

    public void setSlamPostMeasurementsH(double slamPostMeasurementsH) {
        this.slamPostMeasurementsH = slamPostMeasurementsH;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ContentValues generateContentValuesFromObject() {
        ContentValues values = new ContentValues();
        values.put("projectId", getProjectId());
        values.put("interiorCarId", getInteriorCarId());
        values.put("doorStyle", getDoorStyle());

        values.put("centerOpening", getCenterOpening());
        values.put("width", getWidth());
        values.put("height", getHeight());
        values.put("sideWallMainWidth", getSideWallMainWidth());
        values.put("sideWallAuxWidth", getSideWallAuxWidth());
        values.put("doorOpeningWidth", getDoorOpeningWidth());
        values.put("doorOpeningHeight", getDoorOpeningHeight());
        values.put("returnSideWallDepth", getReturnSideWallDepth());
        values.put("slamSideWallDepth", getSlamSideWallDepth());
        values.put("slideWallWidth", getSlideWallWidth());
        values.put("typeOfSlamPost", getTypeOfSlamPost());
        values.put("slamPostMeasurementsA", getSlamPostMeasurementsA());
        values.put("slamPostMeasurementsB", getSlamPostMeasurementsB());
        values.put("slamPostMeasurementsC", getSlamPostMeasurementsC());
        values.put("slamPostMeasurementsD", getSlamPostMeasurementsD());
        values.put("slamPostMeasurementsE", getSlamPostMeasurementsE());
        values.put("slamPostMeasurementsF", getSlamPostMeasurementsF());
        values.put("slamPostMeasurementsG", getSlamPostMeasurementsG());
        values.put("slamPostMeasurementsH", getSlamPostMeasurementsH());
        values.put("otherSlamPost" , getOtherSlamPost());
        values.put("typeOfFrontReturn" , getTypeOfFrontReturn());
        values.put("leftSideA" , getLeftSideA());
        values.put("leftSideB" , getLeftSideB());
        values.put("leftSideC" , getLeftSideC());
        values.put("leftSideD" , getLeftSideD());
        values.put("leftSideE" , getLeftSideE());
        values.put("rightSideA" , getRightSideA());
        values.put("rightSideB" , getRightSideB());
        values.put("rightSideC" , getRightSideC());
        values.put("rightSideD" , getRightSideD());
        values.put("rightSideE" , getRightSideE());

        values.put("leftSideATypeB" , getLeftSideATypeB());
        values.put("leftSideBTypeB" , getLeftSideBTypeB());
        values.put("leftSideCTypeB" , getLeftSideCTypeB());

        values.put("rightSideATypeB" , getRightSideATypeB());
        values.put("rightSideBTypeB" , getRightSideBTypeB());
        values.put("rightSideCTypeB" , getRightSideCTypeB());

        values.put("frontReturnMeasurementsHeight" , getFrontReturnMeasurementsHeight());
        values.put("otherFrontReturnMeasurements" , getOtherFrontReturnMeasurements());
        values.put("carDoorType" , getCarDoorType());
        values.put("carDoorOpeningDirection" , getCarDoorOpeningDirection());
        values.put("transomMeasurementsHeight" , getTransomMeasurementsHeight());
        values.put("transomMeasurementsWidth" , getTransomMeasurementsWidth());
        values.put("transomMeasurementsLeft" , getTransomMeasurementsLeft());
        values.put("transomMeasurementsCenterLeft" , getTransomMeasurementsCenterLeft());
        values.put("transomMeasurementsCenterRight" , getTransomMeasurementsCenterRight());
        values.put("transomMeasurementsRight" , getTransomMeasurementsRight());
        values.put("transomMeasurementsCenter" , getTransomMeasurementsCenter());
        values.put("transomProfileHeight" , getTransomProfileHeight());
        values.put("transomProfileDepth" , getTransomProfileDepth());
        values.put("transomProfileReturn" , getTransomProfileReturn());
        values.put("transomProfileColonnade" , getTransomProfileColonnade());
        values.put("transomProfileColonnade2" , getTransomProfileColonnade2());
        values.put("isThereNewCop" , getIsThereNewCop());
        values.put("mainCopWidth" , getMainCopWidth());
        values.put("mainCopHeight" , getMainCopHeight());
        values.put("mainCopLeft" , getMainCopLeft());
        values.put("mainCopRight" , getMainCopRight());
        values.put("mainCopTop" , getMainCopTop());
        values.put("mainCopBottom" , getMainCopBottom());
        values.put("mainCopThroat" , getMainCopThroat());
        values.put("mainCopReturn" , getMainCopReturn());
        values.put("auxCopWidth" , getAuxCopWidth());
        values.put("auxCopHeight" , getAuxCopHeight());
        values.put("auxCopLeft" , getAuxCopLeft());
        values.put("auxCopRight" , getAuxCopRight());
        values.put("auxCopTop" , getAuxCopTop());
        values.put("auxCopBottom" , getAuxCopBottom());
        values.put("auxCopThroat" , getAuxCopThroat());
        values.put("auxCopReturn" , getAuxCopReturn());

        values.put("notes", getNotes());
        values.put("uuid", getUuid());
        return values;
    }

    public InteriorCarDoorData() {
    }

    public InteriorCarDoorData(Cursor cursor) {
        super();

        setId(cursor.getInt(cursor.getColumnIndex("id")));
        setProjectId(cursor.getInt(cursor.getColumnIndex("projectId")));
        setInteriorCarId(cursor.getInt(cursor.getColumnIndex("interiorCarId")));
        setDoorStyle(cursor.getInt(cursor.getColumnIndex("doorStyle")));

        setCenterOpening(cursor.getInt(cursor.getColumnIndex("centerOpening")));
        setWidth(cursor.getDouble(cursor.getColumnIndex("width")));
        setHeight(cursor.getDouble(cursor.getColumnIndex("height")));
        setSideWallMainWidth(cursor.getDouble(cursor.getColumnIndex("sideWallMainWidth")));
        setSideWallAuxWidth(cursor.getDouble(cursor.getColumnIndex("sideWallAuxWidth")));
        setDoorOpeningHeight(cursor.getDouble(cursor.getColumnIndex("doorOpeningHeight")));
        setDoorOpeningWidth(cursor.getDouble(cursor.getColumnIndex("doorOpeningWidth")));
        setReturnSideWallDepth(cursor.getDouble(cursor.getColumnIndex("returnSideWallDepth")));
        setSlamSideWallDepth(cursor.getDouble(cursor.getColumnIndex("slamSideWallDepth")));
        setSlideWallWidth(cursor.getDouble(cursor.getColumnIndex("slideWallWidth")));
        setTypeOfSlamPost(cursor.getString(cursor.getColumnIndex("typeOfSlamPost")));
        setSlamPostMeasurementsA(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsA")));
        setSlamPostMeasurementsB(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsB")));
        setSlamPostMeasurementsC(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsC")));
        setSlamPostMeasurementsD(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsD")));
        setSlamPostMeasurementsE(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsE")));
        setSlamPostMeasurementsF(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsF")));
        setSlamPostMeasurementsG(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsG")));
        setSlamPostMeasurementsH(cursor.getDouble(cursor.getColumnIndex("slamPostMeasurementsH")));
        setOtherSlamPost(cursor.getString(cursor.getColumnIndex("otherSlamPost")));
        setTypeOfFrontReturn(cursor.getString(cursor.getColumnIndex("typeOfFrontReturn")));
        setLeftSideA(cursor.getDouble(cursor.getColumnIndex("leftSideA")));
        setLeftSideB(cursor.getDouble(cursor.getColumnIndex("leftSideB")));
        setLeftSideC(cursor.getDouble(cursor.getColumnIndex("leftSideC")));
        setLeftSideD(cursor.getDouble(cursor.getColumnIndex("leftSideD")));
        setLeftSideE(cursor.getDouble(cursor.getColumnIndex("leftSideE")));

        setRightSideA(cursor.getDouble(cursor.getColumnIndex("rightSideA")));
        setRightSideB(cursor.getDouble(cursor.getColumnIndex("rightSideB")));
        setRightSideC(cursor.getDouble(cursor.getColumnIndex("rightSideC")));
        setRightSideD(cursor.getDouble(cursor.getColumnIndex("rightSideD")));
        setRightSideE(cursor.getDouble(cursor.getColumnIndex("rightSideE")));

        setLeftSideATypeB(cursor.getDouble(cursor.getColumnIndex("leftSideATypeB")));
        setLeftSideBTypeB(cursor.getDouble(cursor.getColumnIndex("leftSideBTypeB")));
        setLeftSideCTypeB(cursor.getDouble(cursor.getColumnIndex("leftSideCTypeB")));


        setRightSideATypeB(cursor.getDouble(cursor.getColumnIndex("rightSideATypeB")));
        setRightSideBTypeB(cursor.getDouble(cursor.getColumnIndex("rightSideBTypeB")));
        setRightSideCTypeB(cursor.getDouble(cursor.getColumnIndex("rightSideCTypeB")));

        setFrontReturnMeasurementsHeight(cursor.getDouble(cursor.getColumnIndex("frontReturnMeasurementsHeight")));
        setOtherFrontReturnMeasurements(cursor.getString(cursor.getColumnIndex("otherFrontReturnMeasurements")));
        setCarDoorType(cursor.getInt(cursor.getColumnIndex("carDoorType")));
        setCarDoorOpeningDirection(cursor.getInt(cursor.getColumnIndex("carDoorOpeningDirection")));
        setTransomMeasurementsHeight(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsHeight")));
        setTransomMeasurementsWidth(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsWidth")));
        setTransomMeasurementsLeft(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsLeft")));
        setTransomMeasurementsCenterLeft(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsCenterLeft")));
        setTransomMeasurementsCenterRight(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsCenterRight")));
        setTransomMeasurementsRight(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsRight")));
        setTransomMeasurementsCenter(cursor.getDouble(cursor.getColumnIndex("transomMeasurementsCenter")));

        setTransomProfileHeight(cursor.getDouble(cursor.getColumnIndex("transomProfileHeight")));
        setTransomProfileDepth(cursor.getDouble(cursor.getColumnIndex("transomProfileDepth")));
        setTransomProfileReturn(cursor.getDouble(cursor.getColumnIndex("transomProfileReturn")));
        setTransomProfileColonnade(cursor.getDouble(cursor.getColumnIndex("transomProfileColonnade")));
        setTransomProfileColonnade2(cursor.getDouble(cursor.getColumnIndex("transomProfileColonnade2")));

        setIsThereNewCop(cursor.getString(cursor.getColumnIndex("isThereNewCop")));

        setMainCopWidth(cursor.getDouble(cursor.getColumnIndex("mainCopWidth")));
        setMainCopHeight(cursor.getDouble(cursor.getColumnIndex("mainCopHeight")));
        setMainCopLeft(cursor.getDouble(cursor.getColumnIndex("mainCopLeft")));
        setMainCopRight(cursor.getDouble(cursor.getColumnIndex("mainCopRight")));
        setMainCopTop(cursor.getDouble(cursor.getColumnIndex("mainCopTop")));
        setMainCopBottom(cursor.getDouble(cursor.getColumnIndex("mainCopBottom")));
        setMainCopThroat(cursor.getDouble(cursor.getColumnIndex("mainCopThroat")));
        setMainCopReturn(cursor.getDouble(cursor.getColumnIndex("mainCopReturn")));

        setAuxCopWidth(cursor.getDouble(cursor.getColumnIndex("auxCopWidth")));
        setAuxCopHeight(cursor.getDouble(cursor.getColumnIndex("auxCopHeight")));
        setAuxCopLeft(cursor.getDouble(cursor.getColumnIndex("auxCopLeft")));
        setAuxCopRight(cursor.getDouble(cursor.getColumnIndex("auxCopRight")));
        setAuxCopTop(cursor.getDouble(cursor.getColumnIndex("auxCopTop")));
        setAuxCopBottom(cursor.getDouble(cursor.getColumnIndex("auxCopBottom")));
        setAuxCopThroat(cursor.getDouble(cursor.getColumnIndex("auxCopThroat")));
        setAuxCopReturn(cursor.getDouble(cursor.getColumnIndex("auxCopReturn")));

        setNotes(cursor.getString(cursor.getColumnIndex("notes")));
        setUuid(cursor.getString(cursor.getColumnIndex("uuid")));
    }
    public JSONArray getPostJSON(){
        JSONArray jsonArray = new JSONArray();
        try {
            jsonArray.put(0, getJSON("opening", "1"));
            jsonArray.put(1, getJSON("center_opening", getCenterOpening()==1?"YES":"NO"));
            jsonArray.put(2, getJSON("width", getWidth()+""));
            jsonArray.put(3, getJSON("height", getHeight()+""));
            jsonArray.put(4, getJSON("side_wall_main_width", getCenterOpening()==1?getSideWallMainWidth()+"":"0.0"));
            jsonArray.put(5, getJSON("side_wall_aux_width", getCenterOpening()==1?getSideWallAuxWidth()+"":"0.0"));
            jsonArray.put(6, getJSON("return_side_wall_depth", getCenterOpening()==2?getReturnSideWallDepth()+"":"0.0"));
            jsonArray.put(7, getJSON("slam_side_wall_depth", getCenterOpening()==2?getSlamSideWallDepth()+"":"0.0"));
            jsonArray.put(8, getJSON("slide_wall_width", getCenterOpening()==2?getSlideWallWidth()+"":"0.0"));
            jsonArray.put(9, getJSON("door_opening_width", getDoorOpeningWidth()+""));
            jsonArray.put(10, getJSON("door_opening_height", getDoorOpeningHeight()+""));
            jsonArray.put(11, getJSON("type_of_slam_post", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getTypeOfSlamPost():""));
            jsonArray.put(12, getJSON("type_of_slam_post_image", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getTypeOfSlamPost():""));
            jsonArray.put(13, getJSON("other_slam_post", getCenterOpening()==2&&getTypeOfSlamPost().equals("OTHER")?getOtherSlamPost():""));
            jsonArray.put(14, getJSON("slam_post_measurements_A", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getSlamPostMeasurementsA()+"":"0.0"));
            jsonArray.put(15, getJSON("slam_post_measurements_B", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getSlamPostMeasurementsB()+"":"0.0"));
            jsonArray.put(16, getJSON("slam_post_measurements_C", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getSlamPostMeasurementsC()+"":"0.0"));
            jsonArray.put(17, getJSON("slam_post_measurements_D", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")&&!getTypeOfSlamPost().equals("C")?getSlamPostMeasurementsD()+"":"0.0"));
            jsonArray.put(18, getJSON("slam_post_measurements_E", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")&&!getTypeOfSlamPost().equals("C")?getSlamPostMeasurementsE()+"":"0.0"));
            jsonArray.put(19, getJSON("slam_post_measurements_F", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")&&!getTypeOfSlamPost().equals("C")?getSlamPostMeasurementsF()+"":"0.0"));
            jsonArray.put(20, getJSON("slam_post_measurements_G", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getSlamPostMeasurementsG()+"":"0.0"));
            jsonArray.put(21, getJSON("slam_post_measurements_H", getCenterOpening()==2&&!getTypeOfSlamPost().equals("OTHER")?getSlamPostMeasurementsH()+"":"0.0"));
            jsonArray.put(22, getJSON("type_of_front_return", !getTypeOfFrontReturn().equals("OTHER")?getTypeOfFrontReturn():""));

            jsonArray.put(23, getJSON("leftside_image", !getTypeOfFrontReturn().equals("OTHER")?getTypeOfFrontReturn():""));

            jsonArray.put(24, getJSON("left_side_A", !getTypeOfFrontReturn().equals("OTHER")?getLeftSideA()+"":"0.0"));
            jsonArray.put(25, getJSON("left_side_B", !getTypeOfFrontReturn().equals("OTHER")?getLeftSideB()+"":"0.0"));
            jsonArray.put(26, getJSON("left_side_C", !getTypeOfFrontReturn().equals("OTHER")?getLeftSideC()+"":"0.0"));
            jsonArray.put(27, getJSON("left_side_D", !getTypeOfFrontReturn().equals("OTHER")&&!getTypeOfFrontReturn().equals("B")?getLeftSideD()+"":"0.0"));
            jsonArray.put(28, getJSON("left_side_E", !getTypeOfFrontReturn().equals("OTHER")&&!getTypeOfFrontReturn().equals("B")?getLeftSideE()+"":"0.0"));

            jsonArray.put(29, getJSON("rightside_image", getCenterOpening()==1&&!getTypeOfFrontReturn().equals("OTHER")?getTypeOfFrontReturn():""));

            jsonArray.put(30, getJSON("right_side_A", getCenterOpening()==1?getRightSideA()+"":"0.0"));
            jsonArray.put(31, getJSON("right_side_B", getCenterOpening()==1?getRightSideB()+"":"0.0"));
            jsonArray.put(32, getJSON("right_side_C", getCenterOpening()==1?getRightSideC()+"":"0.0"));
            jsonArray.put(33, getJSON("right_side_D", getCenterOpening()==1&&!getTypeOfFrontReturn().equals("B")?getRightSideD()+"":"0.0"));
            jsonArray.put(34, getJSON("right_side_E", getCenterOpening()==1&&!getTypeOfFrontReturn().equals("B")?getRightSideE()+"":"0.0"));
            jsonArray.put(35, getJSON("front_return_measurements_height", !getTypeOfFrontReturn().equals("OTHER")?getFrontReturnMeasurementsHeight()+"":"0.0"));
            jsonArray.put(36, getJSON("other_front_return_measurements", getTypeOfFrontReturn().equals("OTHER")?getOtherFrontReturnMeasurements():""));
            String str = "";
            if(getCarDoorType() == 2)
                str = "Single Speed";
            else if(getCarDoorType() == 1)
                str = "Two Speed";
            jsonArray.put(37, getJSON("car_door_type", str));
            str = "";
            if(getCarDoorOpeningDirection() == 1)
                str = "Slides Open To Left";
            else if(getCarDoorOpeningDirection() == 2)
                str = "Slides Open To Right";
            jsonArray.put(38, getJSON("car_door_opening_direction",getCenterOpening()==2?str:""));

            jsonArray.put(39, getJSON("transom_image", getCarDoorType() == 2? "1s":"2s"));

            jsonArray.put(40, getJSON("transom_measurements_height", getTransomMeasurementsHeight()+""));
            jsonArray.put(41, getJSON("transom_measurements_width", getTransomMeasurementsWidth()+""));
            jsonArray.put(42, getJSON("transom_measurements_left", getTransomMeasurementsLeft()+""));
            jsonArray.put(43, getJSON("transom_measurements_center_left", getCenterOpening()==1?getTransomMeasurementsCenterLeft() + "":"0.0"));
            jsonArray.put(44, getJSON("transom_measurements_center", getCenterOpening()==2?getTransomMeasurementsCenter()+"":"0.0"));
            jsonArray.put(45, getJSON("transom_measurements_center_right", getCenterOpening()==1?getTransomMeasurementsCenterRight()+"":"0.0"));
            jsonArray.put(46, getJSON("transom_measurements_right", getTransomMeasurementsRight() + ""));

            jsonArray.put(47, getJSON("transom_profile_image", getCarDoorType() == 2? "1s":"2s"));

            jsonArray.put(48, getJSON("transom_profile_height", getTransomProfileHeight()+""));
            jsonArray.put(49, getJSON("transom_profile_depth", getTransomProfileDepth()+""));
            jsonArray.put(50, getJSON("transom_profile_return", getTransomProfileReturn()+""));
            jsonArray.put(51, getJSON("transom_profile_colonnade", getTransomProfileColonnade()+""));
            jsonArray.put(52, getJSON("transom_profile_colonnade2", getCarDoorType()==1?getTransomProfileColonnade2()+"":"0.0"));
            jsonArray.put(53, getJSON("is_there_new_cop", getIsThereNewCop()));

            jsonArray.put(54, getJSON("cop_width", getIsThereNewCop().equals("YES")?"Main="+getMainCopWidth()+",Aux="+getAuxCopWidth():"0.0"));
            jsonArray.put(55, getJSON("cop_height", getIsThereNewCop().equals("YES")?"Main="+getMainCopHeight()+",Aux="+getAuxCopHeight():"0.0"));
            jsonArray.put(56, getJSON("cop_left", getIsThereNewCop().equals("YES")?"Main="+getMainCopLeft()+",Aux="+getAuxCopLeft():"0.0"));
            jsonArray.put(57, getJSON("cop_right", getIsThereNewCop().equals("YES")?"Main="+getMainCopRight()+",Aux="+getAuxCopRight():"0.0"));
            jsonArray.put(58, getJSON("cop_top", getIsThereNewCop().equals("YES")?"Main="+getMainCopTop()+",Aux="+getAuxCopTop():"0.0"));
            jsonArray.put(59, getJSON("cop_bottom", getIsThereNewCop().equals("YES")?"Main="+getMainCopBottom()+",Aux="+getAuxCopBottom():"0.0"));
            jsonArray.put(60, getJSON("cop_throat", getIsThereNewCop().equals("YES")?"Main="+getMainCopThroat()+",Aux="+getAuxCopThroat():"0.0"));
            jsonArray.put(61, getJSON("cop_return", getIsThereNewCop().equals("YES")?"Main="+getMainCopReturn()+",Aux="+getAuxCopReturn():"0.0"));

/*
            jsonArray.put(48, getJSON("main_cop_width", getMainCopWidth()+""));
            jsonArray.put(49, getJSON("main_cop_height", getMainCopHeight()+""));
            jsonArray.put(50, getJSON("main_cop_left", getMainCopLeft()+""));
            jsonArray.put(51, getJSON("main_cop_right", getMainCopRight()+""));
            jsonArray.put(52, getJSON("main_cop_top", getMainCopTop()+""));
            jsonArray.put(53, getJSON("main_cop_bottom", getMainCopBottom()+""));
            jsonArray.put(51, getJSON("main_cop_throat", getMainCopThroat()+""));
            jsonArray.put(55, getJSON("main_cop_return", getMainCopReturn()+""));
            jsonArray.put(56, getJSON("aux_cop_width", getAuxCopWidth()+""));
            jsonArray.put(57, getJSON("aux_cop_height", getAuxCopHeight()+""));
            jsonArray.put(58, getJSON("aux_cop_left", getAuxCopLeft()+""));
            jsonArray.put(59, getJSON("aux_cop_right", getAuxCopRight()+""));
            jsonArray.put(60, getJSON("aux_cop_top", getAuxCopTop()+""));
            jsonArray.put(61, getJSON("aux_cop_bottom", getAuxCopBottom()+""));
            jsonArray.put(62, getJSON("aux_cop_throat", getAuxCopThroat()+""));
            jsonArray.put(63, getJSON("aux_cop_return", getAuxCopReturn()+""));
*/

            for (int i = 0; i < getPhotosList().size(); i++){
                PhotoData photoData = getPhotosList().get(i);
                jsonArray.put(i+62, photoData.getPostJSON(i + 1));
            }


        }catch(Exception e){
            e.printStackTrace();
        }

        return jsonArray;
    }
}

