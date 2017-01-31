package fourthlec;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class Task2i_FindKInSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int num = Integer.parseInt(sc.next());
        sc.nextLine();
        List<Integer> array = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (array.contains(num)){
            System.out.println(array.indexOf(num));
        }
        else{
            System.out.println("NO");
        }
    }
}
