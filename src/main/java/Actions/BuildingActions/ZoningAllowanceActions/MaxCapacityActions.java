package Actions.BuildingActions.ZoningAllowanceActions;

import Actions.BaseAction;
import Entyties.Responses.OpenProjectResponse;
import ru.yandex.qatools.allure.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Александр on 06.07.2017.
 */
public class MaxCapacityActions extends BaseAction {

    @Step("Check Lot Area PR")
    public void checkLotAreaPR(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getLotAreaPR(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getLotAreaPR()));
    }

    @Step("Check LotArea In Acres")
    public void checkLotAreaInAcres(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getLotAreaAcres(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getLotAreaAcres()));
    }

    @Step("Check Dwelling Units per Acre")
    public void checkDwellingUnitsperAcre(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getDensityNet(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getDensityNet()));
    }

    @Step("Check Dwelling Units Allowed")
    public void checkDwellingUnitsAllowedTest(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getDensityUnits(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getDensityUnits()));
    }

    @Step("Check FLR")
    public void checkFloorAreaRatio(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getFloorAreaRatio(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getFloorAreaRatio()));
    }


    @Step("Check Maximum Built Area")
    public void checkmaximumBuiltArea(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxBuildingAreaAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxBuildingAreaAllowed()));
    }

    @Step("Check Lot Coverage")
    public void checkLotCoverage(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getLotCoverage(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getLotCoverage()));
    }

    @Step("Check Min OpenSpace")
    public void checkMinOpenSpace(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMinOpenSpace(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMinOpenSpace()));
    }

    @Step("Check Principal Building Max. Height (Podium)")
    public void checkPrincipalBuildingMaxHeightPodium(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getPrincipalMaxHeight(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getPrincipalMaxHeight()));
    }


    @Step("Check Principal Building Min. Height (Podium)")
    public void checkPrincipalBuildingMinHeightPodium(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getPrincipalMinHeight(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getPrincipalMinHeight()));
    }

    @Step("Check Principal Tower Height")
    public void checkPrincipalTowerHeight(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getPrincipalTowerHeight(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getPrincipalTowerHeight()));
    }

    @Step("Check Max Building Area Allowed")
    public void checkMaxBuildingAreaAllowed(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxBuildingAreaAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxBuildingAreaAllowed()));
    }

    @Step("Check Max Office Height Allowed")
    public void checkMaxOfficeHeightAllowed(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxOfficeHeightAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxOfficeHeightAllowed()));
    }

    @Step("Check Max Commercial Area Allowed")
    public void checkMaxCommercialAreaAllowed(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxCommercialAreaAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxCommercialAreaAllowed()));
    }

    @Step("Maximum Commercial Height")
    public void checkMaxCommercialHeight(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxCommercialHeightAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxCommercialHeightAllowed()));
    }

    @Step("Maximum Commercial Height")
    public void checkMaxCommercialEstablishedArea(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        assertThat(getBuildingWrapper(projectExpected).getBuildingEnvelope().getMaxCommercialAreaAllowed(),
                equalTo(getBuildingWrapper(project).getBuildingEnvelope().getMaxCommercialAreaAllowed()));
    }


}
