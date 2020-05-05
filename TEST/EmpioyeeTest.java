package TEST;

public class EmpioyeeTest {
    public static void main(String[] args) {
        Empioyee[] staff=new Empioyee[3];
        staff[0]=new Empioyee("asdas",75000,1987,12,15);
        staff[1]=new Empioyee("asdagew",50000,1989,10,1);
        staff[2]=new Empioyee("dasfag",40000,1990,3,15);
        for (Empioyee e:staff)
            e.raiseSalary(5);
        for (Empioyee e:staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalar()+",hirDay="+e.getHireDay());
    }
}
