public class Employee {
    private Integer idNumber;

    public Integer getIdNumber() {
        return idNumber;
    }

    public Employee(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public boolean hasAdministratorRights() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Employee)) {
            return false;
        }

        Employee otherEmployee = (Employee) obj;
        Integer otherEmployeeId = otherEmployee.getIdNumber();
        return (otherEmployeeId.equals(this.getIdNumber()));

    }
}
