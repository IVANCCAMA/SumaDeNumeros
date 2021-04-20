
public class Numero{
    private int num;
    
    public Numero(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNum(int n){
        num = n;
    }
    
    public Numero Sumar(Numero otro){
        Numero a;
        num = num + otro.getNum();
        a = new Numero(num);
        return a;
    }
    
    @Override
    public String toString(){
        return num + "";
    }
    
}
