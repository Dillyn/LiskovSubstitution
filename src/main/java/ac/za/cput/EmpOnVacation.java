package ac.za.cput;

public class EmpOnVacation extends Emp implements NonWorkingEmp {
    @Override
    public String relax(){
        return "relaxing";
    }
}
