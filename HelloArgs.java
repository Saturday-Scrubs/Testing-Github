public class HelloArgs{
  public static void main(String[] args){
    if(args.length > 0){
      for(String s : args){
        System.out.println(s);
      }
    }
  }
}

