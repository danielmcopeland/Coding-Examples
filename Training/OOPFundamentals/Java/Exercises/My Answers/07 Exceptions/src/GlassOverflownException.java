public class GlassOverflownException extends Exception{
    public GlassOverflownException(float message){
        super("Glass capacity exceeded: you have spilt " + message + " gallons");
    }
}
