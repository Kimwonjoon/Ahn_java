public class Hello{ // public 클래스는 무조건 한개, 파일명과 이름이 같아야한다.
    public static void main(String[] args) { // 여기는 main 메서드의 선언부 항상 형태 고정
        System.out.println("Hello World");
    }
}
// 근데 public class가 없고 아래와 같은 class만 존재한다면 파일명은 Hello1.java, Hello2.java 둘다 가능
class Hello1{
    // 하나의 파일에는 하나의 클래스가 정석인데 둘 이상까지 가능
    public static void main(String[] args) { // 여기는 main 메서드의 선언부 항상 형태 고정
        System.out.println("Hello World");
    }
}
// 둘 이상의 클래스 선언이 가능한데 public class는 무조건 파일명과 동일 시 되어야한다.
class Hello2{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}