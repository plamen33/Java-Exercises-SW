import java.util.*;

public class Task4Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        LinkedHashMap <String, List<String>> bought = new LinkedHashMap<>();
        while(true){
            String[] inputOne = sc.nextLine().split(";");
            for (String line: inputOne) {
                String[] array = line.split("=");
                String name = array[0];
                Double balance = Double.parseDouble(array[1]);
                if(balance < 0){
                    check1 = true;
                    break;
                }
                if(name.equals("")){
                    check2 = true;
                    break;
                }
                Person person = new Person();
                person.name = name;
                person.balance = balance;
                people.add(person);
            }
            if(check1){
                System.out.println("Balance can’t be negative.");
                break;
            }
            if (check2){
                System.out.println("Name can’t be empty.");
                break;
            }

            // PRODUCTS:
            String[] inputTwo = sc.nextLine().split(";");
            for (String line: inputTwo) {
                String[] array = line.split("=");
                String product = array[0];
                Double price = Double.parseDouble(array[1]);
                if(price < 0){
                    check3 = true;
                    break;
                }
                Product prod = new Product();
                prod.name = product;
                prod.price = price;
                products.add(prod);
            }
            if (check3){
                System.out.println("Price can’t be negative.");
                break;
            }

            String buyProcess = sc.nextLine();
            while(!buyProcess.equals("END")){
               String[] array = buyProcess.split(" ");
                String product ="";
                String person="";
                for (int i = array.length-1; i>=0; i--){
                    if(i == array.length-1){
                        product = array[i];
                        break;
                    }
                }
                for (int i = 0; i < array.length-1 ; i++) {
                    person+= array[i]+" ";
                }
                person = person.substring(0, person.length()-1);
                Double prodPrice = 0.0;
                for(Product p: products){
                    if(p.name.equals(product)){
                        prodPrice = p.price;
                    }
                }
                for (Person a: people) {
                    if(a.name.equals(person)){
                        if(prodPrice<= a.balance){
                            a.balance -=prodPrice;
                            System.out.println(a.name +" "+ "bought"+" "+ product);
                            if(!bought.containsKey(person)){
                                bought.put(person, new ArrayList<>());
                            }
                            bought.get(person).add(product);
                        }
                        else{
                            System.out.println(a.name +" "+ "can’t afford"+" "+ product);
                            if(!bought.containsKey(person)){
                                bought.put(person, new ArrayList<>());
                            }
                        }
                    }
                }

                buyProcess = sc.nextLine();
            }// end of buy process

            for (Map.Entry<String, List<String>> personBuy: bought.entrySet()) {
              if(personBuy.getValue().size() != 0){
                  System.out.printf("%s – %s\n", personBuy.getKey(), personBuy.getValue().toString().replace("[", "").replace("]", ""));

              }
                else if(personBuy.getValue().size() == 0){
                  System.out.printf("%s – Nothing bought\n", personBuy.getKey());

              }
            }
          break;
        }// end of white true
    }
}
