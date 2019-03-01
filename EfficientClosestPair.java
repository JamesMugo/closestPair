/**
 * @author James Mureithi Mugo
 * A program that calculates the closest pair i.e two pairs with the shortest distance between them
 * 
 * */
public class EfficientClosestPair{  
  public static void main(String [] args){   
    int numbers[] = {8,7,5,6,9,8,4,5};
    int otherNumbers[] = {12,3,15,9,19,13,58,51};
    
    ClosestPair(numbers,otherNumbers);
    
    
  }
  
  public static void ClosestPair(int [] P, int [] Q){
    int [] pLeft = new int [P.length/2];
    int [] qLeft = new int [Q.length/2];
    
    int [] pRight = new int [P.length/2];
    int [] qRight = new int [Q.length/2];
    
    
    //copy the first [n/2] points of P to array pLeft
    for(int i=0; i<=((P.length/2)-1); i++){
      pLeft[i] = P[i];
    }
    //copy the same [n/2] points of Q to array qLeft
    for(int i=0; i<=((Q.length/2)-1); i++){
      qLeft[i] = Q[i];
    }
    
    //copy the remaining [n/2] points of P to array pRight
    for(int k=0, j=P.length/2; j<P.length && k<pRight.length; j++, k++){
      pRight[k]=P[j];
    }
    //copy the same [n/2] points of P to array qRight
    for(int k=0, j=Q.length/2; j<Q.length && k<qRight.length; j++, k++){
      qRight[k]=Q[j];
    }   
    
    //calculate the distance
    for(int i=1; i<pLeft.length && i<qLeft.length; i++){
      ClosestPair(pLeft, qLeft);
      ClosestPair(pRight, qRight);
      int dLeft = pLeft[i]-qLeft[i];
      int dRight = pRight[i]-qRight[i];
      System.out.println("left distance: "+dLeft);
      System.out.println("right distance: "+dRight);
    }
  }
  
}