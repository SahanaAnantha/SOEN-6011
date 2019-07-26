import java.util.InputMismatchException;
import java.util.Scanner;

public class LogFunction {

  /**
   * This method calculates the Logarithmic value of input x.
   * 
   * @param xval This is the input parameter 
   * @return output This returns the calculated Logarithmic value of xval
   */
  public static double calculateLog(double xval) {
    if (xval > 1.0) {
      double output = 0.0;
      double exp = (xval - 1) / xval;
      double constant = 2;
      double temp = exp;

      while (temp > 1E-15) {
        output = output + temp;
        exp = exp * ((xval - 1) / xval);
        temp = exp * (1.0 / constant);
        constant = constant + 1;
      }
      return output;
    } else if (xval > 0.0) {
      double output = 0.0;
      double exp = xval - 1;
      int powerOfOne = -1;
      double constant = 2;
      double temp = exp;
      while (temp > 1E-15 || -temp > 1E-15) {
        if (temp > 1E-15) {
          output = output - temp;
        } else {
          output = output + temp;
        }
        exp = exp * (xval - 1);
        temp = exp * powerOfOne;
        temp = temp / constant;
        powerOfOne = powerOfOne * -1;
        constant = constant + 1;
      }
      output = output + exp;
      return output;
    } else {
      System.out.println("Domain error");
    }
    return 1;
  }

  /**
   * This is the main method which takes the input valus and calculate the Logarithmic value
   * using the method calculateLog.
   * 
   * @param 
   */
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X of Log(X) to the base b");
      double xval = sc.nextDouble();
      if (xval < 0) {
        System.out.println("Please enter X value greater than 0");
      } else {
        System.out.println("Enter the value of base b of the Log(X)");
        double base = sc.nextDouble();
        if (base < 0) {
          System.out.println("Please enter the value of base greater than 0");
        } else if (base == 1) {
          System.out.println("The value of base equal to 1 is not defineds ");
        } else {
          double result1 = calculateLog(xval);
          double result2 = calculateLog(base);
          double result3 = result1 / result2;
          System.out.println(result3);
        }
      }
      sc.close();
    } catch (InputMismatchException e) {
      System.out.println("Please enter the valid X value");
    } catch (Exception e) {
      System.out.println("Exception occured");
    }
  }

}
