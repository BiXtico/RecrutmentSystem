package recruitmentsystem;

public class SearchCandidates implements SearchStrategy {

    //review the logic , it's returnning a function with a username of one user only not all candidates who have the intrest
    @Override
    public String search(String s) {

        for (Applicant candidate : RecrutmentControler.getApplicants()) {
            for (String intrest : candidate.getIntrests()) {
                if (intrest.equalsIgnoreCase(s)) {
                    return candidate.getUsername();
                }

            }  
        }   
        return "no candidates found";
    }

}
