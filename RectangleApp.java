import java.util.Scanner;

public class RectangleApp {
    private double side_A;
    private double side_B;

    public RectangleApp() {
        Rectangle rectangle = new Rectangle(side_A,side_B);
        side_A = userInput("");
        rectangle.setSide_A(side_A);
        //System.out.println(rectangle.getSide_A());

        side_B = userInput("Sisesta ristküliku külje B pikkus: ");
        rectangle.setSide_B(side_B);
        //System.out.println(rectangle.getSide_B());


        if (rectangle.getSide_A() != rectangle.getSide_B() && rectangle.getSide_A() != 0 && rectangle.getSide_B() != 0) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Kas arvutan ristküliku pindala S või ümbermõõdu P?: ");
            if (scanner.hasNext("S")){ //töötab ainult suur S
                System.out.println("Ristküliku pindala on "+ rectangle.getArea() + " ühikut.");
            } else if (scanner.hasNext("P")){ //töötab ainult suur P
                System.out.println("Ristküliku ümbermõõt on "+ rectangle.getPerimeter()+" ühikut.");
            }

        } else {
            System.out.print("Küljed ei tohi olla võrdsed ja peavad olema suuremad nullist!" + " Külg A= "+ rectangle.getSide_A() + ", külg B= " + rectangle.getSide_B());
        }
    }
        public static void main (String[] args) {
            new RectangleApp();
        }

        private double userInput (String text){
            if (text.isEmpty()) {
                text = "Sisesta ristküliku külje A pikkus: ";
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print(text);
            side_A = scanner.nextDouble();
            return side_A;
        }

    }
