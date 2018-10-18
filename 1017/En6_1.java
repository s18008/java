public class En6_1{
public static void main(String[] args){
Account guest = new Account(args[0],Country.valueOf(args[1]));
Greeter greeter = GreeterFactory.getGreeter(guest);
greeter.login(guest);
greeter.logout(guest);
}
}
