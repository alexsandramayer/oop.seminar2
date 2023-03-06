import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private int age;
    private String father;
    private String mother;
    private List<Human> children;

    public Human(String name, Gender gender, int age) {
        this(name, gender, age, null, null);
    }

    public Human(String name, Gender gender, int age, String father, String mother) {
        this.name  = name;
        this.gender = gender;
        this.age = age;
        this.mother  = mother;
        this.father  = father;
    }


    
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getFather(){
        return father;
    }
    public String getMother(){
        return mother;
    }
    public List<Human> getChildren(){ 
        return children; 
    }
    public Gender getGender(){ 
        return gender; 
    }
    
    public String getInfo(){
        StringBuilder sbuild = new StringBuilder();
        sbuild.append("Имя: ");
        sbuild.append(name);
        sbuild.append("Пол: ");
        sbuild.append(gender);
        sbuild.append(", ");
        sbuild.append("Вораст: ");
        sbuild.append(age);
        sbuild.append(", ");
        sbuild.append("Отец: ");
        sbuild.append(father);
        sbuild.append(", ");
        sbuild.append("Мать: ");
        sbuild.append(mother);
        sbuild.append(", ");
        sbuild.append("Дети: ");
        sbuild.append(children);
        return sbuild.toString();
    }
    

    @Override
    public String toString() {
        String result = "Имя: " + name +  "," + "Возраст: " + age;
        if (this.father != null){
            result += "," + "Отец: " + father;
        } else {
            result += "," + "Отец: неизвестен";
        }
        if (this.mother != null){
            result += "," + "Мать: " + mother;
        } else {
            result += "," + "Мать: неизвестна";
        }
        if (this.children != null){
            result += "," + "Дети: " + children;
        } else {
            result += "," + "Дети: неизвестны";
        }
        return result;
        
    }

   
}