package Abstract;

public class AnimalEx {
    public static void main(String[] args) {

        Animal myCat = new Cat(); 
        myCat.printSound(); // "고양이는 야옹야옹" 출력
        myCat.displayInfo(); // 부모의 메서드도 사용 가능

        // 2. 직접 Cat 객체를 만드는 방법
        // Cat cat = new Cat();
        // cat.printSound();
    }
}