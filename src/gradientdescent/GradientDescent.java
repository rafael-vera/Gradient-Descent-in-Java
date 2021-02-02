package gradientdescent;

/**
 *
 * @author Rafael Vera
 */
public class GradientDescent {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    float x = (float) (Math.random()*101);              // The initial position of x
    float alpha = 0.4f;                                 // The learning rate
    int iter = 100;                                     // The number of itertations
    float gradient;                                     // The variable that store the gradient descent
    for(int i=0; i<iter; i++) {
      System.out.println("--------------------");
      System.out.println("Iteration: "+(i+1));
      gradient = dFunction(x);                          // Update the value of the gradient descent given x
      x = x - alpha * gradient;                         // Update the point in x
      System.out.println("x = "+x+", y = "+function(x));
    }
  }
  /**
   * 
   * @param x
   * @return the point in Y of the function
   */
  private static float function(float x) {
    // y = x^2 + 1
    return x*x + 1;
  }
  /**
   * 
   * @param x
   * @return the derivative of the function
   */
  private static float dFunction(float x) {
    // y' = 2x
    return 2*x;
  }
}