package com.mad.survey.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

public class CustomSQLiteHelper extends SQLiteOpenHelper {
 
    // Database Version
    private static final int DATABASE_VERSION = 7;
    // Database Name
    private static final String DATABASE_NAME = "MADSurvey";
 
    public CustomSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);  
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create Bank Info Table

        String CREATE_BANK_TABLE = "CREATE TABLE IF NOT EXISTS " + BankDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "name TEXT NOT NULL DEFAULT '', " +
                "numOfElevator INTEGER NOT NULL DEFAULT 0, " +
                "numOfCar INTEGER NOT NULL DEFAULT 0, " +
                "numOfInteriorCar INTEGER NOT NULL DEFAULT 0, " +
                "bankNum INTEGER NOT NULL DEFAULT 0, " +
                "description TEXT NOT NULL DEFAULT '', " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "numOfRiser INTEGER NOT NULL DEFAULT 0)";
        db.execSQL(CREATE_BANK_TABLE);

        // Create Project Data table
        String CREATE_PROJECT_TABLE = "CREATE TABLE IF NOT EXISTS " + ProjectDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "no INTEGER NOT NULL DEFAULT 0, " +
                "name TEXT NOT NULL DEFAULT '', " +
                "companyName TEXT NOT NULL DEFAULT '', " +
                "status TEXT NOT NULL DEFAULT '', " +
                "companyContact TEXT NOT NULL DEFAULT '', " +
                "scaleUnit TEXT NOT NULL DEFAULT '', " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "jobType INTEGER NOT NULL DEFAULT 0, " +
                "numBanks INTEGER NOT NULL DEFAULT 0, " +
                "numFloors INTEGER NOT NULL DEFAULT 0, " +
                "numLobbyPanels INTEGER NOT NULL DEFAULT 0, " +
                "lobbyPanels INTEGER NOT NULL DEFAULT 0, " +
                "hallStations INTEGER NOT NULL DEFAULT 0, " +
                "hallLanterns INTEGER NOT NULL DEFAULT 0, " +
                "cops INTEGER NOT NULL DEFAULT 0, " +
                "hallEntrances INTEGER NOT NULL DEFAULT 0, " +
                "cabInteriors INTEGER NOT NULL DEFAULT 0, " +
                "surveyDate TEXT NOT NULL DEFAULT ''," +
                "submitTime TEXT NOT NULL DEFAULT ''," +
                "uuid TEXT NOT NULL DEFAULT '')";

        db.execSQL(CREATE_PROJECT_TABLE);

        // Create Photo Data table
        String CREATE_PHOTO_TABLE = "CREATE TABLE IF NOT EXISTS " + PhotoDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "linkedId INTEGER NOT NULL DEFAULT 0, " +
                "type INTEGER NOT NULL DEFAULT 0, " +
                "isRearEntrance INTEGER NOT NULL DEFAULT 0, " +
                "picNum TEXT NOT NULL DEFAULT '', " +
                "fileURL TEXT NOT NULL DEFAULT '', " +
                "fileName TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_PHOTO_TABLE);

        // Create Lobby Data table
        String CREATE_LOBBY_TABLE = "CREATE TABLE IF NOT EXISTS " + LobbyDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "lobbyNum INTEGER NOT NULL DEFAULT 0, " +
                "visibility INTEGER NOT NULL DEFAULT 0, " +
                "panelWidth DOUBLE NOT NULL DEFAULT 0, " +
                "panelHeight DOUBLE NOT NULL DEFAULT 0, " +
                "screwCenterWidth DOUBLE NOT NULL DEFAULT 0, " +
                "screwCenterHeight DOUBLE NOT NULL DEFAULT 0, " +
                "specialFeature TEXT NOT NULL DEFAULT '', " +
                "specialCommunicationOption TEXT NOT NULL DEFAULT '', " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "location TEXT NOT NULL DEFAULT '')";


        db.execSQL(CREATE_LOBBY_TABLE);
        // Create HallStation Data table
        String CREATE_HALLSTATION_TABLE = "CREATE TABLE IF NOT EXISTS " + HallStationDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "hallStationNum INTEGER NOT NULL DEFAULT 0, " +
                "floorNum INTEGER NOT NULL DEFAULT 0, " +
                "floorNumber TEXT NOT NULL DEFAULT '', " +
                "description TEXT NOT NULL DEFAULT '', " +
                "mount TEXT NOT NULL DEFAULT '', " +
                "wallFinish TEXT NOT NULL DEFAULT '', " +
                "width DOUBLE NOT NULL DEFAULT 0, " +
                "height DOUBLE NOT NULL DEFAULT 0, " +
                "screwCenterWidth DOUBLE NOT NULL DEFAULT 0, " +
                "screwCenterHeight DOUBLE NOT NULL DEFAULT 0, " +
                "affValue DOUBLE NOT NULL DEFAULT 0, " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "sameAs TEXT NOT NULL DEFAULT '',"+
                "uuid TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_HALLSTATION_TABLE);


        // Create HallLantern Data table
        String CREATE_LANTERN_TABLE = "CREATE TABLE IF NOT EXISTS " + LanternDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "lanternNum INTEGER NOT NULL DEFAULT 0, " +
                "floorNum INTEGER NOT NULL DEFAULT 0, " +
                "floorNumber TEXT NOT NULL DEFAULT '', " +
                "description TEXT NOT NULL DEFAULT '', " +
                "mount TEXT NOT NULL DEFAULT '', " +
                "wallFinish TEXT NOT NULL DEFAULT '', " +
                "width DOUBLE NOT NULL DEFAULT 0, " +
                "height DOUBLE NOT NULL DEFAULT 0, " +
                "depth DOUBLE NOT NULL DEFAULT 0, " +
                "quantity INTEGER NOT NULL DEFAULT 0, " +
                "screwCenterWidth DOUBLE NOT NULL DEFAULT 0, " +
                "screwCenterHeight DOUBLE NOT NULL DEFAULT 0, " +
                "spaceAvailableWidth DOUBLE NOT NULL DEFAULT 0, " +
                "spaceAvailableHeight DOUBLE NOT NULL DEFAULT 0, " +
                "affValue DOUBLE NOT NULL DEFAULT 0, " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "sameAs TEXT NOT NULL DEFAULT ''," +
                "uuid TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_LANTERN_TABLE);

        String CREATE_CAR_TABLE = "CREATE TABLE IF NOT EXISTS " + CarDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "carNum INTEGER NOT NULL DEFAULT 0, " +
                "carNumber TEXT NOT NULL DEFAULT '', " +
                "weightScale TEXT NOT NULL DEFAULT '', " +
                "capacityWeight DOUBLE NOT NULL DEFAULT 0, " +
                "capacityNumberPersons INTEGER NOT NULL DEFAULT 0, " +
                "installNumber TEXT NOT NULL DEFAULT '', " +
                "description TEXT NOT NULL DEFAULT '', " +
                "doorsCoinciding TEXT NOT NULL DEFAULT '', " +
                "numberOfOpenings INTEGER NOT NULL DEFAULT 0, " +
                "numberOfCops INTEGER NOT NULL DEFAULT 0, " +
                "floorMarkings TEXT NOT NULL DEFAULT '', " +
                "frontDoorOpeningHeight DOUBLE NOT NULL DEFAULT 0, " +
                "frontDoorSlideJambWidth DOUBLE NOT NULL DEFAULT 0, " +
                "frontDoorStrikeJambWidth DOUBLE NOT NULL DEFAULT 0, " +
                "rearDoorOpeningHeight DOUBLE , " +
                "rearDoorSlideJambWidth DOUBLE , " +
                "rearDoorStrikeJambWidth DOUBLE , " +
                "handRailHeightFromFloor DOUBLE , " +
                "handRailDistanceFromWall DOUBLE , " +
                "handRailDistanceFromReturn DOUBLE , " +
                "isThereHandRail INTEGER NOT NULL DEFAULT 0, " +
                "isThereRearDoor INTEGER NOT NULL DEFAULT 0, " +
                "isThereCDI INTEGER NOT NULL DEFAULT 0, " +
                "isThereSPI INTEGER NOT NULL DEFAULT 0, " +
                "mountCDI TEXT NOT NULL DEFAULT '', " +
                "numberPerCabCDI INTEGER NOT NULL DEFAULT 0, " +
                "coverWidthCDI DOUBLE NOT NULL DEFAULT 0, " +
                "coverHeightCDI DOUBLE NOT NULL DEFAULT 0, " +
                "depthCDI DOUBLE NOT NULL DEFAULT 0, " +
                "coverScrewCenterWidthCDI DOUBLE NOT NULL DEFAULT 0, " +
                "coverScrewCenterHeightCDI DOUBLE NOT NULL DEFAULT 0, " +
                "notesCDI TEXT NOT NULL DEFAULT '', " +
                "mountSPI TEXT NOT NULL DEFAULT '', " +
                "numberPerCabSPI INTEGER NOT NULL DEFAULT 0, " +
                "coverWidthSPI DOUBLE NOT NULL DEFAULT 0, " +
                "coverHeightSPI DOUBLE NOT NULL DEFAULT 0, " +
                "depthSPI DOUBLE NOT NULL DEFAULT 0, " +
                "coverScrewCenterWidthSPI DOUBLE NOT NULL DEFAULT 0, " +
                "coverScrewCenterHeightSPI DOUBLE NOT NULL DEFAULT 0, " +
                "spaceAvailableWidthSPI DOUBLE NOT NULL DEFAULT 0, " +
                "spaceAvailableHeightSPI DOUBLE NOT NULL DEFAULT 0, " +
                "notesSPI TEXT NOT NULL DEFAULT '', " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "uuid TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_CAR_TABLE);

        String CREATE_INTERIOR_CAR_DOOR_TABLE = "CREATE TABLE IF NOT EXISTS " + InteriorCarDoorDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "interiorCarId INTEGER NOT NULL DEFAULT 0, " +
                "doorStyle INTEGER NOT NULL DEFAULT 0, " +
                "centerOpening INTEGER NOT NULL DEFAULT 0, " +
                "width DOUBLE NOT NULL DEFAULT 0, " +
                "height DOUBLE NOT NULL DEFAULT 0, " +
                "sideWallMainWidth DOUBLE NOT NULL DEFAULT 0, " +
                "sideWallAuxWidth DOUBLE NOT NULL DEFAULT 0, " +
                "doorOpeningWidth DOUBLE NOT NULL DEFAULT 0, " +
                "doorOpeningHeight DOUBLE NOT NULL DEFAULT 0, " +
                "returnSideWallDepth DOUBLE NOT NULL DEFAULT 0, " +
                "slamSideWallDepth DOUBLE NOT NULL DEFAULT 0, " +
                "slideWallWidth DOUBLE NOT NULL DEFAULT 0, " +
                "typeOfSlamPost TEXT NOT NULL DEFAULT '', " +
                "otherSlamPost TEXT NOT NULL DEFAULT '', " +
                "slamPostMeasurementsA DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsB DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsC DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsD DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsE DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsF DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsG DOUBLE NOT NULL DEFAULT 0, " +
                "slamPostMeasurementsH DOUBLE NOT NULL DEFAULT 0, " +
                "typeOfFrontReturn TEXT NOT NULL DEFAULT '', " +
                "leftSideA DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideB DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideC DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideD DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideE DOUBLE NOT NULL DEFAULT 0, " +

                "leftSideATypeB DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideBTypeB DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideCTypeB DOUBLE NOT NULL DEFAULT 0, " +

                "rightSideA DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideB DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideC DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideD DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideE DOUBLE NOT NULL DEFAULT 0, " +

                "rightSideATypeB DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideBTypeB DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideCTypeB DOUBLE NOT NULL DEFAULT 0, " +

                "frontReturnMeasurementsHeight DOUBLE NOT NULL DEFAULT 0, " +
                "otherFrontReturnMeasurements TEXT NOT NULL DEFAULT '', " +
                "carDoorType INTEGER NOT NULL DEFAULT 0, " +
                "carDoorOpeningDirection INTEGER NOT NULL DEFAULT 0, " +
                "transomMeasurementsHeight DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsWidth DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsLeft DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsCenterLeft DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsCenterRight DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsRight DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsCenter DOUBLE NOT NULL DEFAULT 0, " +
                "transomProfileHeight DOUBLE NOT NULL DEFAULT 0, " +
                "transomProfileDepth DOUBLE NOT NULL DEFAULT 0, " +
                "transomProfileReturn DOUBLE NOT NULL DEFAULT 0, " +
                "transomProfileColonnade DOUBLE NOT NULL DEFAULT 0, " +
                "transomProfileColonnade2 DOUBLE NOT NULL DEFAULT 0, " +
                "isThereNewCop TEXT NOT NULL DEFAULT '', " +
                "mainCopWidth DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopHeight DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopLeft DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopRight DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopTop DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopBottom DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopThroat DOUBLE NOT NULL DEFAULT 0, " +
                "mainCopReturn DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopWidth DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopHeight DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopLeft DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopRight DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopTop DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopBottom DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopThroat DOUBLE NOT NULL DEFAULT 0, " +
                "auxCopReturn DOUBLE NOT NULL DEFAULT 0, " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "uuid TEXT NOT NULL DEFAULT '')";

        db.execSQL(CREATE_INTERIOR_CAR_DOOR_TABLE);


        String CREATE_INTERIOR_CAR_TABLE = "CREATE TABLE IF NOT EXISTS " + InteriorCarDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "interiorCarNum INTEGER NOT NULL DEFAULT 0, " +
                "carDescription INTEGER NOT NULL DEFAULT 0, " +
                "installNumber TEXT NOT NULL DEFAULT '', " +
                "carCapacity TEXT NOT NULL DEFAULT '', " +
                "weightScale TEXT NOT NULL DEFAULT '', " +
                "numberOfPeople TEXT NOT NULL DEFAULT '', " +
                "carWeight DOUBLE NOT NULL DEFAULT 0, " +
                "isThereBackDoor INTEGER NOT NULL DEFAULT 0, " +
                "carFlooring TEXT NOT NULL DEFAULT '', " +
                "carTiller INTEGER NOT NULL DEFAULT 0, " +
                "carFloorHeight DOUBLE NOT NULL DEFAULT 0, " +
                "isThereExhaustFan INTEGER NOT NULL DEFAULT 0, " +
                "exhaustFanLocation TEXT NOT NULL DEFAULT '', " +
                "typeOfCeilingFrame TEXT NOT NULL DEFAULT '', " +
                "mount DOUBLE NOT NULL DEFAULT 0, " +
                "escapeHatchLocation TEXT NOT NULL DEFAULT '', " +
                "typeOfCar TEXT NOT NULL DEFAULT '', " +
                "birdCage TEXT NOT NULL DEFAULT '', " +

                "frontDoorId INTEGER NOT NULL DEFAULT 0, " +
                "backDoorId INTEGER NOT NULL DEFAULT 0, " +

                "rearWallWidth DOUBLE NOT NULL DEFAULT 0, " +
                "rearWallHeight DOUBLE NOT NULL DEFAULT 0, " +

                "notes TEXT NOT NULL DEFAULT '', " +
                "uuid TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_INTERIOR_CAR_TABLE);


        String CREATE_COP_TABLE = "CREATE TABLE IF NOT EXISTS " + CopDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "carNum INTEGER NOT NULL DEFAULT 0, " +
                "copNum INTEGER NOT NULL DEFAULT 0, " +
                "copName TEXT NOT NULL DEFAULT '', " +
                "options TEXT NOT NULL DEFAULT '', " +
                "returnHinging TEXT NOT NULL DEFAULT '', " +
                "returnPanelWidth DOUBLE NOT NULL DEFAULT 0, " +
                "returnPanelHeight DOUBLE NOT NULL DEFAULT 0, " +
                "swingPanelWidth DOUBLE NOT NULL DEFAULT 0, " +
                "swingPanelHeight DOUBLE NOT NULL DEFAULT 0, " +
                "coverWidth DOUBLE NOT NULL DEFAULT 0, " +
                "coverHeight DOUBLE NOT NULL DEFAULT 0, " +
                "coverToOpening DOUBLE NOT NULL DEFAULT 0, " +
                "coverAff DOUBLE NOT NULL DEFAULT 0, " +
                "notes TEXT NOT NULL DEFAULT '', " +
                "uuid TEXT NOT NULL DEFAULT '')";
        db.execSQL(CREATE_COP_TABLE);


        String CREATE_HALL_ENTRANCE_TABLE = "CREATE TABLE IF NOT EXISTS " + HallEntranceDataHandler.TABLE_NAME + " ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "projectId INTEGER NOT NULL DEFAULT 0, " +
                "bankId INTEGER NOT NULL DEFAULT 0, " +
                "carNum INTEGER NOT NULL DEFAULT 0, " +
                "floorNum INTEGER NOT NULL DEFAULT 0, " +
                "floorDescription TEXT NOT NULL DEFAULT '', " +
                "doorType INTEGER NOT NULL DEFAULT 0, " +
                "direction INTEGER NOT NULL DEFAULT 0, " +
                "leftSideA DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideB DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideC DOUBLE NOT NULL DEFAULT 0, " +
                "leftSideD DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideA DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideB DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideC DOUBLE NOT NULL DEFAULT 0, " +
                "rightSideD DOUBLE NOT NULL DEFAULT 0, " +
                "height DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsA DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsB DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsC DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsD DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsE DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsF DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsG DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsH DOUBLE NOT NULL DEFAULT 0, " +
                "transomMeasurementsI DOUBLE NOT NULL DEFAULT 0, " +
                "notes TEXT NOT NULL DEFAULT '')";

        db.execSQL(CREATE_HALL_ENTRANCE_TABLE);

    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older tables if existed
        db.execSQL("DROP TABLE IF EXISTS " + ProjectDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + PhotoDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LobbyDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + BankDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + HallStationDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LanternDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + CarDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + CopDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + InteriorCarDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + InteriorCarDoorDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + HallEntranceDataHandler.TABLE_NAME);
        // create fresh table
        this.onCreate(db);
    }

    public void truncateTable(SQLiteDatabase db, String tableName) {
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        this.onCreate(db);
    }

    public void truncateAllTables(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + ProjectDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + PhotoDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LobbyDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + BankDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + HallStationDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LanternDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + CarDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + CopDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + InteriorCarDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + InteriorCarDoorDataHandler.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + HallEntranceDataHandler.TABLE_NAME);
    	this.onCreate(db);
    }
}