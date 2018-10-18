public class FranceGreeter implements Greeter{
 @Override
 public void login(Account guest){
 System.out.println(String.format("Bonjour　%s",guest.getName()));
}
 @Override
  public void logout(Account guest){
 System.out.println("Au revoir");
 }
 }
