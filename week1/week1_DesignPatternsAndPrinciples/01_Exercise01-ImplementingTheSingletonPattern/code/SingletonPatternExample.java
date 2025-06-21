class Logger{
    private static Logger i=null;
    private Logger(){ // Singleton Class
        System.out.println("Logger instance Created");
    }
    public static Logger getLogger(){
        if(i==null) i=new Logger();
        return i;
    }
    
}
class Normal{ //Normal class
    public Normal(){
        System.out.println("Normal class instance created");
    }
    public static Normal getNormal(){
        return new Normal();
    }
}
class Test{
    public static void main(String args[]){

        //Singleton Class
        Logger x = Logger.getLogger(); 
        Logger y = Logger.getLogger();
        Logger z = Logger.getLogger();
        if(x==y && y==z){ 
            System.out.println("Follows singleton: All instances are same");
        }
        else{
            System.out.println("Does not Follow Singleton: Instances are differ");
        }

        System.out.println();

        //Normal Class
        Normal a = Normal.getNormal();
        Normal b = Normal.getNormal();
        if(a==b ){
            System.out.println("Follows singleton: All instances are same");
        }
        else{
            System.out.println("Does not Follow Singleton: Instances are different");
        }
    }
}