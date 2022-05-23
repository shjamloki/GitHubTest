class MainClass
{
  OtherClass otherClass= null;
  public MainClass()
  {
    otherClass = new OtherClass();
  }
  public static void main(Stirng a[])
  {
    MainClass main = new MainClass();
    main.callOtherClassMethod();
  }
  
  private void callOtherClassMethod()
  {
    int caller = 1;
    int callee = 2;
    otherClass.callingMethod(caller,callee);
  }
  
}
