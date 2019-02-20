package ac.za.cput;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

    public static void main(String args[]) {

        List<WorkingEmp> employeesList = new ArrayList<>();
        employeesList.add(new WorkingEmpImpli());


        Project project = new Project();
        project.start(employeesList);

       System.out.println(employeesList.size());

    }
}