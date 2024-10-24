package Package1;

//creating object using copy constructor
public class CopyConstructor {

    private String stuName;
    private int stuId;
    private String schoolName;
    private int stuAge;

    //default constructor
    CopyConstructor(){

    }

    CopyConstructor(CopyConstructor cc) {
        this.schoolName = cc.schoolName;
        this.stuAge = cc.stuAge;
        this.stuId = cc.stuId;
        this.stuName = cc.stuName;
    }

    public static void main (String[] args) {
        //default constructor
        CopyConstructor cc = new CopyConstructor();
        System.out.println(cc.schoolName+cc.stuName+cc.stuAge+cc.stuId);
        //assigning values to the object variables
        cc.stuName = "Raghu";
        cc.stuId = 12345;
        cc.stuAge = 35;
        cc.schoolName = "kvs";
        System.out.println(cc.schoolName+cc.stuName+cc.stuAge+cc.stuId);
        //copy constructor
        CopyConstructor cc2 = new CopyConstructor(cc);
        System.out.println(cc2.schoolName+cc2.stuName+cc2.stuAge+cc2.stuId);

    }
}
