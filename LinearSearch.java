public class LinearSearch {
  // public static int linearSearch(int numbers[], int key)

  // // {
  // // for (int i = 0; i < numbers.length; i++) {
  // // if (numbers[i] == key) {
  // // return i;
  // // }
  // // }
  // // return -1;
  // // }
  public static int linearSearch(String menu[], String key) {
    for (int i = 0; i <= menu.length; i++) {
      if (menu[i] == key) {
        return i;
      }

    }
    return -1;

  }

  public static void main (String args[]) {
      // int numbers[]={1,2,3,4,5};
      String menu[]={"Dosa","Chole Bhature","samosa"};
      String item="Chole Bhature";
      int solution=linearSearch(menu,item);
      if(solution==-1){
        System.out.println("Item is not present in the list");
      }
      else {
        System.out.println("The Item is at index: "+solution);
      }
     }
    }





     // LINEAR SEARCH FOR NUMBERS
// int key=1;
// int index=linearSearch(numbers,key);
// // System.out.print(index);
// if(index==-1)
// {
// System.out.println("Key not found");

// }
// else{
// System.out.println("Key is at index: "+index);
// }
// }