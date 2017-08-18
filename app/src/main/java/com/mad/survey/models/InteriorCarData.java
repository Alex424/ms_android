package com.mad.survey.models;

import android.content.ContentValues;
import android.database.Cursor;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;

public class InteriorCarData extends  BaseData implements Serializable {

    private int interiorCarNum = 0;

    private String carDescription = "";
    private String installNumber = "";
    private double carCapacity = 0;
    private String weightScale = "KG";
    private int numberOfPeople = 0;
    private double carWeight = 0;
    private int isThereBackDoor = 0;
    private String carFlooring = "";
    private int carTiller = 0;
    private double carFloorHeight = 0;
    private int isThereExhaustFan = 0;
    private String exhaustFanLocation = "";
    private String typeOfCeilingFrame = "";
    private String mount = "";
    private String escapeHatchLocation = "";
    private String typeOfCar = "";
    private String birdCage = "";

//--------------------------Door Information-----------------

    private int frontDoorId = -1;
    private int backDoorId = -1;

    private InteriorCarDoorData frontDoor = null,backDoor = null;

// ----------------------------------------------
    private double rearWallHeight = 0;
    private double rearWallWidth = 0;

    private String notes = "";
    private String uuid = "";

    public InteriorCarDoorData getFrontDoor() {
        return frontDoor;
    }

    public void setFrontDoor(InteriorCarDoorData frontDoor) {
        this.frontDoor = frontDoor;
    }

    public InteriorCarDoorData getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(InteriorCarDoorData backDoor) {
        this.backDoor = backDoor;
    }

    public double getRearWallHeight() {
        return rearWallHeight;
    }

    public void setRearWallHeight(double rearWallHeight) {
        this.rearWallHeight = rearWallHeight;
    }

    public double getRearWallWidth() {
        return rearWallWidth;
    }

    public void setRearWallWidth(double rearWallWidth) {
        this.rearWallWidth = rearWallWidth;
    }

    public int getFrontDoorId() {
        return frontDoorId;
    }

    public void setFrontDoorId(int frontDoorId) {
        this.frontDoorId = frontDoorId;
    }

    public int getBackDoorId() {
        return backDoorId;
    }

    public void setBackDoorId(int backDoorId) {
        this.backDoorId = backDoorId;
    }

    public String getWeightScale() {
        return weightScale;
    }

    public void setWeightScale(String weightScale) {
        this.weightScale = weightScale;
    }



    public int getInteriorCarNum() {
        return interiorCarNum;
    }

    public void setInteriorCarNum(int interiorCarNum) {
        this.interiorCarNum = interiorCarNum;
    }




    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public String getInstallNumber() {
        return installNumber;
    }

    public void setInstallNumber(String installNumber) {
        this.installNumber = installNumber;
    }

    public double getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(double carCapacity) {
        this.carCapacity = carCapacity;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public int getIsThereBackDoor() {
        return isThereBackDoor;
    }

    public void setIsThereBackDoor(int isThereBackDoor) {
        this.isThereBackDoor = isThereBackDoor;
    }

    public String getCarFlooring() {
        return carFlooring;
    }

    public void setCarFlooring(String carFlooring) {
        this.carFlooring = carFlooring;
    }

    public int getCarTiller() {
        return carTiller;
    }

    public void setCarTiller(int carTiller) {
        this.carTiller = carTiller;
    }

    public double getCarFloorHeight() {
        return carFloorHeight;
    }

    public void setCarFloorHeight(double carFloorHeight) {
        this.carFloorHeight = carFloorHeight;
    }

    public int getIsThereExhaustFan() {
        return isThereExhaustFan;
    }

    public void setIsThereExhaustFan(int isThereExhaustFan) {
        this.isThereExhaustFan = isThereExhaustFan;
    }

    public String getExhaustFanLocation() {
        return exhaustFanLocation;
    }

    public void setExhaustFanLocation(String exhaustFanLocation) {
        this.exhaustFanLocation = exhaustFanLocation;
    }

    public String getTypeOfCeilingFrame() {
        return typeOfCeilingFrame;
    }

    public void setTypeOfCeilingFrame(String typeOfCeilingFrame) {
        this.typeOfCeilingFrame = typeOfCeilingFrame;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public String getEscapeHatchLocation() {
        return escapeHatchLocation;
    }

    public void setEscapeHatchLocation(String escapeHatchLocation) {
        this.escapeHatchLocation = escapeHatchLocation;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getBirdCage() {
        return birdCage;
    }

    public void setBirdCage(String birdCage) {
        this.birdCage = birdCage;
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
        values.put("bankId", getBankId());
        values.put("interiorCarNum", getInteriorCarNum());

        values.put("carDescription", getCarDescription());
        values.put("installNumber", getInstallNumber());
        values.put("carCapacity", getCarCapacity());
        values.put("weightScale", getWeightScale());
        values.put("numberOfPeople", getNumberOfPeople());
        values.put("carWeight", getCarWeight());
        values.put("isThereBackDoor", getIsThereBackDoor());
        values.put("carFlooring", getCarFlooring());
        values.put("carTiller", getCarTiller());
        values.put("carFloorHeight", getCarFloorHeight());
        values.put("isThereExhaustFan", getIsThereExhaustFan());
        values.put("exhaustFanLocation", getExhaustFanLocation());
        values.put("typeOfCeilingFrame", getTypeOfCeilingFrame());
        values.put("mount", getMount());
        values.put("escapeHatchLocation", getEscapeHatchLocation());
        values.put("typeOfCar", getTypeOfCar());
        values.put("birdCage", getBirdCage());

        values.put("frontDoorId" , getFrontDoorId());
        values.put("backDoorId" , getBackDoorId());

        values.put("rearWallHeight" , getRearWallHeight());
        values.put("rearWallWidth" , getRearWallWidth());

        values.put("notes", getNotes());
        values.put("uuid", getUuid());
        return values;
    }

    public InteriorCarData() {
    }

    public InteriorCarData(Cursor cursor) {
        super();
        setId(cursor.getInt(cursor.getColumnIndex("id")));
        setProjectId(cursor.getInt(cursor.getColumnIndex("projectId")));
        setBankId(cursor.getInt(cursor.getColumnIndex("bankId")));
        if(cursor.getColumnIndex("bankDesc")>0)
            setBankDesc(cursor.getString(cursor.getColumnIndex("bankDesc")));
        setInteriorCarNum(cursor.getInt(cursor.getColumnIndex("interiorCarNum")));

        setCarDescription(cursor.getString(cursor.getColumnIndex("carDescription")));
        setInstallNumber(cursor.getString(cursor.getColumnIndex("installNumber")));
        setCarCapacity(cursor.getDouble(cursor.getColumnIndex("carCapacity")));
        setNumberOfPeople(cursor.getInt(cursor.getColumnIndex("numberOfPeople")));
        setCarWeight(cursor.getDouble(cursor.getColumnIndex("carWeight")));
        setWeightScale(cursor.getString(cursor.getColumnIndex("weightScale")));
        setIsThereBackDoor(cursor.getInt(cursor.getColumnIndex("isThereBackDoor")));
        setCarFlooring(cursor.getString(cursor.getColumnIndex("carFlooring")));
        setCarTiller(cursor.getInt(cursor.getColumnIndex("carTiller")));
        setCarFloorHeight(cursor.getDouble(cursor.getColumnIndex("carFloorHeight")));
        setIsThereExhaustFan(cursor.getInt(cursor.getColumnIndex("isThereExhaustFan")));
        setExhaustFanLocation(cursor.getString(cursor.getColumnIndex("exhaustFanLocation")));
        setTypeOfCeilingFrame(cursor.getString(cursor.getColumnIndex("typeOfCeilingFrame")));
        setMount(cursor.getString(cursor.getColumnIndex("mount")));
        setEscapeHatchLocation(cursor.getString(cursor.getColumnIndex("escapeHatchLocation")));
        setTypeOfCar(cursor.getString(cursor.getColumnIndex("typeOfCar")));
        setBirdCage(cursor.getString(cursor.getColumnIndex("birdCage")));

        setFrontDoorId(cursor.getInt(cursor.getColumnIndex("frontDoorId")));
        setBackDoorId(cursor.getInt(cursor.getColumnIndex("backDoorId")));

        setRearWallHeight(cursor.getDouble(cursor.getColumnIndex("rearWallHeight")));
        setRearWallWidth(cursor.getDouble(cursor.getColumnIndex("rearWallWidth")));

        setNotes(cursor.getString(cursor.getColumnIndex("notes")));
        setUuid(cursor.getString(cursor.getColumnIndex("uuid")));
    }

    public JSONObject getPostJSON(){
        JSONObject jsonObject = new JSONObject();

        try {

            JSONArray summaryJSON = new JSONArray();

            summaryJSON.put(0, getJSON("car_number", getCarDescription()));
            summaryJSON.put(1, getJSON("install_number", getInstallNumber()));
            summaryJSON.put(2, getJSON("weight_scale", getWeightScale()));
            summaryJSON.put(3, getJSON("car_capacity", getCarCapacity()+""));
            summaryJSON.put(4, getJSON("number_people", getNumberOfPeople()+""));
            summaryJSON.put(5, getJSON("car_weight", getCarWeight()+""));
            //summaryJSON.put(6, getJSON("is_there_backdoor", getIsThereBackDoor()==1?"true":"false"));
            summaryJSON.put(6, getJSON("car_flooring", getCarFlooring()));
            summaryJSON.put(7, getJSON("car_tiller", getCarTiller() + ""));
            summaryJSON.put(8, getJSON("car_floor_height", getCarFloorHeight() + ""));
            //summaryJSON.put(10, getJSON("is_there_exhaust_fan", getIsThereExhaustFan()==1?"true":"false"));
            summaryJSON.put(9, getJSON("exhaust_fan_location", getIsThereExhaustFan()==1?getExhaustFanLocation():""));
            summaryJSON.put(10, getJSON("type_ceiling_frame", getTypeOfCeilingFrame()));
            summaryJSON.put(11, getJSON("mount", getMount()));
            summaryJSON.put(12, getJSON("escape_hatch_location", getEscapeHatchLocation()));
            summaryJSON.put(13, getJSON("type_car", getTypeOfCar()));
            summaryJSON.put(14, getJSON("bird_cage", getBirdCage()));
            summaryJSON.put(15,getJSON("rear_wall_width",getRearWallWidth()+""));
            summaryJSON.put(16,getJSON("rear_wall_height",getRearWallHeight()+""));
            summaryJSON.put(17,getJSON("notes",getNotes()));
            int i;
            for (i = 0; i < getPhotosList().size(); i++){
                PhotoData photoData = getPhotosList().get(i);
                summaryJSON.put(i+18, photoData.getPostJSON(i + 1));
            }



            if(frontDoor != null) {
                jsonObject.put("front_door", frontDoor.getPostJSON());
            }
            else {
                jsonObject.put("front_door", new JSONArray());
            }
            if(backDoor != null)
                jsonObject.put("back_door", backDoor.getPostJSON());
            else
                jsonObject.put("back_door", new JSONArray());

            jsonObject.put("interior_summary",summaryJSON);

        }catch(Exception e){
            e.printStackTrace();
        }

        return jsonObject;
    }
}

