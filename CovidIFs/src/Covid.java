public class Covid {
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidnevDisease, boolean respiratoryDisease, String provincia
    ){
        if (bodyTemperature >= 38 && difficultyBreathing) {
            if (diabetes || cancer || isPregnant || isOver60yearsold || hepatic || kidnevDisease || respiratoryDisease) {
                return "/diagnostico/" + provincia;
            }
            return "/cuarentena/";
        } else {
            return "/diagnostico_bueno/";
        }
    }
}