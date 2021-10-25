public class Dogs {
    private String name;
    private Breeds breed;
    private int age;

    public Dogs(String name, Breeds breed, int age) {
        this.name = name;
        this.breed = breed;
        if (age < 0) {
            this.age = 1;
        } else this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Breeds getBreed() {

        return breed;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else this.age = age;
    }
    public void output(){
        System.out.println("Name:"+ this.name +"      " +"Breed: " + this.breed+"      "+"Age: "+this.age);
    }

}
