package ac.za.cput;


import java.util.List;

public class Project {

    public void start(List<WorkingEmp> workingEmployees){

        /*Adding working employees to the project*/
        for (WorkingEmp workingEmp:workingEmployees) {
            workingEmp.work();
        }

    }


}
