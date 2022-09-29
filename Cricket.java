class Cricket{
 public static void main(String cricket[]){
 int rohitHighestScore = 264 ;
 int sachinHighestScore = 200 ;
 int mandanaHighestScore = 135 ;
 int ackerrHighestScore = 232 ;
 int bjclarkHighestScore = 229 ;
 int highestScore[] = {rohitHighestScore , sachinHighestScore , mandanaHighestScore , ackerrHighestScore , bjclarkHighestScore};
 int ref4 = highestScore[4] ;
 int ref3 = highestScore[3] ;
 int ref2 = highestScore[2] ;
 int ref1 = highestScore[1] ;
 int ref0 = highestScore[0] ;
 System.out.println("Element at index 4 " + ref4);
 System.out.println("Element at index 3 " + ref3);
 System.out.println("Element at index 2 " + ref2);
 System.out.println("Element at index 1 " + ref1);
 System.out.println("Element at index 0 " + ref0);
 System.out.println("The length of highestScore is " + highestScore.length);
 for(int index = 0 ; index < highestScore.length ; index++){
 int ref = highestScore[index];
 System.out.println("Element at index " + index + "ref"); 
 }
 }
 }