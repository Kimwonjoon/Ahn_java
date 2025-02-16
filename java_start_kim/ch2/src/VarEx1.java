class VarEx1 {
    public static void main(String[] args) {
        int a,b; // 이렇게 값 없이 변수만 일단 선언하는 경우
        int x=5,y=10; // 이렇게 한줄로 초기값과 함께 선언하는 경우

        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}

class VarEx2 { // 변수 간의 값 교환
    public static void main(String[] args) {
        int a=10, b=20;
        int tmp = 0; // 임시 변수 저장소

        System.out.println("a:"+a+" b:"+b);

        tmp = a; // a값을 임시 저장 tmp = 10
        a = b; // a = 20, b = 20

        System.out.println("a:"+a+" b:"+b);
        // 상수 선언 : final로 시작하며 이 변수값은 수정이 불가능하다. 변수명은 대문자로 , 상수는 선언과 동시에 값을 초기화 해줘야한다.
        // error : final int MAX_SPEED; - 이거 에러나는 경우임
        final int MAX_SPEED = 100;

        // 접미사 L, f, d
        // L : long 타입의 변수 선언시 맨 끝에 L을 적어줘야 적용 가능하다.
        long l_ex = 100_100_100_100L;
        // f : 실수의 기본형이 double이라서 float로 명명을 해줘야한다.
        float f_ex = 3.14f;
        // d : 실수의 기본형이기 때문에 생략 가능
        double d_ex = 3.14;
        // 실수의 기본형이 double(8byte)라서 f로 float 지정 안해주면 저장이 안되는거임!

        // 2 8 16 진수 : 0b 0 0x
        int OctNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        // 변수와 리터럴의 타입이 틀린경우
        int i = 'A'; // char = 2, int = 4
        // char, String
        char ch = 'J'; // char는 '' 이렇게 공간이 빈 리터럴은 저장이 안됨, 공백은 가능(띄어쓰기)
        // 원래 String은 class인데 아래와 같은 표현은 특별히 허가
        String name = "JAVA";
        // 원래 String
        String name1 = new String("JAVA");
    }
}

// 클래스의 첫글자는 대문자
// 여러 단어의 합성어는 단어의 첫글자를 무조건 대문자로 StringBuffer
// 상수의 이름은 모두 대문자 MAX_NUMBER
// 모든 변수, 상수의 값은 리터럴이라고 칭한다!
// !!!!!! 타입별 용량 !!!!!!!! - 리터럴의 타입이 저장될 변수의 타입과 달라도 리터럴의 타입이 더 작다면 저장이 가능하다.
// 1byte = boolean, byte / 2byte = char, short(int보다 짧아서 short)
// 4byte = int, float / 8byte = long(int보다 길어서 long), double(float의 두배라 double)