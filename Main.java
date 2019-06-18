package cn.sange.day1;

public class Main {
    public static void main(String[] args)throws Exception {
//        Class cls = Student.class;
        String name = "cn.sange.day1.Docter";
        Class cls;
        if (isClassPresent(name)){
            cls = Class.forName(name);
        }else{
            cls = Class.forName("cn.sange.day1.Student");
        }

        System.out.println("class name:" + cls.getName());
        System.out.println("class simple name:" + cls.getSimpleName());
        System.out.println("package name:" + cls.getPackage().getName());
        System.out.println("is interface:" + cls.isInterface());
            //Student student = (Student) cls.newInstance();
            //student.show();
             Hello hello = (Hello) cls.newInstance();
             hello.show();

    }
    public void println(){
        System.out.println("测试github");
    }

    public static boolean isClassPresent(String name){
        try {
            Class.forName(name);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
