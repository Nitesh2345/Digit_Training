package Day_3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    public void AddContact(ArrayList<contacts> adr)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname=sc.next();
        System.out.println("last name");
        String lastname=sc.next();
        System.out.println("Enter Address");
        String address=sc.next();
        System.out.println("Enter city");
        String city=sc.next();
        System.out.println("state");
        String state=sc.next();
        System.out.println("zip");
        long zip=sc.nextLong();
        System.out.println("phone_no.");
        String phone=sc.next();
        System.out.println("email");
        String email=sc.next();
        contacts c = new contacts(firstname,lastname,address,city,state,zip,phone,email);
        adr.add(c);

    }
    public void deleteContact(ArrayList<contacts> ad){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname=sc.next();

        for(contacts c: ad)
        {
            if(c.getFirstName().equalsIgnoreCase(firstname))
            {
                ad.remove(c);
            }
        }


    }

    public void updateContact(String firstName, String lastName, String address, String city, String state, int zip, String phoneNo, String email) {
        if (firstName != null) {
            firstName = firstName;
        }
        if (lastName != null) {
            lastName = lastName;
        }
        if (address != null) {
            address = address;
        }
        if (city != null) {
            city = city;
        }
        if (state != null) {
            state = state;
        }
        if (zip != 0) {
            zip = zip;
        }
        if (phoneNo != null) {
            phoneNo = phoneNo;
        }
        if (email != null) {
            email = email;
        }
    }
    public void updateContact(ArrayList<contacts> ad){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstname=sc.next();

        for(contacts c: ad)
        {
            if(c.getFirstName().equalsIgnoreCase(firstname))
            {

            }
        }


    }


}
