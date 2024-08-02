package Day_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<contacts> al = new ArrayList<>();
        contacts obj= new contacts("Ram","Kumar","BBsr","BBsr","Odisha",12345,"00223444","ram@gmail.com");
        System.out.println(obj.toString());
        al.add(obj);
        AddressBook adr = new AddressBook();
        adr.AddContact(al);

    }
}
