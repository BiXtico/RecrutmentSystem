package recruitmentsystem;

public class SearchJobTitle implements SearchStrategy {
//edit this to addess the list of jobs
    @Override
    public String search(String s) {

        for (Job j : Job.AllJobs) {
            if (j.getTitle().equalsIgnoreCase(s)) {
                return s;
            }
        }

        return "no matches";
    }

}
