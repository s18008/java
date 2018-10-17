public class En5_3{
public static void main(String[] args){
StringBuilder fizzBuzzResult = new StringBuilder();
for (int i = 1; i <= 100; i++){
if (i % 15 == 0){
    fizzBuzzResult.append("FizzBuzz");
    fizzBuzzResult.append(System.lineSeparator());
} else if (i % 3 == 0){
    fizzBuzzResult.append("Fizz");
    fizzBuzzResult.append(System.lineSeparator());
} else if (i % 5 == 0){
    fizzBuzzResult.append("Buzz");
    fizzBuzzResult.append(System.lineSeparator());
}else{
    fizzBuzzResult.append(i);
    fizzBuzzResult.append(System.lineSeparator());
}
}
System.out.println(fizzBuzzResult);
}
}


