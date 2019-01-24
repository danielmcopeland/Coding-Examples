public class Manager extends Employee{

    public Manager(Integer idNumber) {
        super(idNumber);
    }
    @Override
    public boolean hasAdministratorRights() {
        return true;
    }
}
