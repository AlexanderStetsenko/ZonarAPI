package Actions;

import Entyties.Project.Development.BuildingWrapper.BuildingObject.BuildingObject;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.GeneralInformation.GeneralInformation;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.ZoningAllowances.ZoningAllowances;
import Entyties.Project.Development.BuildingWrapper.BuildingsWrappers;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Uses.Uses;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZcCalibrations;
import Entyties.Responses.OpenProjectResponse;
import Services.JsonConverter;
import Services.MyAssertation;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.core.Is;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BaseAction {
    JsonConverter jsonConverter = new JsonConverter();
    protected MyAssertation myAssertation = new MyAssertation();

    protected BuildingObject getBuilding(OpenProjectResponse project){

        //Building is got from First Development and First Building!!!

        BuildingObject building = project.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject();
        return building;
    }
    protected BuildingsWrappers getBuildingWrapper(OpenProjectResponse project){

        BuildingsWrappers building = project.getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0);
        return building;
    }
    protected GeneralInformation getGeneralInformation(OpenProjectResponse project){
        GeneralInformation generalInformation = project
                .getProject()
                .getDevelopmentsWrapper().get(0)
                .getBuildingsWrappers().get(0)
                .getBuildingObject()
                .getGeneralInformation();
        return generalInformation;
    }

    //ZcCalibrations
    protected ZcCalibrations getZcCalibrations(OpenProjectResponse project){
        return project.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers().get(0).getCalibrationData().getZcCalibrations();
    }
    protected ZcCalibrations getZcOriginalCalibrations(OpenProjectResponse project){
        return project.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers().get(0).getCalibrationData().getZcOriginalCalibrations();
    }
    protected ZcCalibrations getZcCalibrationsWithoutVariances(OpenProjectResponse project){
        return project.getProject().getDevelopmentsWrapper().get(0).getBuildingsWrappers().get(0).getCalibrationData().getZcCalibrationsWithoutVariances();
    }

    //Uses
    protected Uses getUsesFromZcCalibrations(OpenProjectResponse project){
        Uses uses = getZcCalibrations(project).getUses();
        return uses;
    }
    protected Uses getUsesFromZcOriginalCalibrations(OpenProjectResponse project){
        Uses uses = getZcOriginalCalibrations(project).getUses();
        return uses;
    }
    protected Uses getUsesFromZcOriginalCalibrationsWithoutVariances(OpenProjectResponse project){
        Uses uses = getZcCalibrationsWithoutVariances(project).getUses();
        return uses;
    }

    /*Zoning Allowance*/
    protected ZoningAllowances getZoningAllowance(OpenProjectResponse project){
        ZoningAllowances zoningAllowances = getBuilding(project).getZoningAllowances();
        return zoningAllowances;
    }






}
