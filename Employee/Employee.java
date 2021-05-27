
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if(this.salary>=1000){
            return (this.salary/100)*3;
        }
        return 0;
    }

    int bonus(int hours){
        return hours*30;
    }

    double raiseSalary(){
        if(2021-this.hireYear<10){
            return (this.salary/100)*5;
        }
        else if(2021-this.hireYear>9&&2021-this.hireYear<20){
            return (this.salary/100)*10;
        }
        else{
            return (this.salary/100)*15;
        }
    }

    public String toString(){
        int hours=5;
        double tax=tax();
        int bonus=bonus(hours);
        double raiseSalary=raiseSalary();
        double totalSalary=this.salary+raiseSalary;
        double vergiBonus=this.salary+bonus-tax;
        return "Adı : "+this.name+"\n"+"Maaşı : "+this.salary+"\n"+"Çalışma Saati : "+this.workHours+"\n"+"Başlangıç Yılı : "+this.hireYear+"\n"+"Vergi : "+tax+"\n"+"Bonus : "+bonus+"\n"+"Maaş Artışı : "+raiseSalary+"\n"+"Vergi ve Bonuslar ile birlikte maaş :"+vergiBonus+"\n"+"Toplam Maaş :"+totalSalary;
    }

}

