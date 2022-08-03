public class Main {
    public static void main(String[] args) {
        //1
        //  int[] arr={1,2,3,4,5,6,7};

        //  try {
        //     System.out.println(arr[9]);
        //   }
        //  catch(ArrayIndexOutOfBoundsException e){
        //         System.out.println("out of bounds");
        //   }




        //2
        //  try {
        //      divideby5(2);
        //     System.out.println("diveded by 5");
        //      }

        //  catch(ArithmeticException e){
        //    e.printStackTrace();
        //   }






        //3 Author class
     //  Author Author1 = new Author("Alla", "Alla70@gmail.com");
       // Author1.SetEmail("Alla1234@gmail.com");
        //System.out.println(Author1);

//4emplyee class

      //  Employee Emp1 =new Employee(12,"khalid","ramadan",2800);
    //    System.out.println(Emp1);
      //   Emp1.raise(5);
        //  System.out.println(Emp1);


      //5 inovice class
       // InoviceItem it1=new InoviceItem("1","potato",7,700);
       // System.out.println(it1);
       // System.out.println("The total of the potatos "+it1.getTotal());



    }







    //2 method division

    public static int divideby5(int a) throws Exception {
        if (!(a % 5 == 0)) {

            throw new ArithmeticException("not divided by 5");
        }
        return a / 5;
    }
}


