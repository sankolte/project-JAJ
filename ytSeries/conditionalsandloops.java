package ytSeries;

public class conditionalsandloops {
    public static void main(String[] args) {
        int salary=2000;
        if(salary>1000){
            salary=salary+2000;
        } else if (salary>1500){
            salary=salary+5000;
        }else{
            salary=salary+10000;
        }
        System.out.println("The final salary is "+salary);
    }
}


