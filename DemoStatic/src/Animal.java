public class Animal {
    public static String Name;
    private int id;
    protected float prime;

    public Animal() {
    }

    public Animal(String name, int id, float prime) {
        this.id = id;
        this.prime = prime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public static void sound() {
        System.out.println("Gaw gaw");
    }

    public void eat() {
        System.out.println("meat");
    }

    // phướng thức và thuộc tính static thuộc lớp chứ khoogn thuộc đối tượng vì thế ko kế thừa được

    public static class Cat1 extends Animal {
        @Override
        public void eat() {
            super.eat();
        }
    }
}
