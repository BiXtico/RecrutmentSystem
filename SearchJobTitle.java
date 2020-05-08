package recruitmentsystem;

public class SearchJobTitle implements SearchStrategy {
   

    @Override
    public String search(String s) {

        for (Employer e : RecrutmentControler.getEmployers()) {
            for (Job j : e.getMyJobs()) {
                if (j.getTitle().equalsIgnoreCase(s)) {
                    return j.toString();
                }
            }

        }
        return "no matches";
    }

} 
