package orange.models;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class FormRecruitmentModel {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String contacNumber;
    private String keywords;
    private String notes;

    public static List<FormRecruitmentModel> setData(DataTable dataTable ) {
        List<FormRecruitmentModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, FormRecruitmentModel.class));
        }
        return dates;
    }
}

