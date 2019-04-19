package edu.fmi;

public class Main {

    public static void main(String[] args) {
	
        Employee pesho = new Employee("Bai","Pesho",7,"piqnica");
        System.out.println(pesho);
        RegularSraff gosho = new RegularSraff("Bai","Gosho",5,"pustinqk",540);
        System.out.println(gosho);

      //  double zaplata = 540;
      //  for (int i = 1; i <= 5; i++) {
      //       zaplata = zaplata + (zaplata*0.2);
      //  }
      //  System.out.println(zaplata);
    }
}
