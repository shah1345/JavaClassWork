package CT;





class TV{

    private String Name = "My TV";
    int Channel = 6;
    TV(){
        System.out.println("Hello Teacher!");
    }
    public String getname() {
        return Name;
    }
}

public class TEst3 {

    public static void main(String[] args) {

        TV t = new TV();

        System.out.println(t.getname());

    }
}