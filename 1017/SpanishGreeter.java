public class SpanishGreeter implements Greeter{
 @Override
  public void login(Account guest){
 System.out.println(String.format("Buenos　%s",guest.getName()));
  }
  @Override
  public void logout(Account guest){
  System.out.println("Aus Wiesersehen");
 }
 }
