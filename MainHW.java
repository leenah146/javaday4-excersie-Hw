
public class Main {
    public static void main(String[] args) {

//1
    //    int[] arr = {-1, 2, 3, 4, 5, 100};
     //   try {


          //  System.out.println(minval(arr));
  //      } catch (Exception e) {
     //  e.printStackTrace();

     //   }


        Customer cus=new Customer(1,"sarah",'m');
       try {
          System.out.println(cus.getGender());

        }
       catch (Exception e){
           System.out.println("enter a correct gender");
       }


    }
    public static int minval(int[] arr) throws Exception {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

           if (arr[i]<0){
               throw new Exception("not a positive ");
           }

            else if (min > arr[i]) {
                min = arr[i];
            }


        }
        return min;

    }
}