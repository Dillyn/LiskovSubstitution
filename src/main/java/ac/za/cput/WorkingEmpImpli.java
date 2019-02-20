package ac.za.cput;

public class WorkingEmpImpli extends Emp implements WorkingEmp {
    @Override
    public String work(){
        return "working";
    }
}
