package Family;

public class FamilyTest {

    public static void main(String[] args) {

        Family a=new Family();

        Address aadsress=new Address();

        a.name="sanjay";
        aadsress.city="hyd";
        aadsress.flatno="302";
        aadsress.pincode=22334;
        aadsress.street="nehre nagar";

         a.address=aadsress;
        Address baadsress=new Address();

        baadsress.city="hyd";
        baadsress.flatno="302";
        baadsress.pincode=22334;
        baadsress.street="nehre nagar";
        a.name="arun";

         Family[] akids=new Family[2];

        Family b=new Family();


        b.address=baadsress;

        a=new Family();



        System.out.println(aadsress.city);
        System.out.println(aadsress.flatno);
        System.out.println(aadsress.pincode);
        System.out.println(aadsress.street);

        System.out.println(baadsress.city);
        System.out.println(baadsress.flatno);
        System.out.println(baadsress.pincode);
        System.out.println(baadsress.street);


    }
}
