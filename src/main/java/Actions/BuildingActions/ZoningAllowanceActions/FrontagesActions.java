package Actions.BuildingActions.ZoningAllowanceActions;

import Actions.BaseAction;
import Entyties.Project.Development.BuildingWrapper.AnalyzeData.OriginalFrontages.OriginalFrontages;
import Entyties.Responses.OpenProjectResponse;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;


public class FrontagesActions extends ZoningAllowancesActions{

    private Map<String, OriginalFrontages> getFrontageMapByLable(OpenProjectResponse project){
        Map<String, OriginalFrontages> frontageMap = new HashMap<>();
        for (OriginalFrontages frontageProject : getOriginalFrontages(project)) {
            frontageMap.put(frontageProject.getLabel(), frontageProject);
        }
        return frontageMap;
    }

    private List<OriginalFrontages> getOriginalFrontages(OpenProjectResponse project){
        List<OriginalFrontages> originalFrontages = getBuildingWrapper(project).getAnalyzeData().getOriginalFrontages();
        return originalFrontages;
    }

    @Step("Check Frontages Number")
    public void checkFrontageNumber(OpenProjectResponse project, OpenProjectResponse projectExpected)
    {
        assertThat(getOriginalFrontages(project).toArray().length, equalTo(getOriginalFrontages(projectExpected).toArray().length));
    }

    @Step("Check Frontage Type")
    public void checkFrontageType(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        List<OriginalFrontages> frontages = getOriginalFrontages(project);
        List<OriginalFrontages> frontagesExpected = getOriginalFrontages(projectExpected);

        for (OriginalFrontages frontage : frontages){
            String lable = frontage.getLabel();
            for(OriginalFrontages frontageExpected : frontagesExpected){
                    if(lable == frontageExpected.getLabel()){
                        assertThat(frontage.getFrontageType(), is(frontageExpected.getFrontageType()));
                    }
            }

        }

    }

    @Step("Check Setbacks")
    public void checkSetbacks(OpenProjectResponse project, OpenProjectResponse projectExpected) {
        List<OriginalFrontages> frontagesList =  getOriginalFrontages(project);
        for (OriginalFrontages frontage : frontagesList){
            assertThat(frontage.getSetback(),
                    is(getFrontageMapByLable(projectExpected).get(frontage.getLabel()).getSetback()));
        }

    }

}
