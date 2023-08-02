interface a{
    int sum(int c,int b);
    int multi(int c, int b);
}

public class Main implements a {
    @Override
    public int sum(int c, int b) {
        return c+b;
    }

    @Override
    public int multi(int c, int b) {
        return c*b;
    }
    
    public static void main(String[] args) {
        Person p= new Person("Bokri",21,"F");
        aclass a=new aclass() {
            @Override
            int sum(int a, int b) {
                return 0;
            }
        };

        System.out.println(p.getName()+ " " +p.getAge()+ " " +p.getGender());
    }
}