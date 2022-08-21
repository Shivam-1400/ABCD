import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


/*
 * Create a student class object array of size four having attributes name, designation and salary. Let the student class have appropriate getter/setters methods for 
 * accessing these attributes. Initialize these attributes through the setter methods. Store this object into a file "OutObject.txt". Read the objects from the same file 
 * and display the attributes of object through getter methods where name is equal to “rajiv” (ignoring case) else display the following message “The required information 
 * is not found in file”.
 */

class helper{
	static int inoutInt(String a) {
		System.out.print("Enter "+ a+": ");
		return new Scanner(System.in).nextInt();
	}
	static String inoutString(String a) {
		System.out.print("Enter "+ a+": ");
		return new Scanner(System.in).nextLine();
	}
}

class Student implements Serializable{
	String name, des;
	int sal;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDes() {
		return des;
	}
	void setDes(String des) {
		this.des = des;
	}
	int getSal() {
		return sal;
	}
	void setSal(int sal) {
		this.sal = sal;
	}
	
}

public class StudentObjArray {
	public static void main(String args[]) {
		Student[] Ary= new Student[4];
		for(int i=0; i< Ary.length; i++) {
			Ary[i]= new Student();
			Ary[i].setName(helper.inoutString("name"));
			Ary[i].setDes(helper.inoutString("designation"));
			Ary[i].setSal(helper.inoutInt("salary"));
			
		}
		try {
			FileOutputStream fos= new FileOutputStream("C:\\Project-Folder\\studentSample.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(Ary);
			System.out.println("\nObject serializeed\n\n");
			oos.flush();
			oos.close();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis= new FileInputStream("C:\\Project-Folder\\studentSample.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			Student[] obj= (Student[])ois.readObject();
			for(int i=0; i< obj.length; i++) {
				
				if(obj[i].name.equals("rajiv")) {
					System.out.println("Name: "+obj[i].getName()+"\nDesignation: "+obj[i].getDes()+"\nSalary: "+ obj[i].getSal());
				}
			}
			System.out.println("\nObject deserializeed\n\n");
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
